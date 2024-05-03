package com.zonni.orgs.database.dao;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J%\u0010\u0007\u001a\u00020\u00032\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\t\"\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ%\u0010\u000b\u001a\u00020\u00032\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\t\"\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0019\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0014\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00120\u0011H\'J\u001c\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00120\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\'J\u001c\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00120\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\'J\u001c\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00120\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\'J\u001c\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00120\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\'J\u001c\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00120\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\'J\u001c\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00120\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\'J\u001c\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00120\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\'J\u0019\u0010\u001c\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ%\u0010\u001d\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\t\"\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001e"}, d2 = {"Lcom/zonni/orgs/database/dao/ProductDAO;", "", "insert", "", "product", "Lcom/zonni/orgs/modelo/Product;", "(Lcom/zonni/orgs/modelo/Product;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertAll", "products", "", "([Lcom/zonni/orgs/modelo/Product;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "remove", "removeWithId", "id", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchAll", "Lkotlinx/coroutines/flow/Flow;", "", "searchAllOfUser", "userId", "", "searchOrdDescriptionAsc", "searchOrdDescriptionDesc", "searchOrdNameAsc", "searchOrdNameDesc", "searchOrdPriceAsc", "searchOrdPriceDesc", "searchWithId", "update", "app_debug"})
@androidx.room.Dao
public abstract interface ProductDAO {
    
    @androidx.room.Query(value = "SELECT * FROM Product")
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.zonni.orgs.modelo.Product>> searchAll();
    
    @androidx.room.Query(value = "SELECT * FROM Product WHERE userId = :userId")
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.zonni.orgs.modelo.Product>> searchAllOfUser(@org.jetbrains.annotations.NotNull
    java.lang.String userId);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull
    com.zonni.orgs.modelo.Product product, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Insert
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insertAll(@org.jetbrains.annotations.NotNull
    com.zonni.orgs.modelo.Product[] products, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object remove(@org.jetbrains.annotations.NotNull
    com.zonni.orgs.modelo.Product[] products, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM Product WHERE id =:id")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object removeWithId(long id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Update
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object update(@org.jetbrains.annotations.NotNull
    com.zonni.orgs.modelo.Product[] product, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM Product WHERE id = :id")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object searchWithId(long id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.zonni.orgs.modelo.Product> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM Product WHERE userId = :userId ORDER BY nome ASC")
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.zonni.orgs.modelo.Product>> searchOrdNameAsc(@org.jetbrains.annotations.NotNull
    java.lang.String userId);
    
    @androidx.room.Query(value = "SELECT * FROM Product WHERE userId = :userId ORDER BY nome DESC")
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.zonni.orgs.modelo.Product>> searchOrdNameDesc(@org.jetbrains.annotations.NotNull
    java.lang.String userId);
    
    @androidx.room.Query(value = "SELECT * FROM Product WHERE userId = :userId ORDER BY descriptor ASC")
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.zonni.orgs.modelo.Product>> searchOrdDescriptionAsc(@org.jetbrains.annotations.NotNull
    java.lang.String userId);
    
    @androidx.room.Query(value = "SELECT * FROM Product WHERE userId = :userId ORDER BY descriptor DESC")
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.zonni.orgs.modelo.Product>> searchOrdDescriptionDesc(@org.jetbrains.annotations.NotNull
    java.lang.String userId);
    
    @androidx.room.Query(value = "SELECT * FROM Product WHERE userId = :userId ORDER BY price ASC")
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.zonni.orgs.modelo.Product>> searchOrdPriceAsc(@org.jetbrains.annotations.NotNull
    java.lang.String userId);
    
    @androidx.room.Query(value = "SELECT * FROM Product WHERE userId = :userId ORDER BY price DESC")
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.zonni.orgs.modelo.Product>> searchOrdPriceDesc(@org.jetbrains.annotations.NotNull
    java.lang.String userId);
}