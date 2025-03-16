fun roundNumber(number: Int): String {
    return if (number < 1000) {
        number.toString()
    } else {
        val thousands = number / 1000
        "${thousands}К"
    }
}

fun main() {
    println(roundNumber(1272)) // Вывод: 1К
    println(roundNumber(999))   // Вывод: 999
    println(roundNumber(1000))  // Вывод: 1К
    println(roundNumber(5000))  // Вывод: 5К
}
