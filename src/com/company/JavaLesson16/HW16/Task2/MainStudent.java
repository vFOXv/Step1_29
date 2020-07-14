package com.company.JavaLesson16.HW16.Task2;

public class MainStudent {
    //Программа должна выводить на экран список студентов группы, указывая в
    //строчку через пробел фамилию, год рождения, три оценки и средний бал.
    //Необходимо разработать систему классов для реализации программы. Для
    //хранения информации о студенте создайте класс Student.
    public static void main(String[] args) {
        LogicStudent logicStudent = new LogicStudent();
        logicStudent.print(logicStudent.run());

    }
}
