import java.text.SimpleDateFormat
import java.util.*

data class FishWeight(
    val Fish_Id: String,
    val Species: String,
    val Weight: Double,
    val Timestamp: String? = SimpleDateFormat("yyyy-