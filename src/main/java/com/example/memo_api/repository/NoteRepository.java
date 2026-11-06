package com.example.memo_api.repository;


import com.example.memo_api.exception.NoteNotFoundException;
import com.example.memo_api.mapper.NoteMapper;
import com.example.memo_api.dto.Note;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class NoteRepository {

    private final NoteMapper noteMapper;

    public NoteRepository(NoteMapper noteMapper) {
        this.noteMapper = noteMapper;
    }

    public List<Note> findAll() {
        return noteMapper.findAll();
    }

    public int insertNote(Note note){
        return noteMapper.insert(note);
    }

    public Note findById(long id){
        return noteMapper.findById(id);
    }

    public boolean delete(long id){
        return noteMapper.delete(id) == 1;
    }

    public Note update(Note note){
        if (noteMapper.update(note) == 0){
            throw new NoteNotFoundException(note.getId());
        }
        return note;
    }
}
