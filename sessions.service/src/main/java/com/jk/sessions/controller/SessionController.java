package com.jk.sessions.controller;

import com.jk.sessions.entity.Session;
import com.jk.sessions.service.SessionService;
import com.jk.sessions.valueObject.ResponseTemplateValueObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/sessions")
public class SessionController {

    @Autowired
    private SessionService sessionService;

    @PostMapping("/")
    public Session saveSession(@RequestBody Session session) {
        log.info("Session saved - Controller");
        return sessionService.saveSession(session);
    }

    @GetMapping("/{id}")
    public ResponseTemplateValueObject getSessionWithSpeakerById(@PathVariable("id") Long id) {
        log.info("Session by session id - Controller");
        return sessionService.getSessionWithSpeakerById(id);
    }
}
