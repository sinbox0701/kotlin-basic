fun main() {
    var kors = arrayOf(90, 94, 96)
    for((idx, kor) in kors.withIndex()) {
        println("${idx + 1}번째 국어 점수는 ${kor}입니다")
    }
}