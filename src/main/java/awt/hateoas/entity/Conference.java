package awt.hateoas.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Conference extends GenericEntity {

	@XmlElement
	private String name;

	@XmlElement
	private Date startDate;

	@XmlElement
	private Date endDate;

	@XmlElement
	@OneToMany(mappedBy = "conference", cascade = CascadeType.ALL)
	private List<Talk> talks;


	public Conference() {
		super();
		talks = new ArrayList<Talk>();
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Date getStartDate() {
		return startDate;
	}


	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}


	public Date getEndDate() {
		return endDate;
	}


	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}


	public List<Talk> getTalks() {
		return talks;
	}


	public boolean isPast() {
		return endDate.before(new Date());
	}
}
