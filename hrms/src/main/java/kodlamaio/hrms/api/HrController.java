package kodlamaio.hrms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.bussiness.abstracts.PositionService;
import kodlamaio.hrms.entities.concretes.Jop_Position;

@RestController 
@RequestMapping ("/api/jobpositions")

public class HrController {
	private PositionService positionService;
	
	@Autowired
	
	public HrController(PositionService positionService) {
	super();
	this.positionService=positionService;
	
	

}
	@GetMapping("getall")
	public List<Jop_Position> getAll(){
		
		
		return this.positionService.getAll();
	}

	
	
}
