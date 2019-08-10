package demo1;

import java.util.Arrays;

public class Demo1 {
   /* 1.分析以下需求，并用代码实现：
    (1)模拟Arrays.toString(int[] arr);方法，自己封装一个public static String toString(int[] arr);
	(2)如果int类型数组arr为null，toString方法返回字符串"null"
    (3)如果int类型数组arr长度为0，toString方法返回字符串"[]"
    (4)如果int类型数组arr的内容为{1,2,3,4,5},toString方法返回字符串"[1, 2, 3, 4, 5]"*/
       public static void main(String[] args) {
           int[] arr = {41,25,58,68,85};
           String string = Demo1.toString(arr);
           System.out.println(string);
           Demo1 a=new Demo1();
           System.out.println(a.toString(arr));
       }
       public static String toString(int[] arr) {
           //数组为空直接返回字符串"null"
           if (arr == null){
               return "null";
           }
           //数组长度为0，返回字符串"[]"
           if (arr.length == 0){
               return "[]";
           }else{
               String str = "[";
               for (int i = 0; i<arr.length; i++) {
                   if (i == arr.length-1){
                       str+=arr[i]+"]";
                   }else{
                       str+=arr[i]+", ";
                   }
               }
               return str;
           }
       }
   }

