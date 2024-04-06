package top.zsmile.exam.self;

public class Self06 {
    static void printTri(int n) {
        int line = 0;
        while (line < n) {
            for (int i = line; i < n - 1; i++) {
                System.out.print("\t");
            }
            for (int i = 0, num = 1; i < 2 * line + 1; i++) {
                System.out.print(num + "\t");
                if (i < line) {
                    num++;
                } else {
                    num--;
                }

            }
            for (int i = line; i < n - 1; i++) {
                System.out.print("\t");
            }
            System.out.println();
            line++;
        }
    }

    public static void main(String[] args) {
        printTri(8);
    }
}
