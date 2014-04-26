package com.wsolutions.hateoas.service;

import java.util.List;
import com.wsolutions.hateoas.entity.Talk;

public interface TalkService {

	List<Talk> getAll();


	Talk getOneById(long id);
}
