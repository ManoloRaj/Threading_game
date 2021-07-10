package src.com.inata.carapp.test;

import src.com.inata.carapp.bo.Buggati;
import src.com.inata.carapp.bo.MyFirstThread;
import src.com.inata.carapp.bo.RenaultScenic;

public class TestCarrApp {

	public static void main(String[] args) {
		final Buggati voitureSerge  = new Buggati();
		voitureSerge.setOwner("SERGE");
		
		final RenaultScenic voitureJoe = new RenaultScenic();
		voitureJoe.setOwner("JOE");
		
		voitureSerge.start();
		voitureJoe.start();
		
		MyFirstThread t1 = new MyFirstThread();
		t1.setVoiture(voitureSerge);
		
		MyFirstThread t2 = new MyFirstThread();
		t2.setVoiture(voitureJoe);
		
		t1.start();
		t2.start();
	}

}
