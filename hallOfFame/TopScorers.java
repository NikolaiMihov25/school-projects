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
		Player[] player = new Player[10];
		Player player1 = new Player("Cristiano Ronaldo", RealMadrid, 134);
		
		Player player2 = new Player("Lionel Messi", Barcelona, 118);
				
		Player player3 = new Player("Robert Lewandowski", BayernMunich, 71);
				
		Player player4 = new Player("Raul", RealMadrid, 71);
				
		Player player5 = new Player("Karim Benzema", RealMadrid, 69);
				
		Player player6 = new Player("Ruud Van Nistelrooy", ManU, 56);
				
		Player player7 = new Player("Thierry Henry", Arsenal, 50);
	
		Player player8 = new Player("Alfredo Di Stefano", RealMadrid, 49);
				
		Player player9 = new Player("Andriy Shevchenko", Milan, 48);
				
		Player player10 = new Player("Zlatan Ibrahimovic", PSG, 48);
				
		HallOfFame.players = Arrays.asList(player1, player2, player3, player4, player5, player6, player7, player8, player9, player10);
		System.out.println("Hall of fame of " + hallOfFame.name);
		for(Player players : hallOfFame.players) {
			System.out.println(players.getName() + " " +  players.getTeam().name + " " + players.getGoals());
		}
	}

}
