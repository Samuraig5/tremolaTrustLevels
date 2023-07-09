package nz.scuttlebutt.tremola.ssb.db.entities

enum class trustLevel {
    // No notifications and alike are supposed to be shown to the user
    Restricted,
    // ...
    Strangers,
    // ...
    Acquaintances,
    // ...
    Friends
}