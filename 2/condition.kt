fun main() {
    val number = 10

    // if 문 예시
    if (number > 0) {
        println("$number 는 양수입니다.")
    } else if (number < 0) {
        println("$number 는 음수입니다.")
    } else {
        println("$number 는 0 입니다.")
    }

    // when 문 예시
    val day = 3
    val dayString = when (day) {
        1 -> "월요일"
        2 -> "화요일"
        3 -> "수요일"
        4 -> "목요일"
        5 -> "금요일"
        6 -> "토요일"
        7 -> "일요일"
        else -> "잘못된 요일"
    }
    println("오늘은 $dayString 입니다.")
}