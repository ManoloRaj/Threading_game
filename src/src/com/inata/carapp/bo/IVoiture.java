package src.com.inata.carapp.bo;

/**
 * modelise une voiture
 * @author ManoloRaj
 *
 */
public interface IVoiture {
	/**
	 * Démarre la voiture
	 */
	public void start();
	
	/**
	 * Arrete la voiture
	 */
	public void stop();
	
	/**
	 * Accélere la voiture
	 * @return la vitesse après accélération
	 */
	public double accelerate();
	
	/**
	 * Freine
	 * @return la vitesse après freinage
	 */
	public double applyBreak();
	
	/**
	 * Vitesse actuel
	 * @return
	 */
	public double currentSpeed();
}
