//package com.example.moneytransferservice;
//
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//import org.springframework.http.ResponseEntity;
//import org.testcontainers.containers.GenericContainer;
//import org.testcontainers.junit.jupiter.Container;
//import org.testcontainers.junit.jupiter.Testcontainers;
//import com.example.moneytransferservice.model.Amount;
//import com.example.moneytransferservice.web.request.ConfirmOperationRequest;
//import com.example.moneytransferservice.web.request.TransferRequest;
//
//
//@Testcontainers
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//class MoneyTransferServiceApplicationTests {
//
//    @Autowired
//    TestRestTemplate restTemplate;
//
//    private static final int PORT = 5500;
//
//    @Container
//    private static final GenericContainer<?> appContainer = new GenericContainer<>("transfer_service")
//            .withExposedPorts(PORT);
//
//
//    @Test
//    void contextLoadsTransfer() {
//        Integer applicationPort = appContainer.getMappedPort(PORT);
//        String TRANSFER_ENDPOINT = "/transfer";
//        String HOST = "http://localhost:";
//        TransferRequest TRANSFER_REQUEST = new TransferRequest("1111222233334444", "01/29", "345",
//                "5555666677778888", new Amount(1500, "RUR"));
//
//        ResponseEntity<String> entity = restTemplate.postForEntity(HOST + applicationPort + TRANSFER_ENDPOINT,
//                TRANSFER_REQUEST, String.class);
//        String expectedId = "{\"operationId\":\"1\"}";
//        String actualId = entity.getBody();
//
//        Assertions.assertEquals(expectedId, actualId);
//    }
//
//    @Test
//    void contextLoadsConfirmOperation() {
//        Integer applicationPort = appContainer.getMappedPort(PORT);
//        ConfirmOperationRequest CONFIRM_OPERATION_REQUEST = new ConfirmOperationRequest(
//                "1", "0000");
//        String CONFIRM_OPERATION_ENDPOINT = "/confirmOperation";
//        String HOST = "http://localhost:";
//        String expectedId = "{\"operationId\":\"1\"}";
//        ResponseEntity<String> entity = restTemplate.postForEntity(HOST + applicationPort + CONFIRM_OPERATION_ENDPOINT,
//                CONFIRM_OPERATION_REQUEST, String.class);
//        String actualId = entity.getBody();
//        Assertions.assertEquals(expectedId, actualId);
//    }
//}
