package model.sight_type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Sight_Type")
public class SightTypeBean {
	@Id
	@Column(columnDefinition="char(4)")
	private String Sight_type_id;
	@Column(columnDefinition="nvarchar(10)")
	private String Sight_type_name;
	
	public String getSight_type_id() {
		return Sight_type_id;
	}
	public void setSight_type_id(String sight_type_id) {
		Sight_type_id = sight_type_id;
	}
	public String getSight_type_name() {
		return Sight_type_name;
	}
	public void setSight_type_name(String sight_type_name) {
		Sight_type_name = sight_type_name;
	}
	
	
}
