
public class ValidationManager implements ValidationService{

	@Override
	public boolean control(Gamer gamer) {
		if (gamer.getTc().length()== 11) {	
			System.out.println("Kimlik do�rulamas� ba�ar�yla ger�ekle�tirildi");
			return true;
		}else {
			System.out.println("Kimlik do�rulamas� ba�ar�s�z. L�tfen 11 haneli tc kimlik no giriniz...");
			return false;
		}
		
		
	}

}
