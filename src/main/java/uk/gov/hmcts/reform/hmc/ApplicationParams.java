package uk.gov.hmcts.reform.hmc;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;

import javax.inject.Named;
import javax.inject.Singleton;

@Getter
@Named
@Singleton
public class ApplicationParams {

    @Value("${fh.ad.client-id}")
    private String clientId;

    @Value("${fh.ad.client-secret}")
    private String clientSecret;

    @Value("${fh.ad.scope}")
    private String scope;

    @Value("${fh.ad.grant-type}")
    private String grantType;

    @Value("${fh.hmi.source-system}")
    private String sourceSystem;

    @Value("${fh.hmi.destination-system}")
    private String destinationSystem;

    @Value("${azure.jms.servicebus.queue-name}")
    private String queueName;

    @Value("${azure.jms.servicebus.connection-string}")
    private String connectionString;

    @Value("${azure.jms.servicebus.exponential-multiplier}")
    private String exponentialMultiplier;

    @Value("${azure.jms.servicebus.max-retry-attempts}")
    private int maxRetryAttempts;
}
