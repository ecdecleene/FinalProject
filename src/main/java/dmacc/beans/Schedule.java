package dmacc.beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/**  
* Ezra DeCleene - ecdecleene  
* CIS175 22149
* Apr 6, 2024
*/
@Entity
public class Schedule {
	@Id
	@GeneratedValue
	private long id;
	String studentName;
	String year;
	@Autowired
	List<Course> courses;
	
	/**
	 * 
	 */
	public Schedule() {
		super();
	}
	/**
	 * @param courses
	 * @param studentName
	 * @param year
	 */
	public Schedule(List<Course> courses, String studentName, String year) {
		super();
		this.courses = courses;
		this.studentName = studentName;
		this.year = year;
	}
	/**
	 * @param id
	 * @param course
	 * @param studentName
	 * @param year
	 */
	public Schedule(long id, List<Course> courses, String studentName, String year) {
		super();
		this.id = id;
		this.courses = courses;
		this.studentName = studentName;
		this.year = year;
	}
	/**
	 * @return the course
	 */
	public List<Course> getCourse() {
		return courses;
	}
	/**
	 * @param course the course to set
	 */
	public void setCourse(List<Course> courses) {
		this.courses = courses;
	}
	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}
	/**
	 * @param studentName the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	/**
	 * @return the year
	 */
	public String getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(String year) {
		this.year = year;
	}
}
