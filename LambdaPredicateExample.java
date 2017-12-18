import java.util.*;
import java.util.function.*;
class Student{
	private Integer age;
	private String name;
	Student(Integer age,String name){
		this.age=age;
		this.name=name;
	}	

	public Integer getAge(){
		return this.age;
	}

    public String getName(){
		return this.name;
	}	
	
	public String toString(){
		return "age="+this.age+" name:"+this.name;
	}
	public static List filter(List<Student> students,Predicate<Student> p){
		List<Student>filteredStudents=new ArrayList();
	    for(Student st4:students){
          if(p.test(st4)){
		  
		    filteredStudents.add(st4);
        }	
	}	
		 return filteredStudents;
		
}	
}
public class LambdaPredicateExample{
	
	public static void main(String []args){
		
		Student st=new Student(12,"ABC");
		
		Student st1=new Student(10,"BCD");
		
		Student st2=new Student(22,"ACD");

		Student st3=new Student(14,"ASD");		
        
        List<Student> students=new ArrayList();
        System.out.println("Before Sorting"); 
        students.add(st);	
		students.add(st1);			
		students.add(st2);	
		students.add(st3);	
		students.forEach(System.out::println);
		

		Collections.sort(students,(Student st4,Student s5)->st4.getAge().compareTo(s5.getAge()));
		System.out.println("After Sorting"); 
		students.forEach(System.out::println);
				System.out.println("After filtering"); 

Student.filter(students,(Student s)->s.getName().startsWith("A")).forEach(System.out::println);
		

	}
}	
	