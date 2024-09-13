package in.sp.main;

import java.util.List;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import in.sp.main.entities.Student;
import in.sp.main.services.StudentService;
import in.sp.main.services.StudentServiceImpl;

@SpringBootApplication
public class SpringBootWithDataJpaApplication {

	public static void main(String[] args) {
    
		ApplicationContext ctx = SpringApplication.run(SpringBootWithDataJpaApplication.class, args);
	    StudentService stdService= ctx.getBean(StudentServiceImpl.class);
//	    Student std=new Student();
//	    
//	    std.setName("MADHU PRAJAPATI");
//	    std.setRollno(102);
//	    std.setMarks(97.5f);
//	    
//	    
//	    boolean status= stdService.addStudentDetails(std);
//	    if (status) {
//			System.out.println("Insertion Successfull");
//		}else {
//			System.out.println("Insertion Failure");
//		}
	    
	    //-------Select Operation------
	    
//	   List<Student> stdList= stdService.getAllStudentDetails();
//	   for(Student std: stdList) {
//		   System.out.println("Student ID :"+std.getId());
//		   System.out.println("Student Name :"+std.getName());
//		   System.out.println("Student Rollno :"+std.getRollno());
//		   System.out.println("Student Marks :"+std.getMarks());
//		   System.out.println("==============================");
//		   
//	   }
//	  Student std= stdService.getStudentDetail(3L);  
//	  if(std!=null) {
//	  System.out.println("Student ID :"+std.getId());
//	   System.out.println("Student Name :"+std.getName());
//	   System.out.println("Student Rollno :"+std.getRollno());
//	   System.out.println("Student Marks :"+std.getMarks());
//	  }else {
//		  System.out.println("Student not Found");
//	  }
	    
//	   Student stud= stdService.updateStudentDetails(1,"SATISH PRAJAPATI");
//	   if(stud!=null) {
//		   System.out.println("updated");
//		   System.out.println(stud.getName());
//		   System.out.println(stud.getRollno());
//		   System.out.println(stud.getMarks());
//	   }else {
//		   System.out.println("Failure");
//	   }
	    
	    boolean status=stdService.deleteStudent(1);
	    if(status) {
	    	System.out.println("Student deleted Successfully");
	    }else {
	    	System.out.println("Deletion Failed");
	    }
	    
	}
	

}
