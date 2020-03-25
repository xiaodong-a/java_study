package com.study;

public class HomeWork08 {
    public static void main(String[] args) {
        int[] arr={68,27,95,88,171,996,51,210};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            int ge=arr[i]%10;
            int shi=arr[i]/10%10;
            if(ge!=7&&shi!=7&&arr[i]%2==0){
                sum+=arr[i];
            }
        }
        System.out.println("满足条件的和:"+sum);
    }
}
