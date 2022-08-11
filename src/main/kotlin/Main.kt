import lombok.ToString
import org.lipski.telegramma.Bot
import org.lipski.telegramma.enumeration.Method
import org.lipski.telegramma.model.Response
import org.lipski.telegramma.model.Update

class UpdateResponse : Response<List<Update>>()

fun main(args: Array<String>) {

    val telegram = Bot("https://api.telegram.org/", "5493311288:AAGkGKp_vdLyfS77MVQwtmYtk-JMGRWDICE")

    @Suppress("UNCHECKED_CAST")
    println(telegram.invokeMethod(Method.GET_UPDATES, emptyMap(), UpdateResponse::class.java))
}