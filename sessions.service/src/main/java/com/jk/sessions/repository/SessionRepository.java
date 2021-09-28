package com.jk.sessions.repository;

import com.jk.sessions.entity.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionRepository extends JpaRepository<Session, Long> {

    Session getBySessionId(Long id);
}
