package nz.scuttlebutt.tremola.ssb.db.entities

import androidx.room.TypeConverter

class TrustLevelConverter {
    @TypeConverter
    fun fromTrustLevel(trustLevel: trustLevel?): String? {
        // Convert trustLevel to String representation
        return trustLevel?.toString()
    }

    @TypeConverter
    fun toTrustLevel(trustLevelStr: String?): trustLevel? {
        // Convert String representation back to trustLevel
        return trustLevelStr?.let { trustLevel.valueOf(it) }
    }
}