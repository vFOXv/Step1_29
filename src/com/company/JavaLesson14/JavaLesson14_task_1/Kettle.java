package com.company.JavaLesson14.JavaLesson14_task_1;

public class Kettle extends Device {

    public Kettle() {
    }

    public Kettle(String show, String desc){
        super(show,desc);
    }

    public Kettle(String show, String desc, String sound) {
        super(show, desc, sound);
    }

    @Override
    public void newSound(){
        super.newSound();
    }

    @Override
    public void showDescription() {
        super.showDescription();
    }

    @Override
    public void show() {
        super.show();
    }

    @Override
    public void desc() {
        super.desc();
    }

    @Override
    public void sound() {
        super.sound();
    }

    @Override
    public void newDescriptionFull() {
        super.newDescriptionFull();
    }
}
