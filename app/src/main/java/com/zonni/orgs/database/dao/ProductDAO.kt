package com.zonni.orgs.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.zonni.orgs.modelo.Product
import kotlinx.coroutines.flow.Flow

@Dao
interface ProductDAO {
    //Suspend fun é um metodo que so pode ser chamado dentro de um contexto de coroutines.
    @Query("SELECT * FROM Product")
    fun searchAll(): Flow<List<Product>>

    @Query("SELECT * FROM Product WHERE userId = :userId")
    fun searchAllOfUser(userId: String): Flow<List<Product>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(product: Product)

    @Insert
    suspend fun insertAll(vararg products: Product)

    @Delete
    suspend fun remove(vararg products: Product)

    @Query("DELETE FROM Product WHERE id =:id")
    suspend fun removeWithId(id: Long)

    @Update
    suspend fun update(vararg product: Product)

    @Query("SELECT * FROM Product WHERE id = :id")
    suspend fun searchWithId(id: Long) : Product

    @Query("SELECT * FROM Product WHERE userId = :userId ORDER BY nome ASC")
    fun searchOrdNameAsc(userId: String) : Flow<List<Product>>

    @Query("SELECT * FROM Product WHERE userId = :userId ORDER BY nome DESC")
    fun searchOrdNameDesc(userId: String) : Flow<List<Product>>

    @Query("SELECT * FROM Product WHERE userId = :userId ORDER BY descriptor ASC")
    fun searchOrdDescriptionAsc(userId: String) : Flow<List<Product>>

    @Query("SELECT * FROM Product WHERE userId = :userId ORDER BY descriptor DESC")
    fun searchOrdDescriptionDesc(userId: String) : Flow<List<Product>>

    @Query("SELECT * FROM Product WHERE userId = :userId ORDER BY price ASC")
    fun searchOrdPriceAsc(userId: String) : Flow<List<Product>>

    @Query("SELECT * FROM Product WHERE userId = :userId ORDER BY price DESC")
    fun searchOrdPriceDesc(userId: String) : Flow<List<Product>>


}