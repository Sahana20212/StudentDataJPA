package com.ecomm.studajp.entity;

import org.hibernate.annotations.Columns;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder//To Add the bulider patretten, to my entity over here.
@Table(name="student")
public class Student {
	@Id
	 @Column(name="student_id")
	private long student_id;
	@Column(name="student_firstname")
	private String student_firstname;
	@Column(name="student_lastname")
	private String student_lastname;
	@Column(name="student_emailid")
	private String student_emailid;
	@Column(name="gurdian_name")
	private String gurdian_name;
	@Column(name="gurdian_email")
	private String gurdian_email;
	@Column(name="gurdian_mobile")
	private String gurdianmobile;
	
	

}
