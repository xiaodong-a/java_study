### 今日目标

* 理解面向过程和面向对象编程思想相关概述
* 了解对象的内存图解
* 理解成员变量和局部变量的区别
* 理解封装的相关概述
* 掌握private和this两个关键字的用法
* 掌握标准的类的定义和使用

---

### 1. 面向过程和面向对象解释

#### 1.1 面向过程

##### 1.1.1 简述

我们回想一下, 前面我们完成一个需求的步骤是怎样的? 

1. 首先是搞清楚我们要做什么.
2. 然后在分析怎么做.
3. 最后我们在通过代码一步一步去实现.

上述的每一个步骤, 我们都是参与者, 并且需要面对具体的每一个步骤和过程, 这就是面向过程最直接的体现.

##### 1.1.2 举例

* 生活中的例子:  洗衣服.  想完成`洗衣服`这个需求, 我们得完成下述的每一个步骤: 

  1. 找个盆.
  2. 接点水.
  3. 到洗衣液.
  4. 把衣服放进去浸泡10分钟.
  5. 把衣服揉搓干净.
  6. 漂洗.
  7. 拧干水分.
  8. 晾晒.

  > 注意:
  >
  > 1. 上述的这些步骤, 但凡有一个我们不会做, 就没有办法完成`洗衣服`这个需求.
  > 2. 即: 每一步都需要我们亲自做, 这就是: 面向过程思想.

* 代码举例: `把数组元素按照[11, 22, 33, 44, 55]`的格式进行输出.

  1. 定义方法printArray(), 参数列表为: int[] arr, 返回值的类型为String.

  2. 定义字符串变量s, 用来记录数组元素拼接后的结果.

  3. 字符串变量s的初始化值设置为`[`.

  4. 对数组对象进行判断, 看其是否是合法对象.

     > 即: 数组对象不为: null

  5. 通过for循环遍历数组, 获取到每一个元素.

  6. 判断当前获取到的元素是否是最后一个元素, 并和字符串变量s进行拼接.

     * 如果是最后一个元素, 则在后边在拼接上`]`
     * 如果不是最后一个元素, 则在后边在拼接上`, `

  7. 当for循环执行结束后, 字符串变量s记录的就是拼接后的结果, 将其直接返回即可.

  > 注意: 上述的每一步代码都需要我们编写, 这样做比较繁琐.

##### 1.1.3 总结

面向过程思想其实就是一种编程思想. 所谓的`面向过程开发`, 指的就是`面向着具体的每一个步骤和过程, 把每一个步骤和过程完成, 然后由这些功能方法相互调用, 完成需求`. 

> 记忆: 面向过程的代表语言是: C语言. 



#### 1.2 面向对象

##### 1.2.1 简述

当需求单一, 或者简单时, 我们一步一步去操作是没问题的, 并且效率也挺高. 可随着需求的更改, 功能的增多, 发现需要面对每一个步骤就很麻烦了, 于是我们就想着, 能不能把这些步骤和功能在进行封装, 封装时根据不同的功能, 进行不同的封装, 功能类似的用一个类封装在一起, 这样结构就清晰了很多. 用的时候, 找到对应的类就可以了. 这就是面向对象的思想. 

##### 1.2.2 举例

* 生活中的例子:  洗衣服. 

  > 1. 想完成`洗衣服`这个需求,  我们可以通过`洗衣机` 来实现.
  > 2. 对于我们来讲, 洗衣机就是我们的对象.
  > 3. 总结: 万物皆对象. 

* 代码举例: `把数组元素按照[11, 22, 33, 44, 55]`的格式进行输出.

  > 上述的需求, 我们可以通过**Arrays类的toString()方法**来实现. 

##### 1.2.3 思想特点

1. 是一种符合我们思考习惯的思想.
2. 可以将复杂的事情简单化.
3. 让我们从执行者变成了指挥者.

##### 1.2.4 总结

面向对象思想是一种编程思想, 它是基于面向过程的, 强调的是以对象为基础完成各种操作. 

总结来讲, 万物皆对象. 



### 2. 类和对象

#### 2.1 概述

**问题一: 你为什么学习编程语言? **

我们学习编程语言, 其实就是为了把现实世界的事物通过代码模拟出来, 实现信息化. 

例如: 

* 超市的计费系统.

* 银行的核心系统.

* 千亿级数据仓库.

  > 分析PB级数据，为企业提供高效、稳健的实时数据洞察。
  >
  > 采用类似阿里巴巴大数据数仓设计的分层架构思想，使用主流的实时仓库技术Flink、Druid、Kafka。

* 企业级360°全方位用户画像.

  > 360°全方位还原用户画像，实现对个体和群体信息的标签化，实现精准推荐和营销. 

* 黑马电商推荐系统.

  > 项目利用Neo4j构建用户和商品的关系图示，基于词向量相似度推荐商品、CTR/CVR点击率预估模型、逻辑斯特回归算法进行CTR点击率预估。

**问题二: 我们是如何表示现实世界的事物呢? **

1. 属性.
   * 属性指的就是事物的描述信息(名词).
   * 属性在Java中被称之为**成员变量**.
2. 行为.
   * 行为指的就是事物能够做什么.
   * 行为在Java中被称之为**成员方法**.

> 例如:   学生
>
> * 属性: 姓名, 年龄, 性别....
> * 行为: 学习, 吃饭, 睡觉...



**问题三: Java语言是如何表示现实世界的事物呢? **

1. 在Java语言中, 是通过**类**来体现事物的.  Java语言最基本的单位是**类**,  它是一个抽象的概念, 看不见, 摸不着.
2. 对象: 对象就是该类事物的具体体现, 实现.

> 举例:
>
> ​	类			学生
>
> ​	对象		张三, 23



#### 2.2 类的定义格式

##### 2.2.1 简述

定义类其实就是**定义类的成员(成员变量和成员方法)**

* 成员变量:

  > 1. 和以前定义变量是一样的, 只不过位置发生了改变, 写到**类中, 方法外**
  > 2. 而且成员变量还可以不用赋值, 因为它有默认值. (为啥他有默认值???)

* 成员方法: 

  > 1. 和以前定义方法是一样的, 只不过把`static关键字`去掉.
  > 2. 这点先记忆即可, 后面我们再讲解`static关键字`的用法.

##### 2.2.2 格式

```java
public class 类名 {
    //成员变量
    
    //成员方法
}
```

##### 2.2.3 示例

**需求**

定义一个学生类.

**参考代码**

```java
public class Student{
    //成员变量, 就是属性.
    String name;	//姓名
    int age;		//年龄
    
    //成员方法, 就是行为.
    //学习的方法
    public void study() {
        System.out.println("键盘敲烂, 月薪过万!...");
    }
    
    //吃饭的方法
    public void eat() {
        System.out.println("学习饿了要吃饭!...");
    }
}
```



#### 2.3 类的使用

##### 2.3.1 简述

所谓类的使用, 就是**使用类中定义的成员(成员变量和成员方法)**.

##### 2.3.2 格式

1. 创建该类的对象.

   ```java
   类名 对象名 = new 类名();
   
   ```

2. 通过`对象名.`的形式, 调用类中的指定成员即可.

   ```java
   //成员变量
   	对象名.成员变量
   
   //成员方法
   	对象名.成员方法(参数列表中各数据类型对应的值...)
   ```

##### 2.3.3 示例

**需求**

使用学生类中的成员.

**参考代码**

```java
public class StudentTest{
    public static void main(String[] args) {
        //1. 创建学生类的对象.
        Student s = new Student();
        //2. 访问成员变量.
        System.out.println(s.name);
        System.out.println(s.age);
        //3. 给成员变量赋值.
        s.name = "张三";
        s.age = 23;
        //4. 访问成员变量.
        System.out.println(s.name);
        System.out.println(s.age);
        //5. 访问成员方法. 
        s.study();
        s.eat();
    }
}
```



### 3. 手机类的定义和使用

#### 3.1 需求

1. 定义手机类Phone.

   > 属性: 品牌(brand), 价格(price), 颜色(color)
   >
   > 行为: 打电话(call), 发短信(sendMessage)

2. 创建测试类PhoneTest, 在类中定义main方法, 并访问手机类(Phone类)中的成员.

#### 3.2 参考代码

```java
//手机类
public class Phone {
    //属性, 成员变量
    //品牌
    String brand;
    //价格
    int price;
    //颜色
    String color;

    //行为, 成员方法
    //打电话
    public void call(String name) {
        System.out.println("给" + name + "打电话!...");
    }

    //发短信
    public void sendMessage(String name) {
        System.out.println("给" + name + "发短信!...");
    }
}

//手机类的测试类
public class PhoneTest {
    public static void main(String[] args) {
        //1. 创建手机类的对象.
        Phone p = new Phone();
        //2. 设置成员变量值.
        p.brand = "华为";
        p.price = 6666;
        p.color = "黑色";
        //3. 打印成员变量.
        System.out.println(p.brand);
        System.out.println(p.price);
        System.out.println(p.color);
        //4. 调用成员方法.
        p.call("夯哥");
        p.sendMessage("夯哥");
    }
}
```



### 4. 对象的内存图

#### 4.1 一个对象的内存图

**代码**

```java
//手机类
public class Phone {
    //属性, 成员变量
    String brand;	//品牌
    int price;	    //价格
    String color;	//颜色

    //行为, 成员方法
    //打电话
    public void call(String name) {
        System.out.println("给" + name + "打电话!...");
    }

    //发短信
    public void sendMessage(String name) {
        System.out.println("给" + name + "发短信!...");
    }
}

//手机类的测试类
public class PhoneTest {
    public static void main(String[] args) {
        //1. 创建手机类的对象.
        Phone p = new Phone();
        //2. 设置成员变量值.
        p.brand = "华为";
        p.price = 6666;
        p.color = "黑色";
        //3. 打印成员变量.
        System.out.println(p.brand + "--" + p.price + "--" + p.color);
        //4. 调用成员方法.
        p.call("夯哥");
        p.sendMessage("夯哥");
    }
}
```

**内存图解**
略.



#### 4.2 两个对象的内存图

**代码**

```java
//手机类
public class Phone {
    //属性, 成员变量
    String brand;	//品牌
    int price;	    //价格
     String color;	//颜色

    //行为, 成员方法
    //打电话
    public void call(String name) {
        System.out.println("给" + name + "打电话!...");
    }

    //发短信
    public void sendMessage(String name) {
        System.out.println("给" + name + "发短信!...");
    }
}

//手机类的测试类
public class PhoneTest {
    public static void main(String[] args) {
        //1. 创建手机类的对象.
        Phone p = new Phone();
        //2. 设置成员变量值.
        p.brand = "华为";
        p.price = 6666;
        p.color = "黑色";
        //3. 打印成员变量.
        System.out.println(p.brand + "--" + p.price + "--" + p.color);
        //4. 调用成员方法.
        p.call("传智播客");
        p.sendMessage("传智播客");

        Phone p2 = new Phone();
        p2.brand = "小米";
        p2.price = 3333;
        p2.color = "白色";
        System.out.println(p2.brand + "--" + p2.price + "--" + p2.color);
        p2.call("黑马程序员");
        p2.sendMessage("黑马程序员");
    }
}
```

**内存图解**

略.



#### 4.3 两个对象的内存图

**代码**

```java
//手机类
public class Phone {
    //属性, 成员变量
    String brand;	//品牌
    int price;	    //价格
     String color;	//颜色

    //行为, 成员方法
    //打电话
    public void call(String name) {
        System.out.println("给" + name + "打电话!...");
    }

    //发短信
    public void sendMessage(String name) {
        System.out.println("给" + name + "发短信!...");
    }
}

//手机类的测试类
public class PhoneTest {
    public static void main(String[] args) {
        //1. 创建手机类的对象.
        Phone p = new Phone();
        //2. 设置成员变量值.
        p.brand = "华为";
        p.price = 6666;
        p.color = "黑色";
        //3. 打印成员变量.
        System.out.println(p.brand + "--" + p.price + "--" + p.color);
        //4. 调用成员方法.
        p.call("传智播客");
        p.sendMessage("传智播客");

        Phone p2 = p;
        p2.brand = "小米";
        p2.price = 3333;
        p2.color = "白色";
        System.out.println(p.brand + "--" + p.price + "--" + p.color);
        System.out.println(p2.brand + "--" + p2.price + "--" + p2.color);
        p2.call("黑马程序员");
        p2.sendMessage("黑马程序员");
    }
}
```

**内存图解**

略.



### 5. 成员变量和局部变量的区别

#### 5.1 简述

* 成员变量: 指的是**定义在类中, 方法外的变量**.
* 局部变量: 指的是**定义在方法中, 或者方法声明上的变量**.

它们的区别如下:

1. 定义位置不同.
   * 成员变量:  定义在类中, 方法外.
   * 局部变量:  定义在方法中, 或者方法声明上.
2. 在内存中的存储位置不同.
   - 成员变量:  存储在堆内存. 
   - 局部变量:  存储在栈内存. 
3. 生命周期不同.
   - 成员变量:  随着对象的创建而存在, 随着对象的消失而消失.
   - 局部变量:  随着方法的调用而存在, 随着方法的调用完毕而消失.
4. 初始化值不同.
   - 成员变量:  有默认值.
   - 局部变量:  没有默认值, 必须先定义, 再赋值, 然后才能使用. 

#### 5.2 代码演示

```java
public class VariableDemo{
    int x;
    
    public void show() {
        int y = 10;
        System.out.println(x);
        System.out.println(y);
    }
}
VariableDemo v = new VariableDemo();
v.show();

```



### 6. 封装

概念: 隐藏实现细节,对外暴露公共访问方式

上述的代码中, 我们可以任意的设置`属性`的值, 包括我们可以设置一些非法值, 例如: 把年龄设置成负数, 这样做程序就容易出问题, 针对于这种情况, 我们可以通过**private关键字**来优化它. 

#### 6.1 private关键字

##### 6.1.1  简述

private是一个关键字, 也是访问权限修饰符的一种, 它可以用来修饰类的成员(成员变量和成员方法).

##### 6.1.2 特点

被private修饰的内容只能在本类中直接使用.

##### 6.1.3 应用场景

1. 在实际开发中, 成员变量基本上都是用private关键字来修饰的.
2. 如果明确知道类中的某些内容不想被外界直接访问, 都可以通过private来修饰. 

##### 6.1.4 示例

**需求**

1. 定义学生类Student, 包含姓名, 年龄属性. 
2. 在StudentTest测试类中, 创建Student类的对象, 并调用Student类中的成员. 
3. 对年龄或者姓名属性加private修饰, 然后观察结果.

**参考代码**

```java
//学生类
public class Student{
    //属性
    String name;		//姓名
    private int age;	//年龄
    
    //getXxx()和setXxx()方法
    public void setAge(int a) {
        if(a >= 0 && age <= 150) {
            //年龄合法, 就赋值.
            age = a;
        }
    }
    
    public int getAge() {
        return age;
    }
    
    //行为
    public void show() {
        //被private修饰的内容, 可以在本类中直接访问.
        System.out.println(name + "..." + age);
    }
}

//学生类的测试类
public class StudentTest{
    public static void main(String[] args) {
        //1. 创建学生类的对象
        Student s = new Student();
        //2. 给成员变量赋值.
        s.name = "张三";
        //s.age = -23;		//被private修饰的内容, 外界无法直接访问.
         s.setAge(-23);
        //3. 调用成员方法.
        s.show();
    }
}
```



#### 6.2 标准代码

刚才的代码, 为了讲解private关键字, 只给年龄属性加了private, 而在实际开发中, 除非必要, 否则成员变量都要用private来修饰, 然后提供对应的getXxx()和setXxx()方法, 方便用户访问对应的成员变量, 接下来, 我们来写一个实际开发中的标准代码.

**需求**

1. 定义一个标准的学生类Student, 属性: 姓名和年龄, 行为: 学习, 吃饭.
2. 在测试类中创建学生类的对象, 然后访问类中的成员. 

**参考代码**

```java
public class Student {
    //属性, 全部用private修饰.
    //姓名
    private String name;
    //年龄
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int a) {
        age = a;
    }

    //行为, 也就是成员方法.
    public void study() {
        System.out.println("键盘敲烂, 月薪过万!");
    }
    public void eat() {
        System.out.println("学习饿了就要吃饭!.");
    }
}

//测试类
public class StudentTest {
    public static void main(String[] args) {
        //1. 创建学生对象.
        Student s = new Student();
        //2. 设置成员变量值.
        s.setName("张三");
        s.setAge(23);
        //3. 打印成员变量值.
        System.out.println(s.getName() + "..." + s.getAge());
        //4. 调用成员方法.
        s.study();
        s.eat();
    }
}
```



#### 6.3 封装的概述和好处

##### 6.3.1 概述

封装是面向对象编程思想的三大特征之一, 所谓的封装指的就是**隐藏对象的属性和实现细节, 仅对外提供一个公共的访问方式.**

> 记忆: 
>
> ​    面向对象的三大特征:  封装, 继承, 多态.

**问题一: 怎么隐藏? **

通过**private关键字**实现.

**问题二: 公共的访问方式是什么? **

getXxx() 和 setXxx()方法. 



##### 6.3.2 原则

1. 把不需要对外提供的内容都隐藏起来.

2. 把属性隐藏, 并提供公共方法对其访问.

   > 解释: 就是成员变量都用private修饰, 并提供对应的getXxx()和setXxx()方法.



##### 6.3.3 好处

1. 提高代码的安全性.

   > 这点是由`private关键字`来保证的.

2. 提高代码的复用性.

   > 这点是由`方法`来保证的, 方法也是封装的一种体现形式. 



#### 6.4 this关键字

##### 6.4.1 概述

this代表`所在类的对象的引用`, 大白话翻译: **谁调用, this就代表谁.**

##### 6.4.2 作用

用来解决局部变量和成员变量重名问题的. 

##### 6.4.3 示例

**需求**

1. 定义一个标准的学生类Student, 属性: 姓名和年龄, 行为: 学习, 吃饭.
2. 在测试类中创建学生类的对象, 然后访问类中的成员. 

**参考代码**

```java
public class Student {
    //属性, 全部用private修饰.
    //姓名
    private String name;
    //年龄
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
        //s.age = 23;
    }

    //行为, 也就是成员方法.
    public void study() {
        System.out.println("键盘敲烂, 月薪过万!");
    }
    public void eat() {
        System.out.println("学习饿了就要吃饭!.");
    }
}

//测试类
public class StudentTest {
    public static void main(String[] args) {
        //1. 创建学生对象.
        Student s = new Student();
        //2. 设置成员变量值.
        s.setName("张三");
        s.setAge(23);
        //3. 打印成员变量值.
        System.out.println(s.getName() + "..." + s.getAge());
        //4. 调用成员方法.
        s.study();
        s.eat();
    }
}
```

##### 6.4.4 总结

Java中, 使用变量遵循**就近原则**, 局部位置有就使用, 没有就去本类的成员位置找, 有就使用, 没有就报错.

> 解释: 先这么记忆, 不严谨, 因为本类没有, 还会去父类中查找, 这点在继承部分再解释. 



#### 6.5 构造方法

##### 6.5.1 概述

构造方法是用来给对象的成员进行初始化的.

> 大白话: 
>
> ​    构造方法就是用来快速对对象的各个属性赋值的. 

##### 6.5.2 格式

1. 构造方法名必须和类名完全一致(包括大小写).
2. 构造方法没有返回值类型, 连void都不能写.
3. 构造方法没有具体的返回值, 但是可以写return(实际开发, 一般不写).

```java
public 类名(参数类型 参数名1, 参数类型 参数名2) {  //这里可以写多个参数.
    //给对象的各个属性赋值即可.
}
```

##### 6.5.3 示例: 构造方法入门

**需求**

1. 定义学生类Student, 在类的空参构造中打印一句话"这是构造方法".

2. 在StudentTest测试类中, 创建学生类的对象, 并观察程序的运行结果. 

   > 小技巧: 创建对象的格式如下: 
   >
   > ​    类名 对象名 = new 构造方法(参数列表);

**参考代码**

```java
//学生类.
public class Student{
    //类的空参构造.
    public Student() {
        System.out.println("这是构造方法");
    }
}

//学生类的测试类
public class StudentTest{
    public static void main(String[] args) {
        Student s = new Student();
    }
}
```



##### 6.5.4 构造方法的注意事项

1. 如果我们没有给出构造方法, 系统将给出一个默认的**无参构造**供我们使用. 

2. 如果我们给出了构造方法, 系统将不再提供默认的构造方法给我们使用. 

   > 1. 这个时候, 如果我们还想使用无参构造, 就必须自己提供.
   > 2. 建议定义类时, 我们给出无参构造, 方便用户调用(实际开发都这么做的).

**思考题**

**问: ** 给成员变量赋值有几种方式?

**答:** 1. 通过setXxx()方法实现(该方式不会创建新对象).

​      2. 通过构造方法实现(该方式会创建新对象). 



#### 6.6 标准的类的定义和使用

##### 6.6.1 格式

以后在实际开发中, 也都是这样写的, 即: 标准的类的定义格式如下:

```java
public class 类名{
    //属性(成员变量), 全部用private修饰.
    
    //构造方法, 一般提供两个(无参, 全参)
    
    //getXxx()和setXxx()方法
    
    //行为(成员方法), 根据需求来定义.
}
```



##### 6.6.2 示例

**需求**

1. 定义一个标准的学生类Student, 属性: 姓名和年龄, 行为: 学习, 吃饭.
2. 在测试类中创建学生类的对象, 然后访问类中的成员. 

**参考代码**

```java
//学生类
public class Student {
    //属性(成员变量), 全部用private修饰.
    private String name;    //姓名
    private int age;        //年龄
    
    //构造方法, 一般提供两个(无参, 全参)
    public Student() {
    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //getXxx()和setXxx()方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    //行为(成员方法), 根据需求来定义.
    public void study() {
        System.out.println("键盘敲烂, 月薪过万!");
    }

    public void eat() {
        System.out.println("学习饿了要吃饭");
    }
}

//学生类的测试类
public class StudentTest {
    public static void main(String[] args) {
        //1. 创建学生对象.
        Student s = new Student();
        //2. 设置成员变量值.
        s.setName("张三");
        s.setAge(23);
        //3. 打印成员变量值.
        System.out.println(s.getName() + "..." + s.getAge());
        //4. 调用成员方法.
        s.study();
        s.eat();
    }
}
```

