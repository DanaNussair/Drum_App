package drumProject;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFileChooser;

public class OpenFile{
	JFileChooser fc = new JFileChooser();
	
	public OpenFile(){
	try {

		fc.setCurrentDirectory(new File("C:/Users/Dana Nussair"));
		fc.setDialogTitle("Choose A Song");
		fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
		
		if(fc.showOpenDialog(null)== JFileChooser.APPROVE_OPTION)
		{
			try {
				File S6 = fc.getSelectedFile().getAbsoluteFile();
				AudioInputStream audioIn6 = AudioSystem.getAudioInputStream(S6);
				Clip clip6 = AudioSystem.getClip();
				clip6.open(audioIn6);
				clip6.start();
			}
			catch(Exception EX6){
				EX6.printStackTrace();
			}
		}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}

