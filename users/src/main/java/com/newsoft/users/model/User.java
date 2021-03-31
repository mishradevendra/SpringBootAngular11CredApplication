package com.newsoft.users.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
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
	private Integer id;

	@Column(name = "first_name", nullable = false)
	@Length(min = 4, message = "*Your user name must have at least 5 characters")
	@NotEmpty(message = "*Please provide a user name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Email(message = "*Please provide a valid Email")
	@NotEmpty(message = "*Please provide an email")
	@Column(name = "email_id")
	private String emailId;

	@Column(name = "password")
	@Length(min = 4, message = "*Your password must have at least 5 characters")
	@NotEmpty(message = "*Please provide your password")
	private String password;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "dob")
	private Date dob;

	@NotNull(message = "*Please enter age")
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

	@Column(name = "active")
	private Boolean active;

	// @ManyToMany(cascade = CascadeType.MERGE)
	// @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"),
	// inverseJoinColumns = @JoinColumn(name = "role_id"))
	@ElementCollection
	private List<String> roles;

}
