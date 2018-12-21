package com.pfp.firstproject.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfp.firstproject.dto.StudentRequestDto;
import com.pfp.firstproject.dto.StudentResponseDto;
import com.pfp.firstproject.entity.StudentModel;
import com.pfp.firstproject.repository.StudentRepository;
import com.pfp.firstproject.service.StudentDisplService;

//import com.firstProject.stuDto.StudentRequestDto;
//import com.firstProject.stuDto.StudentResponseDto;
//import com.firstProject.stuEntity.StudentModel;
//import com.firstProject.stuRepository.StudentRepository;
//import com.firstProject.stuService.StudentDisplService;

@Service
public class StudentDispImpl implements StudentDisplService  {
	
	@Autowired
	StudentRepository studentRepository;
	
	  	public void studDisp() {
		System.out.println("all student in impl");
}

	  	@Override
	public StudentResponseDto addAllstud(StudentRequestDto sreq) {
		System.out.println("i am in add student impl");
		String sn=sreq.getSname();
		String fn=sreq.getFname();
		//int sid=sreq.getSid();
		int sph=sreq.getSphone();
		
		StudentModel studentModel= new StudentModel();
		studentModel.setStname(sn);
		studentModel.setFname(fn);
		studentModel.setStphone(sph);
		studentRepository.save(studentModel);
		System.out.println("saved in addimpl");
		return null; 
	}
@Override
public  List<StudentResponseDto> studDispAll(){
	List<StudentModel> studentModel= (List<StudentModel>) studentRepository.findAll();
	List<StudentResponseDto> listStudResponseDto = new ArrayList<StudentResponseDto> ();
	System.out.println("i am in displayall impl");
	for (int i=0; i< studentModel.size();i++) {
		StudentResponseDto studentResponseDto= new StudentResponseDto();
		
		int tempId= studentModel.get(i).getStid();
		studentResponseDto.setStid(tempId);
		
		String tempName=studentModel.get(i).getStname();
		studentResponseDto.setStname(tempName);
		
		String tempFather=studentModel.get(i).getFname();
		studentResponseDto.setFtname(tempFather);
		int tempPhone=studentModel.get(i).getStphone();
		studentResponseDto.setStphone(tempPhone);
		
		listStudResponseDto.add(studentResponseDto);
	}

	
	return listStudResponseDto;
}


}
