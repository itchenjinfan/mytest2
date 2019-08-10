package demo4;

public class Demo4 {
    /*4,定义一个方法,接收一个字符串,返回一个新的字符串，其中最后的2个字符,被交换，比如“coding”产生“codign”。
    思路:
    前提:字符串的长度至少要大于2
  1,获取字符串的最后一个字符
  2,获取字符串的倒数第二个字符
  3,截取不要最后两个字符的字符串
  4,拼接*/
    public static void main(String[] args) {
        String str="coding";
        System.out.println(Demo4.methor(str));
        Demo4 a=new Demo4();
        System.out.println(a.methor(str));
    }
    public static String methor(String str){
       if (str.length()>2){
           char str1=str.charAt(str.length()-1);
           char str2=str.charAt(str.length()-2);
           String first=str.substring(0,str.length()-2);
           return first+str1+str2;
       }
       else {
           return "无效字串";
       }
    }
}
