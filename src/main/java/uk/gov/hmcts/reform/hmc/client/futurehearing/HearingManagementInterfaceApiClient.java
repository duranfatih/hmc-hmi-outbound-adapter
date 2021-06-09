package uk.gov.hmcts.reform.hmc.client.futurehearing;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import static org.springframework.http.HttpHeaders.AUTHORIZATION;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@FeignClient(
    name = "hearing-management-interface-api",
    url = "${fh.hmi.host}",
    configuration = {FutureHearingApiClientConfig.class}
)
public interface HearingManagementInterfaceApiClient {

    String REQUEST_URL = "/hearings";

    @PostMapping(value = REQUEST_URL, consumes = APPLICATION_JSON_VALUE)
    HearingManagementInterfaceResponse requestHearing(@RequestHeader(AUTHORIZATION) String authorization,
                        @RequestHeader("Source-System") String sourceSystem,
                        @RequestHeader("Destination-System") String destinationSystem,
                        @RequestHeader("Request-Created-At") String requestCreatedAt,
                        @RequestHeader("Accept") String accept,
                        @RequestHeader("Content-Type") String content,
                        @RequestBody JsonNode data);
}
