package com.example.micvica.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.micvica.data.dao.UserDao
import com.example.micvica.data.entities.User


@Database(entities = [User::class], version = 1)
abstract class UserDatabase: RoomDatabase()
{
    abstract fun UserDao():UserDao
}