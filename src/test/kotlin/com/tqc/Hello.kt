package com.tqc

// 不需要先設定一個類別
// 打main 後打TAB
fun main(args: Array<String>) {
    //println("Hello kotlin")   //可打分號，也可以不打分號
    //Human().hello() //呼叫建構子，不用再寫new，只需要human後加( )，即產生一個物件
    val h = Human()  //從 val 和 var 中，選擇不會改變值的val，使用val h等於Human建構，建構一個Human物件這樣就已經完成了一個物件的產生
    h.hello()
    val age =19  //(不寫資料型號，kotlin會做變動型態的自動推斷)
    val age2: Int = 19
    //因為用val，不能再改成20

    var weight = 66.5
    var weight2 = 66.5f

    //var name;
    var name2:String
    name2= "TQC"

    //那怎麼樣才可以儲存一個物件呢
    //在Kotlin裡面
    //一個物件我們可以使用val或者是var這兩個字來定義
   // val(value)代表當我定義完這個物件之後就不能再改變它的值
}

class Human{  //class的命名，如果kotlin package和java同名，class也同名，會相衝突
    fun hello(){   //如果不用回傳資料，void不用寫
    println("Hello Kotlin(human)")
    }
}