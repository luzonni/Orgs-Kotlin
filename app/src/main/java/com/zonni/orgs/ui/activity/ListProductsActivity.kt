package com.zonni.orgs.ui.activity

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.lifecycle.lifecycleScope
import com.zonni.orgs.R
import com.zonni.orgs.database.AppDatabse
import com.zonni.orgs.databinding.ListProductsMainBinding
import com.zonni.orgs.extensions.goTo
import com.zonni.orgs.modelo.Product
import com.zonni.orgs.modelo.User
import com.zonni.orgs.ui.reciclerview.adapter.ListProdutcsAdapter
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.filterNotNull
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ListProductsActivity : UserBaseActivity() {

    private val job = Job()
    private val productDAO by lazy {
        AppDatabse.instance(this).productDAO()
    }
    private val adapter = ListProdutcsAdapter(this)
    private val binding  by lazy {
        ListProductsMainBinding.inflate(layoutInflater)
    }

    /*
        Contexto Dispatchers.Main: Este contexto é usado principalmente em
        aplicativos Android ou em qualquer aplicativo com interface gráfica
        do usuário (GUI). Ele direciona a execução das coroutines para a
        thread principal, onde as atualizações da interface do usuário devem
        ocorrer. Isso é crucial para garantir que as operações que atualizam
        a IU sejam feitas na thread principal, evitando assim problemas de
        concorrência e bloqueios.

        Contexto Dispatchers.IO: Este contexto é ideal para operações de entrada
        e saída (I/O), como operações de rede, acesso a banco de dados,
        leitura/gravação de arquivos, etc. As coroutines lançadas neste contexto
        são executadas em uma pool de threads otimizada para operações de I/O,
        permitindo que as operações bloqueantes não afetem a thread principal.

    */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        configRecyclerView()
        configFab()
        lifecycleScope.launch {
            launch {
                //Flows travam as threads! Cuidado!
                user.filterNotNull().collect {
                    searchUserProducts(it)
                }
            }
        }
    }

    private suspend fun searchUserProducts(user: User) {
        productDAO.searchAllOfUser(user.id).collect {
            adapter.refresh(it)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_list_products, menu)

        return super.onCreateOptionsMenu(menu)
    }

//    override fun onResume() {
//        super.onResume()

        /*O handler serve para que qualquer exception lançada dentro de um escopo de
        coroutines ( outra thread ) seja coletada e tratada da forma que se programar (dentro
        do escopo do CoroutineExceptionHandler, onde colocará o codigo para tratar a exception).

        val handler = CoroutineExceptionHandler{ coroutineContext, throwable ->
            Toast.makeText(this, "Ocorreu um problema", Toast.LENGTH_LONG).show()
        }
        */
//        lifecycleScope.launch(/*handler + */ job + CoroutineName("procura os produtos para adicionar na lista")) {
//            productDAO.searchAll().collect{
//                adapter.refresh(it)
//            }
//            throw Exception("Exception no context de Main")
//        }

//    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val productDAO = AppDatabse.instance(this).productDAO()
        lifecycleScope.launch {
            user.value?.let { user ->
                var products: Flow<List<Product>>? = null
                when(item.itemId) {
                    R.id.menu_list_exit -> {
                        goTo(UserPerfilActivity::class.java)
                    }
                    R.id.menu_all_products -> {
                        goTo(AllProductsActivity::class.java)
                    }
                    R.id.menu_list_products_none -> {
                        products = productDAO.searchAllOfUser(user.id)
                    }
                    R.id.menu_list_products_name_ascending -> {
                        products = productDAO.searchOrdNameAsc(user.id)
                    }
                    R.id.menu_list_products_name_descending -> {
                        products = productDAO.searchOrdNameDesc(user.id)
                    }
                    R.id.menu_list_products_description_ascending -> {
                        products = productDAO.searchOrdDescriptionAsc(user.id)
                    }
                    R.id.menu_list_products_description_descending -> {
                        products = productDAO.searchOrdDescriptionDesc(user.id)
                    }
                    R.id.menu_list_products_price_ascending -> {
                        products = productDAO.searchOrdPriceAsc(user.id)
                    }
                    R.id.menu_list_products_price_descending -> {
                        products = productDAO.searchOrdPriceDesc(user.id)
                    }
                }
                products?.collect{
                    adapter.refresh(it)
                }
            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun configFab() {
        val add_button = binding.addButton
        add_button.setOnClickListener {
            goToFormProduct()
        }
    }

    private fun goToFormProduct() {
        val intent = Intent(this, FormProductActivity::class.java)
        startActivity(intent)
    }

    private fun configRecyclerView() {
        val recyclerView = binding.listaProdutos
        recyclerView.adapter = adapter
        adapter.whenClickOnItem = {
            val intent = Intent(this, ProductSpecificationActivity::class.java).apply {
                putExtra(PRODUCT_ID_KEY, it.id)
            }
            startActivity(intent)
        }
        adapter.whenClockOnEdit = {
            Intent(this, FormProductActivity::class.java).apply {
                putExtra(PRODUCT_ID_KEY, it.id)
                startActivity(this)
            }
        }
        adapter.whenClickOnDelet = {
            val db = AppDatabse.instance(this)
            val productDao = db.productDAO()
            lifecycleScope.launch {
                withContext(Dispatchers.IO) {
                    productDao.remove(it)
                }
            }
        }
    }

}