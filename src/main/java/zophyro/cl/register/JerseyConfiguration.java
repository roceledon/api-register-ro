package zophyro.cl.register;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;
import zophyro.cl.register.resource.LoginResource;

@Component
public class JerseyConfiguration extends ResourceConfig {

    public JerseyConfiguration() {
        register(LoginResource.class);
    }

}