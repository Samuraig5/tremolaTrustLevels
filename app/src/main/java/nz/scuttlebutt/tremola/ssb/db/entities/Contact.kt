package nz.scuttlebutt.tremola.ssb.db.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters


@Entity(tableName = "Contact")
@TypeConverters(TrustLevelConverter::class)
/**
 *
 * lid = Log ID
 * alias = alias
 * isPub = isPublic
 * pict = ?
 * scan_low = ?
 * front_sequence = ?
 * front_previous = ?
 */
data class Contact(
    @PrimaryKey
    @ColumnInfo(name = "lid")            val lid: String,
    @ColumnInfo(name = "alias")          val alias: String?,
    @ColumnInfo(name = "isPub")          val isPub: Boolean,
    @ColumnInfo(name = "pict")           val pict: String?,
    @ColumnInfo(name = "scan_low")       val scan_low: Int,
    @ColumnInfo(name = "front_sequence") val front_seq: Int,
    @ColumnInfo(name = "front_previous") val front_prev: String?,
    @ColumnInfo(name = "trustLevel")     val trustLevel: trustLevel? = nz.scuttlebutt.tremola.ssb.db.entities.trustLevel.Restricted
)