import java.time.LocalDate
import java.time.Period


fun main() {
    println("What is your name")
    val yourName = readLine()
    println("Please input your birth year")
    val birthYear = readLine()!!.toInt()
    println("Please input your birth month in mm format")
    val birthMonth = readLine()!!.toInt()
    println("Please input your birth date in dd format")
    val birthDate = readLine()!!.toInt()
    val yourAge = 2021 - birthYear
    val age =  Period.between(LocalDate.of(birthYear,birthMonth,birthDate), LocalDate.now())

    println("You are $yourName and you are ${age.years} years, ${age.months} months, ${age.days} days old")

}

