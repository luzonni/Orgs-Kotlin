package com.zonni.orgs.ui.activity;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0011H\u0002J\u0016\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0016H\u0002J\b\u0010\u001a\u001a\u00020\u0016H\u0002J\u0010\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0013H\u0002J\u0012\u0010\u001d\u001a\u00020\u00162\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\b\u0010 \u001a\u00020\u0016H\u0014J\u0019\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020#H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J\b\u0010%\u001a\u00020\u0016H\u0002J\u0011\u0010&\u001a\u00020\u0016H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'J\u0016\u0010(\u001a\u00020)2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u0018H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006*"}, d2 = {"Lcom/zonni/orgs/ui/activity/FormProductActivity;", "Lcom/zonni/orgs/ui/activity/UserBaseActivity;", "()V", "binding", "Lcom/zonni/orgs/databinding/ActivityFormProductBinding;", "getBinding", "()Lcom/zonni/orgs/databinding/ActivityFormProductBinding;", "binding$delegate", "Lkotlin/Lazy;", "productDao", "Lcom/zonni/orgs/database/dao/ProductDAO;", "getProductDao", "()Lcom/zonni/orgs/database/dao/ProductDAO;", "productDao$delegate", "productID", "", "urlThumb", "", "buildProduct", "Lcom/zonni/orgs/modelo/Product;", "userId", "configAutoCompletTextView", "", "users", "", "configFieldUser", "configSaveButton", "fillFields", "loadedProduct", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "setUserId", "user", "Lcom/zonni/orgs/modelo/User;", "(Lcom/zonni/orgs/modelo/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryGetProduct", "trySaveProduct", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "validUser", "", "app_debug"})
public final class FormProductActivity extends com.zonni.orgs.ui.activity.UserBaseActivity {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy binding$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy productDao$delegate = null;
    @org.jetbrains.annotations.Nullable
    private java.lang.String urlThumb;
    private long productID = 0L;
    
    public FormProductActivity() {
        super();
    }
    
    private final com.zonni.orgs.databinding.ActivityFormProductBinding getBinding() {
        return null;
    }
    
    private final com.zonni.orgs.database.dao.ProductDAO getProductDao() {
        return null;
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    protected void onResume() {
    }
    
    private final void tryGetProduct() {
    }
    
    private final void configFieldUser() {
    }
    
    private final void configAutoCompletTextView(java.util.List<java.lang.String> users) {
    }
    
    private final boolean validUser(java.util.List<java.lang.String> users) {
        return false;
    }
    
    private final void fillFields(com.zonni.orgs.modelo.Product loadedProduct) {
    }
    
    private final void configSaveButton() {
    }
    
    private final java.lang.Object trySaveProduct(kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final java.lang.Object setUserId(com.zonni.orgs.modelo.User user, kotlin.coroutines.Continuation<? super java.lang.String> $completion) {
        return null;
    }
    
    private final com.zonni.orgs.modelo.Product buildProduct(java.lang.String userId) {
        return null;
    }
}