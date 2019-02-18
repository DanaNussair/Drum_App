package drumProject;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.*;
import java.io.File;
import javax.sound.sampled.*;
import javax.swing.*;

public class ExtendedDrum extends JPanel implements ActionListener{
	JButton EB1;
	JButton EB2;
	JButton EB3;
	JButton EB4;
	JButton EB5;
	JButton EB6;
	JLabel EL1;
	JLabel EL2;
	JLabel EL3;
	AudioInputStream AU1;
	Clip clip;
	public ExtendedDrum(){
		EL1 = new JLabel(" Contineous Beats:");
		EL2 = new JLabel("");
		EL3 = new JLabel("");
		EB1 = new JButton("Kick-NewWave");
		EB2 = new JButton("Kick-Softy");
		EB3 = new JButton("Crash");
		EB4 = new JButton("HiHat-Ring");
		EB5 = new JButton("Snare-Punch");
		EB6 = new JButton("Perc-Weirdo");
		
		//setLayout(new BorderLayout());
		JPanel P = new JPanel();
		P.setBackground(Color.white);
		
		setLayout(new GridLayout(3,2));
		EB1.addActionListener(this);
		EB2.addActionListener(this);
		EB3.addActionListener(this);
		EB4.addActionListener(this);
		EB5.addActionListener(this);
		EB6.addActionListener(this);
		
		add(EL1);
		add(EL2);
		add(EL3);
		add(EB1);
		add(EB2);
		add(EB3);
		add(EB4);
		add(EB5);
		add(EB6);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()== EB1)
		{
			try
			{
				File S1 = new File("src/kick-newwave.wav");
				AU1 = AudioSystem.getAudioInputStream(S1);
				clip = AudioSystem.getClip();
				clip.open(AU1);
				clip.start();
				clip.loop(Clip.LOOP_CONTINUOUSLY);
			}
			catch(Exception EX1)
			{
				EX1.printStackTrace();
			}
		}
		
		else if(e.getSource()== EB2)
		{
			try
			{
				File S1 = new File("src/kick-softy.wav");
				AU1 = AudioSystem.getAudioInputStream(S1);
				clip = AudioSystem.getClip();
				clip.open(AU1);
				clip.start();
				clip.loop(Clip.LOOP_CONTINUOUSLY);
			}
			catch(Exception EX2)
			{
				EX2.printStackTrace();
			}
		}
		
		else if(e.getSource()== EB3)
		{
			try
			{
				File S1 = new File("src/crash-acoustic.wav");
				AU1 = AudioSystem.getAudioInputStream(S1);
				clip = AudioSystem.getClip();
				clip.open(AU1);
				clip.start();
				clip.loop(Clip.LOOP_CONTINUOUSLY);
			}
			catch(Exception EX3)
			{
				EX3.printStackTrace();
			}
		}
		
		else if(e.getSource()== EB4)
		{
			try
			{
				File S1 = new File("src/hihat-ring.wav");
				AU1 = AudioSystem.getAudioInputStream(S1);
				clip = AudioSystem.getClip();
				clip.open(AU1);
				clip.start();
				clip.loop(Clip.LOOP_CONTINUOUSLY);
			}
			catch(Exception EX4)
			{
				EX4.printStackTrace();
			}
		}
		
		else if(e.getSource()== EB5)
		{
			try
			{
				File S1 = new File("src/snare-punch.wav");
				AU1 = AudioSystem.getAudioInputStream(S1);
				clip = AudioSystem.getClip();
				clip.open(AU1);
				clip.start();
				clip.loop(Clip.LOOP_CONTINUOUSLY);
			}
			catch(Exception EX5)
			{
				EX5.printStackTrace();
			}
		}
		else if (e.getSource() == EB6)
		{
			try 
			{
				File S1 = new File("src/perc-weirdo.wav");
				AU1 = AudioSystem.getAudioInputStream(S1);
				clip = AudioSystem.getClip();
				clip.open(AU1);
				clip.start();
				clip.loop(Clip.LOOP_CONTINUOUSLY);
			}
			catch (Exception EX6)
			{
				EX6.printStackTrace();
			}
		}
	}
}
