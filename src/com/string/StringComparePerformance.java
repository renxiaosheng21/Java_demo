package com.string;

public class StringComparePerformance {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            String s1 = "hello";
            String s2 = "hello";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("通过String关键字创建字符串的时间：" + (endTime - startTime) + "毫秒");
        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            String s3 = new String("hello");
            String s4 = new String("hello");
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("通过String对象创建字符串的时间：" + (endTime1 - startTime1) + "毫秒");

        String varibles[] = new String[50000];
        long startTime0 = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            varibles[i] = "hello";
        }
        long endTime0 = System.currentTimeMillis();
        System.out.println("使用字面值直接赋值字符串，花费时间：" + (endTime0 - startTime0) + "毫秒");
        String vavaribles1[] = new String[50000];
        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            vavaribles1[i] = new String("hello");
            vavaribles1[i] = vavaribles1[i].intern();
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("使用字符串对象intern方法花费：" + (endTime2 - startTime2) + "毫秒");
    }
}
