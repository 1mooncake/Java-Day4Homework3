
public class ValidationManager implements ValidationService{

	@Override
	public boolean control(Gamer gamer) {
		if (gamer.getTc().length()== 11) {	
			System.out.println("Kimlik doðrulamasý baþarýyla gerçekleþtirildi");
			return true;
		}else {
			System.out.println("Kimlik doðrulamasý baþarýsýz. Lütfen 11 haneli tc kimlik no giriniz...");
			return false;
		}
		
		
	}

}
