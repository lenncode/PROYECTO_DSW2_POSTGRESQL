package com.back.rest.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class ValidationHandler {

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public List<String> handleValidationErrors(MethodArgumentNotValidException e){
		List< String> errors=new ArrayList<String>();
		List<ObjectError> allErrors=e.getBindingResult().getAllErrors();
		allErrors.forEach(err->{
			FieldError fe=(FieldError) err;
			//errors.put(fe.getField(), fe.getDefaultMessage());
			errors.add(fe.getDefaultMessage());
		});
		return errors;
	}
	@ExceptionHandler(ModeloNotFoundException.class)
	public ResponseEntity<?> manejarModeloNotFoundException(ModeloNotFoundException ex, WebRequest request) {
		ExceptionResponse er = new ExceptionResponse("", request.getDescription(false));
		return new ResponseEntity<>(
                MensajeResponse.builder()
                        .mensaje(ex.getMessage())
                        .object(er)
                        .build()
                , HttpStatus.NOT_FOUND);
	}
}
