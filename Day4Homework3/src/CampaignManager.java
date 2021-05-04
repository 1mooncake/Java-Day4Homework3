
public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName()+ " adl� kampanya i�in %"+campaign.getCampaignRate()+" oran�nda kapmanya eklendi");
		
	}

	@Override
	public void uptade(Campaign campaign) {
		System.out.println(campaign.getName()+ " adl� kampanya g�ncellendi.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName()+ " adl� kampanya silindi.");
		
	}

}
