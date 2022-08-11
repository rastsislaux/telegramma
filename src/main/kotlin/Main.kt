import org.lipski.telegramma.Bot

fun main(args: Array<String>) {

    val telegram = Bot("https://api.telegram.org/", "5493311288:AAGkGKp_vdLyfS77MVQwtmYtk-JMGRWDICE")

    println(telegram.token)
}