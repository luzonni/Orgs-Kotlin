package com.zonni.orgs.ui.activity;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0011\u0010\u0010\u001a\u00020\u0011H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0011\u0010\u0013\u001a\u00020\u0011H\u0084@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\b\u0010\u0014\u001a\u00020\u0011H\u0002J\u0012\u0010\u0015\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0019\u001a\u00020\u001aH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u0014\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u001e0\u001dH\u0004R\u0016\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0007X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001f"}, d2 = {"Lcom/zonni/orgs/ui/activity/UserBaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "_user", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/zonni/orgs/modelo/User;", "user", "Lkotlinx/coroutines/flow/StateFlow;", "getUser", "()Lkotlinx/coroutines/flow/StateFlow;", "userDAO", "Lcom/zonni/orgs/database/dao/UserDAO;", "getUserDAO", "()Lcom/zonni/orgs/database/dao/UserDAO;", "userDAO$delegate", "Lkotlin/Lazy;", "checkUserLogged", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deslogar", "goToLogin", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "searchUser", "userId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "users", "Lkotlinx/coroutines/flow/Flow;", "", "app_debug"})
public abstract class UserBaseActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy userDAO$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.zonni.orgs.modelo.User> _user = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.zonni.orgs.modelo.User> user = null;
    
    public UserBaseActivity() {
        super();
    }
    
    private final com.zonni.orgs.database.dao.UserDAO getUserDAO() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    protected final kotlinx.coroutines.flow.StateFlow<com.zonni.orgs.modelo.User> getUser() {
        return null;
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull
    protected final kotlinx.coroutines.flow.Flow<java.util.List<com.zonni.orgs.modelo.User>> users() {
        return null;
    }
    
    private final java.lang.Object checkUserLogged(kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final java.lang.Object searchUser(java.lang.String userId, kotlin.coroutines.Continuation<? super com.zonni.orgs.modelo.User> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    protected final java.lang.Object deslogar(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final void goToLogin() {
    }
}