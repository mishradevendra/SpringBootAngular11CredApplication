package com.newsoft.users.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "first_name", nullable = false)
	@NotEmpty
	@Size(min = 2, message = "First Name should have at least 2 characters")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;
	
	@SuppressWarnings("deprecation")
	@NotEmpty(message = "Email must not be empty or null")
	@Email(message = "Email should be a valid email")
	@Column(name = "email_id")
	private String emailId;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "dob")
	private Date dob;

	@NotNull(message = "Please enter age")
	@Column(name = "AGE")
	private Integer age;

	@Column(name = "gender")
	private String gender;

	@Column(name = "join_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date joinDate;

	@NotNull(message = "Mobile no must have 10 digit")
	@Column(name = "mobil_no")
	private Long mobileNo;

	@Column(name = "street")
	private String street;

	@Column(name = "city")
	private String city;

	@Column(name = "state")
	private String state;

	@Column(name = "pin_code")
	@NotNull(message = "PinCode must not be empty or null")
	private Integer pinCode;

	@Column(name = "country")
	private String country;

}
