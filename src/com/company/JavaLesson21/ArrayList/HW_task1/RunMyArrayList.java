package com.company.JavaLesson21.ArrayList.HW_task1;

public class RunMyArrayList {
    //Пользователь вводит с клавиатуры набор чисел. Полученные числа необходимо сохранить в список.
    //После чего нужно показать меню, в котором предложить пользователю набор пунктов:
    //1. Добавить элемент в список.
    //2. Удалить элемент из списка.
    //3. Показать содержимое списка.
    //4. Проверить есть ли значение в списке.
    //5. Заменить значение в списке.
    //В зависимости от выбора пользователя выполняется
    //действие, после чего меню отображается снова.
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        Menu menu = new Menu();
        myArrayList.createArrayList();
        myArrayList.printArray();
        while (true) {
            System.out.println();
            menu.myMenu();
            switch (menu.getPosition()) {
                case 1:
                    myArrayList.myAdd();
                    myArrayList.printArray();
                    break;
                case 2:
                    myArrayList.myRemove();
                    myArrayList.printArray();
                    break;
                case 3:
                    myArrayList.printArray();
                    break;
                case 4:
                    myArrayList.myCheck();
                    myArrayList.printArray();
                    break;
                case 5:
                    myArrayList.myChange();
                    myArrayList.printArray();
                    break;
                case 6:
                    return;
                default:
                    System.err.println("You enter number <1 and >6!!!");
            }
        }
    }
}
