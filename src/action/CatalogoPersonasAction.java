package action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Persona;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import form.PersonaForm;

public class CatalogoPersonasAction extends DispatchAction{
	public ActionForward listar(ActionMapping mapping,ActionForm form, HttpServletRequest request, HttpServletResponse response){
		//Recuperamos la lista de personas de la sesion si es que existe
		
		System.out.println("Entró a listar");
		HttpSession session = request.getSession();
		List<Persona> personas = (List<Persona>) session.getAttribute("personas");
		//agregamos la lista de personas a la sesion
		if(personas == null || personas.size() == 0 ){
			personas = new ArrayList<Persona>();
		}
		session.setAttribute("personas", personas);		
		
		return mapping.findForward("lista");
		
	}
	
	public ActionForward agregar(ActionMapping mapping,ActionForm form, HttpServletRequest request, HttpServletResponse response){
		//Aquí va la logica de este metodo
		
		System.out.println("Entró a agregar");
		//PersonaForm personaFormBean = (PersonaForm) form;		
		return mapping.findForward("agrega");
	}
	
	public ActionForward guardar(ActionMapping mapping,ActionForm form, HttpServletRequest request, HttpServletResponse response){
		
		//Aquí va la logica de este metodo
		//PersonaForm personaFormBean = (PersonaForm)  form;
		PersonaForm personaBean = (PersonaForm)  form;
		
		Persona p = new Persona();
		p.setNombre(personaBean.getNombre());
		p.setApellido(personaBean.getApellido());
		
		//Recuperamos la lista de la sesion y agregamos el nuevo eleemento
		HttpSession session = request.getSession();
		List<Persona> personas = (List<Persona>) session.getAttribute("personas");
		if(personas == null || personas.size() == 0 ){
			personas = new ArrayList<Persona>();
		}
		personas.add(p);
		
		session.setAttribute("personas", personas);
		
		return mapping.findForward("inicio");
	}
}
