package com.bridgelabz.discoveryClient_note.exceptionservice;

import org.slf4j.Logger;


import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestBody;

import com.bridgelabz.discoveryClient_note.controller.NoteController;
import com.bridgelabz.discoveryClient_note.dto.ResponseDto;



/**
 * @author bridgelabz
 * @since 12/7/2018 <br>
 *        <p>
 *        entity to handle exceptions
 *        </p>
 */
@ControllerAdvice
public class ExceptionHandler {
	public static final Logger logger = LoggerFactory.getLogger(NoteController.class);
	
	@org.springframework.web.bind.annotation.ExceptionHandler(ToDoException.class)
	public ResponseEntity<ResponseDto> Exceptionhandler(@RequestBody ToDoException todoexception) {
		logger.info("Handling exception here");
		ResponseDto response = new ResponseDto();
		response.setMessage(todoexception.getMessage());
		response.setStatus(-1);

		return new ResponseEntity<ResponseDto>(response, HttpStatus.BAD_REQUEST);
	}
}