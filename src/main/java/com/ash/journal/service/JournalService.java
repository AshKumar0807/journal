package com.ash.journal.service;

import com.ash.journal.entities.Journal;
import com.ash.journal.repository.JournalRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Collection;

@Service
public class JournalService {

    private final JournalRepository journalRepository;

    public JournalService(JournalRepository journalRepository) {
        this.journalRepository = journalRepository;
    }

    public Journal addJournal(Journal journal) {
        journal.setCreatedAt(LocalDateTime.now());
        journalRepository.save(journal);
        return journal;
    }

    public Collection<Journal> getAllJournals() {
        return journalRepository.findAll();
    }

    public Journal getJournalById(int id) {
        return journalRepository.findById(id);
    }
}
