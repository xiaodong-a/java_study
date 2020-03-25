package com.study;

import java.util.Random;

//随机生成10个[1,100]不重复的整数, 存入长度为10数组中, 最终遍历数组.
public class HomeWork09 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();
        int count=0;
        while (count!=arr.length){
            arr[count]=r.nextInt(100)+1;
            boolean flag=true;
            for (int i=0;i<count;i++){
                if(arr[count]==arr[i]){
                    flag=false;
                    break;
                }
            }
            if (flag){
                count++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
