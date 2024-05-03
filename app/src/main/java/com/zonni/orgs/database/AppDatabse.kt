package com.zonni.orgs.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.zonni.orgs.database.converter.Converters
import com.zonni.orgs.database.dao.ProductDAO
import com.zonni.orgs.database.dao.UserDAO
import com.zonni.orgs.modelo.Product
import com.zonni.orgs.modelo.User

@Database(
    entities = [
        Product::class,
        User::class
    ],
    version = 3,
    exportSchema = false
)
@TypeConverters(Converters::class)
abstract class AppDatabse : RoomDatabase() {
    abstract fun productDAO(): ProductDAO
    abstract fun userDAO(): UserDAO
    companion object {
        //Volatile é uma anotação que ajuda a coleta de um valor por multiplas threads com segurança.
        @Volatile
        private lateinit var db: AppDatabse
        fun instance(context: Context) : AppDatabse {
            if(::db.isInitialized) return db
            return Room.databaseBuilder(
                context,
                AppDatabse::class.java,
                "orgs.db"
            ).addMigrations(MIGRATION_1_2, MIGRATION_2_3).build().also {
                db = it
            }
        }
    }
}