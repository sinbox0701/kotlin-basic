fun main(){
    var s = Student2()
    s.name = "참새"
    s.displayAddressLength()
    s.address = "서울"
    s.displayInfo()
    //  var data = readLine()!!.toInt()

    var inputData = readLine()!!
    var data = inputData.toInt()
    println("Null아닌 값: ${data}")
}

class Student2 {
    lateinit var name:String
    //null 허용
    var address:String? = null
    
    fun displayInfo() {
        println("이름은: ${name} 입니다")
        println("주소는: ${address} 입니다")
    }

    fun displayAddressLength() {
        //safe call
        println("주소의 길이는: ${address?.length} 입니다")
        //elvis 연산자
        println("주소의 길이는: ${address?.length ?: "주소가 없습니다"} 입니다")
    }
}