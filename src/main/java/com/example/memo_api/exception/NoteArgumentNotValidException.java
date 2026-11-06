package com.example.memo_api.exception;

public class NoteArgumentNotValidException extends RuntimeException {
    public NoteArgumentNotValidException(String message) {
        super(message);
    }
}
