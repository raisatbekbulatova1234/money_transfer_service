package com.example.moneytransferservice.service;

import org.springframework.stereotype.Service;
import com.example.moneytransferservice.web.request.ConfirmOperationRequest;
import com.example.moneytransferservice.web.request.TransferRequest;
import com.example.moneytransferservice.web.response.MoneyTransferResponse;

@Service
public interface TransferService {

    MoneyTransferResponse transfer(TransferRequest transferRequest);

    MoneyTransferResponse confirmOperation(ConfirmOperationRequest operationRequest);
}
