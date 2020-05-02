package com.binamra100.repository;

import com.binamra100.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    public List<Speaker>  findAll(){
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();
        speaker.setFirstName("Binamra");
        speaker.setLastName("Kandel");

        speakers.add(speaker);

        return speakers;
    }

}
