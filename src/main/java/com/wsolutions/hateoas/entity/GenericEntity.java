package com.wsolutions.hateoas.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
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

	@Column(name = "creation_time", nullable = false)
	@XmlAttribute
	private Date creationTime;

	@Column(name = "modification_time", nullable = false)
	@XmlAttribute
	private Date modificationTime;

	@XmlElement
	@Transient
	private RESTServiceDiscovery link;

	@XmlID
	public String getIdString() {
		return Long.toString(id);
	}

	public long getId() {
		return id;
	}

	public Date getCreationTime() {
		return creationTime;
	}

	public Date getModificationTime() {
		return modificationTime;
	}

	@PreUpdate
	public void preUpdate() {
		modificationTime = new Date();
	}

	@PrePersist
	public void prePersist() {
		Date now = new Date();
		creationTime = now;
		modificationTime = now;
	}

	public RESTServiceDiscovery getLink() {
		return link;
	}
}
