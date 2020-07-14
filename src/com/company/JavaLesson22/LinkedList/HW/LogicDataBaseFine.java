package com.company.JavaLesson22.LinkedList.HW;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LogicDataBaseFine {
    public void workDataBase() {

        Menu menu = new Menu();
        MethodDataBaseFine methodDataBaseFine = new MethodDataBaseFine();


        while (true) {
            menu.menu();
            Scanner scanner = new Scanner(System.in);
            switch (menu.getChoice()) {
                case 1:
                    methodDataBaseFine.printDataBase();
                    break;
                case 2:
                    System.out.println("Enter fine's code  person in format - 001");
                    //поиск человека по ИНН
                    try {
                        Integer codePerson = scanner.nextInt();
                        methodDataBaseFine.printCodePeopleFine(codePerson);
                    } catch (InputMismatchException e) {
                        System.out.println("You enter not integer number");
                    }
                    break;
                case 3:
                    try {
                        //Scanner scanner = new Scanner(System.in);
                        System.out.println("Enter fine's code  1 - 8.");
                        //поиск штрафа
                        int searchFine = scanner.nextInt();
                        if (searchFine > 0 && searchFine < 9) {
                            String codeFine = "Fine " + searchFine;
                            System.out.println("Test code fine - " + codeFine);
                            methodDataBaseFine.printTypeFine(codeFine);
                        } else {
                            System.err.println("Fine's code mast be to 1 from 8!!!");
                        }
                    } catch (InputMismatchException e) {
                        System.err.println("You enter not integer number!!!");
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    System.out.println("Enter name of city (default - Odessa, Lviv, Kiev )");
                    String nameCity = scanner.next();
                    methodDataBaseFine.printCityFine(nameCity);
                case 5:
                    Integer inn = 0;
                    String city = null;
                    Fine fine = new Fine();

                    String codeFine = null;
                    Integer sum = null;


                    //ввод ИНН
                    try {
                        while (true) {
                            System.out.println("Enter person'INN in format - 001");
                            Integer cashInn = scanner.nextInt();
                            if (cashInn <= 0) {
                                System.err.println("INN be can not negative!!!");
                                //проверка на наличее в базе этого ИНН
                            } else if (!methodDataBaseFine.checkAvailableCodePerson(cashInn)) {
                                System.out.println("This INN be in the Data Base Fine!!!");
                            } else {
                                inn = cashInn;
                                break;
                            }
                        }
                    } catch (InputMismatchException e) {
                        System.err.println("You enter not integer number!!!");
                        e.printStackTrace();
                    }

                    //ввод названия города
                    while (true) {
                        System.out.println("Enter city of name.");
                        String cashCity = scanner.next();
                        if (!cashCity.isEmpty()) {
                            city = cashCity;
                            break;
                        } else {
                            System.err.println("You enter empty line!!!");
                        }
                    }

                    //ввад списка штрафов человека
                    while (true) {
                        try {
                            System.out.println("Enter code fine in format  integer number.");
                            int cashCode = scanner.nextInt();
                            codeFine = "Fine " + Math.abs(cashCode);
                            System.out.println("Enter sum fine in format integer number.");
                            Integer cashSum = scanner.nextInt();
                            if (cashSum <= 0) {
                                System.err.println("Sum fine can not be <= 0!!!");
                            } else {
                                sum = cashSum;
                            }
                        } catch (InputMismatchException e) {
                            System.err.println("You enter not integer number!!!");
                            e.printStackTrace();
                        }
                        try {
                            //fine.getFines().put(codeFine,sum);
                            fine.creatureElementMapFines(codeFine, sum);
                            methodDataBaseFine.addNewPerson(inn, city, fine);                    //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!   вне try компилятор ругался
                            break;                                                               //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!  и не могу прописать break в конце кейса(
                        } catch (NullPointerException e) {
                            System.err.println("Enter full data!!!");
                            e.printStackTrace();
                        } catch (Exception e) {
                            System.out.println("ХЗ, я не знаю что происходит :(");
                            e.printStackTrace();
                        }
                    }

                    break;                                                                       //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! break в конце кейса прописываеться только при наличее его выше!!!

                case 6:
                    //добавление штрафоф для существующей записи
                    System.out.println("New fines for being person");

                    //поиск человека по ИНН
                    int cashCode = -1;  //позиция в ArrayList
                    while (true) {
                        Scanner scan = new Scanner(System.in);
                        System.out.println("Enter fine's code  person in format - 001");
                        try {
                            Integer codePerson = scan.nextInt();
                            cashCode = methodDataBaseFine.findCodePeopleFine(codePerson);
                            if (cashCode == -1) {
                                System.err.println("This person not being!!!");
                            } else {
                                break;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("You enter not integer number");
                        }
                    }
                    int newCode = 0;
                    String newCodeString = null;
                    int newSum = 0;
                    while (true) {
                        Scanner scanner1 = new Scanner(System.in);
                        try {
                            System.out.println("Enter code next fine(integer number).");
                            newCode = scanner1.nextInt();
                            newCodeString = "Fine " + newCode;
                            System.out.println("Enter sun this fine(integer number).");
                            newSum = scanner1.nextInt();
                            methodDataBaseFine.addNewFind(cashCode, newCodeString, newSum);
                        } catch (InputMismatchException e) {
                            System.err.println("You enter not integer number!!!");
                            e.printStackTrace();
                        }
                        System.out.println("Are you be enter next fine? (Yes=Press any key)/No");
                        String choice = scanner1.next();
                        if (choice.equalsIgnoreCase("no")) {
                            break;
                        }
                    }
                case 7:
                    System.out.println("Fine remove for person.");
                    //поиск человека по ИНН
                    cashCode = -1;  //позиция в ArrayList
                    while (true) {
                        Scanner scan = new Scanner(System.in);
                        System.out.println("Enter fine's code  person in format - 001");
                        try {
                            Integer codePerson = scan.nextInt();
                            cashCode = methodDataBaseFine.findCodePeopleFine(codePerson);
                            if (cashCode != -1) {
                                //само удаление штрафа из person
                                try {
                                    System.out.println("Enter fine of code then must be remove.");
                                    int oldCodeFine = scanner.nextInt();
                                    String oldCodeFineString = "Fine " + oldCodeFine;
                                    methodDataBaseFine.removeOldFine(cashCode, oldCodeFineString);
                                } catch (InputMismatchException e) {
                                    System.err.println("You enter not integer number!!!");
                                    e.printStackTrace();
                                }
                                break;
                            } else {
                                System.err.println("This person not being!!!");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("You enter not integer number");
                        }
                    }
                    break;
                case 8:
                    //поиск человека по ИНН
                    cashCode = -1; //позиция в ArrayList
                    while (true) {
                        Scanner scan = new Scanner(System.in);
                        System.out.println("Enter fine's code  person in format - 001");
                        try {
                            Integer codePerson = scan.nextInt();
                            cashCode = methodDataBaseFine.findCodePeopleFine(codePerson);
                            if (cashCode == -1) {
                                System.err.println("This person not being!!!");
                            } else {
                                break;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("You enter not integer number");
                        }
                    }

                    Integer cashNewInn = 0;
                    Integer newInn = 0;
                    city = null;

                    System.out.println("Are you change INN person?  Yes/(No=press any key)");
                    String choice = null;
                    choice = scanner.next();
                    if (choice.equalsIgnoreCase("yes")) {
                        System.out.println("Enter new INN in format - 111");
                        try {
                            cashNewInn = scanner.nextInt();
                            if (cashNewInn <= 0) {
                                System.err.println("Fine of code not be <=0!!!");
                            } else {
                                newInn = cashNewInn;
                                if(!methodDataBaseFine.checkAvailableCodePerson(newInn)){
                                    System.err.println("This number is in the data!!!");
                                    break;
                                }
                                methodDataBaseFine.changeInn(cashCode, newInn);
                            }
                        } catch (InputMismatchException e) {
                            System.err.println("You enter not integer number!!!");
                            e.printStackTrace();
                        }
                    }

                    System.out.println("Are you change city person?  Yes/(No=press any key)");
                    choice = null;
                    choice = scanner.next();
                    if (choice.equalsIgnoreCase("yes")) {
                        System.out.println("Enter new city for person");
                        city = scanner.next();
                        methodDataBaseFine.changeCity(cashCode, city);
                    }
            }
        }
    }
}
