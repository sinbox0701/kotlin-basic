fun main() {
    while(true) {
        try {
            var num1 = readLine()!!.toInt()
            println("내가 입력한 숫자는 ${num1}입니다")
            break
        } catch(e:java.lang.NumberFormatException) {
            println("숫자를 입력하세요")
        }
    }
}