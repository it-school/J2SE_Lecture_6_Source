package com.itschool;

class Student {
    // Имя студента, доступен только в классу
    private String Name;
    // Специальность, доступна только в классу
    private String Speciality;

    // Метод для получения Имя, доступен в любом месте
    String getName() {
        return Name;
    }

    // Метод для Изменения Имя, доступен в любом месте
    public void setName(String var) {
        this.Name = var;
    }

    // Метод для получения Специальности, доступен в любом месте
    String getSpeciality() {
        return Speciality;
    }

    // Конструктор класса, определенный пользователем
    Student(String _name, String _speciality) {
        // ключевое слов this явно указывает, что поле относится к данному классу
        this.Name = _name;
        this.Speciality = _speciality;
    }

    // Метод сна, а что ещё надо студенту ? :)
    String Sleep() {
        return Name + " засыпает...";
    }
}
