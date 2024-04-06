package top.zsmile.exam.self;

/**
 * 请编写方法double sumSequence(int n),
 * 该方法的功能是求以下数列前n项的和s并返回:s=1/2+2/3+3/5+5/8+8/13+.....
 * 提示:下一项的分子=上一项的分母,下一项的分母=上一项的分子与分母的和。
 * double sumSequence(int n){}
 */
public class Self01 {
    static double sumSequence(int n) {
        int i1 = 1, i2 = 2;
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i1 / i2;
            int tmp = i2;
            i2 = i1 + i2;
            i1 = tmp;
        }
        return sum;
    }

    public static void main(String[] args) {
        double v = sumSequence(1);
        System.out.println(v);
    }
}
