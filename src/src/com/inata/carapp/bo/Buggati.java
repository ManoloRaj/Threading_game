package src.com.inata.carapp.bo;

public class Buggati extends Voiture{
	
	@Override
	public double accelerate() {
		
		if(isStarted()){
			vitesse += 5;
		}
		if(vitesse >440){
			vitesse = 440;
		}
		return vitesse;
	}

	@Override
	public double applyBreak() {
		if(isStarted()){
			vitesse -= 20;
		}
		
		if(vitesse <0){
			vitesse = 0d;
		}
		return vitesse;
	}

}
