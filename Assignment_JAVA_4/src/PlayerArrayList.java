import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Player{
	
	public String name;
	int runs;
	int wickets;
	int matches;
	String country;
	int century;
	String category;
	
	Player(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Player Name");
		this.name = s.next();
		System.out.println("Enter Player runs");
		this.runs = s.nextInt();
		System.out.println("Enter Player wickets");
		this.wickets = s.nextInt();
		System.out.println("Enter Player matches");
		this.matches = s.nextInt();
		System.out.println("Enter Player country");
		this.country = s.next();
		System.out.println("Enter number of centuries");
		this.century = s.nextInt();
		System.out.println("Enter Player category");
		this.category = s.next();
		
	}
	void display() {
		System.out.println("Name : " + name);
		System.out.println("Runs : " + runs);
		System.out.println("Wickets : " + wickets);
		System.out.println("Matches : " + matches);
		System.out.println("Country : " + country);
		System.out.println("No of Centuries : " + century);
		System.out.println("Category : " + category);
	}
	String getName() {
		return this.name;
	}
	
}

class PlayerManagement  {
	static void addPlayers(ArrayList<Player>players) {
		
		Player pl = new Player();
		players.add(pl);
		
	}
	static void displayPlayer(ArrayList <Player> players) {
		
		for(Player p : players) {
			p.display();
		}
		
	}
	static void maxScorer(ArrayList<Player> players) {
		int max = 0 ;
		for(Player p : players) {
			if(p.runs > max) {
				max = p.runs;
			}
		}
		for(Player p : players) {
			if(max == p.runs) {
				p.display();
			}
		}
		
	}
	static void sortPlayers(ArrayList<Player> players) {
		SortByName sn = new SortByName();
		Collections.sort(players,sn);
	}
	static void removePlayer(ArrayList<Player> players) {
		for(int i = 0; i < players.size();i++) {
			if(players.get(i).runs < 100 ) {
				players.remove(i);
			}
		}
	}
	static void updgradePlayers(ArrayList<Player> players) {
		for(int i = 0; i < players.size();i++) {
			if(players.get(i).century >= 10) {
				players.get(i).category = "A";
			}
			else {
				players.get(i).category = "B";
			}
		}
	}
}


public class PlayerArrayList {

	public static void main(String[] args) {
		
		int token = 0;
		ArrayList <Player> players = new ArrayList<>();
		while(token == 0) {
			System.out.println("Choose options -  1 : Add players  , 2 : display Players, 3 : Max Scorer , 4 : Sort by name, 5 : exit");
			Scanner s = new Scanner(System.in);
			int inp = s.nextInt() ;
			if(inp == 1) {
				PlayerManagement.addPlayers(players); 
			}
			else if (inp == 2) {
				PlayerManagement.displayPlayer(players);
			}
			else if(inp == 3) {
				PlayerManagement.maxScorer(players);
			}
			else if(inp == 4) {
				PlayerManagement.sortPlayers(players);
			}
			
			else if(inp == 5 ) {
				token =1;
			}
			
		}
		
			
		
	}

	
	
	
}
