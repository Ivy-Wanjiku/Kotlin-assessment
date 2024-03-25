fun main(){
myString("Barnie bakes brown bagels and buns")

    var array= arrayOf(2,3,5,7,5)
    println(array.sum())
    println(array.count())
    println(array.average())
volume(3.14159,21)
    println( isPalindrome("wonderful"))
   println( isPalindrome("madam"))

}
fun myString(sentence:String){
println(sentence.replace("b"," "))
}
fun myNumbers(array: Array<Int>) {
    array.forEachIndexed { index, i ->  }




}
fun volume(pi:Double,r:Int){
 var vol=pi*4/3*r*r*r
   println(vol)

}
fun isPalindrome(word:String):Boolean {
   if (word==word.reversed()){
       return (true)
   }
    else{
        return (false)
   }
}

