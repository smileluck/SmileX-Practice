package top.zsmile.exam.self;

/**
 * 请编写方法void strReverse(String str)，
 * 该方法的功能是输出一个新字符串，新字符串字符排列顺序与原字符串str的字符排列顺序相反。
 * 例如，strReverse(“abcde”)所输出的结果是“edcba”。请使用字符串与字节数组的相互转换方法进行设计。
 */
public class Self02 {

    static void strReverse(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        System.out.println(reverse);
    }

    public static void main(String[] args) {
        strReverse("abcde");
    }
}
