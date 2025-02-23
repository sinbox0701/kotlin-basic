fun main() {
    // for 문 예시
    println("for 문 예시:")
    for (i in 1..5) {
        println("현재 값은 $i 입니다.")
    }

    // while 문 예시
    println("\nwhile 문 예시:")
    var j = 0
    while (j < 5) {
        println("현재 값은 $j 입니다.")
        j++
    }

    var infos = arrayOf("꿩", "닭", "참새", "오목눈이", "공작새")

    for(info in infos) {

        if(info == "참새") {
            println("찾았다 참새!")
						break
        } else {
            continue
        }
    }

    var catStatus = false
    println("고양이는 매우 배고픕니다..")
    println("사료를 10번 먹여주세요")


    // 고양이가 현재 배고프니까(false) 사료 배급가능
    if(catStatus == false) {
        for(idx in 0..9) {
            println("${idx}번째: 냠냠")
        }
    }

    // 사료를 10번 준 이후의 상태변화
    catStatus = true
    if(catStatus == true) {
        println("배부른 고양이입니다")
    }
}