package com.wsolutions.hateoas.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.wsolutions.hateoas.dao.ConferenceDAO;
import com.wsolutions.hateoas.entity.Conference;
import com.wsolutions.hateoas.service.ConferenceService;

@Service
@Transactional
public class ConferenceServiceImpl implements ConferenceService {

	@Resource
	private ConferenceDAO conferenceDAO;


	@Override
	public List<Conference> getAll() {
		List<Conference> conferences = conferenceDAO.findAll();
		for (Conference conference : conferences) {
			conference.getTalks().size();
		}
		return conferences;
	}


	@Override
	public Conference getOneById(long id) {
		Conference conference = conferenceDAO.findOne(id);
		conference.getTalks().size();
		return conference;
	}
}
