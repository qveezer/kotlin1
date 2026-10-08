fun task1() {
    val amount = 12_500.0
    val commission = maxOf(amount * 0.0075, 35.0)
    println("Сумма перевода: $amount руб.")
    println("Комиссия: $commission руб.")
}

fun task2Likes() {
    val likes = 32
    val lastTwo = likes % 100
    val lastOne = likes % 10
    val word = when {
        lastTwo in 11..14 -> "лайков"
        lastOne == 1      -> "лайк"
        lastOne in 2..4   -> "лайка"
        else              -> "лайков"
    }
    println("Понравилось $likes $word")
}

fun task2People() {
    val likes = 32
    val lastTwo = likes % 100
    val lastOne = likes % 10
    val word = when {
        lastTwo in 11..14 -> "людям"
        lastOne == 1      -> "человеку"
        lastOne in 2..4   -> "людям"
        else              -> "людям"
    }
    println("Понравилось $likes $word")
}

fun task3() {
    val purchase = 15_000.0
    val isRegular = true

    val discount = when {
        purchase <= 1_000  -> 0.0
        purchase <= 10_000 -> 100.0
        else               -> purchase * 0.05
    }

    val priceAfterBase = purchase - discount
    val finalPrice = if (isRegular) priceAfterBase * 0.99 else priceAfterBase

    println("Сумма покупки: $purchase руб.")
    println("Базовая скидка: $discount руб.")
    println("Итоговая цена: $finalPrice руб.")
}

fun main() {
    task1()
    task2Likes()
    task2People()
    task3()
}