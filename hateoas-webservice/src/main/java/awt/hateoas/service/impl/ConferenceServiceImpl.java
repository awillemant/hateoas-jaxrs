package awt.hateoas.service.impl;

import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import org.springframework.transaction.annotation.Transactional;
import awt.hateoas.dao.ConferenceDAO;
import awt.hateoas.entity.Conference;
import awt.hateoas.service.ConferenceService;

@Named
@Transactional
public class ConferenceServiceImpl implements ConferenceService {

	@Inject
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
