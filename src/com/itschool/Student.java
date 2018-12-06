package com.itschool;

import java.util.Date;

class Student {
    // Имя студента, доступен только в классу
    private String name;
    // Специальность, доступна только в классу
    private String specialty;

    public Date getBirthday()
    {
        return birthday;
    }

    public String getBirthdayAsString()
    {
        return birthday.toString();
    }

    public void setBirthday(Date birthday)
    {
        this.birthday = (new Date()).before(birthday) ? new Date() : birthday;
    }

    private Date birthday;

    // Метод для получения Имя, доступен в любом месте
    String getName() {
        return name;
    }

    // Метод для Изменения Имя, доступен в любом месте
    public void setName(String var) {
        this.name = var;
    }

    // Метод для получения Специальности, доступен в любом месте
    String getSpecialty()
    {
        return specialty;
    }

    // Конструктор класса, определенный пользователем
    Student()
    {
        name = "NoName";
        specialty = "Software developer";
        birthday = new Date();
    }

        // Конструктор класса, определенный пользователем
    Student(String name, String speciality) {
        // ключевое слов this явно указывает, что поле относится к данному классу
        this.name = name;
        this.specialty = speciality;
    }

    // Метод сна, а что ещё надо студенту ? :)
    String Sleep() {
        return name + " засыпает...";
    }
}
