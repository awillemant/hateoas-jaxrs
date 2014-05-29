package awt.hateoas.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import awt.hateoas.entity.Conference;

public interface ConferenceDAO extends JpaRepository<Conference, Long> {}
