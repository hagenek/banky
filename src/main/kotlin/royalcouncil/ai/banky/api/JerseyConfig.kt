package royalcouncil.ai.banky.config

import org.glassfish.jersey.server.ResourceConfig
import org.springframework.stereotype.Component
import royalcouncil.ai.banky.api.controllers.HelloWorldController

@Component
class JerseyConfig : ResourceConfig() {
    init {
        // Register Jersey resources
        register(HelloWorldController::class.java)
    }
}