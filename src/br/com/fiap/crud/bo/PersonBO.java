package br.com.fiap.crud.bo;

import java.util.List;

import br.com.fiap.crud.bean.PersonBean;
import br.com.fiap.crud.dao.PersonDAO;

public class PersonBO {

	public void create(PersonBean person) {
		PersonDAO personDAO = new PersonDAO();
		personDAO.create(person);
	}

	public List<PersonBean> readAll() {
		PersonDAO personDAO = new PersonDAO();
		return personDAO.readAll();
	}

	public void update(PersonBean person) {
		PersonDAO personDAO = new PersonDAO();
		personDAO.update(person);	
	}

	public void delete(PersonBean person) {
		PersonDAO personDAO = new PersonDAO();
		personDAO.delete(person);
	}
}
