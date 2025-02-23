/*
data class 클래스명(
    var 필드명: 타입,
    var 필드명: 타입,
    ...
)

sealed class 클래스명 {
   
}

object 클래스명 {
    var 필드명: 타입 = 값
    fun 메소드명() {
        // 메소드 내용
    }
}

enum class 클래스명 {
    // 열거형 상수
}
 */

 fun main() {
    
 }
 
 class Character {
    var name:String = ""
    var hairColor:String = ""
    var height:Double = 0.0
 
    fun fireBall() {
        println("파이어볼!")
    }
    fun compositing(device1:String, device2:String): String {
        var device3 = device1 + device2
        println("새로운 무기인 ${device3}입니다")
        return device3
    }
 }