package dmacc;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.ArrayList;

import java.time.LocalTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dmacc.beans.Course;
import dmacc.beans.Schedule;

/**  
* Ezra DeCleene - ecdecleene  
* CIS175 22149
* Apr 30, 2024  
*/
class ScheduleTest {

	Course c1 = new Course(1, "Algebra", "12345", "Mr. Smith", 4.0, "A", "Math", LocalTime.now(), LocalTime.now(), "123", "In Progress");
	Course c2 = new Course(1, "Language Arts 9", "12345", "Mrs. Smith", 4.0, "A", "English", LocalTime.now(), LocalTime.now(), "123", "In Progress");
	List<Course> courses = new ArrayList<Course>() {{
		add(c1);
		add(c2);
	}};
	Schedule s = new Schedule(1, courses, "Student", "2000");
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testConstrucor() {
		assertEquals(s.getStudentName(), "Student");
		assertEquals(s.getYear(), "2000");
		assertEquals(s.getCourse(), courses);
	}

}
