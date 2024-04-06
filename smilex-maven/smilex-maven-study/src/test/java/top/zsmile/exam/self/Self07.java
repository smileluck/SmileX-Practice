package top.zsmile.exam.self;

import org.apache.commons.lang3.StringUtils;

public class Self07 {
    public static void main(String[] args) {
        int i, j, k;
        for (i = 0; i <= 100; i++) {
            for (j = 0; j <= 100 - i; j++) {
                for (k = 0; k <= 100 - i - j; k++) {
                    if ((i * 5 + j * 3 + k) == 100) {
                        System.out.println(String.format("%s,%s,%s", i, j, k));
                    }
                }
            }
        }
    }
}
