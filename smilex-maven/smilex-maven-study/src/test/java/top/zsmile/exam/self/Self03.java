package top.zsmile.exam.self;

/**
 * 请编写方法 int countlntOfArray(doublea[])，该方法的功能是返回非空数组中正数的个数
 */
public class Self03 {

    static int countIntOfArray(double a[]) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                count++;
            }
        }
        return count;
    }
}
