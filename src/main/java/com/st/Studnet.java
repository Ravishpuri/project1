// POJO - Plain Old Java Object

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
@Table(name="student")
public class Studnet {
	
	// Data Member
	
	@Id 
	@Column(name="sid")
	private int studId;		// (Primary Key)
	
	@OneToOne
	@JoinColumn(name="addressId")
	
	private Address address;
	
	@Column(name="sname")
	private String studName;
	
	@Column(name="course")
	private String enrollCourse;
	
	private String studEmail;
	private String studContactNo;
	
	
	
}
