1.�붨��һ��Collection���͵ļ��ϣ��洢�����ַ�����
		��JavaEE��ҵ������ָ�ϡ�����Oracle�߼���̡�����MySQL�����ŵ���ͨ����
		��Java�ܹ�ʦ֮·��
	����ʵ�����¹��ܣ�
 ʹ�õ�������������Ԫ�أ�����ӡ
 ʹ�õ�������������Ԫ�أ�ɸѡ����С��10���ַ��ģ�����ӡ��
 ʹ�õ�������������Ԫ�أ�ɸѡ�����а�����Java���ģ�����ӡ
 ��������а�����Oracle������ɾ�����顣ɾ���󣬱������ϣ���ӡ����������
	(ע�⣺���Ϲ���д��һ��main()�����У����뵥��ʵ��)
2.��Ŀ
	�붨��һ��Collection���͵ļ��ϣ��洢���·�����Ϣ��
		88.5,39.2,77.1,56.8,89,99,59.5
	����ʵ�����¹��ܣ�
 ʹ����ǿfor��������Ԫ�أ�����ӡ
 ʹ����ǿfor��������Ԫ�أ���ӡ������ķ�����
 ʹ����ǿfor��������Ԫ�أ����㲻����ķ�������������ƽ���֣�����ӡ��������
 ʹ����ǿfor��������Ԫ�أ������߷֣�����ӡ��
	(ע�⣺�������й���д��һ��main()�����У����뵥��ʵ��)	
3. ����⡾���͡�
	��������ṹ��
		��Ա��(Person)��
			|--ѧ����(Student)
				|--Javaѧ����(JavaStudent)
				|--UIѧ����(UIStudent)
			|--��ʦ��(Teacher)
				|--Java��ʦ��(JavaTeacher)
				|--UI��ʦ��(UITeacher)
	Ҫ��
 	�밴����Ҫ�����࣬��ʵ�ּ̳й�ϵ����(����Ҫ�������Ա)
 	�밴���¸�ʽ��Ҫ���������ͷ�����
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
			
			//�������Щ���Ͽ��Ե���print1()����
			//�������Щ���Ͽ��Ե���print2()����
			//�������Щ���Ͽ��Ե���print3()����
			//�������Щ���Ͽ��Ե���print4()����
		}
		//Ҫ�󣺲������Խ����κη��͵�ArrayList����
		public static void print1(ArrayList<______________> list){
			
		}
		//Ҫ�󣺲������Խ����κ�Person�������෺�͵�ArrayList����
		public static void print2(ArrayList<______________> list){
		}
		//Ҫ�󣺲������Խ����κ�Student�������෺�͵�ArrayList����
		public static void print3(ArrayList<______________> list){
		}
		//Ҫ�󣺲������Խ����κ�JavaѧԱ�����丸�෺�͵�ArrayList����
		public static void print4(ArrayList<______________> list){
		}
	}
	
4. ����¼�����ɵ����ִ��뼯����, ֱ��¼�� -1 ����,�����������
    (1)�󼯺������ֵ
	(2)�󼯺���Ԫ�غ�
	(3)��������ż��Ԫ�ر�ɵĶ���
	(4)ɾ����������������Ԫ��
	(ע��,�������ÿһ������)
5.����¼�����ɵ��ַ������뼯����,ֱ��¼��"over"����, �������������
	(1)������������Ԫ�ر�ɴ�д
	(2)��������"��"��ͷ��Ԫ�ش�ӡ����
	(3)��Ԫ������"A"���"B",���չʾ����Ԫ��
6.�������10�����ظ���������뼯��, ʵ�����������,ż�����ұ�	