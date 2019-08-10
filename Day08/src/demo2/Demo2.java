package demo2;

public class Demo2 {
    public static void main(String[] args) {
//        2,定义一个方法,接收一个字符串,如果字符串的前两个字符和末尾的两
//         个字符同时出现，就返回true，如“edited”，则返回true。
//        思路:想要截取前两个和最后两个前提是字符串的长度至少要大于等于2

        String str="editeded";
        System.out.println(Demo2.A(str));
    }
    public static boolean A(String str) {
        if (str.length() > 2) {
            String start = str.substring(0, 2);
            String end = str.substring(str.length() - 2);
            if (start.equals(end)) {
                return true;
            }
        }return false;
    }}
