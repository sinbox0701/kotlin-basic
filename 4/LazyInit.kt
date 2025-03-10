// fun main(){
//     var s1 = Student()
//     s1.name = "참새"
//     s1.displayInfo()

//     s1.age = 10
//     s1.displayInfo()
// }

// class Student {
//     lateinit var name:String
//     var age:Int = 0

//     fun displayInfo() {
//         println("이름은: ${name} 입니다.")
//         println("나이는: ${age} 입니다.")
//     }
// }

fun main(){
    var s1 = Student()
    s1.name = "참새"
    s1.displayInfo()

    s1.age = 10
    s1.displayInfo()
}

class Student {
    lateinit var name:String
    var age:Int = 0

    fun displayInfo() {
        // 이름이 초기화되었는지 확인
		if(this::name.isInitialized) {
	        println("이름은: ${name} 입니다.")
	        println("나이는: ${age} 입니다.")
		} else {
			println("name변수를 초기화해주세요.")
		}
    }
}