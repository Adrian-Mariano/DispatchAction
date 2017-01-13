package form;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class PersonaForm extends ActionForm{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String apellido;
	private String nombre;
	
	public ActionErrors validate(ActionMapping mapping, HttpServletResponse reponse, HttpServletRequest request)	{		
		return null;
	}

	public void reset(ActionMapping mapping, HttpServletResponse reponse, HttpServletRequest request)	{		
		
	}
	
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
