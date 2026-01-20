package com.studyassistant.repository;

import com.studyassistant.model.StudyNote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudyRepository extends JpaRepository<StudyNote, Long> {
}
