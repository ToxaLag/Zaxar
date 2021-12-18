import java.io.FileInputStream
import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val scAct = Scanner(FileInputStream("roles.txt"))
    val scWords = Scanner(FileInputStream("roles_text.txt"))
    val roles = arrayListOf<String>()
    val words = arrayListOf<String>()
    val map = sortedMapOf<String, ArrayList<String>>()
    while (scAct.hasNextLine())
    roles.add(scAct.nextLine())
    while (scWords.hasNextLine())
    words.add(scWords.nextLine())
    for (i in 0..roles.size - 1) {
        val replika = arrayListOf<String>()
        var number = 1
        for (j in 0..words.size - 1) {
            if (roles[i] == words[j].substring(0, words[j].indexOf(":"))) {
                replika.add("${j + 1})${words[j].substring(words[j].indexOf(":") + 2)}\n")
            }
        else
            number++
        }
        map[roles[i]] = replika
    }
    for (i in map.keys){
        println("$i:")
        val slova = map[i]
        for (j in 0 until (slova?.size ?: -1 ))
            print("${slova?.get(j)}")
        println()
    }
}