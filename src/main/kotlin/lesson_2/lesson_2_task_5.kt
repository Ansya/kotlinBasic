package lesson_2

import kotlin.math.pow

fun main() {
    val depositAmount = 70000
    val interestRate = 16.7
    val years = 20

    val finalDepositAmount = depositAmount * (1 + interestRate / ONE_HUNDRED_PERCENT).pow(years)

    println("Final deposit amount is %.3f RUB".format(finalDepositAmount))
}
