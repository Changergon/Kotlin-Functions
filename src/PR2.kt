fun getYearsEnding(years: Int): String {
    return when {
        years % 10 == 1 && years % 100 != 11 -> "$years год"
        years % 10 in 2..4 && (years % 100 < 10 || years % 100 > 20) -> "$years года"
        else -> "$years лет"
    }
}

fun main() {
    println(getYearsEnding(1))   // Вывод: 1 год
    println(getYearsEnding(2))   // Вывод: 2 года
    println(getYearsEnding(5))   // Вывод: 5 лет
    println(getYearsEnding(21))  // Вывод: 21 год
    println(getYearsEnding(22))  // Вывод: 22 года
    println(getYearsEnding(25))  // Вывод: 25 лет
    println(getYearsEnding(11))  // Вывод: 11 лет
}

