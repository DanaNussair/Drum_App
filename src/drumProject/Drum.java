package drumProject;

import javax.sound.sampled.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.swing.*;

public class Drum extends JPanel implements ActionListener, ItemListener
{
	JButton B[];
	JButton Browse;
	JButton bt1;
	JFileChooser filechooser;
	JTextField T;
	Clip clip;
	Clip clipR;
	AudioInputStream audioIn;
	AudioInputStream audioInR;
	
	JRadioButton R[];


	public Drum()
	{      
      setLayout(new FlowLayout());
      B = new JButton[5];
      for(int i=0; i < 5; i++)
      {
		  B[i] = new JButton();
		  B[i].addActionListener(this);
	  }
	  B[0].setIcon(new ImageIcon(getClass().getClassLoader().getResource("DrumSet/bass.jpg")));
	  B[1].setIcon(new ImageIcon(getClass().getClassLoader().getResource("DrumSet/hi hat.jpg")));
	  B[2].setIcon(new ImageIcon(getClass().getClassLoader().getResource("DrumSet/ride cymbal.jpg")));
	  B[3].setIcon(new ImageIcon(getClass().getClassLoader().getResource("DrumSet/snare drum.jpg")));
	  B[4].setIcon(new ImageIcon(getClass().getClassLoader().getResource("DrumSet/tom drum.jpg")));

	  B[0].setMnemonic('S');
	  B[1].setMnemonic('D');
	  B[2].setMnemonic('J');
	  B[3].setMnemonic('K');
	  B[4].setMnemonic('L');

	  add(B[2]);
	  add(B[4]);
	  add(B[0]);
	  add(B[3]);
	  add(B[1]);

	  R = new JRadioButton[3];
	  for(int i=0; i < 3; i++)
	  {
		  R[i] = new JRadioButton();
	  	  R[i].addItemListener(this);
	  }
	  R[0].setText("Rock Song 1");
	  R[1].setText("Rock Song 2");
	  R[2].setText("Funk Song");

	  ButtonGroup g=new ButtonGroup();
	  	  g.add(R[0]);
	  	  g.add(R[1]);
	      g.add(R[2]);

	  add(R[0]);
	  add(R[1]);
	  add(R[2]);
	  
	  bt1=new JButton("Stop");
	  bt1.addActionListener(this);
	  add(bt1);
	  
	  bt1.addActionListener
	    (
	    		new ActionListener(){
	    			public void actionPerformed(ActionEvent e) {
	    				if(e.getSource()==bt1)
						{
							clipR.close();
						}
	    		}
	    	}
	  );
	  
	  
	  Browse = new JButton("Get backing track");
      Browse.setBounds(10, 41, 87, 23);
	         
	   Browse.addActionListener
	    (
	    		new ActionListener(){ 
	    			public void actionPerformed(ActionEvent e) {
	    		        OpenFile OP = new OpenFile();
	    			}	
	    		}
	    );
	    
	  add(Browse);
	  
	  
	}
	
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()== B[0])
		{
			try
			{
				File S1 = new File("src/kick-acoustic01.wav");
				audioIn = AudioSystem.getAudioInputStream(S1);
				clip = AudioSystem.getClip();
				clip.open(audioIn);
				clip.start();
			}
			catch(Exception EX1)
			{
				EX1.printStackTrace();
			}
		}
		else if(e.getSource()== B[1])
		{
			try
			{
				File S2 = new File("src/openhat-acoustic01.wav");
				audioIn = AudioSystem.getAudioInputStream(S2);
				clip = AudioSystem.getClip();
				clip.open(audioIn);
				clip.start();
			}
			catch(Exception EX2)
			{
				EX2.printStackTrace();
			}
		}
		else if(e.getSource()== B[2])
		{
			try
			{
				File S3 = new File("src/ride-acoustic01.wav");
				audioIn = AudioSystem.getAudioInputStream(S3);
				clip = AudioSystem.getClip();
				clip.open(audioIn);
				clip.start();
			}
			catch(Exception EX3)
			{
				EX3.printStackTrace();
			}
		}
		else if(e.getSource()== B[3])
		{
			try
			{
				File S4 = new File("src/snare-acoustic01.wav");
				audioIn = AudioSystem.getAudioInputStream(S4);
				clip = AudioSystem.getClip();
				clip.open(audioIn);
				clip.start();
			}
			catch(Exception EX4)
			{
				EX4.printStackTrace();
			}
		}
		else if(e.getSource()== B[4])
		{
			try
			{
				File S5 = new File("src/tom-acoustic01.wav");
				audioIn = AudioSystem.getAudioInputStream(S5);
				clip = AudioSystem.getClip();
				clip.open(audioIn);
				clip.start();
			}
			catch(Exception EX5)
			{
				EX5.printStackTrace();
			}
		}
	}
	public void itemStateChanged(ItemEvent e)
	{
		if(e.getSource()== R[0])
		{
			try
			{
				
				File f1 = new File("src/Rock Song1.wav");
				audioInR = AudioSystem.getAudioInputStream(f1);
				clipR = AudioSystem.getClip();
				clipR.open(audioInR);
				clipR.start();
			}
			catch (Exception e1){
				e1.printStackTrace();
			}
		}
		else if(e.getSource() == R[1] )
		{
			try
			{
				File f2 = new File("src/Rock Song2.wav");
				audioInR = AudioSystem.getAudioInputStream(f2);
				clipR = AudioSystem.getClip();
				clipR.open(audioInR);
				clipR.start();
			}
			catch (Exception e2){
				e2.printStackTrace();
			}
		}
		else if(e.getSource() == R[2])
		{
			try
			{
				File f3 = new File("src/Funk_020.wav");
				audioInR = AudioSystem.getAudioInputStream(f3);
				clipR = AudioSystem.getClip();
				clipR.open(audioInR);
				clipR.start();
			}
			catch (Exception e3){
				e3.printStackTrace();
			}
		}
	}
	public static void main(String[] args)
	{
		JFrame JF = new JFrame("Drum Program");
		Drum obj = new Drum();
		ExtendedDrum ED = new ExtendedDrum();
		Bar bar = new Bar();
		
		JF.add(bar,BorderLayout.PAGE_START);
		JF.add(obj, BorderLayout.CENTER);
		JF.add(ED, BorderLayout.SOUTH);
		
		JF.setSize(900, 500); 
		JF.setVisible(true);
		JF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}