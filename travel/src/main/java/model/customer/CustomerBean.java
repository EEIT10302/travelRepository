package model.customer;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Customer")
public class CustomerBean {
	
	@Id
	@Column(columnDefinition="char(10)")
	private String Customer_id;
	@Column(columnDefinition="varchar(50)")
	private String Customer_lastName;
	@Column(columnDefinition="varchar(50)")
	private String Customer_firstName;
	@Column(columnDefinition="varchar(20)")
	private String Customer_password;	
	@Column(columnDefinition="varchar(50)")
	private String Customer_phone;
	private Boolean Customer_gender;
	private Date Customer_birthday;
	@Column(columnDefinition="varchar(100)")
	private String Customer_email;
	private Date Customer_date;
	
	@Override
	public String toString() {
		return "CustomerBean [Customer_id=" + Customer_id + ", Customer_lastName=" + Customer_lastName
				+ ", Customer_firstName=" + Customer_firstName + ", Customer_password=" + Customer_password
				+ ", Customer_phone=" + Customer_phone + ", Customer_gender=" + Customer_gender + ", Customer_birthday="
				+ Customer_birthday + ", Customer_email=" + Customer_email + ", Customer_date=" + Customer_date + "]";
	}

	public CustomerBean() {}

	public CustomerBean(String customer_id, String customer_lastName, String customer_firstName,
			String customer_password, String customer_phone, Boolean customer_gender, Date customer_birthday,
			String customer_email, Date customer_date) {
		super();
		Customer_id = customer_id;
		Customer_lastName = customer_lastName;
		Customer_firstName = customer_firstName;
		Customer_password = customer_password;
		Customer_phone = customer_phone;
		Customer_gender = customer_gender;
		Customer_birthday = customer_birthday;
		Customer_email = customer_email;
		Customer_date = customer_date;
	}

	public String getCustomer_id() {
		return Customer_id;
	}

	public void setCustomer_id(String customer_id) {
		Customer_id = customer_id;
	}

	public String getCustomer_lastName() {
		return Customer_lastName;
	}

	public void setCustomer_lastName(String customer_lastName) {
		Customer_lastName = customer_lastName;
	}

	public String getCustomer_firstName() {
		return Customer_firstName;
	}

	public void setCustomer_firstName(String customer_firstName) {
		Customer_firstName = customer_firstName;
	}

	public String getCustomer_password() {
		return Customer_password;
	}

	public void setCustomer_password(String customer_password) {
		Customer_password = customer_password;
	}

	public String getCustomer_phone() {
		return Customer_phone;
	}

	public void setCustomer_phone(String customer_phone) {
		Customer_phone = customer_phone;
	}

	public Boolean getCustomer_gender() {
		return Customer_gender;
	}

	public void setCustomer_gender(Boolean customer_gender) {
		Customer_gender = customer_gender;
	}

	public Date getCustomer_birthday() {
		return Customer_birthday;
	}

	public void setCustomer_birthday(Date customer_birthday) {
		Customer_birthday = customer_birthday;
	}

	public String getCustomer_email() {
		return Customer_email;
	}

	public void setCustomer_email(String customer_email) {
		Customer_email = customer_email;
	}

	public Date getCustomer_date() {
		return Customer_date;
	}

	public void setCustomer_date(Date customer_date) {
		Customer_date = customer_date;
	}

}
