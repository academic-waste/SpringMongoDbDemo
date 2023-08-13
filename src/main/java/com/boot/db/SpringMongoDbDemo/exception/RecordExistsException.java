package com.boot.db.SpringMongoDbDemo.exception;

public class RecordExistsException extends Exception{
    public RecordExistsException(String message) {
        super(message);
    }
}
