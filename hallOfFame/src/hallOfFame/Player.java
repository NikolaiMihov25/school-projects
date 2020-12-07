package hallOfFame;

import java.util.Arrays;
import java.util.List;

public class Player {
	String name;
	Team team;
	HallOfFame hallOfFame;
	Goals goals;
	
	Player(){
		goals = new Goals(this , 132) 	;
	}
}
