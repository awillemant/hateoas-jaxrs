package com.wsolutions.hateoas.controller;

import java.util.List;
import javax.annotation.Resource;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.jboss.resteasy.links.AddLinks;
import org.jboss.resteasy.links.LinkResource;
import org.springframework.stereotype.Controller;
import com.wsolutions.hateoas.entity.Talk;
import com.wsolutions.hateoas.service.TalkService;

@Controller
@Produces(MediaType.APPLICATION_JSON)
@Path("/rs/talks")
public class TalkController {

	@Resource
	private TalkService talkService;


	@GET
	@Path("/")
	@LinkResource(value = Talk.class)
	@AddLinks
	public List<Talk> getAll() {
		return talkService.getAll();
	}


	@GET
	@Path("/{id}")
	@LinkResource()
	@AddLinks
	public Talk getOneById(@PathParam("id") long id) {
		return talkService.getOneById(id);
	}


	@POST
	@Path("/{id}/test")
	@LinkResource(value = Talk.class, rel = "testAction2")
	public void testAction(@PathParam("id") long id) {
		// TODO
	}
}
