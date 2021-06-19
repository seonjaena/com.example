package com.example;

import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.RecordMetadata;

public class ProducerCallback implements Callback {

    @Override
    public void onCompletion(RecordMetadata metadata, Exception exception) {

        if(exception != null) System.out.println(exception.getMessage());
        else System.out.println(metadata.toString());

    }

}
