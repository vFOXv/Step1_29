package com.company.JavaLesson14.JavaLesson14_task_2;

public class ManRun {
    //Создать класс Man (человек), с полями: имя, возраст, пол и вес.
    //Определить методы задания имени, возраста и веса.
    //Создать производный класс Student, имеющий поле года обучения.
    //Определить методы задания и увеличения(изменения) года обучения.
    //У обоих классов должны быть конструкторы по умолчанию и с параметрами.
    //В классе Man создайте метод show, который будет выводить на консоль информацию о человеке.
    //В классе Student метод show нужно переопределить таким образом, чтоб выводилась информация про год обучения.
    public static void main(String arg[]) {

        System.out.println("Man. Defaulted Constructor");
        Man manDefaulted = new Man();
        manDefaulted.show();
        manDefaulted.enterNewDescriptionFull();
        manDefaulted.show();
        System.out.println();

        System.out.println("Man. Constructor with parameters");
        Man manFull = new Man("Костя", 30.0,"Man", 75.0);
        manFull.show();
        System.out.println();

        System.out.println("Student. Defaulted Constructor");
        Student student = new Student();
        student.show();
        student.enterNewDescriptionFull();
        student.show();
        System.out.println();
        student.allStudyYears();
        student.show();

        System.out.println("Man. Constructor with parameters");
        Student studentFull = new Student("Игорь", 20.0, "Man", 60.0, 2.0);
        studentFull.show();
        studentFull.allStudyYears();
        studentFull.show();
    }
}
