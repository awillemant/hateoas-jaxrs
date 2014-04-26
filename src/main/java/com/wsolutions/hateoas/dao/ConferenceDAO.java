package com.wsolutions.hateoas.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.wsolutions.hateoas.entity.Conference;

public interface ConferenceDAO extends JpaRepository<Conference, Long> {}
