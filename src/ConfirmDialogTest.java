import java.util.Random;

import javax.swing.JOptionPane;

public class ConfirmDialogTest {

	public static void main(String[] args) {
		int result = 0;
		Random rnd = new Random();
		String [] fortunes = {	"You will encounter a strange person today", 
							  	"There will be three funny noises on your trip home.",
							  	"It's going to be a great day!",
							  	"It's going to be a mediocre day!",
							  	"It's going to be a ROUGH day!" };
		
		do {
			result = JOptionPane.showConfirmDialog(null,  "Do you want a fortune?", "Fortune Request", JOptionPane.YES_NO_OPTION );
			if( result == JOptionPane.YES_OPTION) {
				JOptionPane.showMessageDialog( null,  fortunes[rnd.nextInt(fortunes.length)] );
			}
		} while( result == JOptionPane.YES_OPTION );
	}

}
