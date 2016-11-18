
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
    }
}
