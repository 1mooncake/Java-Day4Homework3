
public class Campaign {
	int id;
	String name;
	int campaignRate;
	
	public Campaign(int id, String name, int campaignRate) {
		super();
		this.id = id;
		this.name = name;
		this.campaignRate = campaignRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCampaignRate() {
		return campaignRate;
	}

	public void setCampaignRate(int campaignRate) {
		this.campaignRate = campaignRate;
	}
	

}
