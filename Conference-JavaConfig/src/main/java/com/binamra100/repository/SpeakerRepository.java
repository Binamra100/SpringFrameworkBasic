package com.binamra100.repository;

import com.binamra100.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
