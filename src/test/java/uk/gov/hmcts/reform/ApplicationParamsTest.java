package uk.gov.hmcts.reform;

import org.junit.jupiter.api.Test;
import org.springframework.test.util.ReflectionTestUtils;
import uk.gov.hmcts.reform.hmc.ApplicationParams;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ApplicationParamsTest {

    private final ApplicationParams applicationParams = new ApplicationParams();
    private static final String VALUE = "test-value";

    @Test
    void shouldGetClientId() {
        ReflectionTestUtils.setField(applicationParams, "clientId", VALUE);
        assertEquals(VALUE,
                     applicationParams.getClientId());
    }

    @Test
    void shouldGetClientSecret() {
        ReflectionTestUtils.setField(applicationParams, "clientSecret", VALUE);
        assertEquals(VALUE,
                     applicationParams.getClientSecret());
    }

    @Test
    void shouldGetGrantType() {
        ReflectionTestUtils.setField(applicationParams, "grantType", VALUE);
        assertEquals(VALUE,
                     applicationParams.getGrantType());
    }

    @Test
    void shouldGetScope() {
        ReflectionTestUtils.setField(applicationParams, "scope", VALUE);
        assertEquals(VALUE,
                     applicationParams.getScope());
    }

    @Test
    void shouldGetSourceSystem() {
        ReflectionTestUtils.setField(applicationParams, "sourceSystem", VALUE);
        assertEquals(VALUE,
                     applicationParams.getSourceSystem());
    }

    @Test
    void shouldGetDestinationSystem() {
        ReflectionTestUtils.setField(applicationParams, "destinationSystem", VALUE);
        assertEquals(VALUE,
                     applicationParams.getDestinationSystem());
    }

    @Test
    void shouldGetConnectionString() {
        ReflectionTestUtils.setField(applicationParams, "connectionString", "someValue");
        assertEquals("someValue",
                     applicationParams.getConnectionString());
    }

    @Test
    void shouldGetQueueName() {
        ReflectionTestUtils.setField(applicationParams, "queueName", "someValue");
        assertEquals("someValue",
                     applicationParams.getQueueName());
    }

    @Test
    void shouldGetWaitToRetryTime() {
        ReflectionTestUtils.setField(applicationParams, "waitToRetryTime", "someValue");
        assertEquals("someValue",
                     applicationParams.getWaitToRetryTime());
    }
}
