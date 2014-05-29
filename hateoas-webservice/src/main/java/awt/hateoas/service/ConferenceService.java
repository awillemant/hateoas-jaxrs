package awt.hateoas.service;

import java.util.List;
import awt.hateoas.entity.Conference;

public interface ConferenceService {

	List<Conference> getAll();


	Conference getOneById(long id);
}
