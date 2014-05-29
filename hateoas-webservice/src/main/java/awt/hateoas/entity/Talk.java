package awt.hateoas.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlElement;

@Entity
public class Talk extends GenericEntity {

	@XmlElement
	private String speakerName;

	@XmlElement
	private String title;

	@ManyToOne
	private Conference conference;


	public Talk() {
		super();
	}


	public String getSpeakerName() {
		return speakerName;
	}


	public void setSpeakerName(String speakerName) {
		this.speakerName = speakerName;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public Conference getConference() {
		return conference;
	}


	public void setConference(Conference conference) {
		this.conference = conference;
	}
}
