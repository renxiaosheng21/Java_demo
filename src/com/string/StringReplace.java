package com.string;
/*字符串替换
replace
replaceFast 替换首次出现的字符
replaceAll 替换去按怒
* */
public class StringReplace {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str.replace("H","h"));
        System.out.println(str.replaceFirst("He","he"));
        System.out.println(str.replaceAll("o","e"));
    }
}
