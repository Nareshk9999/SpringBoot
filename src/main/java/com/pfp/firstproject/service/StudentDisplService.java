package com.pfp.firstproject.service;

import java.util.List;

import com.pfp.firstproject.dto.StudentRequestDto;
import com.pfp.firstproject.dto.StudentResponseDto;

//import com.firstProject.stuDto.StudentRequestDto;
//import com.firstProject.stuDto.StudentResponseDto;


public interface StudentDisplService {

	
	public  List<StudentResponseDto> studDispAll();

    public StudentResponseDto addAllstud(StudentRequestDto sreq);
}
