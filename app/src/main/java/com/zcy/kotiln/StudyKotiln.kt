package com.zcy.kotiln

/**
 * 作者：user on 2018/5/13 21:19
 * 描述：
 * 修改：
 * http://www.kotlindoc.cn/GettingStarted/Basic-Syntax.html
 * https://github.com/JetBrains/kotlin/tree/1.2.40
 */

//有返回值的函数 Int
fun sum (a:Int,b:Int):Int{
    return a+b
}
//自推导型函数
fun sum1(a:Int,b: Int)=a+b

//返回一个没有意义的值 Unit 可省
fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

fun main(args:Array<String>) {
    print("sum of 3 and 5 is ")
    println(sum(3, 5))
}
