import java.io.FileInputStream
import java.util.*

fun main() {
    val rol = Scanner(FileInputStream("roles.txt"))
    val roles = arrayListOf<String>()
    val rep = Scanner(FileInputStream("roles_text.txt"))
    val replik = arrayListOf<String>()
    while (rol.hasNextLine()) {
        roles.add(rol.nextLine())
    }
    while (rep.hasNextLine())
        replik.add(rep.nextLine())
    for (t in roles) {
        println("$t:")
        var number = 1
        for (i in replik) {
            if (i.substring(0, i.indexOf(":")) == t) {
                print("$number) ${i.substring(i.indexOf(":") + 2)}\n")
                number++
            }
            else
                number ++
        }
        println()
    }
}