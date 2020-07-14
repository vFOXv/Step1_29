package com.company.JavaLesson14.JavaLesson14_task_1;


import java.util.Scanner;

public class Device {
    private String show;
    private String desc;
    private String sound;


    public Device() {

    }

    public Device(String show, String desc) {
        this.show = show;
        this.desc = desc;
    }

    public Device(String show, String desc, String sound) {
        this.show = show;
        this.desc = desc;
        this.sound = sound;
    }

    public String getShow() {
        return show;
    }

    public void setShow(String show) {
        this.show = show;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }


    public void show() {
        System.out.println("It is " + getShow());
    }

    public void desc() {
        System.out.println("It make " + getDesc());
    }

    public void sound() {
        System.out.println("It sound " + getSound());
    }

    public void showDescription() {
        System.out.println("Show - " + getShow());
        System.out.println("Desc - " + getDesc());
        System.out.println("Sound - " + getSound());
    }

    public void newSound(){
        System.out.println("Do you want get kettle's sound? Enter yes/no.");
        while (true) {
            Scanner scan = new Scanner(System.in);
            String answer = scan.nextLine();
            if (answer.isEmpty()) {
                System.err.println("You enter empty line! Enter answer!");
            } else if (!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("no")) {
                System.err.println("You not enter answer! Enter answer!");
            } else if (answer.equalsIgnoreCase("no")) {
                break;
            } else if (answer.equalsIgnoreCase("yes")) {
                System.out.println("Enter new sound devise");
                setSound(check());
                System.out.println("New sound - " + getSound());
                System.out.println("\n");
                break;
            }
        }
    }

    public void newDescriptionFull() {
        System.out.println("Do you want change full description device? Enter yes/no.");
        while (true) {
            Scanner scan = new Scanner(System.in);
            String answer = scan.nextLine();
            if (answer.isEmpty()) {
                System.err.println("You enter empty line! Enter answer!");
            } else if (!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("no")) {
                System.err.println("You not enter answer! Enter answer!");
            } else if (answer.equalsIgnoreCase("no")) {
                break;
            } else if (answer.equalsIgnoreCase("yes")) {
                System.out.println("Enter new show devise");
                setShow(check());

                System.out.println("Enter new desc devise ");
                setDesc(check());

                System.out.println("Enter new sound devise");
                setSound(check());

                System.out.println("New show - " + getShow());
                System.out.println("New desk - " + getDesc());
                System.out.println("New sound - " + getSound());
                System.out.println("\n");

                break;
            }
        }
    }

    public String check() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter new description!");
        String data = scanner.nextLine();
        if (data.isEmpty()) {
            System.err.println("You enter empty line! ");
            data = data +check();
        }
        return data;
//        String data = "";
//        if (data.isEmpty()) {
//            while (true) {
//                Scanner scanner = new Scanner(System.in);
//                System.out.println("Enter new description!");
//                data = scanner.nextLine();
//                if (data.isEmpty()) {
//                    System.out.println("You enter empty line!");
//                }
//                if (!data.isEmpty()) {
//                    break;
//                }
//            }
//        }
//        return data;
    }
}
