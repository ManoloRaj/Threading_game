package src.com.inata.carapp.graphique;

import src.com.inata.carapp.bo.Voiture;

import java.awt.*;
import java.util.Calendar;

public class VoitureGraphics {
	
    private Voiture voiture;
    private int x,y;
    private int size = 20;
    private Color color;
    private long lastPaint;

    public VoitureGraphics(Voiture voiture, int x, int y, int size, Color color) {
        this.voiture = voiture;
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
    }

    public Voiture getVoiture() {
        return voiture;
    }

    public void setVoiture(Voiture voiture) {
        this.voiture = voiture;
    }

    /**
     *
     */
    public void updatePosition(){
        if(voiture.isStarted()){
            //prendre la vitesse;
            long time = 0;
            if(lastPaint == 0){
                lastPaint = System.currentTimeMillis();
            }
            else {
                long now = System.currentTimeMillis();
                time  = now - lastPaint;
                lastPaint = now;
            }
            if(time != 0) {
                System.out.println(time);
                Double d = voiture.currentSpeed() * (time/ 3.6E06); //en km
                voiture.setCompteur(voiture.getCompteur()+d);
                System.out.println(voiture.getOwner()+voiture.getCompteur());
                //echelle 1km = 1000px
                d = voiture.getCompteur()*1000;
                x = d.intValue();
            }
        }
    }

    public void paint(Graphics2D g){
        g.setColor(color);
        g.fillOval(x, y, size, size);
    }
}
