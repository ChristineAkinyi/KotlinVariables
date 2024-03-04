fun main() {
       printFullName("Beryl", "Omwenga")
       printAge(20)
       writePhoneNumber("0756987623")
       weightInKg(49.8)
       citizenship("isKenyanCitizen")




}

fun printFullName(fName:String, lName:String){
        var fName = "Beryl"
        var lName = "Omwenga"
        var fullName = "Beryl " + " Omwenga"
        println(fullName)
}

fun printAge(age:Int){
    var age = 20
    println(age)
}

fun writePhoneNumber(number:String){
    var number = "0756987623"
    println(number)
}

fun weightInKg(weight:Double){
    var weight = 49.8
    println(weight)
}

fun citizenship(word:String){
    if(word=="isKenyanCitizen") {
        println("True")
    } else {
        println("False")
    }
}






