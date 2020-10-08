package com.chen;

public class TestMain1 {
    public static void main(String[] args) {
        System.out.println("第一次提交");
        char[] arr1 = new char[]{'c',' ',' ','p','q'};
        char[] arr2 = new char[10];
        for(char i = 0;i<arr1.length;i++){
            if(arr1[i] != 32){
                arr2[i] = arr1[i];
            }
        }
        for (char c : arr2) {
            System.out.println(c);
        }
    }
}
