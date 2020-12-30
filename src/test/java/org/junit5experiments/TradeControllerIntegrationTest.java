package org.junit5experiments;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.net.URL;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TradeControllerIntegrationTest {
    // bind the above RANDOM_PORT
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Mock
    TradeService tradeService;

    @BeforeEach
    public void setupMocks() {
        Trade t11 = new Trade("T1", "V1", 1000d);
        Trade t12 = new Trade("T1", "V2", 1100d);
        Trade t2 = new Trade("T2", "V1", 2000d);
        List<Trade> tradeList = Arrays.asList(t11, t12, t2);

        when(tradeService.listTrades()).thenReturn(tradeList);
    }

    @Test
    @DisplayName("Given trades request, then return list of trades successfully")
    public void tradesAPITest() throws Exception {
        String url = new URL("http://localhost:" + port + "/trades").toString();
        ResponseEntity<List> responseEntity = restTemplate.getForEntity(url, List.class);
        Assertions.assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        List<Trade> tradeListResult = responseEntity.getBody();
        Assertions.assertEquals(3, tradeListResult.size());
    }
}
