/*
凡是参数类型为Object类型,那么就可以传入任意引用数据类型的对象进来

String 类:
    1.包:java.lang  不需要导包
    2.类的解释说明
        概述:String 类代表字符串,Java 程序中的所有字符串字面值（如 "abc" ）都作为此类的对象.
            大白话:创建String类对象其实就是创建字符串对象,或者所有的字符串其实就是String类对象

        特点:String 对象是不可变的，所以可以共享

    3.构造方法
        String()  初始化一个新创建的 String 对象，使其表示一个空字符序列。
        String(byte[] bytes)  通过使用平台的默认字符集解码指定的 byte 数组，构造一个新的 String。
        String(char[] value)  分配一个新的 String，使其表示字符数组参数中当前包含的字符序列。
        String(String original)  初始化一个新创建的 String 对象，使其表示一个与参数相同的字符序列；换句话说，新创建的字符串是该参数字符串的副本。

    4.成员方法
        判断功能的方法
            - public boolean equals (Object anObject) ：将此字符串与指定对象进行比较。
            - public boolean equalsIgnoreCase (String anotherString) ：将此字符串与指定对象进行比较，忽略大小写。
          总结: 2个字符串使用==比较运算符,比较的是地址值,如果使用的是equals方法,比较的是字符串内容是否相等

       获取功能的方法
        - public int length () ：返回此字符串的长度。
        - public String concat (String str) ：将指定的字符串连接到该字符串的末尾。拼接
        - public char charAt (int index) ：返回指定索引处的 char值。  字符串中的每一个字符都有一个对应的索引,索引是从0开始,最大索引:长度-1
        - public int indexOf (String str) ：返回指定子字符串第一次出现在该字符串内的索引。
        - public String substring (int beginIndex) ：返回一个子字符串，从beginIndex开始截取字符串到字符串结尾。 包括beginIndex
        - public String substring (int beginIndex, int endIndex) ：返回一个子字符串，从beginIndex到endIndex截取字符串。含beginIndex，不含endIndex

       转换功能的方法
            - public char[] toCharArray () ：将此字符串转换为新的字符数组。
            - public byte[] getBytes () ：使用平台的默认字符集将该 String编码转换为新的字节数组。    重要
            - public String replace (CharSequence target, CharSequence replacement) ：将与target匹配的字符串使用replacement字符串替换。
                    如果参数的类型CharSequence,就可以传入字符串对象

     分割功能的方法
        - public String[] split(String regex) ：将此字符串按照给定的regex（规则）拆分为字符串数组。

    回家自己练习:
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
         static String valueOf(int i)  返回 int 参数的字符串表示形式。  10+""-->"10"
 */
public class Demo10 {
    public static void main(String[] args) {

        // 特殊的地方
        String str1 = "hello.world.hello.java";


        //  需求:以点拆分str字符串
        String[] split = str1.split("\\.");// 告诉编译器这个点就是一个字符串点,并不是正则表达式的一种规则
        System.out.println(split.length);//4
        for (int i = 0;i<split.length;i++){
            System.out.println(split[i]);
        }

       // String[] split = str1.split(".");// 传入的参数regex,可能会是正则表达式  点是正则表达式中的一种规则,代表任意字符
       // System.out.println(split.length);//0


        System.out.println("======================");
        String str = "hello,world,hello,java";

        // 最基本的使用
        // 需求:以逗号拆分str字符串
        String[] arr = str.split(",");

        for (int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }

    /**
     * 转换功能的方法
     */
    private static void method09() {
        String str = "Hello World!";

        // 把str转换为字符数组
        char[] chs = str.toCharArray();

        for (int i = 0;i<chs.length;i++){
            System.out.println(chs[i]);
        }

        System.out.println("=======================");
        // 把str转换为字节数组
        String str1 = "abcdefg";
        byte[] bytes = str1.getBytes();
        for (int i = 0;i<bytes.length;i++){
            System.out.println(bytes[i]);
        }


        // 把str1中的bcd替换成dcb
        String replace = str1.replace("bcd", "dcb");
        System.out.println(replace);// adcbefg
        System.out.println(str1);// abcdefg
    }

    /**
     * substring
     */
    private static void method08() {
        String str = "Hello World!";

        // 截取World!字符串
        String substring = str.substring(6);
        System.out.println(substring);// World!

        // 截取World字符串  开始:6  结束索引:11
        String substring1 = str.substring(6, 11);
        System.out.println(substring1);// World
    }

    /**
     * indexOf
     */
    private static void method07() {
        String str = "Hello World!";

        // 找llo子字符串的索引
        int index1 = str.indexOf("llo");
        System.out.println(index1);// 2


        // 找Hello World!子字符串的索引
        int index2 = str.indexOf("Hello World!");
        System.out.println(index2);//0

        // 找l子字符串的索引
        int index3 = str.indexOf("l");
        System.out.println(index3);//2
    }

    /**
     * 获取功能的方法(一)
     */
    private static void method06() {
        String str1 = "Hello World!";

        // 获取str1字符串的长度
        int len = str1.length();
        System.out.println("str1的长度是:"+len);//12

        // 拼接字符串
        String concat = str1.concat("Hello java!");
        System.out.println(concat);// Hello World!Hello java!
        System.out.println(str1);// Hello World!

        // 获取索引为1的字符
        char ch1 = str1.charAt(1);
        System.out.println("索引为1对应的字符是:"+ch1);// e

        // 获取倒数第二个字符  倒数第二个字符的索引:字符串长度-2
        char ch2 = str1.charAt(len - 2);
        System.out.println("倒数第二个字符是:"+ch2);// d
    }

    /**
     * equals与equalsIgnoreCase的比较方法
     */
    private static void method05() {
        String str1 = "abc";
        String str2 = "ABC";

        // equals方法  不忽略大小的比较
        boolean res1 = str1.equals(str2);
        System.out.println(res1);// false

        // equalsIgnoreCase  忽略大小的比较
        boolean res2 = str1.equalsIgnoreCase(str2);
        System.out.println(res2);// true
    }

    /**
     * == 和 equals方法比较字符串的区别
     */
    private static void method04() {
        String str1 = "ABC";// 直接使用双引号创建字符串对象  常量区   "ABC"
        String str2 = new String("ABC");// 使用构造方法创建字符串对象  堆区  "ABC"

        System.out.println(str1 == str2);// false

        // 使用equals方法比较2个字符串是否相等
        boolean res1 = str1.equals(str2);
        System.out.println(res1);// true

        // 总结: 2个字符串使用==比较运算符,比较的是地址值,如果使用的是equals方法,比较的是字符串内容是否相等
    }

    /**
     *  直接使用双引号创建字符串对象与使用构造方法创建字符串对象的区别
     */
    private static void method03() {
        String str1 = "ABC";// 直接使用双引号创建字符串对象  常量区
        String str2 = new String("ABC");// 使用构造方法创建字符串对象  堆区
        String str3 = "ABC";

        System.out.println(str1 == str3);// true
        System.out.println(str1 == str2);// false
    }

    /**
     * 创建字符串对象
     */
    private static void method02() {
        // 根据构造方法来创建字符串对象
        String str1 = new String();// 创建了一个空字符串: ""

        // 通过byte数组来创建字符串对象  把byte数组转换为字符串
        byte[] bys = {97,98,99};
        String str2 = new String(bys);// "abc"
        System.out.println(str2);

        // 通过char数组来创建字符串对象  把字符数组转换为字符串
        char[] chs = {'a','b','c','d'};
        String str3 = new String(chs);
        System.out.println(str3);// "abcd"

        // 根据字符串创建一个字符串
        String str4 = "ABC";// 直接使用双引号创建字符串对象
        String str5 = new String("ABC");// 使用构造方法创建字符串对象
        System.out.println(str4);// "ABC"
        System.out.println(str5);// "ABC"
    }

    /**
     * Sting字符串的特点
     */
    private static void method01() {
        // String str = "abc";
        // str += "d";// 字符串和任意类型相加,都会得到一个新的字符串
        // System.out.println(str);//abcd,内存中有三个字符串对象,分别是:"abc","d","abcd"

      /*  String str = "abc";
        System.out.println(str+"d");// abcd
        System.out.println(str);// abc*/


        String str1 = "abc";
        String str2 = "abc";// 内存中只有一个字符串对象,"abc"字符串常量
    }
}
