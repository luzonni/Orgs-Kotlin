package com.zonni.orgs.database;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Lcom/zonni/orgs/database/AppDatabse;", "Landroidx/room/RoomDatabase;", "()V", "productDAO", "Lcom/zonni/orgs/database/dao/ProductDAO;", "userDAO", "Lcom/zonni/orgs/database/dao/UserDAO;", "Companion", "app_debug"})
@androidx.room.Database(entities = {com.zonni.orgs.modelo.Product.class, com.zonni.orgs.modelo.User.class}, version = 3, exportSchema = false)
@androidx.room.TypeConverters(value = {com.zonni.orgs.database.converter.Converters.class})
public abstract class AppDatabse extends androidx.room.RoomDatabase {
    @kotlin.jvm.Volatile
    private static volatile com.zonni.orgs.database.AppDatabse db;
    @org.jetbrains.annotations.NotNull
    public static final com.zonni.orgs.database.AppDatabse.Companion Companion = null;
    
    public AppDatabse() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.zonni.orgs.database.dao.ProductDAO productDAO();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.zonni.orgs.database.dao.UserDAO userDAO();
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/zonni/orgs/database/AppDatabse$Companion;", "", "()V", "db", "Lcom/zonni/orgs/database/AppDatabse;", "instance", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.zonni.orgs.database.AppDatabse instance(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return null;
        }
    }
}