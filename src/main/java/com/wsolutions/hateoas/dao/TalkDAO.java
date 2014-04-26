package com.wsolutions.hateoas.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.wsolutions.hateoas.entity.Talk;

public interface TalkDAO extends JpaRepository<Talk, Long> {}
