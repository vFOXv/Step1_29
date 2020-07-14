package com.company.JavaLesson16.HW16.Task3;

public class RunProfession {
    //Создайте абстрактный класс Profession с приватными полями «Имя» и «Промышленность».
    //У этого класса должен быть абстрактный метод «Делать Работу».
    // Создайте класс «Разработчик» с приватным полем «Специальность»,
    //который наследует класс Profession и реализует абстрактный метод.
    //Так же создайте класс «Пилот», с приватным полем «Тип самолета»,
    //который также наследует класс Profession и реализует абстрактный метод.
    // В классе Runner должны быть созданы экземпляры классов «Пилот» и «Разработчик»,
    //а также экземпляр типа Profession который создает еще одного разработчика.
    //Все параметры задаются в конструкторе, конструкторы классов наследников основаны
    //на конструкторе класса родителя.
    //Так же во всех классах где необходимо должны быть созданы методы для работы с параметрами
    //и организован вывод данных (toString).
    public static void main(String[] args) {
        Developer developer = new Developer("Nik","IT","Java");
        Pilot pilot = new Pilot("Make","AirTrip","Ty124");
        Profession myDeveloper = new Developer("Stiv","IT","HTML");

        System.out.println(developer);
        developer.makeWork();

        System.out.println(pilot);
        pilot.makeWork();

        System.out.println(myDeveloper);
        myDeveloper.makeWork();
    }
}
