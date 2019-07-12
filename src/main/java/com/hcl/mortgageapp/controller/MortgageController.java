package com.hcl.mortgageapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.mortgageapp.model.UserRequest;


/*
 * This is the MortgageController for mortgage cluculation
 */
@RestController
@RequestMapping("/mortgage")
public class MortgageController {

	
	/*
	 * This method is used for mortgage calculation
	 * @param gets user details request
	 * @return returns  
	 */
	@PostMapping("/calculate") 
	  public ResponseEntity<?> calculateMortgage(@RequestBody UserRequest userRequest){
		  
		  
	  return null;
	  }
	 

}
