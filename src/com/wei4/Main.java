package com.wei4;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    // 循环递归
    public int fun(int x) {
        if (x ==0 ) {
            return 0;
        } else {
            return 2 * fun(x - 1) + x * x;
        }
    }
}
