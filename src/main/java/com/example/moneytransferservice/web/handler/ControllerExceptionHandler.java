package com.example.moneytransferservice.web.handler;

import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import com.example.moneytransferservice.exception.ConfirmOperationException;
import com.example.moneytransferservice.exception.ErrorInputDataException;
import com.example.moneytransferservice.exception.ErrorTransferException;
import com.example.moneytransferservice.web.response.ExceptionWebResponse;


@Slf4j
@ControllerAdvice
public class ControllerExceptionHandler {


    @ExceptionHandler(ErrorInputDataException.class)
    public ResponseEntity<ExceptionWebResponse> handleErrorInputDataException(@NonNull final ErrorInputDataException exc) {
        String message = " Incorrect card data entry: ";
        log.error(message + exc.getMessage());
        return new ResponseEntity<>(new ExceptionWebResponse(exc.getMessage(),400), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ErrorTransferException.class)
    public ResponseEntity<ExceptionWebResponse> handleErrorTransferException(@NonNull final ErrorTransferException exc) {
        String message = " Transfer error: ";
        log.error(message + exc.getMessage());
        return new ResponseEntity<>(new ExceptionWebResponse(exc.getMessage(),500), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(ConfirmOperationException.class)
    public ResponseEntity<ExceptionWebResponse> handleConfirmOperationException(@NonNull final ConfirmOperationException exc) {
        String message = " Error confirmation: ";
        log.error(message + exc.getMessage());
        return new ResponseEntity<>(new ExceptionWebResponse(exc.getMessage(),400), HttpStatus.BAD_REQUEST);
    }

}
