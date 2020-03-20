package com.study;

public class VariableDemo05 {
    // 输入钱  存的年数  年利率 得到本息
    public static float calMoney(float money,int year,float rate){
        //银行存款按单利计算
        return money*(1+rate*year) ;
    }
    //实现自动化输出，由于作业给出的输出 “一年， 两年..本金是”,所以要有 数字年 转成 汉字 年的方法。
    //注意输出给的2 是两年，一般20 ，会读成二十年，200 可以读成 二百
    //规定只允许存1000年以下好了，这样简单点。
    //12 十二不是一十二    211读二百一十一，210不读二百一十零.......
    public static String convert(int year) {
        String[] nums1 = {"零", "一", "二", "三", "四", "五", "六", "七", "八", "九"};
        String[] nums2 = {"零", "一", "两", "三", "四", "五", "六", "七", "八", "九"};
        String[] unit = {"", "十", "百"};
        String str = String.valueOf(year);
        char[] charNum = str.toCharArray();
        String result = "";
        int length = str.length();
        if (length == 1) {
            result = nums2[charNum[0] - '0'];
        } else if(length == 2 ){
            int c = charNum[0] - '0';
            result +=  c == 1 ?  unit[1] : nums1[c]+unit[1];
                c = charNum[1]-'0';
            result +=  c == 0 ?  "" : nums1[c];
        }else if (length == 3) {
            int c1 = charNum[0] - '0';  //百
            int c2 = charNum[1] - '0';  //十
            int c3 = charNum[2] - '0';  //个
            result += nums1[c1]+unit[2];
            result += (c3 == 0 ) ?  (c2 == 0? "":nums1[c2]+unit[1]):(c2 == 0 ? "零"+nums1[c3]:nums1[c2]+unit[1]+nums1[c3]);
        }
        return result;
    }
    public static void printMoney(float money,int year,float rate){
        System.out.println("存取"+convert(year)+"年后的本息是："+calMoney(money,year,rate));
    }

    public static void main(String[] agrs){
        float money =1000.0F;
        System.out.println("本金为："+money);
        printMoney(money,1,0.0225F);
        printMoney(money,2,0.027F);
        printMoney(money,3,0.0324F);
        printMoney(money,5,0.036F);
        //额外测试添加的输出，超过五年同意年利率为3.6%
        printMoney(money,10,0.036F);   //十
        printMoney(money,12,0.036F);   //十二
        printMoney(money,30,0.036F);   //三十
        printMoney(money,36,0.036F);   //三十六
        printMoney(money,200,0.036F);  //二百
        printMoney(money,201,0.036F);  //二百零一
        printMoney(money,220,0.036F);  //二百二十
        printMoney(money,221,0.036F);  //二百二十一
    }
}
