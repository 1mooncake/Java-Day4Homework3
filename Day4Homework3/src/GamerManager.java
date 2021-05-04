
public class GamerManager implements GamerService{
	private ValidationManager validationManager;
	
	public GamerManager(ValidationManager validationManager) {
		this.validationManager = validationManager;
	}
	
	
	@Override
	public void register(Gamer gamer) {
		if(validationManager.control(gamer)==true) {
			System.out.println();System.out.println(
					gamer.getFirstName() + " " + gamer.getLastName() + " Kay�t ba�ar�yla tamamland�.");
		}else
			System.out.println(" Kay�t ba�ar�s�z.");
		
		
		
	}

	@Override
	public void uptade(Gamer gamer) {
		if(validationManager.control(gamer)==true) {
			System.out.println();System.out.println(
					gamer.getFirstName() + " " + gamer.getLastName() + " G�ncelleme ba�ar�yla tamamland�.");
		}else
			System.out.println(" G�ncelleme ba�ar�s�z.");
		
		
	}

	@Override
	public void delete(Gamer gamer) {
		if(validationManager.control(gamer)==true) {
			System.out.println();System.out.println(
					gamer.getFirstName() + " " + gamer.getLastName() + " Silme i�lemi ba�ar�yla tamamland�.");
		}else
			System.out.println(" Silme ba�ar�s�z.");
		
		
	}

}
