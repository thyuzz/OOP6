package org.example;

import org.example.model.Human;
import org.example.service.HumanBuilderImpl;

public class Main {
    public static void main(String[] args) {
        HumanBuilderImpl human = new HumanBuilderImpl();
        human.breakfast();
        human.gotojob();
        human.lunch();
        human.gotohome();
        human.humango();
    }
}