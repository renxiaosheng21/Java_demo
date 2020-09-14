package com.string;

import java.util.StringTokenizer;

public class StringSplit {
    public static void main(String[] args) {
        String str = "Hello-World";
        String[] temp;
        String delimter = "-";
        temp = str.split(delimter);
        for(int i=0;i<temp.length;i++){
            System.out.println("123"+temp[i]);
        }
        System.out.println("-----java for each循环输出的方法------");
        String str1 = "www.runoob.com";
        String[] temp1;
        String delimeter1 = "\\.";
        temp1 = str1.split(delimeter1);
        for(String x: temp1){
            System.out.println(x);
        }
        //在本例中用到String类的split方法，其实在字符串分割时可以调用StringTokenizer，实例化一个StringTokenizer的
        //的对象，通过hashMoreToken()与nextToken进行判断并打印分割后的子字符串，具体代码如下
        String str3 = "www.runoob.com";
        StringTokenizer str2 = new StringTokenizer(str3,".");
        //对str2遍历并打印字符串
        while(str2.hasMoreTokens()){
            System.out.println(str2.nextToken());
        }
    }
}
