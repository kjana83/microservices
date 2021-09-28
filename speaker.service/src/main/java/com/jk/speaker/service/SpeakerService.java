package com.jk.speaker.service;

import com.jk.speaker.entity.Speaker;
import com.jk.speaker.repository.SpeakerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SpeakerService {

    @Autowired
    private SpeakerRepository speakerRepository;

    public Speaker saveSpeaker(Speaker speaker) {
      log.info("Speaker saved - Service");
      return speakerRepository.save(speaker);
    }

    public Speaker getBySepeakerId(Long id) {
        log.info("Speaker by Id - Service");
        return speakerRepository.getBySpeakerId(id);
    }
}
