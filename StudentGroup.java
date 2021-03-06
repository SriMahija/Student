import java.util.Date;
import java.util.*;
/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	 LinkedList<Student> hm=new LinkedList<Student>();
	 
	public StudentGroup(int length) {
		this.students = new Student[length];
	}
	hm=Arrays.asList(students);
	int i;
	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		hm.set(0,students);
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		if(hm.contains(index)){
			return hm.get(index);
		}
		
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		hm.set(index,student);
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		hm.addFirst(student);
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		hm.addLast(student);
	}
	

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		hm.add(index,student);
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		hm.remove(index);
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		if(hm.contains(student)){
			ind=hm.indexOf(student);
			hm.remove(ind);
		}
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		Collections.sort(hm);
		
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		Iterator it=new Iterator(hm);
		while(it.hasNext()){
		if(hm.contains(student)){
			return it.next();
		}
		}
		return null;
	}
}
