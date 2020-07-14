package com.company.JavaLesson17.Task1;

public class RunArray {
    //Создайте шаблонный класс Array, который представляет собой массив, позволяющий хранить объекты
    //заданного типа. Необходимо реализовать:
    //* заполнение массива с клавиатуры;
    //* заполнение массива случайными числами;
    //* отображение массива;
    //* поиск максимального значения;
    //* поиск минимального значения;
    //* подсчет среднеарифметического значения;
    //* сортировка массива по возрастанию;
    //* сортировка массива по убыванию;
    //* поиск значения в массиве, используя бинарный поиск;
    //* замена значения в массиве на новое значение.
    public static void main(String[] args) {
        Class clazz;
        boolean full = false; //проверка на то что масив заполнен(not null)

        Menu menu = new Menu();
        MethodArray methodArray = new MethodArray();
        Array array = new Array();
        //определение типа масива с которым хочет работать пользователь
        menu.arrayChoiceType();
        //задание длины масива
        menu.arrayLength();
        //создание объетов с определенным типом
        if (menu.getTypeArray() == 1) {
            Array<Integer> integerArray = new Array<>();
            array.setArray(methodArray.creatureArray(Integer.class, menu.getLength()));
            clazz = Integer.class;
        } else if (menu.getTypeArray() == 2) {
            Array<Double> doubleArray = new Array<>();
            array.setArray(methodArray.creatureArray(Double.class, menu.getLength()));
            clazz = Double.class;
        } else {
            Array<String> stringArray = new Array<>();
            array.setArray(methodArray.creatureArray(String.class, menu.getLength()));
            clazz = String.class;
        }
        //проверка на заполнение массива
        while (true) {
            if (!full) {
                //кнопка - запонять масив в ручную или нет
                if (menu.arrayChoiceFillScan()) {
                    //заполнение масива с клавиатуры
                    methodArray.arrayFillKeyboard(array.getArray(), clazz);
                    full = true;
                    // отображение массива;
                    for (int i = 0; i < array.getArray().length; i++) {
                        System.out.print(array.getArray()[i] + " ");
                    }
                    System.out.println();
                }
                //заполнение массива случайными числами
                if (menu.arrayChoiceFillRandom()) {
                    methodArray.arrayFillRandom(array.getArray(), clazz);
                    full = true;
                    // отображение массива;
                    for (int i = 0; i < array.getArray().length; i++) {
                        System.out.print(array.getArray()[i] + " ");
                    }
                    System.out.println();
                }
            } else {
                break;
            }
        }

        // поиск максимального минимального значения
        if (menu.arrayMaxMin()) {
            methodArray.arrayMaxMin(array.getArray(), clazz);
        }
        // подсчет среднеарифметического значения;
        if (menu.arrayMiddle()) {
            methodArray.arrayMiddle(array.getArray(), clazz);
        }

        //сортировка массива по возрастанию
        if (menu.arraySortGrow()) {
            methodArray.arraySortGrow(array.getArray(), clazz);
            //вход только после сортировки по возрастанию
            // поиск значения в массиве, используя бинарный поиск
            if (menu.arrayBinary()) {
                methodArray.arrayBinary(array.getArray(), clazz);
            }
        }


        // сортировка массива по убыванию
        if (menu.arraySortDecrease()) {
            methodArray.arrayDecrease(array.getArray(), clazz);
        }

        // замена значения в массиве на новое значение
        if (menu.arrayChangeVolume()) {
            methodArray.arrayChangeVolume(array.getArray(), clazz);
            // отображение массива;
            for (int i = 0; i < array.getArray().length; i++) {
                System.out.print(array.getArray()[i] + " ");
            }
            System.out.println();
        }
    }
}
