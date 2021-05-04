
public class Main {

	public static void main(String[] args) {
		Game game1= new Game(1, "Dark Souls 3", 180, "Aksiyon Macera");
		Game game2= new Game(2, "Sekiro", 280, "Soulslike");
		
		Gamer gamer1=new Gamer(1, "Zkan", "Horseman", "11111111111");
		Gamer gamer2=new Gamer(2, "NotZkan", "NotHorseman", "11111111221");
		
		Campaign campaign1=new Campaign(1, "Minik indirim", 10);
		
		
		GamerManager gamerManager= new GamerManager(new ValidationManager());
		gamerManager.register(gamer1);
		gamerManager.uptade(gamer1);
		gamerManager.delete(gamer1);
		
		
		CampaignManager campaignManager=new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.delete(campaign1);
		campaignManager.uptade(campaign1);
		
	}

}
