package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="employees")


public class Employer extends User{
	
	@NonNull
	@Column(name="company_name")
	private int companyName;
	

	@NonNull
	@Column(name="web_site")
	private int webSite;
	
	
	@NonNull
	@Column(name="mail_address")
	private int mailAddress;
	
	@NonNull
	@Column(name="telephone")
	private int telephone;
	
	
	

}
