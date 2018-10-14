/**
 * 
 */
package co.com.taller1.backend.models.output;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import co.com.taller1.backend.models.ExecServicio;

/**
 * @author drache
 *
 */
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListarResponse<T extends Serializable> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ExecServicio execServicio;
	private List<T> list;

	/**
	 * @return the execServicio
	 */
	public ExecServicio getExecServicio() {
		return execServicio;
	}

	/**
	 * @param execServicio
	 *            the execServicio to set
	 */
	public void setExecServicio(ExecServicio execServicio) {
		this.execServicio = execServicio;
	}

	/**
	 * @return the list
	 */
	public List<T> getList() {
		return list;
	}

	/**
	 * @param list
	 *            the list to set
	 */
	public void setList(List<T> list) {
		this.list = list;
	}
}
