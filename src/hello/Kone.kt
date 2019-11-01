package hello
/*fun main(args: Array<String>) {    // 包级可见的函数，接受一个字符串数组作为参数
    println("Hello World!")         // 分号可以省略
}*/

//val 相当于java里面的final
class Greeter(val name: String) {
    fun greet() {
        println("Hello, $name")
    }
}

// 如果是返回 Unit类型，则可以省略(对于public方法也是这样)：
fun printSum(a: Int, b: Int): Unit {
    println(a + b)
}

//函数的变长参数可以用 vararg 关键字进行标识
fun vars(vararg v:Int){
    for(vt in v){
        print(vt)
    }
    println()
}

//lamda
fun testlamda(){
    val sumLambda: (Int, Int) -> Int = {x,y -> x+y}
    println(sumLambda(1,2))  // 输出 3
}

//字符串模板
fun testString(){
    var a = 1
// 模板中的简单名称：
    val s1 = "a is $a"

    a = 2
// 模板中的任意表达式：
    val s2 = "${s1.replace("is", "was")}, but now is $a"
    println(s2)
}

// Null 值校验
fun testNull(){
    //类型后面加?表示可为空
    var age: String? = "23"
//抛出空指针异常
    val ages = age!!.toInt()
//不做处理返回 null
    val ages1 = age?.toInt()
//age为空返回-1
    val ages2 = age?.toInt() ?: -1
    println(age)
    println(ages)
    println(ages1)
    println(ages2)

}

fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        // 做过类型判断以后，obj会被系统自动转换为String类型
        return obj.length
    }
    // 这里的obj仍然是Any类型的引用
    return null
}

fun main(args: Array<String>) {
    Greeter("World!").greet()          // 创建一个对象不用 new 关键字
    printSum(1,2)
    vars(1,2,3,4,5)
    testlamda()
    testString()
    testNull()
    getStringLength("fsfdfge")
}
