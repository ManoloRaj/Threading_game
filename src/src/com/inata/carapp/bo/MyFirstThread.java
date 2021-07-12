package src.com.inata.carapp.bo;

import src.com.inata.carapp.graphique.CarPanel;

import javax.swing.*;
import java.lang.reflect.InvocationTargetException;

/**
 * Thread pour lancer les voitures
 * @author ManoloRaj
 *
 */
public class MyFirstThread extends Thread {
	private Voiture voiture;
	private CarPanel carPanel;
	
	@Override
	
	public void run() {
		
		while(voiture.getCompteur() <= .4){
			voiture.accelerate();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		while(voiture.currentSpeed() > 0 ){
			voiture.applyBreak();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		voiture.stop();
	}
	public void setVoiture(Voiture voiture) {
		this.voiture = voiture;
	}

	public void setCarPanel(CarPanel carPanel) {
		this.carPanel = carPanel;
	}
}
