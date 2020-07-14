package com.company.JavaLesson17.Task1;

import java.lang.reflect.Array;
import java.util.Scanner;

public class MethodArray<T> {
    private T volume;


    //создание масива конкретного вида
    public <T> T[] creatureArray(Class<T> clazz, int length) {
        T[] array = (T[]) Array.newInstance(clazz, length);
        return array;
    }

    //заполнение масива с клавиатуры
    public <T> T[] arrayFillKeyboard(T array[], Class<T> clazz) {
        Object volume = null;                                           //???????????????????????????????? эта же переменная типа Т!!!
        for (int i = 0; i < array.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter " + i + " volume");

            if (clazz.isAssignableFrom(Integer.class)) {
                if (scanner.hasNextInt()) {
                    volume = scanner.nextInt();
                    array[i] = clazz.cast(volume);
                } else {
                    System.err.println("You enter not integer number!!!");
                    i--;
                }
            } else if (clazz.isAssignableFrom(Double.class)) {
                if (scanner.hasNextDouble()) {
                    volume = scanner.nextDouble();
                    array[i] = clazz.cast(volume);
                } else {
                    System.err.println("You enter not double number!!!");
                    i--;
                }
            } else if (clazz.isAssignableFrom(String.class)) {
                volume = scanner.nextLine();
                array[i] = clazz.cast(volume);                      //???????????????????????????????? что это значи?
            }
        }
        return array;
    }

    // заполнение массива случайными числами
    public <T> void arrayFillRandom(T array[], Class<T> clazz) {
        //StringBuilder для генерации случайных строк
        StringBuilder builder = new StringBuilder();
        Object volume = null;
        for (int i = 0; i < array.length; i++) {
            if (clazz.isAssignableFrom(Integer.class)) {
                volume = (int) (-100 + Math.random() * 200);
                array[i] = clazz.cast(volume);
            } else if (clazz.isAssignableFrom(Double.class)) {
                volume = (-100 + Math.random() * 200);
                array[i] = clazz.cast(volume);
            } else if (clazz.isAssignableFrom(String.class)) {
                for (int j = 0; j < (int) (Math.random() * 10); j++) {
                    char myChar = (char) (94 + Math.random() * 33);
                    builder.append((myChar));
                }
                volume = builder.toString();
                array[i] = clazz.cast(volume);
            }
        }
    }

    //поиск МАХ значения
    public <T> void arrayMaxMin(T array[], Class<T> clazz) {
        if (clazz.isAssignableFrom(Integer.class)) {
            int cache = (int) array[0];
            for (int i = 0; i < array.length - 1; i++) {
                if (cache < (int) (array[i + 1])) {
                    cache = (int) (array[i + 1]);
                }
            }
            System.out.println("MAX volume = " + cache);
            //return clazz.cast(cache);                                      //????????????????????? как вернуть значение   return clazz.cast(cache);  - работает
            cache = (int) array[0];
            for (int i = 0; i < array.length - 1; i++) {
                if (cache > (int) (array[i + 1])) {
                    cache = (int) (array[i + 1]);
                }
            }
            System.out.println("MIN volume = " + cache);
        } else if (clazz.isAssignableFrom(Double.class)) {
            double cache = (double) array[0];
            for (int i = 0; i < array.length - 1; i++) {
                if (cache < (double) (array[i + 1])) {
                    cache = (double) (array[i + 1]);
                }
            }
            System.out.println("MAX volume = " + cache);
            //return (Integer)cache;                                     `   ????????????????????? как вернуть значение
            cache = (double) array[0];
            for (int i = 0; i < array.length - 1; i++) {
                if (cache > (double) (array[i + 1])) {
                    cache = (double) (array[i + 1]);
                }
            }
            System.out.println("MIN volume = " + cache);
        } else if (clazz.isAssignableFrom(String.class)) {
            System.out.println("We will not find MAX volume in the String)))");
        }
    }

    // подсчет среднеарифметического значения;
    public <T> void arrayMiddle(T array[], Class<T> clazz) {
        if (clazz.isAssignableFrom(Integer.class)) {
            int cache = 0;
            for (int i = 0; i < array.length; i++) {
                cache = cache + (int) (array[i]);
            }
            System.out.println("Middle volume = " + (double) cache / array.length);
        } else if (clazz.isAssignableFrom(Double.class)) {
            double cache = 0.0;
            for (int i = 0; i < array.length; i++) {
                cache = cache + (double) (array[i]);
            }
            System.out.println("MAX volume = " + (double) cache / array.length);
        } else if (clazz.isAssignableFrom(String.class)) {
            System.out.println("We will not find middle volume in the String)))");
        }
    }

    //сортировка массива по возрастанию
    public <T> void arraySortGrow(T array[], Class<T> clazz) {
        if (clazz.isAssignableFrom(Integer.class)) {
            boolean sorted = false;
            int temp;
            while (!sorted) {
                sorted = true;
                for (int i = 0; i < array.length - 1; i++) {
                    if ((int) array[i] > (int) array[i + 1]) {
                        temp = (int) array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = clazz.cast(temp);
                        sorted = false;
                    }
                }
            }
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        } else if (clazz.isAssignableFrom(Double.class)) {
            boolean sorted = false;
            double temp;
            while (!sorted) {
                sorted = true;
                for (int i = 0; i < array.length - 1; i++) {
                    if ((double) array[i] > (double) array[i + 1]) {
                        temp = (double) array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = clazz.cast(temp);
                        sorted = false;
                    }
                }
            }
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        } else if (clazz.isAssignableFrom(String.class)) {
            System.out.println("We will not sort array String)))");
        }
    }

    // сортировка массива по убыванию
    public <T> void arrayDecrease(T array[], Class<T> clazz) {
        if (clazz.isAssignableFrom(Integer.class)) {
            boolean sorted = false;
            int temp;
            while (!sorted) {
                sorted = true;
                for (int i = 0; i < array.length - 1; i++) {
                    if ((int) array[i] < (int) array[i + 1]) {
                        temp = (int) array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = clazz.cast(temp);
                        sorted = false;
                    }
                }
            }
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        } else if (clazz.isAssignableFrom(Double.class)) {
            boolean sorted = false;
            double temp;
            while (!sorted) {
                sorted = true;
                for (int i = array.length - 1; i < 0; i++) {
                    if ((double) array[i] > (double) array[i + 1]) {
                        temp = (double) array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = clazz.cast(temp);
                        sorted = false;
                    }
                }
            }
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        } else if (clazz.isAssignableFrom(String.class)) {
            System.out.println("We will not sort array String)))");
        }
    }

    // поиск значения в массиве, используя бинарный поиск
    public <T> void arrayBinary(T[] array, Class<T> clazz) {
        if (clazz.isAssignableFrom(Integer.class)) {
            int key = 0;
            while (true) {
                System.out.println("Enter element of binary search:");
                Scanner scanner = new Scanner(System.in);
                if (scanner.hasNextInt()) {
                    key = scanner.nextInt();
                    break;
                } else {
                    System.err.println("You enter not integer number!!!");
                }
            }
            boolean flag = false;
            int firstIndex = 0;
            int lastIndex = array.length - 1;
            while (firstIndex <= lastIndex) {
                int mid = (firstIndex + lastIndex) / 2;
                if ((int) array[mid] < key) {
                    firstIndex = mid + 1;
                } else if ((int) array[mid] > key) {
                    lastIndex = mid - 1;
                } else if ((int) array[mid] == key) {
                    System.out.println("Index number " + key + " is " + mid);
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.err.println("There is not volume " + key + " in this array!!!");        // ??????? какие условия для отрецательного ответа?if()
            }
        } else if (clazz.isAssignableFrom(Double.class)) {
            double key = 0;
            while (true) {
                System.out.println("Enter element of binary search:");
                Scanner scanner = new Scanner(System.in);
                if (scanner.hasNextDouble()) {
                    key = scanner.nextDouble();
                    break;
                } else {
                    System.err.println("You enter not double number!!!");
                }
            }
            boolean flag = false;
            int firstIndex = 0;
            int lastIndex = array.length - 1;
            while (firstIndex <= lastIndex) {
                int mid = (firstIndex + lastIndex) / 2;
                if ((double) array[mid] < key) {
                    firstIndex = mid + 1;
                } else if ((double) array[mid] > key) {
                    lastIndex = mid - 1;
                } else if ((double) array[mid] == key) {
                    System.out.println("Index number " + key + " is" + mid);
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.err.println("There is not volume " + key + " in this array!!!");
            }
        } else if (clazz.isAssignableFrom(String.class)) {
            System.out.println("We will not sort array String)))");
        }
    }

    public <T> void arrayChangeVolume(T[] array, Class<T> clazz) {
        if (clazz.isAssignableFrom(Integer.class)) {
            int index = 0;
            //Object number = null;
            int number = 0;
            while (true) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter index number: ");
                if (scanner.hasNextInt()) {
                    int cache = scanner.nextInt();
                    if (cache >= 0 && cache <= array.length - 1) {
                        index = cache;
                        break;
                    } else {
                        System.err.println("Index must be >= 0 and < " + (array.length - 1) + " !!!");
                    }
                } else {
                    System.err.println("You enter not integer number!!!");
                }
            }
            while (true) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter integer number's volume:");
                if (scanner.hasNextInt()) {
                    number = scanner.nextInt();
                    array[index] = clazz.cast(number);                          //???????????????????? в теле цикла каст проходит!!!
                    break;
                } else {
                    System.err.println("You enter not integer number!!!");
                }
            }
            //number = array[index];
        }else if (clazz.isAssignableFrom(Double.class)) {
            int index = 0;
            double number = 0;
            while (true) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter index number: ");
                if (scanner.hasNextDouble()) {
                    int cache = scanner.nextInt();
                    if (cache >= 0 && cache <= array.length - 1) {
                        index = cache;
                        break;
                    } else {
                        System.err.println("Index must be >= 0 and < " + (array.length - 1) + " !!!");
                    }
                } else {
                    System.err.println("You enter not integer number!!!");
                }
            }
            while (true) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter integer number's volume:");
                if (scanner.hasNextDouble()) {
                    number = scanner.nextDouble();
                    array[index] = clazz.cast(number);
                    break;
                } else {
                    System.err.println("You enter not double number!!!");
                }
            }
        } else if (clazz.isAssignableFrom(String.class)) {
            int index = 0;
            String str= null;
            while (true) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter index number: ");
                if (scanner.hasNextDouble()) {
                    int cache = scanner.nextInt();
                    if (cache >= 0 && cache <= array.length - 1) {
                        index = cache;
                        break;
                    } else {
                        System.err.println("Index must be >= 0 and < " + (array.length - 1) + " !!!");
                    }
                } else {
                    System.err.println("You enter not integer number!!!");
                }
            }
            while (true) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter string:");
                if (str.isEmpty()) {                                //????????????? выдает ошибку при обращении к IF
                    str = scanner.nextLine();
                    array[index] = clazz.cast(str);
                    break;
                } else {
                    System.err.println("You enter empty string!!!");
                }
            }
        }
    }
}



