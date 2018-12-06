package com.itschool;

public class Main {
    public static void main(String[] args)
    {
        Student student1 = new Student();
        //  student1.setName("Student");
        //  student1.getSpecialty();
        System.out.println(student1.getName());
        System.out.println(student1.getSpecialty());
        System.out.println(student1.getBirthday());
        System.out.println(student1.getBirthdayAsString());

        Student student2 = new Student("QA", "Sociology");
        System.out.println(student2.getName());
        System.out.println(student2.getSpecialty());

        System.out.println(student1);
        System.out.println(student2);
        student1 = student2;
        student1.setName(student2.getName());
        System.out.println(student1.getName());
        System.out.println(student2.getName());

        System.out.println(student1);
        System.out.println(student2);

        student1.setName("Developer");
        System.out.println(student1.getName());
        System.out.println(student2.getName());


        Student[] University = new Student[5];

        String speciaity = "Разработка программного обеспечения";

        University[0] = new Student("Алексей", speciaity);
        University[1] = new Student("Иван", speciaity);
        University[2] = new Student("Александр", speciaity);
        University[3] = new Student("Наталия", speciaity);
        University[4] = new Student("Виктор", speciaity);
int c=0;
        for (Student student : University)
        {
            System.out.println(student.getName() + " учится на специальности : " +
                    student.getSpecialty());

            System.out.println(student.Sleep());
            student.setName("argaergaeg"+c++);
        }


        for (Student student : University)
        {
            System.out.println(student.getName() + " учится на специальности : " +
                    student.getSpecialty());

        }
    }
}
