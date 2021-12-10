import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.mockkClass
import org.apache.kafka.common.serialization.StringDeserializer
import org.apache.kafka.common.serialization.StringSerializer
import org.apache.kafka.streams.KeyValue
import org.apache.kafka.streams.StreamsConfig
import org.apache.kafka.streams.TopologyTestDriver
import java.util.*

class StreamProcessorTest : StringSpec() {

    private val input = Fish("id", "salmon", 1.0, 1.0, "today", null)
    private val expectedOutput = Fish("id", "salmon", 1.0, 1.0, "today", Prediction(2.0, "yesterday"))

    private val properties = Properties()

    init {

        "Stream Processor works correctly"{

            // Predictor Mock
            val mockPredictor = mockkClass(Predictor::class)
        