package com.ash.journal.controller;

import com.ash.journal.entities.Journal;
import com.ash.journal.service.JournalService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashMap;

@RestController
@RequestMapping(value = "/journals", produces = "application/json")
public class JournalController {
    private final JournalService journalService;

    public JournalController(JournalService journalService) {
        this.journalService = journalService;
    }

    //POST - Create Journal
    @PostMapping(value ="/post", consumes = "application/json")
    public Journal createJournal(@RequestBody Journal journal) {
        return journalService.addJournal(journal);
    }

    //GET - All Journals
    @GetMapping
    public Collection<Journal> getAllJournals() {
        return journalService.getAllJournals();
    }

    //GET - Journal by ID
    @GetMapping("/{id}")
    public Journal getJournal(@PathVariable int id) {
        return journalService.getJournalById(id);
    }
}
