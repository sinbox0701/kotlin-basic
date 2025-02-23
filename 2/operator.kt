fun main() {
    var num1 = 30
    var num2 = 10
    
    // 덧셈 연산자(+)사용해서 num1과 num2를 더한후에 plusResult에 대입함
    var plusResult = num1 + num2
    println("num1 + num2는 ${plusResult}이야")

    // 뺄셈 연산자(-)사용해서 num1에서 num2를 뺀후에 minusResult에 대입함
    var minusResult = num1 - num2
    println("num1 - num2는 ${minusResult}이야")

    // 곱셈 연산자(*)사용해서 num1과 num2를 곱한후에 multipleResult에 대입함
    var multipleResult = num1 * num2
    println("num1 * num2는 ${multipleResult}이야")

    // 나눗셈 연산자(/)사용해서 num1에서 num2를 나눈후에 divideResult에 대입함
    var divideResult = num1 / num2
    println("num1 / num2는 ${divideResult}이야")
    
    // num2를 10에서 7로 변경
    num2 = 7

    // 나머지 연산자(%)사용해서 num1에서 num2를 나눈 나머지를 modResult에 대입함
    var modResult = num1 % num2
    println("num1 % num2는 정수로 ${modResult}야")

    // = 기준으로
    // 오른쪽: "참새"
    // 왼쪽의 이름: name
    // 즉, "참새"를 name변수에 대입한다라고 읽을 수 있음
    var name = "참새"
    println("내 이름은 ${name}")

    // = 기준으로
    // 오른쪽: 10
    // 왼쪽의 이름: age
    // 즉, 10을 age변수에 대입한다라고 읽을 수 있음
    val age = 10
    println("내 나이는 ${age}")

    var num3 = 30
    var num4 = 10

    // 산술연산자와 대입연산자를 따로 사용
    // num1의 값을 10 증가시켜서 40을 만들고 싶다면?
    num3 = num3 + 10
    println("산술, 대입 따로 적용한 결과 ${num3}")

    // 복합대입연산자를 사용
    // num2의 값을 10 증가시켜서 20을 만들고 싶다면?
    num4 += 10
    println("산술, 대입 따로 적용한 결과 ${num4}")
    
    // 뺄셈, 곱셈, 나눗셈, 나머지연산도 동일하게 사용가능해요
    // 뺄셈: a-=b
    // 곱셈: a*=b
    // 나눗셈: a/=b
    // 나머지: a%=b

    var num5 = 30
    var num6 = 10

    // num1의 값을 1 증가시키고 싶다면?

    // 1) 산술연산자, 대입연산자 따로 사용
    num5 = num5 + 1
    println("(num5_1): 산술,대입 연산자 따로 사용해서 1증가 ${num5}")

    // 2) 복합대입연산자 사용
    num5 += 1
    println("(num5_2): 복합대입연산자 사용해서 1증가 ${num6}")

    // 3) 증감 연산자
    num5++
    println("(num5_3): 증가연산자 사용해서 1증가 ${num5}")

    println("====================================================")

    // num2의 값을 1 감소시키고 싶다면?

    // 1) 산술연산자, 대입연산자 따로 사용
    num6 = num6 - 1
    println("(num6_1): 산술,대입 연산자 따로 사용해서 1감소 ${num6}")

    // 2) 복합대입연산자 사용
    num6 -= 1
    println("(num2_2): 복합대입연산자 사용해서 1감소 ${num2}")

    // 3) 증감 연산자
    num6--
    println("(num6_3): 증가연산자 사용해서 1감소 ${num6}")

    var num7 = 10
	var num8 = 20
    var num9 = 30
    
    // 후위연산자는 println연산을 실행후에 증감해요
    println(num7++)
    println(num7)
    
    // 전위연산자는 println연산 실행전에 증감해요
    println(++num8)
    println(num8)
    
    num9++
    println(num9)
    
    ++num9
    println(num9)

    var num10 = 10
    var num11 = 20
    var num12 = 30

    // 후위연산자는 println연산을 실행후에 증감해요
    println(num10++)
    println(num10)

    // 전위연산자는 println연산 실행전에 증감해요
    println(++num11)
    println(num11)

    num12++
    println(num12)

    ++num12
    println(num12)

}