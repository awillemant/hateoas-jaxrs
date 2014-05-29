package awt.hateoas.controller;

import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.jboss.resteasy.links.AddLinks;
import org.jboss.resteasy.links.LinkResource;
import awt.hateoas.entity.Talk;
import awt.hateoas.service.TalkService;

@Named
@Produces(MediaType.APPLICATION_JSON)
@Path("/rs/talks")
public class TalkController extends AbstractController {

	@Inject
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
	@Path("/")
	public Response post() {
		return notImplemented();
	}


	@PUT
	@Path("/")
	public Response put() {
		return notImplemented();
	}


	@DELETE
	@Path("/")
	public Response delete() {
		return notImplemented();
	}
}
