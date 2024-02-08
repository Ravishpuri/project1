package com.st;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="Address")
public class Address {
	// Data Member of Address Entity Class
	
	@Id
	@Column(name = "addressId")
	private int addressId;		// FK(foreign key)
	
	@Column(name="stud_Hno")
	private String houseNo;
	
	@Column(name="stud_Sno")
	private String streetNo;
	
	@Column(name="stud_City")
	private String cityName;
	
	@Column(name="stud_State")
	private String stateName;
	
	@Column(name="ZIP")
	private int zipCode;

}
