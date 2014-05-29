package awt.hateoas.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import org.jboss.resteasy.links.RESTServiceDiscovery;

@MappedSuperclass
@XmlAccessorType(XmlAccessType.NONE)
public class GenericEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@XmlElement
	private long id;

	@XmlElement
	@Transient
	private RESTServiceDiscovery links;


	public long getId() {
		return id;
	}


	public RESTServiceDiscovery getLinks() {
		return links;
	}
}
