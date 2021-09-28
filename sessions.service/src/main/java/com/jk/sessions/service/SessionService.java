package com.jk.sessions.service;

import com.jk.sessions.entity.Session;
import com.jk.sessions.repository.SessionRepository;
import com.jk.sessions.valueObject.ResponseTemplateValueObject;
import com.jk.sessions.valueObject.Speaker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Service
public class SessionService {

    @Autowired
    private SessionRepository sessionRepository;

    @Autowired
    private RestTemplate restTemplate;

    public Session saveSession(Session session) {
        log.info("Save Session - Service");
        return sessionRepository.save(session);
    }

    public Session getSessionById(Long id) {
        log.info("Session by Id - Service");
        return sessionRepository.getBySessionId(id);
    }

    public ResponseTemplateValueObject getSessionWithSpeakerById(Long id) {
        ResponseTemplateValueObject vo= new ResponseTemplateValueObject();

        Session session = sessionRepository.getBySessionId(id);

        Speaker speaker = restTemplate.getForObject("http://SPEAKER-SERVICE/speakers/" +
                session.getSessionId(), Speaker.class);

        vo.setSession(session);
        vo.setSpeaker(speaker);
        return vo;
    }
}
