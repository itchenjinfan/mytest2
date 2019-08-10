package demo8;

public class Demo8 {
 /*   8.给定两个字符串，如果第一个字符串的最后一个和第二个字符串的第一个字符相等,那么就
    省略其中的任何一个字符,例如:“abc”和“cat”将生成“abcat”
    思路:
    前提:获取第一个字符串的最后一个字符,和获取第二个字符串的第一个字符,长度至少要大于等于1.
	1,获取参数1的最后一个字符
	2,获取参数2 的第一个字符
	3,比较获取的字符是否相等
	4,拼接*/
 public static void main(String[] args) {
     String str1="abcfe";
     String str2="effd";
     System.out.println(Demo8.method(str1,str2));
 }
 public static String method(String str1,String str2){
     char at1 = str1.charAt(str1.length() - 1);
     char at2 = str2.charAt(0);
     if (at1==at2){
         String str=str1+str2.substring(1,str2.length());
         return str;
     }
     return "无效数字";
 }
}
