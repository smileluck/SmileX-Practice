package top.zsmile.test.basic.binary;

import org.junit.Test;

public class BinaryTest {


    @Test
    public void test() {
        int a = -10;
        for (int i = 0; i < 32; i++) {
            int t = (a & 0x80000000 >>> i) >>> (31 - i);
            System.out.print(t);
        }
    }
    @Test
    public void test2() {
        int a = 1;
        int b = a >> 32;
        System.out.println("a: " + Integer.toBinaryString(a));
        System.out.println("b: " + Integer.toBinaryString(b));
    }
}
