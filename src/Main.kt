
fun main(){

    letScopeFunction()
    alsoScopeFunction()
}

fun alsoScopeFunction() {
    var stringList= mutableListOf<String>("a","b","c","ab","bc","abc","abcd")
    var resultList=stringList.map { it.length }.filter { it>2 }
    println("without elso:$resultList")

    stringList.map { it.length }.also { println("with also:$it") }
}

fun letScopeFunction() {
    var myString:String?=null

    var length=if (myString?.length!=null ){
        myString.length.toString()
    }else{
        "0"
    }
    println("without let ScopeFunction: $length")

    var x=myString.let {
        it?.length.toString()
//        "S S"
    }?: "0"
    println("with let scopeFunction: $x")
}
