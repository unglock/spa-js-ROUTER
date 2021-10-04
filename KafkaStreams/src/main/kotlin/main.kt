import org.apache.logging.log4j.kotlin.logger

fun main() {

    val logger = logger("Kafka Streams")

    val streamProperties = StreamProperties()
    val predictor = Predictor(streamProperties.configureProperties())
    val streamProcessor = Stream