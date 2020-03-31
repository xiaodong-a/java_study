# day11 【常用API、引用类型小结】

## 今日内容

- BigInteger类
- BigDecimal类
- Arrays类
- 包装类
- String类的常用方法
- 引用类型的使用场景

## 教学目标

- [ ] 能够说出BigInteger可以解决的问题
- [ ] 能够说出BigDecimal可以解决的问题
- [ ] 能够使用Arrays类的sort方法
- [ ] 能够使用Arrays类的toString方法
- [ ] 能够说出自动装箱、自动拆箱的概念
- [ ] 能够将基本类型转换为对应的字符串
- [ ] 能够将字符串转换为对应的基本类型
- [ ] 能够说出String类常用方法的功能及使用
- [ ] 能够在不同的位置使用引用类型

# 第三章 Arrays类

## 3.1 Arrays类概述

​	java.util.Arrays类：该类包含用于操作数组的各种方法（如排序和搜索）

## 3.2 Arrays类常用方法

- public static void sort(int[] a)：按照数字顺序排列指定的数组
- public static String toString(int[] a)：返回指定数组的内容的字符串表示形式

- 示例代码：

  ~~~java
  public static void main(String[] args) {
      int[] arr = {432, 53, 6, 323, 765, 7, 254, 37, 698, 97, 64, 7};
      //将数组排序
      Arrays.sort(arr);
      //打印数组
      System.out.println(Arrays.toString(arr));
  }
  ~~~

  打印结果：

  ~~~java
  [6, 7, 7, 37, 53, 64, 97, 254, 323, 432, 698, 765]
  ~~~



# 第四章  包装类

## 4.1 概述

Java提供了两个类型系统，基本类型与引用类型，使用基本类型在于效率，然而很多情况，会创建对象使用，因为对象可以做更多的功能，如果想要我们的基本类型像对象一样操作，就可以使用基本类型对应的包装类，如下：

| 基本类型 | 对应的包装类（位于java.lang包中） |
| -------- | --------------------------------- |
| byte     | Byte                              |
| short    | Short                             |
| int      | **Integer**                       |
| long     | Long                              |
| float    | Float                             |
| double   | Double                            |
| char     | **Character**                     |
| boolean  | Boolean                           |



## 4.2 Integer类

- Integer类概述

  包装一个对象中的原始类型 int 的值

- Integer类构造方法及静态方法

| 方法名                                  | 说明                                   |
| --------------------------------------- | -------------------------------------- |
| public Integer(int   value)             | 根据 int 值创建 Integer 对象(过时)     |
| public Integer(String s)                | 根据 String 值创建 Integer 对象(过时)  |
| public static Integer valueOf(int i)    | 返回表示指定的 int 值的 Integer   实例 |
| public static Integer valueOf(String s) | 返回保存指定String值的 Integer 对象    |

- 示例代码

```java
public class IntegerDemo {
    public static void main(String[] args) {
        //public Integer(int value)：根据 int 值创建 Integer 对象(过时)
        Integer i1 = new Integer(100);
        System.out.println(i1);

        //public Integer(String s)：根据 String 值创建 Integer 对象(过时)
        Integer i2 = new Integer("100");
		//Integer i2 = new Integer("abc"); //NumberFormatException
        System.out.println(i2);
        System.out.println("--------");

        //public static Integer valueOf(int i)：返回表示指定的 int 值的 Integer 实例
        Integer i3 = Integer.valueOf(100);
        System.out.println(i3);

        //public static Integer valueOf(String s)：返回保存指定String值的Integer对象 
        Integer i4 = Integer.valueOf("100");
        System.out.println(i4);
    }
}
```



## 4.3 装箱与拆箱

基本类型与对应的包装类对象之间，来回转换的过程称为”装箱“与”拆箱“：

- **装箱**：从基本类型转换为对应的包装类对象。
- **拆箱**：从包装类对象转换为对应的基本类型。

用Integer与 int为例：（看懂代码即可）

基本数值---->包装对象

```java
Integer i = new Integer(4);//使用构造函数函数
Integer iii = Integer.valueOf(4);//使用包装类中的valueOf方法
```

包装对象---->基本数值

```java
int num = i.intValue();
```



## 4.4 自动装箱与自动拆箱

由于我们经常要做基本类型与包装类之间的转换，从Java 5（JDK 1.5）开始，基本类型与包装类的装箱、拆箱动作可以自动完成。例如：

```java
Integer i = 4;//自动装箱。相当于Integer i = Integer.valueOf(4);
i = i + 5;//等号右边：将i对象转成基本数值(自动拆箱) i.intValue() + 5;
//加法运算完成后，再次装箱，把基本数值转成对象。
```



## 4.5 基本类型与字符串之间的转换

### 基本类型转换为String

- 转换方式
- 方式一：直接在数字后加一个空字符串
- 方式二：通过String类静态方法valueOf()
- 示例代码

```java
public class IntegerDemo {
    public static void main(String[] args) {
        //int --- String
        int number = 100;
        //方式1
        String s1 = number + "";
        System.out.println(s1);
        //方式2
        //public static String valueOf(int i)
        String s2 = String.valueOf(number);
        System.out.println(s2);
        System.out.println("--------");
    }
}
```

### String转换成基本类型 

除了Character类之外，其他所有包装类都具有parseXxx静态方法可以将字符串参数转换为对应的基本类型：

- `public static byte parseByte(String s)`：将字符串参数转换为对应的byte基本类型。
- `public static short parseShort(String s)`：将字符串参数转换为对应的short基本类型。
- **`public static int parseInt(String s)`：将字符串参数转换为对应的int基本类型。**
- **`public static long parseLong(String s)`：将字符串参数转换为对应的long基本类型。**
- `public static float parseFloat(String s)`：将字符串参数转换为对应的float基本类型。
- `public static double parseDouble(String s)`：将字符串参数转换为对应的double基本类型。
- `public static boolean parseBoolean(String s)`：将字符串参数转换为对应的boolean基本类型。

代码使用（仅以Integer类的静态方法parseXxx为例）如：

- 转换方式
  - 方式一：先将字符串数字转成Integer，再调用valueOf()方法
  - 方式二：通过Integer静态方法parseInt()进行转换
- 示例代码

```java
public class IntegerDemo {
    public static void main(String[] args) {
        //String --- int
        String s = "100";
        //方式1：String --- Integer --- int
        Integer i = Integer.valueOf(s);
        //public int intValue()
        int x = i.intValue();
        System.out.println(x);
        //方式2
        //public static int parseInt(String s)
        int y = Integer.parseInt(s);
        System.out.println(y);
    }
}
```

> 注意:如果字符串参数的内容无法正确转换为对应的基本类型，则会抛出`java.lang.NumberFormatException`异常。

# 第六章 引用类型使用小结

​		实际的开发中，引用类型的使用非常重要，也是非常普遍的。我们可以在理解基本类型的使用方式基础上，进一步去掌握引用类型的使用方式。基本类型可以作为成员变量、作为方法的参数、作为方法的返回值，那么当然引用类型也是可以的。在这我们使用两个例子 , 来学习一下。

## 6.1 类名作为方法参数和返回值

```java
public class Person{
  public void eat(){
    System.out.println("吃饭");
  }
}
public class Test{
  public static void main(String[] args){
        method(new Person());
   		Person p = createPerson();
  }
    
  //引用类型作为方法参数,在前面笔记本案例中我们也使用了接口类型作为方法参数
  pubic static void method(Person p){
       p.eat();
  }
    
  //引用类型作为返回值
  public static Person createPerson(){
    	return new Person();
  }
}

```



## 6.2 抽象类作为方法参数和返回值

- 抽象类作为形参：表示可以接收任何此抽象类的"子类对象"作为实参；
- 抽象类作为返回值：表示"此方法可以返回此抽象类的任何子类对象"；

```java
/* 定义一个抽象类 */
public abstract class Person{
    public void eat(){
        System.out.println("吃饭");
    }
    public abstract void work();
}
/*定义子类Student*/
public class Student extends Person{
    public void work(){
        System.out.println("学生的工作是学习...");
    }
}
public class Teacher extends Person{
    public void work(){
        System.out.println("老师的工作是教书育人...");
    }
}
/*测试类*/
public class Test{
    public static void main(String[] args){
        //1.调用method1()方法，可以传入一个Student对象，也可以传入一个Teacher对象
        method1(new Student());//OK的
        method1(new Teacher());//OK的
        
        //2.调用method2()方法，接收的可能是Student对象，也可能是Teacher对象
        //所以，这里使用Person类型接收
        Person p = method2();
        p.work();//如果是Student对象，则调用的是Student的work()；如果是Teacher对象，调用的是Teacher的work()。
    }
    //-------------------------------------------------------------------------------//
    //抽象类Person作为形参——可以接收任何它的子类对象
    public static void method1(Person p){
        p.eat();
        p.work();
    }
    
    //抽象类Person作为返回值——此方法可以返回一个Student对象，也可以返回一个Teacher对象
    public static Person method2(){
      //  return new Student();//OK的
        return new Teacher();//OK的
    }
    
}
```



## 6.3 接口作为方法参数和返回值

- 接口作为方法的形参：【同抽象类】
- 接口作为方法的返回值：【同抽象类】

```java
/*定义一个接口*/
public interface USB{
    public void run();
}
/*定义子类*/
public class Keyboard implements USB{
    public void run(){
        System.out.println("使用键盘...");
    }
}
public class Mouse implements USB{
    public void run(){
        System.out.println("使用鼠标...");
    }
}
/*定义测试类*/
public class Test{
    public static void main(String[] args){
        //1.调用method1()方法，需要传入USB的任何子类对象都可以
        method1(new Keyboard());
        method2(new Mouse());
        
        //2.调用method2()方法，此方法可能返回一个Keyboard对象，也可能返回一个Mouse对象
        USB usb = method2();
        usb.run();
    }
    //接口作为形参
    public static void method1(USB usb){
        usb.run();
    }
    //接口作为返回值
    public static USB method2(){
  //      return new Keyboard();//OK的
    	return new Mouse();//OK的    
    }
}
```



## 6.4 类名作为成员变量

​	我们每个人(Person)都有一个身份证(IDCard) , 为了表示这种关系 , 就需要在Person中定义一个IDCard的成员变量。定义Person类时，代码如下：

```java
class Person {
    String name;//姓名
    int age;//年龄
}
```

​	使用`String` 类型表示姓名 , `int` 类型表示年龄。其实，`String`本身就是引用类型，我们往往忽略了它是引用类型。如果我们继续丰富这个类的定义，给`Person` 增加身份证号 , 身份证签发机关等属性，我们将如何编写呢？这时候就需要编写一个IDCard类了

定义IDCard(身份证)类，添加身份证号 , 签发地等属性：

```java
class IDCard {
    String idNum;//身份证号
    String authority;//签发地
  
  	//getter和setter方法
  	//...
  	
  	//toString方法
  	//...
}
```

修改Person类：

```java
public class Person {
    String name;//姓名
    int age;//年龄

    IDCard idCard;//表示自己的身份证信息

    //name和age的getter、setter方法
    //...

    public IDCard getIdCard() {
        return idCard;
    }

    public void setIdCard(IDCard idCard) {
        this.idCard = idCard;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", idCard=" + idCard +
                '}';
    }
}
```

测试类：

```java
public class TestDemo {
    public static void main(String[] args) {
        //创建IDCard对象
        IDCard idCard = new IDCard();
        //设置身份证号
        idCard.setIdNum("110113201606066666");
        //设置签发地
        idCard.setAuthority("北京市顺义区公安局");

        //创建Person对象
        Person p = new Person();
        //设置姓名
        p.setName("小顺子");
        //设置年龄
        p.setAge(2);
        //设置身份证信息
        p.setIdCard(idCard);

        //打印小顺子的信息
        System.out.println(p);
    }
}
输出结果:
Person{name='小顺子', age=2, idCard=IDCard{idNum='110113201606066666', authority='北京市顺义区公安局'}}
```

> 类作为成员变量时，对它进行赋值的操作，实际上，是赋给它该类的一个对象。同理 , 接口也是如此 , 例如我们笔记本案例中使用usb设备。在此我们只是通过小例子 , 让大家熟识下引用类型的用法 , 后续在咱们的就业班学习中 , 这种方式会使用的很多。  



## 6.5 抽象类作为成员变量

- 抽象类作为成员变量——为此成员变量赋值时，可以是任何它的子类对象

```java
/*定义抽象类*/
public abstract class Animal{
    public abstract void sleep();
}
/*定义子类*/
public class Cat extends Animal{
    public void sleep(){
        System.out.println("小猫睡觉...");
    }
    public String toString(){
        return "一只可爱的小猫";
    }
}
public class Dog extends Animal{
    public void sleep(){
        System.out.println("小狗睡觉...");
    }
    public String toString(){
        return "一只可爱的小狗";
    }
}
/*定义Student类*/
public class Student{
    private String name;
    private int age;
    private Animal animal;//表示学生有一个动物，可以是Cat，也可以是Dog
    
    public Student(String name,int age,Animal animal){
        this.name = name;
        this.age = age;
        this.animal = animal;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    public void setAnimal(Animal animal){
        this.animal = animal;
    }
    public Animal getAnimal(){
        return this.animal;
    }
    
    public String toString(){
        return "Student [name = " + name + 
            	" , age = " + age + 
            	" , animal = " + animal + 
            	"]";
    }
}
/*定义测试类*/
public class Test{
    public static void main(String[] args){
        Student stu = new Student();
        stu.setName("章子怡");
        stu.setAge(19);
    //    stu.setAnimal(new Cat());//表示Student有一只猫
        stu.setAnimal(new Dog());//表示Student有一只狗
        
        System.out.println(stu);//隐式调用stu.toString()，而stu.toString()中会隐式调用animal的toString().
    }
    
}
```



## 6.6 接口作为成员变量

- 接口类型作为成员变量——【同抽象类】

```java
/*定义接口*/
public interface Animal{
    public abstract void sleep();
}
/*定义子类*/
public class Cat implements Animal{
    public void sleep(){
        System.out.println("小猫睡觉...");
    }
    public String toString(){
        return "一只可爱的小猫";
    }
}
public class Dog implements Animal{
    public void sleep(){
        System.out.println("小狗睡觉...");
    }
    public String toString(){
        return "一只可爱的小狗";
    }
}
/*定义Student类*/
public class Student{
    private String name;
    private int age;
    private Animal animal;//表示学生有一个动物，可以是Cat，也可以是Dog
    
    public Student(String name,int age,Animal animal){
        this.name = name;
        this.age = age;
        this.animal = animal;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    public void setAnimal(Animal animal){
        this.animal = animal;
    }
    public Animal getAnimal(){
        return this.animal;
    }
    
    public String toString(){
        return "Student [name = " + name + 
            	" , age = " + age + 
            	" , animal = " + animal + 
            	"]";
    }
}
/*定义测试类*/
public class Test{
    public static void main(String[] args){
        Student stu = new Student();
        stu.setName("章子怡");
        stu.setAge(19);
    //    stu.setAnimal(new Cat());//表示Student有一只猫
        stu.setAnimal(new Dog());//表示Student有一只狗
        
        System.out.println(stu);//隐式调用stu.toString()，而stu.toString()中会隐式调用animal的toString().
    }
    
}
```

# 第七章 Date类

## 2.1概述

` java.util.Date`类 表示特定的瞬间，精确到毫秒。

继续查阅Date类的描述，发现Date拥有多个构造函数，只是部分已经过时，我们重点看以下两个构造函数

- `public Date()`：从运行程序的此时此刻到时间原点经历的毫秒值,转换成Date对象，分配Date对象并初始化此对象，以表示分配它的时间（精确到毫秒）。
- `public Date(long date)`：将指定参数的毫秒值date,转换成Date对象，分配Date对象并初始化此对象，以表示自从标准基准时间（称为“历元（epoch）”，即1970年1月1日00:00:00 GMT）以来的指定毫秒数。

> tips: 由于中国处于东八区（GMT+08:00）是比世界协调时间/格林尼治时间（GMT）快8小时的时区，当格林尼治标准时间为0:00时，东八区的标准时间为08:00。

简单来说：使用无参构造，可以自动设置当前系统时间的毫秒时刻；指定long类型的构造参数，可以自定义毫秒时刻。例如：

```java
import java.util.Date;

public class Demo01Date {
    public static void main(String[] args) {
        // 创建日期对象，把当前的时间
        System.out.println(new Date()); // Tue Jan 16 14:37:35 CST 2020
        // 创建日期对象，把当前的毫秒值转成日期对象
        System.out.println(new Date(0L)); // Thu Jan 01 08:00:00 CST 1970
    }
}
```

> tips:在使用println方法时，会自动调用Date类中的toString方法。Date类对Object类中的toString方法进行了覆盖重写，所以结果为指定格式的字符串。



## 2.2 常用方法

Date类中的多数方法已经过时，常用的方法有：

- `public long getTime()` 把日期对象转换成对应的时间毫秒值。
- `public void setTime(long time)` 把方法参数给定的毫秒值设置给日期对象

示例代码

```java
public class DateDemo02 {
    public static void main(String[] args) {
        //创建日期对象
        Date d = new Date();
        
        //public long getTime():获取的是日期对象从1970年1月1日 00:00:00到现在的毫秒值
        //System.out.println(d.getTime());
        //System.out.println(d.getTime() * 1.0 / 1000 / 60 / 60 / 24 / 365 + "年");

        //public void setTime(long time):设置时间，给的是毫秒值
        //long time = 1000*60*60;
        long time = System.currentTimeMillis();
        d.setTime(time);

        System.out.println(d);
    }
}
```

> 小结：Date表示特定的时间瞬间，我们可以使用Date对象对时间进行操作。

# 第八章 DateFormat类

## 3.1概述

`java.text.DateFormat` 是日期/时间格式化子类的抽象类，我们通过这个类可以帮我们完成日期和文本之间的转换,也就是可以在Date对象与String对象之间进行来回转换。

- **格式化**：按照指定的格式，把Date对象转换为String对象。
- **解析**：按照指定的格式，把String对象转换为Date对象。



## 3.2 构造方法

由于DateFormat为抽象类，不能直接使用，所以需要常用的子类`java.text.SimpleDateFormat`。这个类需要一个模式（格式）来指定格式化或解析的标准。构造方法为：

- `public SimpleDateFormat(String pattern)`：用给定的模式和默认语言环境的日期格式符号构造SimpleDateFormat。参数pattern是一个字符串，代表日期时间的自定义格式。



## 3.3 格式规则

常用的格式规则为：

| 标识字母（区分大小写） | 含义 |
| ---------------------- | ---- |
| y                      | 年   |
| M                      | 月   |
| d                      | 日   |
| H                      | 时   |
| m                      | 分   |
| s                      | 秒   |

> 备注：更详细的格式规则，可以参考SimpleDateFormat类的API文档。



## 3.4 常用方法

DateFormat类的常用方法有：

- `public String format(Date date)`：将Date对象格式化为字符串。

- `public Date parse(String source)`：将字符串解析为Date对象。

  ```java
  public class SimpleDateFormatDemo {
      public static void main(String[] args) throws ParseException {
          //格式化：从 Date 到 String
          Date d = new Date();
          SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
          String s = sdf.format(d);
          System.out.println(s);
          System.out.println("--------");
  
          //从 String 到 Date
          String ss = "2048-08-09 11:11:11";
          //ParseException
          SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
          Date dd = sdf2.parse(ss);
          System.out.println(dd);
      }
  }
  ```

> 小结：DateFormat可以将Date对象和字符串相互转换。

# 第五章 Math类

## 5.1 概述

- java.lang.Math(类): Math包含执行基本数字运算的方法。
- 它不能创建对象，它的构造方法被“私有”了。因为他内部都是“静态方法”，通过“类名”直接调用即可。



## 5.2 常用方法

| 方法名                                       | 说明                |
| -------------------------------------------- | ------------------- |
| public static int abs(int a)                 | 获取参数a的绝对值： |
| public static double ceil(double a)          | 向上取整            |
| public static double floor(double a)         | 向下取整            |
| public static double pow(double a, double b) | 获取a的b次幂        |
| public static long round(double a)           | 四舍五入取整        |



## 5.3 示例代码

~~~java
public class Demo {
    public static void main(String[] args) {
        System.out.println("-5的绝对值：" + Math.abs(-5));//5
    	System.out.println("3.4向上取整：" + Math.ceil(3.4));//4.0
    	System.out.println("3.4向下取整：" + Math.floor(3.4));//3.0
    	System.out.println("2的8次幂：" + Math.pow(2, 8));//256.0
    	System.out.println("3.2四舍五入：" + Math.round(3.2));//3
    	System.out.println("3.5四舍五入：" + Math.round(3.5));//4

    }
}
~~~

