package top.zsmile.exam.self;

/**
 * 有一对兔子，从出生后第3个月起每个月都生一对免子，小兔子长到第三个月后每个月又生一对兔子，
 * 假如兔子都不死，编写一个函数 fibonacci输出第6个月的兔子总数为多少?
 */
public class Self04 {

    static int fibonacci2() {
        // f1 是兔子总数，f2是每月增加的兔子， f是
        int f1 = 1, f2 = 1;
        for (int i = 3; i < 6; i++) {
            f1 = f1 + f2;
        }
        return f1;
    }

    static int fibonacci() {
        int f1 = 1, f2 = 1, f;
        for (int i = 3; i <= 6; i++) {
            f = f2;
            f2 = f1 + f2;
            f1 = f;

        }

        System.out.println("第6个月兔子的对数是:" + f2);
        return f2;
    }

    public static void main(String[] args) {
        fibonacci();
    }
}
