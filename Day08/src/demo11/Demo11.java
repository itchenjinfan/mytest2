package demo11;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Demo11 {
    public static void main(String[] args) {
      /*  转换功能的方法
        - public char[] toCharArray () ：将此字符串转换为新的字符数组。
        - public byte[] getBytes () ：使用平台的默认字符集将该 String编码转换为新的字节数组。    重要
        - public String replace (CharSequence target, CharSequence replacement) ：将与target匹配的字符串使用replacement字符串替换。
        如果参数的类型CharSequence,就可以传入字符串对象*/
      String str="dddfdsA DS1ddd2@fkjd";
        byte[] arr1=str.getBytes();
        System.out.println(Arrays.toString(arr1));
        char[] arr2=str.toCharArray();
        System.out.println(Arrays.toString(arr2));
        String str1=str.replace("fd","abcd");
        System.out.println(str1);
        System.out.println("=======================");
        /*回家自己练习:
         boolean contains(CharSequence s)  当且仅当此字符串包含指定的 char 值序列时，返回 true。
         boolean endsWith(String suffix) 测试此字符串是否以指定的后缀结束。
         boolean startsWith(String prefix) 测试此字符串是否以指定的前缀开始。
         int indexOf(int ch)  返回指定字符在此字符串中第一次出现处的索引。
         boolean isEmpty() 当且仅当 length() 为 0 时返回 true。 ""
         int lastIndexOf(int ch)  返回指定字符在此字符串中最后一次出现处的索引。
         int lastIndexOf(String str) 返回指定子字符串在此字符串中最右边出现处的索引。
         String replace(char oldChar, char newChar)  返回一个新的字符串，它是通过用 newChar 替换此字符串中出现的所有 oldChar 得到的。
         String toLowerCase()  使用默认语言环境的规则将此 String 中的所有字符都转换为小写。
         String toUpperCase() 使用默认语言环境的规则将此 String 中的所有字符都转换为大写。
          String trim() 返回字符串的副本，忽略前导空白和尾部空白。
         static String valueOf(int i)  返回 int 参数的字符串表示形式。  10+""-->"10"*/
        System.out.println(str.contains("abc"));
        System.out.println(str.endsWith("fkj"));
        System.out.println(str.startsWith("abc"));
        System.out.println(str.indexOf("sA"));
        System.out.println(str.isEmpty());
        System.out.println(str.lastIndexOf('1'));
        System.out.println(str.toLowerCase());
        System.out.println(str1.toUpperCase());
        String str2="     sddsf";
        System.out.println(str2.trim());
    }
}
