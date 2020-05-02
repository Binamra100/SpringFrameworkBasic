package com.binamra100.service;

import com.binamra100.model.Speaker;
import com.binamra100.repository.HibernateSpeakerRepositoryImpl;
import com.binamra100.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();

    public List<Speaker> findAll(){
        return repository.findAll();
    }
}
