package textRPG

class CheerLeader {
    var name:String = ""
    var age:Int = 0
    var gender:String = ""
    var money:Int = 0
    var hp:Int = 0

    constructor(_name:String, _age:Int, _gender:String, _money:Int, _hp:Int) {
        println("${name} 치어리더 생성")
        name = _name
        age = _age
        gender = _gender
        money = _money
        hp = _hp
    }

    fun cheer() {
        println("응원 - ${name} ${name}")
    }

    fun jump() {
        println("점프 - ${age}살")
    }

    fun clap() {
        println("박수 - 짝짝 짝짝짝")
    }    
}