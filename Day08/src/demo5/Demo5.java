package demo5;

public class Demo5 {
    public static void main(String[] args) {
        /*5,定义一个方法,接收一个字符串和一个int n，返回一个由原字符串中前n个字符和后N个字符组成的字符串,
                字符串长度至少为n个。
        例如:method("heimaitcast",3) 结果:heiast
*/
        String str="heimaitcase";
        System.out.println(Demo5.method(str,4));
    }
    public static String method(String str,int n){
        if (str.length()>n) {
            String substring1 = str.substring(0, n);
            String substring2 = str.substring(str.length() - n, str.length() );
            String substring = substring1 + substring2;
            return substring;
        }
        return "无效字符串";
    }
}
