package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Schedule;

/**  
* Ezra DeCleene - ecdecleene  
* CIS175 22149
* Apr 21, 2024  
*/
@Repository
public interface ScheduleRepo extends JpaRepository<Schedule, Long> {

}
