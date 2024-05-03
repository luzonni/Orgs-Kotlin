package com.zonni.orgs.ui.activity;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010\u0015\u001a\u00020\u0013H\u0002J\u0012\u0010\u0016\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0019\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\"H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006$"}, d2 = {"Lcom/zonni/orgs/ui/activity/ListProductsActivity;", "Lcom/zonni/orgs/ui/activity/UserBaseActivity;", "()V", "adapter", "Lcom/zonni/orgs/ui/reciclerview/adapter/ListProdutcsAdapter;", "binding", "Lcom/zonni/orgs/databinding/ListProductsMainBinding;", "getBinding", "()Lcom/zonni/orgs/databinding/ListProductsMainBinding;", "binding$delegate", "Lkotlin/Lazy;", "job", "Lkotlinx/coroutines/CompletableJob;", "productDAO", "Lcom/zonni/orgs/database/dao/ProductDAO;", "getProductDAO", "()Lcom/zonni/orgs/database/dao/ProductDAO;", "productDAO$delegate", "configFab", "", "configRecyclerView", "goToFormProduct", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "searchUserProducts", "user", "Lcom/zonni/orgs/modelo/User;", "(Lcom/zonni/orgs/modelo/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class ListProductsActivity extends com.zonni.orgs.ui.activity.UserBaseActivity {
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.CompletableJob job = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy productDAO$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final com.zonni.orgs.ui.reciclerview.adapter.ListProdutcsAdapter adapter = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy binding$delegate = null;
    
    public ListProductsActivity() {
        super();
    }
    
    private final com.zonni.orgs.database.dao.ProductDAO getProductDAO() {
        return null;
    }
    
    private final com.zonni.orgs.databinding.ListProductsMainBinding getBinding() {
        return null;
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final java.lang.Object searchUserProducts(com.zonni.orgs.modelo.User user, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull
    android.view.MenuItem item) {
        return false;
    }
    
    private final void configFab() {
    }
    
    private final void goToFormProduct() {
    }
    
    private final void configRecyclerView() {
    }
}