package com.test;

import com.pojo.Person;

public interface Service {
	void addPerson(Person person);
	void delPerson(Integer id);
	void updPerson(Person person);
}
