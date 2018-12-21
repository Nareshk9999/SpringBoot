package com.pfp.firstproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pfp.firstproject.dto.StudentRequestDto;
import com.pfp.firstproject.dto.StudentResponseDto;
import com.pfp.firstproject.service.StudentDisplService;

//import com.firstProject.stuDto.StudentRequestDto;
//import com.firstProject.stuDto.StudentResponseDto;
//import com.firstProject.stuService.StudentDisplService;



@RestController
public class NewStudController {
@Autowired
StudentDisplService studentDisplService ;

	//@GetMapping(value="/") 
	@RequestMapping(value="/stt",method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public String dispStudController() {
		System.out.println("all sutdent of 10th");
		
		return null;
	}
	
	@RequestMapping(value="/addAllstudents", method = RequestMethod.POST)
	@ResponseBody
	public StudentResponseDto addAllstud(@RequestBody StudentRequestDto sreq) {
		StudentResponseDto responseDto= studentDisplService.addAllstud(sreq);
		return responseDto;
	}

	@RequestMapping(value="/getAllstudents", method = RequestMethod.GET)
	@ResponseBody
	public  List<StudentResponseDto> studDispAll(){
		System.out.println("collecting all student data");
		List<StudentResponseDto>  st= studentDisplService.studDispAll();
		return st;
	}
	
}
