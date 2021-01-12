package com.mvvm_demo.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.mvvm_demo.db.dao.ExampleDao
import com.mvvm_demo.db.entities.Example

@Database(entities = arrayOf(Example::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun exampleDao(): ExampleDao
}