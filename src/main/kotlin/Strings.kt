fun main () {
    val myMessage = "Happy Birthday! "
    val myAnotherMessage = "Justin!"
    val message1 = "apada"
    val message2 = "adapa"
    val givenName = "Alexzandre"
    val familyName = "Dilag"
    val middleName = "Espartero"



//  Combines 2 strings
    println(myMessage.plus(myAnotherMessage))
//  Returns the length of the String
    println(myMessage.length)
//  Returns a boolean if the two strings are equal
    println(myMessage.contentEquals(myAnotherMessage))
//  Converts the string into lowercase
    println(myMessage.lowercase())
//  Removes the part of the strings
    println(myMessage.substring(1,myMessage.length))
//  Check if 2 strings are palindrome
    println(message1.contentEquals(message2.reversed()))

    println("My full name is $givenName ${middleName.get(0)}. ${familyName}")

    val nickName = "akki"
    val product = 100
    val amount = 10

    println("Hey, ${nickName.replaceFirstChar { it.titlecase() }}, the amount of your purchase is ${product * amount} pesos")

}