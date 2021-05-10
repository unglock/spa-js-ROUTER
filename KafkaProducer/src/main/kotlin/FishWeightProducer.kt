import com.beust.klaxon.Klaxon
import org.apache.kafka.clients.producer.KafkaProducer
import org.apache.kafka.clients.producer.ProducerRecord
import org.apache.logging.log4j.kotlin.logger

class FishWeightProducer {

    private val logger = logger(javaClass.name)

    fun produceEvents(properties: ProducerProperties, data: List<String>): Thread {

        val thread = Thread {
            val klaxon = Klaxon()
            val kafkaProducer = KafkaProducer<String, String>(properties.co