package com.poc.entity;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(schema = "public", name="customer")
public class CustomerEntity {
	
	@Id
	/*@GeneratedValue(generator="increment")
	@GenericGenerator(name="increment",strategy="increment")*/
	@SequenceGenerator(name="pk_sequence_categoryid",sequenceName="customer_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="pk_sequence_categoryid")
	@Column(name="id")
	Integer id;
	@Column(name="name")
	String name;
	@Column(name="address")
	String address;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "CustomerEntity [id=" + id + ", name=" + name + ", address="
				+ address + "]";
	}
	
	

}
