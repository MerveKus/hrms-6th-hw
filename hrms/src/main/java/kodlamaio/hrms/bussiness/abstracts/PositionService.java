package kodlamaio.hrms.bussiness.abstracts;

import java.util.List;

import kodlamaio.hrms.entities.concretes.Jop_Position;

public interface PositionService {
	List<Jop_Position> getAll();
}
