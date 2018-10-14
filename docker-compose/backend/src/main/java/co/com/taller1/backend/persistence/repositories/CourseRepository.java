/**
 * 
 */
package co.com.taller1.backend.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.taller1.backend.persistence.models.Course;

/**
 * @author drache
 *
 */
public interface CourseRepository extends JpaRepository<Course, Long>{

}
