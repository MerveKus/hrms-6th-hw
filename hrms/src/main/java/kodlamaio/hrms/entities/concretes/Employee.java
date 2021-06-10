package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="employers")

public class Employee extends User{
	
	
	@NonNull
	@Column(name="name")
	private String name;
	
	@NonNull
	@Column(name="last_name")
	private String lastName;
	
	@NonNull
	@Column(name="national_identity_number")
	private String natinaolIdentityNumber;
	

	

	
	

}
