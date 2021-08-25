package com.example.micvica
import android.app.Application
import androidx.room.Room
import com.example.micvica.data.UserDatabase

class MoneyApp : Application()
{
    companion object{
        lateinit var database: UserDatabase
    }
    override fun onCreate() {
        super.onCreate()


        database = Room.databaseBuilder(
            this,
            UserDatabase::class.java,
            "debtor_db"
        ).build()


    }
}