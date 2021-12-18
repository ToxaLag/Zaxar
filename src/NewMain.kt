import java.io.FileInputStream
import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val scAct = Scanner(FileInputStream("roles.txt"))
    val scWords = Scanner(FileInputStream("roles_text.txt"))
    val roles = arrayListOf<String>()
    val words = arrayListOf<String>()
    val map = sortedMapOf<String, String>()
    while (scAct.hasNextLine())
        roles.add(scAct.nextLine())
    while (scWords.hasNextLine())
        words.add(scWords.nextLine())
    var number = 0
    for (i in words) {
        number++
        val actor = i.substring(0,i.indexOf(":"))
        if (actor in map.keys)
            map[actor]+= "\n$number) ${i.substring(i.indexOf(":")+2)}"
        else
            map[actor]="$number)${i.substring(i.indexOf(":")+2)}"
            }
    for ((key, value) in map){
        println("$key: \n$value \n")
    }
}