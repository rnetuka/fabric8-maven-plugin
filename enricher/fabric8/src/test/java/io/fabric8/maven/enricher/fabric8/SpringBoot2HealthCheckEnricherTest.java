package io.fabric8.maven.enricher.fabric8;


public class SpringBoot2HealthCheckEnricherTest extends AbstractSpringBootHealthCheckEnricherSupport {

    @Override
    protected String getSpringBootVersion() {
        return "2.0.0.RELEASE";
    }
}
