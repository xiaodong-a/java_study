package com.study;

import java.util.Random;

//定义一个数组其中包含多个数字。用自己的方式最终实现，奇数放在数组的左边，
// 偶数放在数组的右边。（可以创建其他数组，不必须在原数组中改变）
public class HomeWork11 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {   //1-100的随机数组，排序奇偶
            arr[i]=r.nextInt(100)+1;
        }
        int[] result=new int[arr.length];
        int left=0;
        int right=result.length-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==1){
                result[left]=arr[i];
                left++;
            }else{
                result[right]=arr[i];
                right--;
            }
        }
        System.out.println("原数组：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("奇偶分类后：");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
}
