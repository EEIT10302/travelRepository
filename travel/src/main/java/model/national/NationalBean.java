package model.national;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="National")
public class NationalBean {
	@Id
	@Column(columnDefinition="char(2)")
	private String National_id;
	@Column(columnDefinition="varchar(50)")
	private String National_name_e;
	@Column(columnDefinition="nvarchar(50)")
	private String National_name;
	public NationalBean(String national_id, String national_name_e, String national_name) {
		super();
		National_id = national_id;
		National_name_e = national_name_e;
		National_name = national_name;
	}
	public NationalBean() { }
	@Override
	public String toString() {
		return "NationalBean [National_id=" + National_id + ", National_name_e=" + National_name_e + ", National_name="
				+ National_name + "]";
	}
	public String getNational_id() {
		return National_id;
	}
	public void setNational_id(String national_id) {
		National_id = national_id;
	}
	public String getNational_name_e() {
		return National_name_e;
	}
	public void setNational_name_e(String national_name_e) {
		National_name_e = national_name_e;
	}
	public String getNational_name() {
		return National_name;
	}
	public void setNational_name(String national_name) {
		National_name = national_name;
	}
	
}
