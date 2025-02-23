fun main() {
    var myMathScore = readLine()!!.toInt()
    
    var myRank = checkRank(myMathScore)
    println("나의 등급은 : ${myRank}")
}

fun checkRank(score:Int) : String {
    return when(score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}