package lesson_2

fun main() {
    val numberOfEmployees = 50
    val employeeSalary = 30000

    var salaryCost = numberOfEmployees * employeeSalary
    println("Costs of paying salaries to employees is $salaryCost")

    val numberOfInterns = 30
    val internSalary = 20000
    salaryCost += numberOfInterns * internSalary
    println("Costs of paying salaries to employees and to interns is $salaryCost")

    val averageSalary = salaryCost / (numberOfEmployees + numberOfInterns)
    println("Average salary now is $averageSalary")

}