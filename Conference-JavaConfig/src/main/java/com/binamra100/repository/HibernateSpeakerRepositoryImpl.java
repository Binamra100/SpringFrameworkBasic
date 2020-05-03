package com.binamra100.repository;

import com.binamra100.model.Speaker;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("speakerRepository")
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
