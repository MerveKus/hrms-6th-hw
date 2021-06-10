package kodlamaio.hrms.bussiness.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kodlamaio.hrms.bussiness.abstracts.PositionService;
import kodlamaio.hrms.dataAccess.abstracts.JopDao;
import kodlamaio.hrms.entities.concretes.Jop_Position;

public class PositionManager implements  PositionService
{

		private JopDao jopDao;
		
		@Autowired
		public PositionManager (JopDao jopDao) {
			super();
			this.jopDao =jopDao;
		}
		
	@Override
	public List<Jop_Position> getAll() {
		// TODO Auto-generated method stub
		return this.jopDao.findAll();
	}

}
