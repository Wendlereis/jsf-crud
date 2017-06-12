package br.com.fiap.crud.managedbean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.fiap.crud.bean.PersonBean;
import br.com.fiap.crud.bo.PersonBO;

@ManagedBean
@SessionScoped
public class PersonMB {
	PersonBean person = new PersonBean();
	List<PersonBean> listPerson = new ArrayList<PersonBean>();

	public List<PersonBean> getListPerson() {
		PersonBO personBO = new PersonBO();
		return listPerson = personBO.readAll();
	}

	public void setListPerson(List<PersonBean> listPerson) {
		this.listPerson = listPerson;
	}

	public PersonBean getPerson() {
		return person;
	}

	public void setPerson(PersonBean person) {
		this.person = person;
	}
	
	public String createController(){
		PersonBO personBO = new PersonBO();
		personBO.create(person);
		
		return "create";
	}
	
	public String readAllController() {
		PersonBO personBO = new PersonBO();
		listPerson = personBO.readAll();
		
		return "read";
	}
	
	public String updateController(PersonBean person) {
		PersonBO personBO = new PersonBO();
		personBO.update(person);
		
		return "update";
	}
	
	public String deleteController(PersonBean person) {
		PersonBO personBO = new PersonBO();
		personBO.delete(person);
		
		return "delete";
	}
}
