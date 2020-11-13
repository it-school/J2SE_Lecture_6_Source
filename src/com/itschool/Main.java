package com.itschool;

public class Main
{
	public static void main(String[] args)
	{
		MyClass myClass = new MyClass();
		System.out.println(myClass.toString());
		String text = "sleep";
		myClass.doIT(text);
		myClass.doIT("");
		myClass.setTemperature1(12345567);
		System.out.println(myClass.getTemperature1());
		myClass.drawRectangle();
		System.out.println();
		myClass.drawRectangle(3, 10);
		System.out.println();
		myClass.drawRectangle(4, 6, '@');
		MyClass myClass1 = new MyClass('$');
		myClass1.drawRectangle(10, 2);

		myClass.doNothingRecursively();
        /*HomeWork1 credit = new HomeWork1();
        credit.credit = 10000;

        System.out.println(credit.moneyCredit(500));
        System.out.println(credit.moneyCredit(1500));
        System.out.println(credit.moneyCredit(5500));
        System.out.println(credit.moneyCredit(2500));
        System.out.println(credit.moneyCredit(100));

        HomeWork1 credit2 = new HomeWork1(5800);
        System.out.println(credit2.moneyCredit(500));
        System.out.println(credit2.moneyCredit(1500));
        System.out.println(credit2.moneyCredit(5500));

        HomeWork2 exchanger = new HomeWork2(28.1, 30.5, 36);
        System.out.println(exchanger.exchange(1000, CurrencyType.USD));
*/
        /*
        // Создание объекта с конструктором по-умолчанию
        Student student1 = new Student();
        student1.setName("Student");
        student1.setSpecialty("OOP");
        student1.setBirthday(new Date(2000, 12, 25));

        // Вывод информации о студенте
        System.out.println(student1.getName());
        System.out.println(student1.getSpecialty());
        System.out.println(student1.getBirthday());
        System.out.println(student1.getBirthday(2));

        // Создание объекта с пользовательским конструктором (с двумя параметрами)
        Student student2 = new Student("Sidorov", "Sociology");
        System.out.println(student2.getName());
        System.out.println(student2.getSpecialty());

        // Вывод адресов объектов
        System.out.println(student1);
        System.out.println(student2);

//        student1 = student2;                    // копирование ссылки одного объекта в другой объект
//        student1.setName(student2.getName());   // После чего, изменяя имя одного объекта
//        System.out.println(student1.getName()); // получаем одинаковые имена
//        System.out.println(student2.getName()); // у обоих объектов, т.к. теперь это один и тот же объект

        // Если же не копировать ссылку, а просто копировать значения полей
        student1.setName("Developer");
        System.out.println(student1.getName()); // то объекты имеют раличное расположение в памяти
        System.out.println(student2.getName()); // и оказываются физически разными объектами
        System.out.println(student1);
        System.out.println(student2);


        Student[] group = new Student[5];  // создание массива объектов (экземпляров класса)

        String specialty = "Разработка программного обеспечения";

        group[0] = new Student("Алексей", specialty);  // инициализация элементов массива объектов
        group[1] = new Student("Иван", specialty);
        group[2] = new Student("Александр", specialty);
        group[3] = new Student("Наталия", specialty);
        group[4] = new Student("Виктор", specialty);

        int counter = 0;
        for (Student student : group)
        {
            System.out.println(student.getName() + " учится на специальности : " +
                    student.getSpecialty());

            System.out.println(student.Sleep());
            student.setName("Name od student №" + counter++);  // присвоение нового имени полю элементов массива ссылочного типа
        }                                                       // приводит к изменению данных объектов

        for (Student student : group)  // демонстрация изменений
        {
            System.out.println(student.getName() + " учится на специальности : " +
                    student.getSpecialty());
        }
        */
	}
}