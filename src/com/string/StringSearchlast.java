package com.string;
/*
查找字符串最后一次出现的位置
lastIndexOf：查找最后一个字符串出现的位置
indexOf:首次出现的位置，从0开始
* */
public class StringSearchlast {
    public static void main(String[] args) {
        String str = "Hello world,Hello Runoob";
        int lastIndex = str.lastIndexOf("Runoob");
        if(lastIndex == -1){
            System.out.println("没有找到这个字符串");
        }else{
            System.out.println("该字符串最后出现的位置是:"+lastIndex);
        }
        String str1 = "https://www.csdn.net.csdn.net/";
        System.out.println("n第一次出现的位置:"+str1.indexOf("n"));//15
    }
}
