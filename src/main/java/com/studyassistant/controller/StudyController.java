package com.studyassistant.controller;

import com.studyassistant.model.StudyNote;
import com.studyassistant.service.StudyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/study")
public class StudyController {

    private final StudyService service;

    public StudyController(StudyService service) {
        this.service = service;
    }

    @PostMapping
    public StudyNote addNote(@RequestBody StudyNote note) {
        return service.createNote(note);
    }

    @GetMapping
    public List<StudyNote> getAllNotes() {
        return service.getAllNotes();
    }
}
