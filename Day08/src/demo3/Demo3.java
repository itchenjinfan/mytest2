package demo3;

public class Demo3 {
    /*3,定义一个方法,接收一个字符串,如果字符串中含有"bad" 并且"bad"在字符串出现的位置在0或1索引处，则返回true，
    例如“badxxx”或“xbadxx”，返回true,而“xxbadxx”返回false, 字符串可以是任何长度,有可能长度为0.
            注意：使用.equals（）来比较2个字符串。
    思路:
    获取bad在字符串中出现的位置,判断是否在0位置或者1位置上
    获取某个字符串在什么位置使用,indexOf(String str);*/
    public static void main(String[] args) {
        String str="badeer";
        System.out.println(Demo3.flat(str));
    }

    public static boolean flat(String str) {
        if (str.length() > 3) {
            String str1 = str.substring(0, 3);
            String str2 = str.substring(1, 4);
            if (str1.equals("bad") || str2.equals("bad")) {
                return true;
            }
        } return false;
    }
}