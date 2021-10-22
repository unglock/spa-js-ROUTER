import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe
import java.util.*

class PredictorIntTest: StringSpec() {

    init {

        "Integration works correctly" {

            // first run docker-compose file in KafkaStreams/src/test/resources

            val properties =  Properties()
            properties.setProperty("MODEL_URL", "http://localhost:8000/prediction")

            val predictor = Predictor(pr