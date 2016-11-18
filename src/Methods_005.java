// Методы (Функции).

class Methods_005 {
    private static int Add(int summand1, int summand2)
    {
        return summand1 + summand2;
    }

    public static void main(String[] args) {
        int summand1 = 2, summand2 = 3;

        int sum = Add(summand1, summand2);

        System.out.println(sum); // 5
    }
}
