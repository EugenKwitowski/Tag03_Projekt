fun main(){
    // Erzeuge eigene Variablen ohne Compilerfehler
    var age: Int = 38
    var location: String = "Frankfurt am Main"
    println(location + " " + age)

    println(age)
    println(location)

    println(location + "\n" + age)

    println("wie ist dein Name?")
    readln()
    println("Hallo, Eugen!")
    println("Wie lange dauert dein Kurs?")
    readln()
    var month: String = "12"
    var month2: Int = month.toInt()
    var month3: String = " Monate"
    println("$month2 $month3")
}