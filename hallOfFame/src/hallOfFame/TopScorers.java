package hallOfFame;

import java.util.Arrays;

public class TopScorers {

	public static void main(String[] args) {
		HallOfFame hallOfFame = new HallOfFame();
		hallOfFame.name="Top Scorers";
			//creating teams
		Team Barcelona = new Team();
		Barcelona.name = "Barcelona";
		Team RealMadrid = new Team();
		RealMadrid.name = "Real Madrid";
		Team BayernMunich = new Team();
		BayernMunich.name = "Bayern Munich";
		Team ManU = new Team();
		ManU.name = "Manchester United";
		Team Arsenal = new Team();
		Arsenal.name = "Arsenal";
		Team Milan = new Team();
		Milan.name = " AC Milan";
		Team PSG = new Team();
		PSG.name = "Paris-Saint Germain";
	
			//creating players
		Player player1 = new Player();
		player1.team = RealMadrid;
		player1.name = "Cristiano Ronaldo";
		
		Player player2 = new Player();
		player2.team = Barcelona;
		player2.name = "Lionel Messi";
		
		Player player3 = new Player();
		player3.team = BayernMunich;
		player3.name = "Robert Lewandowski";
		
		Player player4 = new Player();
		player4.team = RealMadrid;
		player4.name = "Raul";
		
		Player player5 = new Player();
		player5.team = RealMadrid;
		player5.name = "Karim Benzema";
		
		Player player6 = new Player();
		player6.team = ManU;
		player6.name = "Ruud Van Nistelrooy";
		
		Player player7 = new Player();
		player7.team = Arsenal;
		player7.name = "Thierry Henry";
		
		Player player8 = new Player();
		player8.team = RealMadrid;
		player8.name = "Alfredo Di Stefano";
		
		Player player9 = new Player();
		player9.team = Milan;
		player9.name = "Andriy Shevchenko";
		
		Player player10 = new Player();
		player10.team = PSG;
		player10.name = "Zlatan Ibrahimovic";
		
		HallOfFame.players = Arrays.asList(player1, player2, player3, player4, player5, player6, player7, player8, player9, player10);
		System.out.println("Hall of fame of " + hallOfFame.name);
		for(Player players : hallOfFame.players) {
			System.out.println(players.name + " " +  players.team.name);
		}
	}

}
