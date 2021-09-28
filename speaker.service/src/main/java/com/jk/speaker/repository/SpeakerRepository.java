package com.jk.speaker.repository;

import com.jk.speaker.entity.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
    Speaker getBySpeakerId(Long id);
}
