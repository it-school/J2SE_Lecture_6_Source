// Методы (Функции).

class Methods_005 {
    private static int Add(int summand1, int summand2)
    {
        return summand1 + summand2;
    }

    public static void main(String[] args) {
        int summand3 = 2, summand4 = 3;

        int sum = Add(summand3, summand4);

        System.out.println(sum); // 5
    }
}
