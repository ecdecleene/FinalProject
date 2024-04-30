package dmacc.beans;

import java.time.LocalTime;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/**  
* Ezra DeCleene - ecdecleene  
* CIS175 22149
* Apr 6, 2024  
*/
@Entity
@Embeddable
public class Course {
	@Id
	@GeneratedValue
	private long id;
	String courseName;
	String courseNum;
	String teacherName;
	double gpa;
	String grade;
	String subject;
	LocalTime startTime;
	LocalTime endTime;
	String roomNum;
	String status;
	
	/**
	 * @param courseName
	 * @param courseNum
	 * @param teacherName
	 * @param gpa
	 * @param grade
	 * @param subject
	 * @param roomNum
	 */
	public Course(String courseName, String courseNum, String teacherName, double gpa, String grade, String subject,
			String roomNum) {
		super();
		this.courseName = courseName;
		this.courseNum = courseNum;
		this.teacherName = teacherName;
		this.gpa = gpa;
		this.grade = grade;
		this.subject = subject;
		this.roomNum = roomNum;
	}
	/**
	 * @param id
	 * @param courseName
	 * @param courseNum
	 * @param teacherName
	 * @param gpa
	 * @param grade
	 * @param subject
	 * @param startTime
	 * @param endTime
	 * @param roomNum
	 */
	public Course(long id, String courseName, String courseNum, String teacherName, double gpa, String grade,
			String subject, LocalTime startTime, LocalTime endTime, String roomNum) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.courseNum = courseNum;
		this.teacherName = teacherName;
		this.gpa = gpa;
		this.grade = grade;
		this.subject = subject;
		this.startTime = startTime;
		this.endTime = endTime;
		this.roomNum = roomNum;
	}
	/**
	 * @param courseName
	 * @param courseNum
	 * @param teacherName
	 * @param gpa
	 * @param grade
	 * @param subject
	 * @param startTime
	 * @param endTime
	 * @param roomNum
	 */
	public Course(String courseName, String courseNum, String teacherName, double gpa, String grade, String subject,
			LocalTime startTime, LocalTime endTime, String roomNum) {
		super();
		this.courseName = courseName;
		this.courseNum = courseNum;
		this.teacherName = teacherName;
		this.gpa = gpa;
		this.grade = grade;
		this.subject = subject;
		this.startTime = startTime;
		this.endTime = endTime;
		this.roomNum = roomNum;
	}
	/**
	 * @param courseName
	 * @param courseNum
	 * @param teacherName
	 * @param gpa
	 * @param grade
	 * @param subject
	 * @param roomNum
	 * @param status
	 */
	public Course(String courseName, String courseNum, String teacherName, double gpa, 
			String grade, String subject, String roomNum, String status) {
		super();
		this.courseName = courseName;
		this.courseNum = courseNum;
		this.teacherName = teacherName;
		this.gpa = gpa;
		this.grade = grade;
		this.subject = subject;
		this.roomNum = roomNum;
		this.status = status;
	}
	/**
	 * @param courseName
	 * @param courseNum
	 * @param teacherName
	 * @param gpa
	 * @param grade
	 * @param subject
	 * @param startTime
	 * @param endTime
	 * @param roomNum
	 * @param status
	 */
	public Course(String courseName, String courseNum, String teacherName, double gpa, String grade, String subject,
			LocalTime startTime, LocalTime endTime, String roomNum, String status) {
		super();
		this.courseName = courseName;
		this.courseNum = courseNum;
		this.teacherName = teacherName;
		this.gpa = gpa;
		this.grade = grade;
		this.subject = subject;
		this.startTime = startTime;
		this.endTime = endTime;
		this.roomNum = roomNum;
		this.status = status;
	}
	/**
	 * 
	 */
	public Course() {
		super();
	}
	/**
	 * @param id
	 * @param courseName
	 * @param courseNum
	 * @param teacherName
	 * @param gpa
	 * @param grade
	 * @param subject
	 * @param startTime
	 * @param endTime
	 * @param roomNum
	 * @param status
	 */
	public Course(long id, String courseName, String courseNum, String teacherName, double gpa, String grade,
			String subject, LocalTime startTime, LocalTime endTime, String roomNum, String status) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.courseNum = courseNum;
		this.teacherName = teacherName;
		this.gpa = gpa;
		this.grade = grade;
		this.subject = subject;
		this.startTime = startTime;
		this.endTime = endTime;
		this.roomNum = roomNum;
		this.status = status;
	}
	/**
	 * @return the courseName
	 */
	public String getCourseName() {
		return courseName;
	}
	/**
	 * @param courseName the courseName to set
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	/**
	 * @return the courseNum
	 */
	public String getCourseNum() {
		return courseNum;
	}
	/**
	 * @param courseNum the courseNum to set
	 */
	public void setCourseNum(String courseNum) {
		this.courseNum = courseNum;
	}
	/**
	 * @return the teacherName
	 */
	public String getTeacherName() {
		return teacherName;
	}
	/**
	 * @param teacherName the teacherName to set
	 */
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	/**
	 * @return the gpa
	 */
	public double getGpa() {
		return gpa;
	}
	/**
	 * @param gpa the gpa to set
	 */
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	/**
	 * @return the grade
	 */
	public String getGrade() {
		return grade;
	}
	/**
	 * @param grade the grade to set
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}
	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}
	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}
	/**
	 * @return the startTime
	 */
	public LocalTime getStartTime() {
		return startTime;
	}
	/**
	 * @param startTime the startTime to set
	 */
	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}
	/**
	 * @return the endTime
	 */
	public LocalTime getEndTime() {
		return endTime;
	}
	/**
	 * @param endTime the endTime to set
	 */
	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}
	/**
	 * @return the roomNum
	 */
	public String getRoomNum() {
		return roomNum;
	}
	/**
	 * @param roomNum the roomNum to set
	 */
	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
}
