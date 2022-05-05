package com.example.phonebook.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ContactDbModel(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "content") val content: String,
    @ColumnInfo(name = "can_be_checked_off") val canBeCheckedOff: Boolean,
    @ColumnInfo(name = "is_checked_off") val isCheckedOff: Boolean,
    @ColumnInfo(name = "tag_id") val tagId: Long,
    @ColumnInfo(name = "in_trash") val isInTrash: Boolean,




) {
    companion object {
        val DEFAULT_CONTACTS = listOf(
            ContactDbModel(1, "Father", "0912345678", false, false, 1, false),
            ContactDbModel(2, "Brother", "0912345678", false, false, 1, false),
            ContactDbModel(3, "Mother", "0819321654", false, false, 1, false),
            ContactDbModel(
                4,
                "Grandma",
                "0899999999",
                false,
                false,
                1,
                false

            ),
            ContactDbModel(5, "Taylor Swift", "0912345678", false, false, 1, false),
            ContactDbModel(6, "Colt Python", "0912345678", false, false, 1, false),
            ContactDbModel(7, "Katy Perry", "0912345678", false, false, 2, false),
            ContactDbModel(8, "Harry Style", "0912345678", false, false, 3, false),
            ContactDbModel(9, "Doctor Strange", "0912345678", false, false, 4, false),
            ContactDbModel(10, "Justin Timberlake", "0912345678", false, false, 5, false),
            ContactDbModel(11, "Jamie Oliver", "0912345678", true, false, 1, false),
            ContactDbModel(12, "Miyawaki Sakura", "0912345678", true, false, 2, false)
        )
    }
}


