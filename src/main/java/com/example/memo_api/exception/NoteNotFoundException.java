package com.example.memo_api.exception;

public class NoteNotFoundException extends RuntimeException {
    public NoteNotFoundException(long id) {
        super("指定されたIDのﾉｰﾄが見つかりません:" + id);
    }
}
