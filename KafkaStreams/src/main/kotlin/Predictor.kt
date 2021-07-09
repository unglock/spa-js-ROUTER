import com.beust.klaxon.Klaxon
import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import kotlinx.coroutines.runBlocking
import org.apache.logging.log4j.kotlin.logger
import java.util.*

class Predictor(private val properties: Properties) {

    private val logger = logger(javaClass.name)

    fun requestWeight(fish: Fish): Fish {

        val url: String = properties.getProperty("MODEL_URL")

        val response