package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Course;

/**  
* Ezra DeCleene - ecdecleene  
* CIS175 22149
* Apr 6, 2024  
*/
@Repository
public interface CourseRepo extends JpaRepository<Course, Long> {

}
