package com.example.clubquest

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query


@Dao
interface LeagueDoa {

    @Query("select * from league")
    suspend fun getAll(): List<League>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(vararg league: League)

    @Insert
    suspend fun insertUser(league: League)

    @Delete
    suspend fun deleteUser(league: League)

    @Query("delete from league")
    suspend fun deleteAll()

}