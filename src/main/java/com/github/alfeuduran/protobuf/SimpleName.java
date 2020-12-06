package com.github.alfeuduran.protobuf;

import example.simple.Simple;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class SimpleName {

    public static void main(String[] args) {

        System.out.println("Ola mundo!");
        Simple.SimpleMessageOrBuilder builder = Simple.SimpleMessage.newBuilder();

        builder.getId();


        //builder.setId(42)
                 //.setIsSimples(true)


        //repeated field.

        //builder.addSampleList(2)
        //builder.addSampleList(3)
        //builder.addSampleList(4)

        //builder.addAllSampleList(Arrays.asList(4,5,6));


        Simple.SimpleMessage message = Simple.SimpleMessage.newBuilder().build();

        //write protocol buffers to a binary file

        try{
            FileOutputStream outputStream = new FileOutputStream("simple_message.bin");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //send as byte array (over the network)

        byte[] bytes = message.toByteArray();






    }
}
