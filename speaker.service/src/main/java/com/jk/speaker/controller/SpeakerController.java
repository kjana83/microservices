package com.jk.speaker.controller;

import com.jk.speaker.entity.Speaker;
import com.jk.speaker.service.SpeakerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/speakers")
@Slf4j
public class SpeakerController {

    @Autowired
    private SpeakerService speakerService;

    @PostMapping("/")
    public Speaker save(@RequestBody Speaker speaker) {
        log.info("Save speaker - Controller");
        return speakerService.saveSpeaker(speaker);
    }

    @GetMapping("/{id}")
    public Speaker getById(@PathVariable("id") Long id) {
        log.info("Get speaker by Id - Controller");
        return speakerService.getBySepeakerId(id);
    }
}
