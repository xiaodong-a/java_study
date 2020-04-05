1.请定义一个Collection类型的集合，存储以下字符串：
		“JavaEE企业级开发指南”，”Oracle高级编程”，”MySQL从入门到精通”，
		”Java架构师之路”
	请编程实现以下功能：
 使用迭代器遍历所有元素，并打印
 使用迭代器遍历所有元素，筛选书名小于10个字符的，并打印；
 使用迭代器遍历所有元素，筛选书名中包含“Java”的，并打印
 如果书名中包含“Oracle”，则删掉此书。删掉后，遍历集合，打印所有书名。
	(注意：以上功能写在一个main()方法中，但请单独实现)
2.题目
	请定义一个Collection类型的集合，存储以下分数信息：
		88.5,39.2,77.1,56.8,89,99,59.5
	请编程实现以下功能：
 使用增强for遍历所有元素，并打印
 使用增强for遍历所有元素，打印不及格的分数；
 使用增强for遍历所有元素，计算不及格的分数的数量，和平均分，并打印计算结果。
 使用增强for遍历所有元素，求出最高分，并打印；
	(注意：以上所有功能写在一个main()方法中，但请单独实现)	
3. 编程题【泛型】
	有以下类结构：
		人员类(Person)：
			|--学生类(Student)
				|--Java学生类(JavaStudent)
				|--UI学生类(UIStudent)
			|--教师类(Teacher)
				|--Java教师类(JavaTeacher)
				|--UI教师类(UITeacher)
	要求：
 	请按上述要求定义类，并实现继承关系即可(不需要定义类成员)
 	请按以下格式和要求定义测试类和方法：
	public class Test4_1{
		public static void main(String[] args){
			ArrayList<String> list1 = new ArrayList<>();
			ArrayList<Person> list2 = new ArrayList<>();
			ArrayList<Student> list3 = new ArrayList<>();
			ArrayList<JavaStudent> list4 = new ArrayList<>();
			ArrayList<UIStudent> list5 = new ArrayList<>();
			ArrayList<Teacher> list6 = new ArrayList<>();
			ArrayList<JavaTeacher> list7 = new ArrayList<>();
			ArrayList<UITeacher> list8 = new ArrayList<>();
			
			//请测试哪些集合可以调用print1()方法
			//请测试哪些集合可以调用print2()方法
			//请测试哪些集合可以调用print3()方法
			//请测试哪些集合可以调用print4()方法
		}
		//要求：参数可以接收任何泛型的ArrayList参数
		public static void print1(ArrayList<______________> list){
			
		}
		//要求：参数可以接收任何Person及其子类泛型的ArrayList参数
		public static void print2(ArrayList<______________> list){
		}
		//要求：参数可以接收任何Student及其子类泛型的ArrayList参数
		public static void print3(ArrayList<______________> list){
		}
		//要求：参数可以接收任何Java学员，及其父类泛型的ArrayList参数
		public static void print4(ArrayList<______________> list){
		}
	}
	
4. 键盘录入若干的数字存入集合中, 直到录入 -1 结束,完成以下需求
    (1)求集合中最大值
	(2)求集合中元素和
	(3)将集合中偶数元素变成的二倍
	(4)删除集合所有奇数的元素
	(注意,单独解决每一个需求)
5.键盘录入若干的字符串存入集合中,直到录入"over"结束, 请完成以下需求
	(1)将集合中所有元素变成大写
	(2)将集合以"张"开头的元素打印出来
	(3)将元素所有"A"变成"B",最后展示数据元素
6.随机生成10个不重复的数组放入集合, 实现奇数放左边,偶数放右边	