
fun main(){
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