package com.string;

public class StringToUpperCase {
    public static void main(String[] args) {
        String str = "String runoob";
        String strUpper = str.toUpperCase();
        System.out.println("原始字符串:"+str);
        System.out.println("转换为大写:"+strUpper);
        String strLower = str.toLowerCase();
        System.out.println("转换为小写:"+strLower);
    }
}
