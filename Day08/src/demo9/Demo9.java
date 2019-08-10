package demo9;

import java.util.Scanner;

public class Demo9 {
    /*9.给定一个字符串，返回一个没有前2个字符的版本。 如果第一个字符是'a'，则保留第一个字符
    如果第二个字符是'b'。 则保留第二个字符，字符串可以是任意长度。
    思路: 1,返回一个没有前2个字符的版本。那么也就是字符串长度至少要大于等于2
     2,如果第一个字符是'a'，则保留第一个字符如果第二个字符是'b'。 则保留第二个字符
      3,分了四种情况:
    1),前面有ab,返回:原串
	2),第一个字符是a,返回: 保留a,从第二个字符开始截取到最后
	3),第二个字符时b,返回: 丢掉第0个字符,从第一个字符开始截取到最后
	4),没有ab,返回:从第二个开始截取到最后*/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一串大于2个字符的字符串：");
        String str=sc.nextLine();
        System.out.println(Demo9.method(str));
    }
    public static String method(String str){
        if (str.substring(0,2).equals("ab")){
            return str;
        }
        else if (str.charAt(0)=='a'){
            return 'a'+str.substring(2,str.length());
        }
        else if (str.charAt(1) == 'b') {
            return 'b'+str.substring(2,str.length());
        }
        else {
            return str.substring(2,str.length());
        }

    }
}
