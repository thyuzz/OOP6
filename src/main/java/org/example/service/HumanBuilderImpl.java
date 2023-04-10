package org.example.service;

import org.example.model.Human;

public class HumanBuilderImpl implements HumanBuilder{
    String text_breakfast;
    String text_gotojob;
    String text_lunch;
    String text_gotohome;
    public HumanBuilderImpl() {
        super();
    }

    @Override
    public HumanBuilder breakfast() {
        this.text_breakfast = "Человек позавтракал.";
        return this;
    }

    @Override
    public HumanBuilder gotojob() {
        this.text_gotojob = "Человек идёт на работу.";
        return this;
    }

    @Override
    public HumanBuilder lunch() {
        this.text_lunch = "Человек пообедал.";
        return this;
    }

    @Override
    public HumanBuilder gotohome() {
        this.text_gotohome = "Человек идёт с работы.";
        return this;
    }

    @Override
    public void humango() {
        System.out.println(text_breakfast +" "+ text_gotojob + " " +
                text_lunch + " " + text_gotohome +
                " " + "Человек лёг спать и завтра встанет.");
    }
}
