/**
 * Created by keyurgolani on 6/1/17.
 */

package learning

import kotlin.coroutines.experimental.EmptyCoroutineContext.plus

fun main(args: Array<String>) {

    // Hello World

    println("Hello World")

    // Variables

    val name = "Keyur"
    var myAge = 25
    myAge += 1

    val bigInt: Int = Int.MAX_VALUE
    val smallInt: Int = Int.MIN_VALUE

    println("Biggest Int: ${bigInt}")
    println("Smallest Int: ${smallInt}")

    var bigLong: Long = Long.MAX_VALUE
    var smallLong: Long = Long.MIN_VALUE

    println("Biggest Long : ${bigLong}")
    println("Smallest Long : ${smallLong}")

    var bigDouble: Double = Double.MAX_VALUE
    var smallDouble: Double = Double.MIN_VALUE

    println("Biggest Double : ${bigDouble}")
    println("Smallest Double : ${smallDouble}")

    var bigFloat: Float = Float.MAX_VALUE
    var smallFloat: Float = Float.MIN_VALUE

    println("Biggest Float : ${bigFloat}")
    println("Smallest Float : ${smallFloat}")

    var double1: Double = 1.1111111111111111
    var double2: Double = 1.1111111111111111

    println("Sum: ${double1 + double2}")

    if (true is Boolean) {
        print("True is Boolean\n")
    }

    val letterGrade: Char = 'A'

    print("A is a Char ${letterGrade is Char}")

    println("3.14 to Int: ${3.14.toInt()}")

    println("A to Int: ${letterGrade.toInt()}")
    println("65 to Char: ${65.toChar()}")

    // Strings

    val longStr = """
This is a long, long, long string"""

    var friendFirstName: String = "Hardik"
    var friendLastName: String = "Shah"

    friendFirstName = "Harry"

    var friend = friendFirstName + " " + friendLastName

    println("Friend: ${friend}")

    println("1 + 2 = ${1 + 2}")

    println("Friend Name Length: ${friend.length}")

    println("Strings Equal .equal different strings: ${"This".equals("That")}")
    println("Strings Equal .equal different objects same string: ${"This".equals("This")}")
    println("Strings Equal .equal same object: ${friend.equals(friend)}")
    println("Strings Equal == different strings: ${"This" == "That"}")
    println("Strings Equal == different objects same string: ${"This" == "This"}")
    println("Strings Equal == same object: ${friend == friend}")

    println("Strings Equal .compareTo different strings: ${"This".compareTo("That")}")
    println("Strings Equal .compareTo different objects same string: ${"This".compareTo("This")}")
    println("Strings Equal .compareTo same object: ${friend.compareTo(friend)}")

    println("2nd Index for Friend: ${friend[2]}")

    println("Friend Sub Name Idx 2 - 7: ${friend.subSequence(2, 8)}")

    println("Contains Hardik: ${friend.contains("Hardik")}")

    // Arrays

    var myArray = arrayOf(1, 3.14, "Harry")

    println("2nd Index: ${myArray[2]}")

    myArray[2] = 2.71828;
    // TODO: Check in depth why this is not supported. If appropriate, get it supported somehow. ;)
//    myArray[1] += 2

    myArray[1] = 2

    println("Array Length: ${myArray.size}")

    println("Friend Harry Inside: ${myArray.contains("Harry")}")

    println("SubArray: ${myArray.copyOfRange(0, 1)}")

    println("First Element: ${myArray.first()}")
    println("Last Element: ${myArray.last()}")

    println("Where is Harry: ${myArray.indexOf("Harry")}")
    println("Where is Pi: ${myArray.indexOf(3.14)}")
    println("Where is 'e': ${myArray.indexOf(2.71828)}")

}


