fun main() {
    val number = 320
    print("შედეგი: ${getResult(number)}")
}

fun getResult(number: Int): Int {

    var num = number
    var sum = 0
    var multiplication = 1

    while (num != 0) {
        sum += num % 10
        multiplication *= num % 10
        num /= 10
    }

    print("ნამრავლი: $multiplication ")
    print("ჯამი: $sum ")

    return multiplication - sum

}
