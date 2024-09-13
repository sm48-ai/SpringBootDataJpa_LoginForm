package in.sp.main.services;

import java.util.List;

import in.sp.main.entities.Student;

public interface StudentService {
	public boolean addStudentDetails(Student std);
	public List<Student> getAllStudentDetails();
	public Student getStudentDetail(long id);
	public Student getStudentDetail(String name);
	public Student updateStudentDetails(long id,String name);
	public boolean deleteStudent(long id);

}
