package com.test.controller;

import org.springframework.http.HttpStatus;

import com.test.exception.CustomException;

public class ExceptionThrower {
	public void throwUnknownErrorException() throws CustomException {
		throw new CustomException(HttpStatus.BAD_REQUEST.value(), "Unknown Error!", HttpStatus.BAD_REQUEST);
	}

	public void throwFileEmptyException() throws CustomException {
		throw new CustomException(HttpStatus.BAD_REQUEST.value(), "Please select a file to upload",
				HttpStatus.BAD_REQUEST);
	}
	
	public void throwFileStoreException() throws CustomException {
		throw new CustomException(HttpStatus.BAD_REQUEST.value(), "Error in storing file in temp",
				HttpStatus.BAD_REQUEST);
	}

}
