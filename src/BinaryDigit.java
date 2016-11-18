
class BinaryDigit {
    private static void Converter(int n) {
        int temp;

        temp = n % 2;

        if (n >= 2)
            Converter(n / 2);

        System.out.print(temp);
    }

    public static void main(String[] args) {

        int n = 4;

        Converter(n);
    }
}
