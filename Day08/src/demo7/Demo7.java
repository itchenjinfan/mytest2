package demo7;

import java.util.Scanner;

public class Demo7 {
/*    7.分析以下需求，并用代码实现：
    (1)键盘录入一个小数，要求小数点后的小数位最少2位
    (2)定义方法，实现保留小数点后的两位小数(只舍不进)
	(3)如：输入5.6789 输出5.67,输入5.67389 输出5.67*/
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("请输入一个小数位大于2的小数：");
      String str=sc.nextLine();
      System.out.println(Demo7.method(str));
   }
   public static String method(String str){
      String[]arr=str.split("\\.");
      arr[1]=arr[1].substring(0,2);
      return arr[0]+"."+arr[1];
   }
}

