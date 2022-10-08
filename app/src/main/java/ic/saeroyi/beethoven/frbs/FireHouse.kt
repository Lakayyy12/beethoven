package ic.saeroyi.beethoven.frbs

import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class FireHouse {
    lateinit var databaseReference: DatabaseReference
    fun getDatabase(): DatabaseReference {
        val database = FirebaseDatabase.getInstance()
        databaseReference = database.getReference("JumpingCode")
        return databaseReference
    }
}