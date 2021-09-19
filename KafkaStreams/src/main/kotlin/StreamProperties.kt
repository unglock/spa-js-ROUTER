import org.apache.kafka.streams.StreamsConfig
import java.util.*

class StreamProperties {

    fun configureProperties(): Properties {

        val settings = Properties()
        settings.setProperty(StreamsCo