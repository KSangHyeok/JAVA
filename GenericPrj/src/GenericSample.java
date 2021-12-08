
public class GenericSample {

	public static void main(String[] args) {
		EmployeeInfo ei = new EmployeeInfo(1);
		Person<EmployeeInfo, Integer> p1 = new Person<EmployeeInfo, Integer>(ei, 1);
		
		StudentInfo si=new StudentInfo(2);
		Person<StudentInfo,Integer> p2=new Person<StudentInfo,Integer>(si,2);
//		StudentInfo si = new StudentInfo(2);
//		StudentPerson sp = new StudentPerson(si);
//		System.out.println(sp.info.grade); // 2
//
//		EmployeeInfo ei = new EmployeeInfo(1);
//		EmployeePerson ep = new EmployeePerson(ei);
//		System.out.println(ep.info.rank);

	}

}
class Person<T, S> {
	public T info;
	public S id;

	Person(T info, S id) {
		this.info = info;
		this.id = id;
	}
}

class Person{
	public EmployeeInfo info;
	public int id;
}

class StudentInfo {
	public int grade;

	public StudentInfo(int grade) {
		this.grade = grade;
	}
}

//class StudentPerson {
//		public StudentInfo info;
//
//		public StudentPerson(StudentInfo info) {
//			this.info = info;
//	}
//}
class EmployeeInfo {
	public int rank;

	public EmployeeInfo(int rank) {
		this.rank = rank;
	}
}



//class EmployeePerson {
//		public EmployeeInfo info;
//
//		public EmployeePerson(EmployeeInfo info) {
//			this.info=info;
//		}
//	}
