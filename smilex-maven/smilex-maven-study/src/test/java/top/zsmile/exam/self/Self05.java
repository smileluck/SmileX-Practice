package top.zsmile.exam.self;

public class Self05 {
    public static void main(String[] args) {
        Self05 mt = new Self05();
        int initNum = 9, res = 0;
        for (int i = 1; i <= initNum; i++) {
            for (int k = i; k < i; k++)
                System.out.print("                   ");
            for (int j = i; j <= initNum; j++) {
                res = i * j;
                mt.printFormula(i, j, res);
            }
            System.out.print("\n");
        }
    }

    public void printFormula(int i, int j, int res) {
        System.out.print(i + "*" + j + "=" + res + "\t");
    }
}