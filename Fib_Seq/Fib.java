package Fib_Seq;

public class Fib {
    public static int fibSeq(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        else {
            return fibSeq(i - 2) + fibSeq(i - 1);
        }
    }

    public static void main(String[] args) {
        int num = 6;
        int result = fibSeq(num);
        System.out.println(result);
    }
}