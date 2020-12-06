package com.github.alfeuduran.protobuf;

import example.complex.ComplexExample;

import java.util.Arrays;
import java.util.concurrent.CompletionService;

public class ComplexMain {
    public static void main(String[] args) {

        ComplexExample.DummyMessage oneDummy = newDummyMessage(55,"Alfeu");

        //singular message
        ComplexExample.ComplexMessage.Builder builder = ComplexExample.ComplexMessage.newBuilder();
        builder.setOneDummy(oneDummy);

        //repeated field
        builder.addAllMultipleDummy(Arrays.asList(newDummyMessage(10,"Santos"),
                newDummyMessage(11,"Duran"),
                newDummyMessage(12,"Alfeu")));



        ComplexExample.ComplexMessage message = builder.build();

        System.out.println(message);

        message.getMultipleDummyList(); // Nesse caso aqui o que temos é que ele retorna uma lista de mensagens caso a gente queira iterar através dessa lista.
    }


    public static ComplexExample.DummyMessage newDummyMessage(Integer id, String name){
        ComplexExample.DummyMessage.Builder dummyMessageBuilder = ComplexExample.DummyMessage.newBuilder();
        ComplexExample.DummyMessage message = dummyMessageBuilder.setName(name)
                .setId(id)
                .build();
            return message;

    }



}
