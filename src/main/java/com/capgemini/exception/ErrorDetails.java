package com.capgemini.exception;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Data;


@Data
public class ErrorDetails {

	private String messsage;
	private LocalDateTime timestamp;
	private List<String> errors;
}
