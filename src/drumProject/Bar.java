package drumProject;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Bar extends JPanel{
	public Bar(){
		JMenu file = new JMenu( "File" );
		file.setMnemonic('F');
		JMenuItem aboutItem = new JMenuItem( "About..." );
		aboutItem.setMnemonic( 'A' );
		file.add( aboutItem );
		aboutItem.addActionListener
		(
			new ActionListener()
			{
				public void actionPerformed( ActionEvent event )
				{
					JOptionPane.showMessageDialog(Bar.this,"This program is for a collection of drums that you can use to make your own song.","About", JOptionPane.PLAIN_MESSAGE );
				}
			}
		);
		
		JMenuItem Instructions = new JMenuItem( "Instructions" );
		   Instructions.setMnemonic( 'I' );
		   file.add( Instructions );
		   Instructions.addActionListener
		   (
			   new ActionListener()
			   {
				   public void actionPerformed( ActionEvent event )
		           {
					   JOptionPane.showMessageDialog(Bar.this,"You can use the keyboard to make drumming easier, and the keys are:\n"
					   		+ " press alt+S: for bass drum\n "
					   		+ "press alt+D: for Hit-hat\n "
					   		+ "press alt+J: for Ride-Cybmal\n "
					   		+ "press alt+K: for Snare Drum\n "
					   		+ "press alt+L: for Tom drum\n"
					   		+ "\nYou can also try one of our given backing tracks for the drumming or import songs from your computer.\n"
					   		+ "Note: You can only use .wav songs for this program.\n"
					   		+ "\nIf you like you can add a contineous beat for your song using the buttons at the bottom.\n"
					   		+ "\nShortcuts are available for each item in this bar: \n"
					   		+ "press alt+F: for file\n"
					   		+ "press file then alt+A: for about\n"
					   		+ "press file then alt+I: for instructions\n"
					   		+ "press file then alt+X: for exit\n"
					   		+ "\nENJOY! \\M/" ,"Instructions", JOptionPane.QUESTION_MESSAGE);
		           }
		       }
		    );
		   
		   
       JMenuItem exitItem = new JMenuItem( "Exit" );
	   exitItem.setMnemonic( 'x' );
	   file.add( exitItem );
	   exitItem.addActionListener
	   (
		   new ActionListener()
		   {
			   public void actionPerformed( ActionEvent event )
	           {
	              System.exit( 0 );
	           }
	       }
	    );

      JMenuBar bar = new JMenuBar();
	  //setJMenuBar( bar );
      add(bar, BorderLayout.PAGE_START);
      bar.add( file );
	}
}
