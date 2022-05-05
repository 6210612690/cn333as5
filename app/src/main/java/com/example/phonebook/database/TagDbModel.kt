package com.example.phonebook.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class TagDbModel(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo(name = "hex") val hex: String,
    @ColumnInfo(name = "name") val name: String
) {
    companion object {
        val DEFAULT_TAGS = listOf(
            TagDbModel(1, "#FADAE0","Family"),
            TagDbModel(2, "#FFFDC2","Friend"),
            TagDbModel(3, "#99DECF","Work"),
            TagDbModel(4, "#AEC3EF","ETC"),
            TagDbModel(5, "#E2DBFF","Emergency"),

        )
        val DEFAULT_TAG = DEFAULT_TAGS[0]
    }
}
