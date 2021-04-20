fun main (){
    println(isEven(400))
    var b= home("Kenya")
    print(b[0])
    print(b[2])
    print(b[4])
}
fun isEven(number: Int): Boolean{
    if(number %2==0){
        return true
    }
    else {
        return false
    }
}
//data class Kiosk(var name: String, var weight: Int, var price: Int, var category: String){
//fun mylist(product: String){
//    var groceries= listOf<String>()
//   var hygiene= listOf<String>()
//    when(product){
//        "groceries" -> println(groceries.add(product))
//    }
//
//}
//}
fun home(name: String): String{
    var house=name
    return house
}
fun person(){

}
