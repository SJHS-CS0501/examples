import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class GoogleSearchExample extends JFrame implements ActionListener {

	private JPanel searchPanel;
	private JPanel resultsPanel;
	private JTextField searchBox;
	
	public GoogleSearchExample() {
		super( "Google Search Example" );
	
		JButton button;
		JLabel label;
		
		setLayout( new BorderLayout() );
		searchPanel = new JPanel( new BorderLayout() );
		resultsPanel = new JPanel( new FlowLayout() );
		
		searchBox = new JTextField();
		searchPanel.add( searchBox, BorderLayout.CENTER );
		
		button = new JButton( "Search!" );
		button.setActionCommand("searchBtn");
		button.addActionListener( this );
		searchPanel.add( button, BorderLayout.SOUTH );
		
		add( searchPanel, BorderLayout.NORTH );
		
		
		
		
	}
	public static void main(String[] args) {

	}
	
	public void actionPerformed( ActionEvent e ) {
		
	}

}
