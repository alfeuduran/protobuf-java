package com.github.alfeuduran.protobuf;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import example.complex.ComplexExample;
import example.simple.Simple;

import java.util.Arrays;

import static com.github.alfeuduran.protobuf.ComplexMain.newDummyMessage;

public class ProtoToJsonMain {

    public static void main(String[] args) throws InvalidProtocolBufferException {
        ComplexExample.DummyMessage oneDummy = newDummyMessage(55,"Alfeu");

        //singular message
        ComplexExample.ComplexMessage.Builder builder = ComplexExample.ComplexMessage.newBuilder();
        builder.setOneDummy(oneDummy);

        //repeated field
        builder.addAllMultipleDummy(Arrays.asList(newDummyMessage(10,"Santos"),
                newDummyMessage(11,"Duran"),
                newDummyMessage(12,"Alfeu")));



        // Protobuff to Json
        String jsonString = JsonFormat.printer().print(builder);
        System.out.println(jsonString);

        //Parse Json into Protobuff

        Simple.SimpleMessage.Builder builder2 = Simple.SimpleMessage.newBuilder();

        JsonFormat.parser()
                .ignoringUnknownFields()
                .merge(jsonString,builder2);

        System.out.println(builder2);




    }
}
