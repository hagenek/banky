package royalcouncil.ai.banky.api.controllers

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/hello")
class HelloWorldController {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun sayHello(): String {
        return """{"message":"Hello World"}"""
    }
}