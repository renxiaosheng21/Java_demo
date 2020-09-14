import java.sql.SQLOutput;

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
    }
}
