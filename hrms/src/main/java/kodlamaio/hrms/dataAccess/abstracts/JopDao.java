package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.Jop_Position;

public interface JopDao extends JpaRepository<Jop_Position,Integer>{

}
