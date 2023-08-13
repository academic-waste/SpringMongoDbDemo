package com.boot.db.SpringMongoDbDemo.exception;

public class RecordNotFoundException extends Exception{
    public RecordNotFoundException(String message) {
        super(message);
    }
}
