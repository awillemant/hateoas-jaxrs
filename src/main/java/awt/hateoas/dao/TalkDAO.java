package awt.hateoas.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import awt.hateoas.entity.Talk;

public interface TalkDAO extends JpaRepository<Talk, Long> {}
