package awt.hateoas.service;

import java.util.List;
import awt.hateoas.entity.Talk;

public interface TalkService {

	List<Talk> getAll();


	Talk getOneById(long id);
}
