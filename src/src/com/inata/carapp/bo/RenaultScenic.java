package src.com.inata.carapp.bo;

public class RenaultScenic extends Voiture{
	
	@Override
	public double accelerate() {
		if(isStarted()){
			vitesse += 1;
		}
		if(vitesse >180){
			vitesse = 180;
		}
		return vitesse;
	}

	@Override
	public double applyBreak() {
		if(isStarted()){
			vitesse -= 10;
		}
		
		if(vitesse <0){
			vitesse = 0d;
		}
		return vitesse;
	}

}
