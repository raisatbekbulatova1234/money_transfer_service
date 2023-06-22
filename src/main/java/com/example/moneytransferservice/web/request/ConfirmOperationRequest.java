package com.example.moneytransferservice.web.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ConfirmOperationRequest {

    String operationId;
    String code;

}
