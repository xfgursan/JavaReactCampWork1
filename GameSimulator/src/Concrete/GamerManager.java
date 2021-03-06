package Concrete;

import Abstract.GamerCheckService;
import Abstract.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService {
	
	private GamerCheckService gamerCheckService;
	
	public GamerManager(GamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void add(Gamer gamer) {
		if(gamerCheckService.CheckIfRealPerson(gamer)) {
			System.out.println("Verified user: " +gamer.getFirstName());
		}else {
			System.out.println("not valid person");
		}
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("User uppdated : " + gamer.getFirstName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		
		System.out.println("User deleted : " + gamer.getFirstName());
	}

}
