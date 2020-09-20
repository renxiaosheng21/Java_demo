package com.string;
/*字符串反转常用的函数及方法
* */
public class StringReverse {
    public static void main(String[] args) {
        String str = "Hello World";
        StringBuffer reverse  = new StringBuffer(str).reverse();
        System.out.println(reverse);
    }
}
