package dmacc;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dmacc.beans.Course;

/**  
* Ezra DeCleene - ecdecleene  
* CIS175 22149
* Apr 30, 2024  
*/
class CourseTest {

	Course course = new Course(1, "Algebra", "12345", "Mr. Smith", 4.0, "A", "Math", LocalTime.now(), LocalTime.now(), "123", "In Progress");
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testConstructor() {
		assertEquals(course.getCourseName(), "Algebra");
		assertEquals(course.getCourseNum(), "12345");
		assertEquals(course.getTeacherName(), "Mr. Smith");
		assertEquals(course.getGpa(), 4.0);
		assertEquals(course.getGrade(), "A");
		assertEquals(course.getSubject(), "Math");
		assertEquals(course.getRoomNum(), "123");
		assertEquals(course.getStatus(), "In Progress");
	}

}
