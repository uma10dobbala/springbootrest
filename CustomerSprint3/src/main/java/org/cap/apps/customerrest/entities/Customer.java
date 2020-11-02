package org.cap.apps.customerrest.entities;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "customers")
@Entity
public class Customer {

	@GeneratedValue
	@Id
	private Integer id;
	
	private String name;
	
	private Integer age;
	
	public Customer() {
		
	}
	
	public Customer(String name, Integer age){
		this.name=name;
		this.name=name;
	}
	
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public int hashCode() {
		int hash=Objects.hashCode(id);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer that = (Customer) obj;
		if (this.id != that.id)
			return false;
		return true;
	}
}
