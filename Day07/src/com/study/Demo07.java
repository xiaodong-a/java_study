package com.study;
//定义Demo07类 ,设计一个方法，用于比较两个数组的内容是否相同。在main方法中调用该方法测试功能
public class Demo07 {
    public static void main(String[] args) {
        int[] arr1={1,23,3,2};
        int[] arr2={1,23,3,2};
        int[] arr3={1,23,3,2,1};
        System.out.println("数组arr1");
        printArray(arr1);
        System.out.println("数组arr2");
        printArray(arr2);
        System.out.println("数组arr3");
        printArray(arr3);
        System.out.printf("compare(arr1,arr2)=%b\n",compare(arr1,arr2));
        System.out.printf("compare(arr1,arr3)=%b\n",compare(arr1,arr3));

    }
    public static boolean compare(int[] arr1,int[] arr2){
        if (arr1.length==arr2.length){
            for (int i = 0; i < arr1.length; i++) {
                if(arr1[i]!=arr2[i]){
                    return false;
                }
            }
        }else{
            return false;
        }
        return true;
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

}
