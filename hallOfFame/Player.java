package hallOfFame;

import java.util.Arrays;
import java.util.List;

public class Player {
	private String name;
	private Team team;
	private HallOfFame hallOfFame;
	private Goals goals;
	
	public Player(String name, Team team){
		
		this.setTeam(team);
		this.setName(name);
	}
	public Player(String name, Team team, int goals){
		//this.setGoals(new Goals(this , goals));
		//this.setGoals(goals);
		this.setName(name);
		this.setTeam(team);
		//Player (name, team);
		this.setGoals(new Goals(this , goals));
		
	}
	
	

//	public Player(String name2, Team realMadrid, int goals2) {
//		// TODO Auto-generated constructor stub
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public int getGoals() {
		return goals.goals;
	}

	public void setGoals(Goals goals2) {
		this.goals = goals2;
	}
}
