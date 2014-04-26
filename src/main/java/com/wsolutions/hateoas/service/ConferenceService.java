package com.wsolutions.hateoas.service;

import java.util.List;
import com.wsolutions.hateoas.entity.Conference;

public interface ConferenceService {

	List<Conference> getAll();


	Conference getOneById(long id);
}
