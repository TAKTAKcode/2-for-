package com.tak.array;

public class NumArray {

    public static void main(String[] args) {
//        int N = 10000;
//        int cnt = 0;
//
//        for (int i = 0; i < N; i++) {
//            System.out.println("연산 횟수 : " + cnt++);
//        }
//        for (int i = 0; i < N; i++) {
//            System.out.println("연산 횟수 : " + cnt++);
//        }
//        for (int i = 0; i < N; i++) {
//            System.out.println("연산 횟수 : " + cnt++);
//        }

        int N = 10;
        int cnt = 0;
        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                System.out.println("연산 횟수 : " + cnt++);
            }
        }



    }
}
