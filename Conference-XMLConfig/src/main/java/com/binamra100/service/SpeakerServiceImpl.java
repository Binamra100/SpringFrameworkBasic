package com.binamra100.service;

import com.binamra100.model.Speaker;
import com.binamra100.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    public SpeakerServiceImpl() {

    }

    public SpeakerServiceImpl(SpeakerRepository repository) {
        this.repository = repository;
    }

    public List<Speaker> findAll() {
        return repository.findAll();
    }

    public void setSpeakerRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}
