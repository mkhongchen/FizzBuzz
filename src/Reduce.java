public class Reduce {
    public static void main(String[] args) {

        int n = 100;
        reduce(n);
    }

    public static void reduce(int n) {
        int steps = 0;

        while (n > 0) {
            if (n % 2 == 0) {
                n = n / 2;
            }
            else {
                n --;
            }
            steps ++;
        }

        System.out.println(steps);
    }
}
