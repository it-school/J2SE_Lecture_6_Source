
class MethodRecFact {
    private static int Factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * Factorial(n - 1);
    }

    public static void main(String[] args) {
        int factorial = Factorial(4);

        System.out.println(factorial);

        int n = 1;
        for (int i = 1; i <= 4; i++)
            n*=i;

        System.out.println(n);

    }
}
