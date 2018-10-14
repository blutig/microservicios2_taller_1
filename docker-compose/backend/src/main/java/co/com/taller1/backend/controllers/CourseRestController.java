/**
 * 
 */
package co.com.taller1.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import co.com.taller1.backend.models.ExecServicio;
import co.com.taller1.backend.models.output.ListarResponse;
import co.com.taller1.backend.persistence.models.Course;
import co.com.taller1.backend.persistence.repositories.CourseRepository;

/**
 * @author drache
 *
 */
@RestController
@RequestMapping(value = "/rest/course", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class CourseRestController {

	@Autowired
	private CourseRepository courseRepository;

	@RequestMapping(value = "/list")
	public @ResponseBody ListarResponse<Course> creacionContenidoPortal() {
		ListarResponse<Course> listarResponse = new ListarResponse<>();
		try {
			List<Course> categoriasSaved = courseRepository.findAll();
			listarResponse.setList(categoriasSaved);

		} catch (Exception e) {
			ExecServicio execServicio = new ExecServicio();
			execServicio.setCodigo(e.getClass().toString());
			execServicio.setMensajeError(e.getMessage());
			listarResponse.setExecServicio(execServicio);
		}
		return listarResponse;
	}
}
