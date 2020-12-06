package com.github.alfeuduran.protobuf;

import example.enumerations.EnumExample;

public class EnumMain {
    public static void main(String[] args) {

        System.out.println("Exmaple for Enums");

        EnumExample.EnumMessage.Builder builder = EnumExample.EnumMessage.newBuilder();

        builder.setId(345);
        builder.setDayOfTheWeek(EnumExample.DayOfTheWeek.FRIDAY);


        //print Enum Message
        EnumExample.EnumMessage message = builder.build();
        System.out.println(message);

    }
}
