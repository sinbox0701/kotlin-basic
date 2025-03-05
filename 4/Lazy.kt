fun main(){
    var s1 = Student1()
    s1.name = "참새"
    s1.displayInfo()

    s1.age = 10
    s1.displayInfo()
}

class Student1 {
    lateinit var name:String
    var age:Int = 0
    val address: String by lazy {
        println("address 초기화")
        "seoul"
    }

    fun displayInfo() {
        println("이름은: ${name} 입니다.")
        println("나이는: ${age} 입니다.")
        println("주소는: ${address} 입니다.")
    }
}