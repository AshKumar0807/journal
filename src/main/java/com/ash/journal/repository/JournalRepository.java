package com.ash.journal.repository;

import com.ash.journal.entities.Journal;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class JournalRepository {

    private final Map<Integer, Journal> journalStore = new HashMap<>();

    public void save(Journal journal) {
        journalStore.put(journal.getId(), journal);
    }

    public Collection<Journal> findAll() {
        return journalStore.values();
    }

    public Journal findById(int id) {
        return journalStore.get(id);
    }
}
