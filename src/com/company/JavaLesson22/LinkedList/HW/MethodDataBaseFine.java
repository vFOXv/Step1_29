package com.company.JavaLesson22.LinkedList.HW;

import java.util.*;

public class MethodDataBaseFine {
    private DataBaseFine dataBaseFine;

    public MethodDataBaseFine() {
        dataBaseFine = new DataBaseFine();
        //создание дефолтной базы штрафов
        dataBaseFine.defaultDataBaseFine();

    }


    public void printDataBase() {
        System.out.println(dataBaseFine.toString());
    }

    public int sizeData() {
        return dataBaseFine.getPersons().size();
    }


    public void printCodePeopleFine(Integer code) {
        for (int i = 0; i < sizeData(); i++) {
            Integer personCode = dataBaseFine.getPersons().get(i).getPersonCode();
            if (personCode == code) {
                System.out.println(dataBaseFine.getPersons().get(i).toString());
            }
        }
    }

    public void printTypeFine(String fine) {
        Set<String> keySet;
        for (int i = 0; i < sizeData(); i++) {
            keySet = dataBaseFine.getPersons().get(i).getFine().getFines().keySet();
            if (keySet.contains(fine)) {
                System.out.println(dataBaseFine.getPersons().get(i).toString());
            }
        }
    }

    public void printCityFine(String nameCity) {
        for (int i = 0; i < sizeData(); i++) {
            String personCity = dataBaseFine.getPersons().get(i).getCity();
            if (personCity.equalsIgnoreCase(nameCity)) {
                System.out.println(dataBaseFine.getPersons().get(i).toString());
            }
        }
    }

    public void addNewPerson(Integer inn, String city, Fine fine) {
        dataBaseFine.getPersons().add(new Person(inn, city, fine));
    }

    //проверка на наличее ИНН в базе
    public boolean checkAvailableCodePerson(Integer inn) {
        for (int i = 0; i < sizeData(); i++) {
            if (inn == dataBaseFine.getPersons().get(i).getPersonCode()) {
                return false;
            }
        }
        return true;
    }

    //поиск человека по коду с возвращением позиции в List(если такого кода нет возвращает -1)
    public int findCodePeopleFine(Integer code) {
        for (int i = 0; i < sizeData(); i++) {
            Integer personCode = dataBaseFine.getPersons().get(i).getPersonCode();
            if (personCode == code) {
                return i;
            }
        }
        return -1;
    }

    public void addNewFind(Integer position, String newCodeString, Integer newSum) {
        Set<String> keySet;
        Map<String, Integer> myMap;

        keySet = dataBaseFine.getPersons().get(position).getFine().getFines().keySet();
        if (keySet.contains(newCodeString)) {
            myMap = dataBaseFine.getPersons().get(position).getFine().getFines();
            myMap.put(newCodeString, newSum + myMap.get(newCodeString));
            dataBaseFine.getPersons().get(position).getFine().setFines(myMap);
        } else {
            myMap = dataBaseFine.getPersons().get(position).getFine().getFines();
            myMap.put(newCodeString, newSum);
            dataBaseFine.getPersons().get(position).getFine().setFines(myMap);
        }
    }

    public void removeOldFine(Integer position, String newCodeString) {
        Set<String> keySet;

        keySet = dataBaseFine.getPersons().get(position).getFine().getFines().keySet();
        if (keySet.contains(newCodeString)) {
            dataBaseFine.getPersons().get(position).getFine().getFines().remove(newCodeString);
        } else {
            System.err.println("This fine not there!!!");
        }
    }

    public void changeInn(int position, Integer newInn) {
        dataBaseFine.getPersons().get(position).setPersonCode(newInn);
    }

    public void changeCity(int position, String city) {
        dataBaseFine.getPersons().get(position).setCity(city);
    }
}

