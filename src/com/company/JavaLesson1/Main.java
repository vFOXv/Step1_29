package com.company.JavaLesson1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// Ключевые слова public и static являются модификаторами. Далее идет тип возвращаемого значения. Ключевое слово void указывает на то, что метод ничего не возвращает.
    //Затем идут название метода - main и в скобках параметры метода - String[] args. И в фигурные скобки заключено тело метода - все действия, которые он выполняет.
        System.out.print("\t _____\n");
        System.out.print("\t|     |\n");
        System.out.print("\t|     |\n");
        char line = (char)8254;
        System.out.print("\t "+line+line+line+line+line+"\n");
        System.out.println("\tМеня зовут Евгений.");
        System.out.print("\tЖиву в городе Одессе.\n");
        System.out.print("\tСейчас учусь на JAVA разработчика.");
    }
}
