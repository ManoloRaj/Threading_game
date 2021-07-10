package src.com.inata.carapp.graphique;

import src.com.inata.carapp.bo.Buggati;
import src.com.inata.carapp.bo.MyFirstThread;
import src.com.inata.carapp.bo.RenaultScenic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Application {
	
    public static void main(String[] a) {
    	
        final Buggati voitureSerge  = new Buggati();
        voitureSerge.setOwner("SERGE");
        
        final RenaultScenic voitureJoe = new RenaultScenic();
        voitureJoe.setOwner("JOE");
                                                             
        JFrame f = new JFrame();
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        
        CarPanel cp = new CarPanel();
        new Thread(()->{
            while(true){
                SwingUtilities.invokeLater(()->cp.repaint());
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        
        cp.getVgs().add(new VoitureGraphics(voitureJoe,10,10, 20, Color.BLUE));
        cp.getVgs().add(new VoitureGraphics(voitureSerge,10,40, 20, Color.PINK));
        f.setContentPane(cp);
        f.setSize(800,375);
        f.setVisible(true);


        voitureSerge.start();
        voitureJoe.start();

        MyFirstThread t1 = new MyFirstThread();
        	t1.setVoiture(voitureSerge);
        	t1.setCarPanel(cp);

        MyFirstThread t2 = new MyFirstThread();
        	t2.setVoiture(voitureJoe);
        	t2.setCarPanel(cp);

        t1.start();
        t2.start();


    }
}
