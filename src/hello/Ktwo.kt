package hello
/*Kotlin 中所有类都继承该 Any 类，它是所有类的超类，对于没有超类型声明的类是默认超类*/
class Example // 从 Any 隐式继承

/*Any 默认提供了三个函数 equals hashCode toString*/

// 1 基类(被继承的类) 如果一个类要被继承，可以使用 open 关键字进行修饰
open class Base(p: Int)           // 定义基类

class Derived(p: Int) : Base(p)

// 2 如果子类没有主构造函数，则必须在每一个二级构造函数中用 super 关键字初始化基类，
// 或者在代理另一个构造函数。初始化基类时，可以调用基类的不同构造方法。

/**用户基类**/
open class Person(name:String){
    /**次级构造函数**/
    constructor(name:String,age:Int):this(name){
        //初始化
        println("-------基类次级构造函数---------")
    }
}

/**子类继承 Person 类**/
class Student:Person{

    /**次级构造函数**/
    constructor(name:String,age:Int,no:String,score:Int):super(name,age){
        println("-------继承类次级构造函数---------")
        println("学生名： ${name}")
        println("年龄： ${age}")
        println("学生号： ${no}")
        println("成绩： ${score}")
    }
}


//3 在基类中，使用fun声明函数时，此函数默认为final修饰，不能被子类重写
//如果允许子类重写该函数，那么就要手动添加 open 修饰它, 子类重写方法使用 override 关键词


/**用户基类**/
open class Person1{
    open fun study(){       // 允许子类重写
        println("我毕业了")
    }
}

/**子类继承 Person1 类**/
class Student1 : Person1() {

    override fun study(){    // 重写方法
        println("我在读大学")
    }
}

fun main(args: Array<String>) {
    var s =  Student("Runoob", 18, "S12345", 89)
}

