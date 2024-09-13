package in.sp.main.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sp.main.entities.Student;
import in.sp.main.repository.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository sturepo;

	@Override
	public boolean addStudentDetails(Student std) {
		boolean status=false;
		try {
			sturepo.save(std);
			status=true;
			
		} catch (Exception e) {
			e.printStackTrace();
			status=false;
		}
		return status;
	}

	@Override
	public List<Student> getAllStudentDetails() {
		
		return sturepo.findAll();
	}

	@Override
	public Student getStudentDetail(long id) {
		Optional<Student> opt= sturepo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}
		return null;
	}

	@Override
	public Student getStudentDetail(String name) {
	
		return null;
	}

	@Override
	public Student updateStudentDetails(long id, String name) 
	{
		Student std=getStudentDetail(id);
		if(std!=null) {
		std.setName(name);
		sturepo.save(std);
		}
			return std;
		
		
		
	}

	@Override
	public boolean deleteStudent(long id) {
		boolean status=false;
		try {
			sturepo.deleteById(id);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
			status=false;
		}
		
		return status;
	}

}
