package src.com.inata.carapp.bo;

public class Voiture implements IVoiture{
	private String marque;
	protected String color;
	protected double vitesse;
	public boolean started;
	private String owner;
	private double compteur;

	public Voiture(){
	}


	@Override
	public void start() {
		started = true;
	}

	@Override
	public void stop() {
		started = false;// TODO Auto-generated method stub

	}

	@Override
	public double accelerate() {
		return vitesse;
	}

	@Override
	public double applyBreak() {
		return vitesse;
	}


	@Override
	public double currentSpeed() {
		return vitesse;
	}


	public boolean isStarted() {
		return started;
	}


	public void setStarted(boolean started) {
		this.started = started;
	}


	public String getOwner() {
		return owner;
	}


	public void setOwner(String owner) {
		this.owner = owner;
	}

	public synchronized double getCompteur() {
		return compteur;
	}

	public  synchronized void setCompteur(double compteur) {
		this.compteur = compteur;
	}
}
