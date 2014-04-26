package com.wsolutions.hateoas.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.wsolutions.hateoas.dao.TalkDAO;
import com.wsolutions.hateoas.entity.Talk;
import com.wsolutions.hateoas.service.TalkService;

@Service
@Transactional
public class TalkServiceImpl implements TalkService {

	@Resource
	private TalkDAO talkDAO;


	@Override
	public List<Talk> getAll() {
		List<Talk> talks = talkDAO.findAll();
		return talks;
	}


	@Override
	public Talk getOneById(long id) {
		Talk Talk = talkDAO.findOne(id);
		return Talk;
	}
}
