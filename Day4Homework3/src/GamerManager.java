
public class GamerManager implements GamerService{
	private ValidationManager validationManager;
	
	public GamerManager(ValidationManager validationManager) {
		this.validationManager = validationManager;
	}
	
	
	@Override
	public void register(Gamer gamer) {
		if(validationManager.control(gamer)==true) {
			System.out.println();System.out.println(
					gamer.getFirstName() + " " + gamer.getLastName() + " Kayýt baþarýyla tamamlandý.");
		}else
			System.out.println(" Kayýt baþarýsýz.");
		
		
		
	}

	@Override
	public void uptade(Gamer gamer) {
		if(validationManager.control(gamer)==true) {
			System.out.println();System.out.println(
					gamer.getFirstName() + " " + gamer.getLastName() + " Güncelleme baþarýyla tamamlandý.");
		}else
			System.out.println(" Güncelleme baþarýsýz.");
		
		
	}

	@Override
	public void delete(Gamer gamer) {
		if(validationManager.control(gamer)==true) {
			System.out.println();System.out.println(
					gamer.getFirstName() + " " + gamer.getLastName() + " Silme iþlemi baþarýyla tamamlandý.");
		}else
			System.out.println(" Silme baþarýsýz.");
		
		
	}

}
