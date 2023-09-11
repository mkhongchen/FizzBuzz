public class Multiples {
    public static void main(String[] args) {

        int current = 1;
        int total_multiples = 0;

        while (current < 1000) {
            if (current % 3 == 0 || current % 5 == 0) {
                total_multiples ++;
            }
            current ++;
        }
        System.out.println(total_multiples);
    }
}
