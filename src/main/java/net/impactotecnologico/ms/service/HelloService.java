package net.impactotecnologico.ms.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import net.impactotecnologico.ms.pojo.Curso;

/**
 * This is the Microservice resource class. See <a href=
 * "https://github.com/wso2/msf4j#getting-started">https://github.com/wso2/msf4j#getting-started</a>
 * for the usage of annotations.
 *
 * @since 0.1-SNAPSHOT
 */
@Path("/service")
public class HelloService {

    @GET
	@Produces("application/json")
	@Path("/")
	public Response get() {
		// TODO: Implementation for HTTP GET request
		System.out.println("GET invoked");
		return Response.ok(new Retorno("Hello from WSO2 MSF4J", 1000)).build();
		// return "Hello from WSO2 MSF4J";
	}

	@POST
	@Path("/")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Curso post(Curso curso) {
		curso.setFecha("22/05/2018");
		curso.setDuracion(16);
		return curso;
	}

	@PUT
	@Path("/")
	public void put() {
		// TODO: Implementation for HTTP PUT request
		System.out.println("PUT invoked");
	}

	@DELETE
	@Path("/")
	public void delete() {
		// TODO: Implementation for HTTP DELETE request
		System.out.println("DELETE invoked");
	}

	class Retorno {
		String msj;
		Integer code;

		Retorno(String msj, Integer code) {
			this.msj = msj;
			this.code = code;
		}
	}
}
