package com.graphic;

import javax.swing.JFrame;

import javax.swing.JFrame;

public class WelcomeFrame extends JFrame{
 
	public WelcomeFrame(){
		super();
 
		build();
	}
 
	private void build(){
		setTitle("Threading game"); 
		setSize(600,500); 
		setLocationRelativeTo(null);
		setResizable(true); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setVisible(true);
	}
}