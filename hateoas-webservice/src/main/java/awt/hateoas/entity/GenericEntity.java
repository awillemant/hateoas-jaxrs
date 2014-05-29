package awt.hateoas.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import org.jboss.resteasy.links.RESTServiceDiscovery;

@MappedSuperclass
@XmlAccessorType(XmlAccessType.NONE)
public class GenericEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@XmlAttribute
	private long id;

	@XmlElement
	@Transient
	private RESTServiceDiscovery links;


	@XmlID
	public String getIdString() {
		return Long.toString(id);
	}


	public long getId() {
		return id;
	}


	public RESTServiceDiscovery getLinks() {
		return links;
	}
}
