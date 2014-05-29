package awt.hateoas.service.impl;

import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import org.springframework.transaction.annotation.Transactional;
import awt.hateoas.dao.TalkDAO;
import awt.hateoas.entity.Talk;
import awt.hateoas.service.TalkService;

@Named
@Transactional
public class TalkServiceImpl implements TalkService {

	@Inject
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
