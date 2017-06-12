package br.com.fiap.crud.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.crud.bean.PersonBean;

public class PersonDAO {
	List<PersonBean> listPerson = new ArrayList<PersonBean>();	
	
	public void create(PersonBean person) {
		listPerson.add(person);		
	}

	public List<PersonBean> readAll() {		
		return listPerson;
	}

	public void update(PersonBean person) {
		int index = 0;
		
		if (!listPerson.isEmpty()) {
			for (PersonBean personBean : listPerson) {
				if (person.getName() == personBean.getName()) {
					listPerson.add(index, person);
				}
				
				index++;
			}
		}		
	}

	public void delete(PersonBean person) {
		//int index = 0;
		
		if (!listPerson.isEmpty()) {
			for (PersonBean personBean : listPerson) {
				if (person.getName() == personBean.getName()) {
					listPerson.remove(person);
				}
				
				//index++;
			}
		}
	}
}
