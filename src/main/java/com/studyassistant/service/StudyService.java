package com.studyassistant.service;

import com.studyassistant.model.StudyNote;
import com.studyassistant.repository.StudyRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class StudyService {

    private final StudyRepository repository;
    private final WebClient webClient;

    public StudyService(StudyRepository repository) {
        this.repository = repository;
        this.webClient = WebClient.create("https://api.openai.com/v1/"); // placeholder
    }

    public StudyNote createNote(StudyNote note) {
        String aiSummary = callAiApi(note.getContent(), "summary");
        String aiQuiz = callAiApi(note.getContent(), "quiz");
        note.setSummary(aiSummary);
        note.setQuiz(aiQuiz);
        return repository.save(note);
    }

    public List<StudyNote> getAllNotes() {
        return repository.findAll();
    }

    private String callAiApi(String content, String task) {
        // placeholder AI call
        return "AI-generated " + task + " for: " + content.substring(0, Math.min(50, content.length()));
    }
}
