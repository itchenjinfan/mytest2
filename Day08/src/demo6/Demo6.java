package demo6;

public class Demo6 {
   /* 6,定义一个方法,接收一个字符串,找出字符串中三元组的个数,
            “三元组”是指一个连续出现的三次的字符，返回给定字符串中三元组的个数，
            “三元组”是可以重叠的：“AAAAA”包含3个三元组
    思路:计数器思想*/
   public static void main(String[] args) {
        String str="AAABAAA";
       System.out.println(Demo6.method(str));
   }
   public static int method(String str){
       if (str.length()>=3){
           int count=0;//
           for (int i = 0; i <str.length() ; i++) {
               if(i + 2 < str.length()){
                   if(str.charAt(i) == str.charAt(i + 1) && str.charAt(i + 1) == str.charAt(i + 2)){
                       count++;
                   }
               }
           }
           return count;
       }return 0;
   }
}
