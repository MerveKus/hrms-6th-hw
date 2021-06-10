package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="user")


public class User {
	@GeneratedValue
	@Column (name="id")
	private int id;
	
	@Column (name= "email")
	private String email;
	
	@Column (name="password")
	private String password;
	

}
