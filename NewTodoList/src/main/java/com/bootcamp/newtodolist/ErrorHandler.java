package com.bootcamp.newtodolist;

import java.util.HashMap;
import java.util.Map;

import org.springframework.validation.BindingResult;

public class ErrorHandler {
	
	public Map<String, String> validacionInputs(BindingResult bindingResult) {
		
		//creo una variable (key, value) para guardar los errores
		Map<String, String> errors = new HashMap<>();
		
		//recorro todos los errores y los guardo en mi variable
		bindingResult.getFieldErrors().forEach((error) -> {
			String campo = error.getField();
			String errMsj = error.getDefaultMessage();
			errors.put(campo, errMsj);
		});
		
		//retorno los errores (campo:mensaje)
		return errors;
		
	}

}
