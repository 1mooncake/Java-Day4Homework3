
public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName()+ " adlý kampanya için %"+campaign.getCampaignRate()+" oranýnda kapmanya eklendi");
		
	}

	@Override
	public void uptade(Campaign campaign) {
		System.out.println(campaign.getName()+ " adlý kampanya güncellendi.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName()+ " adlý kampanya silindi.");
		
	}

}
