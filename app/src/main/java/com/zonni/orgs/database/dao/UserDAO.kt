package com.zonni.orgs.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.zonni.orgs.modelo.Product
import com.zonni.orgs.modelo.User
import kotlinx.coroutines.flow.Flow

@Dao
interface UserDAO {

    @Query("SELECT * FROM User")
    fun searchAll(): Flow<List<User>>

    @Insert
    suspend fun insert(user: User)

    @Query("SELECT * FROM User WHERE id = :id")
    fun searchWithId(id: String) : Flow<User>

    @Query("SELECT * FROM User WHERE id = :userId AND password = :password")
    suspend fun authenticate(userId: String, password: String) : User?

}