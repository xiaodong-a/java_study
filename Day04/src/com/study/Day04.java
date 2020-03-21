package com.study;

import java.sql.SQLOutput;
import java.util.Enumeration;
import java.util.Scanner;

//idea 建立新文件再一个一个运行，太麻烦了，还是写在一个文件吧，也方便批改作业
public  class Day04{

    public void homeWork01(){
        int red = 21;
        int green=24;
        int red_now = 2*red+3; //现在的钱
        int green_now = 2*green;
        System.out.printf("红茶妹妹和绿茶妹妹现在的钱%s.",(red_now==green_now? "一致":"不一致"));
    }

    public void homeWork02(){
        int fish =24;
        int peanut=8;
        int rice=3;
        float sum =fish+peanut+rice;
        float result1 = 16+peanut+rice; //采用鱼香肉丝优惠方式
        float result2 = sum>=30? sum*0.8F:sum; //采用打折优惠方式
        float result = result1>result2? result2:result1;
        System.out.println("这个小伙最少要花"+result+"元。");
    }

    public void homeWork03(){
        //捕捉用户的操作错误，让程序更稳定
        //number好像必须要写在try外边？在try里面声明，while外看不到？try结束，try中声明变量占用的空间会释放？
        //这是个块，不能在里面声明
        int number;
        while(true){
            try {
                //要在try中声声明对象in，这样可以清空控制台输入缓存
                //不然如果输入的类型不对。nextInt就会一直捕捉上次输入的错误缓存，死循环。
                Scanner in = new Scanner(System.in);
                System.out.println("请输入4位会员卡号：");
                   number=in.nextInt();              //非整数，会使得nextInt出错
                if (number<1000||number>9999){
                    throw new Exception ("输入数据范围不匹配"); //非四位数，抛出错误
                }
                break;
            }catch (Exception e){
                System.out.println(e);
            }
        }
        int ge = number%10;
        int shi = number/10%10;
        int bai = number/100%10;
        int qian = number/1000%10;
        int sum=ge+shi+bai+qian;
        System.out.println("会员卡号"+number+"各位之和为："+sum);
        System.out.printf("会员卡号%d%s幸运客户",number,(sum==23? "是":"不是"));
    }

    public void homeWork04(){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入小明左手中的纸牌：");
        int left = in.nextInt();
        System.out.println("请输入小明右手中的纸牌：");
        int right = in.nextInt();
        System.out.printf("互换前小明手中的纸牌:\n左手中的纸牌:%d\n右手中的纸牌:%d\n",left,right);
        int temp=left;
        left=right;
        right=temp;
        System.out.printf("互换后小明手中的纸牌:\n左手中的纸牌:%d\n右手中的纸牌:%d\n",left,right);
    }

    //快没时间交作业了，不能边看作业边学习新东西了==
    public void homeWork05(){
        Scanner in = new Scanner(System.in);
        //题目说录入一个数字，没说是整数，还是浮点数。简单点。整数好了
        System.out.println("键盘录入一个整数：");
        int number = in.nextInt();
        if(number<100||number>999){
            System.out.println(number+"不是三位数，当然不是水仙花数");
        }else{
            int ge = number%10;
            int shi = number/10%10;
            int bai = number/100%10;
            int sum=ge*ge*ge+shi*shi*shi+bai*bai*bai;
            if(sum==number){
                System.out.println(number+"是水仙花数");
            }else{
                System.out.println(number+"不是水仙花数");
            }

        }
    }


    public void homeWork06(){
        Scanner in = new Scanner(System.in);
        /*	90-100	优秀
        	80-90	好
	        70-80	良
	        60-70	及格
	        60以下	不及格
	             这个90算那个呢？全左闭又开好了
	        90-100	优秀
        	80-89	好
	        70-79	良
	        60-69	及格
	        60（不含60）以下	不及格
         */
        System.out.println("输入你的分数(整数)：");
        int score = in.nextInt();
        String[] levels={"不及格","不及格","不及格","不及格","不及格","不及格","及格",
                "良","好","优秀","优秀"};
        if(score>100||score<0){
            System.out.println(score+"不是0~100范围，不对");
        }else{
            System.out.println("成绩为："+levels[score/10]);//如果是左开右闭区间，score-1就行
        }
    }

    public void homeWork07(){
        Scanner in = new Scanner(System.in);
        System.out.println("输入你的存款(单位：元)：");
        double money = in.nextDouble();
        if(money>5000000){
            System.out.println("买奥迪A8L");
        }else if(money>1000000){
            System.out.println("买奥迪A6L");
        }else if(money>500000){
            System.out.println("买奥迪A4L");
        }else if(money>100000){
            System.out.println("买大众速腾");
        }else{
            System.out.println("买大众捷达");
        }

    }

    public void homeWork08(){
        Scanner in = new Scanner(System.in);
        System.out.println("百米成绩(单位：秒)：");
        double score=in.nextDouble();
        System.out.println("性别(男/女)：");
        String gender = in.next(); //nextLine会读取上次输入末尾的回车

        if(score<=10){
            System.out.println("可以进入决赛");
       //     gender.equals(); gender.compareTo(); gender.compareToIgnoreCase();gender.equalsIgnoreCase();
       //     gender.contains()
            if(gender.equals("男")){
                System.out.println("进入男子组");
            }else{
                System.out.println("进入女子组");
            }
        }else{
            System.out.println("不能进入决赛");
        }
    }

    public void homeWork09(){
        int sum=0;
        for(int i = 1;i<=100;i++){
            if (i%2==0){
                sum+=i;
            }
        }
        System.out.println("1-100之间的偶数和为："+sum);
    }

    public void homeWork10() {
        //打印所有的水仙花数, 及水仙花数的总个数.
        int count = 0;
        for (int number = 100; number <= 999; number++) {
            int ge = number % 10;
            int shi = number / 10 % 10;
            int bai = number / 100 % 10;
            int sum = ge * ge * ge + shi * shi * shi + bai * bai * bai;
            if (sum == number) {
                System.out.println(number);
                count++;
            }
        }
        System.out.println("水仙花总数：" + count);
    }

    //把1~100之间的奇数, 按照6个一行的格式进行输出.
    public void homeWork11() {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                count++;
                System.out.print(i + (count% 6 == 0 ? "\n" : " "));
            }
        }
    }

   /* 已知世界最高山峰是珠穆朗玛峰(8844.43米=8844430毫米).
    假如我有一张足够大的纸，它的厚度是0.1毫米.
            请问，我折叠多少次，可以折成珠穆朗玛峰的高度?
    即: 纸张的厚度 >= 珠穆朗玛峰的高度
   */
   public void homeWork12(){
       double height=0.1;
       int count=0;
       for(;height<8844430.0;height*=2.0){
           count++;
       }
       System.out.printf("折叠%d次后，大于等于珠穆朗玛峰的高度",count);
   }

   //13. 按照从大到小的顺序输出四位数中的 个位 + 百位 = 十位 + 千位(3553,2332,1166,8228,3773)的数字及个数.
   public void homeWork13(){
       //换种思路
       /*四位数mnxy  ;其实对于任何mn，总有mnnm四位数符合条件
       m+x=n+y
       0<=m+x-n<=9    ;y=m+x-n
       n-m<=x<=9+n-m  联立 0<=x<=9
       max(n-m,0)<=x<=min(9,9+n-m);由于mnnm这个不等式始终又解，无解也行，不影响for循环
       */
       int count=0;
       for(int m =9;m>=1;m--){   //千位不能为0
           for(int n=9;n>=0;n--){
               for(int x=min(9,9+n-m);x>=max(n-m,0);x--){
                   int number = 1000*m+100*n+10*x+(m+x-n);
                   count++;
                   System.out.print(number + (count% 5 == 0 ? "\n" : "\t"));
               }
           }
       }
       System.out.println("总个数是："+count);
   }

   public int max(int m,int n){
       return m>n?  m:n;
   }

    public int min(int m,int n){
        return m>n?  n:m;
    }

    public void homeWork14(){
        Scanner sc = new Scanner(System.in);
        int number;
        while(true){
            System.out.println("请输入一个三位数");
            number = sc.nextInt();
            //判断number是否是一个三位数!!!!
            if(number > 100 && number <=999){// 只有当输入的是三位数才会结束循环
                break;
            }else{
                System.out.println("重新输入");
            }
        }
        int sum = 0;
        //拿到100 到 number之间的所有的三位数
        for(int i = 100; i <= number; i++){
            int ge = i % 10;
            int shi = i /10 % 10;
            int bai = i /100% 10;
            if(ge != 7 && shi != 5 && bai != 3){
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public void homeWork15() {
        Scanner in = new Scanner(System.in);
        System.out.println("机票原价：");
        int money = in.nextInt();
        System.out.println("旅行月份(1~12)：");
        int month = in.nextInt();
        System.out.println("选择仓位：1头等舱  2经济舱");
        int type = in.nextInt();

        if (4 <= month && month <= 8) {
            if (type == 1) {
                double discount = 0.9;
                System.out.println("旺季" + month + "月份出行，头等舱打" + discount + "折，原价" + money
                        + "，折后价格" + money * discount);
            } else {
                double discount = 0.8;
                System.out.println("旺季" + month + "月份出行，经济舱打" + discount + "折，原价" + money
                        + "，折后价格" + money * discount);
            }
        } else {
            if (type == 1) {
                double discount = 0.5;
                System.out.println("淡季" + month + "月份出行，头等舱打" + discount + "折，原价" + money
                        + "，折后价格" + money * discount);
            } else {
                double discount = 0.4;
                System.out.println("淡季" + month + "月份出行，经济舱打" + discount + "折，原价" + money
                        + "，折后价格" + money * discount);
            }
        }
    }

    public void showZuoye(int n) {
        //这个不好，有类似eval就好了，下次再说
        switch (n) {
            case 1:
                homeWork01();
                break;
            case 2:
                homeWork02();
                break;
            case 3:
                homeWork03();
                break;
            case 4:
                homeWork04();
                break;
            case 5:
                homeWork05();
                break;
            case 6:
                homeWork06();
                break;
            case 7:
                homeWork07();
                break;
            case 8:
                homeWork08();
                break;
            case 9:
                homeWork09();
                break;
            case 10:
                homeWork10();
                break;
            case 11:
                homeWork11();
                break;
            case 12:
                homeWork12();
                break;
            case 13:
                homeWork13();
                break;
            case 14:
                homeWork14();
                break;
            case 15:
                homeWork15();
                break;
            default:
                System.out.println("没有匹配的作业");
        }
    }

     public static void main(String[] args){
        Day04 hw = new Day04();
            for(int nn = 1; nn<=15;nn++){
                System.out.println("--------------------------------------------");
                System.out.println("第"+nn+"题");
                hw.showZuoye(nn);
                System.out.println("\n--------------------------------------------");
                Scanner in = new Scanner(System.in);
                if(nn<15) {
                    System.out.println("按下enter执行下一题:");
                    String en = in.nextLine();
                }
            }
    }
}