package io.fabric8.maven.enricher.fabric8;

public class SpringBoot1HealthCheckEnricherTest extends AbstractSpringBootHealthCheckEnricherSupport {

    @Override
    protected String getSpringBootVersion() {
        return "1.5.10.RELEASE";
    }
}
