public class Fibonacci {
    public static int findValue(int index) {

        if (index < 3) return 1;

        return findValue(index - 2) + findValue(index - 1);

    }
}
