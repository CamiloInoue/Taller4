package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Vector;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

public class VentanaTop10 extends JFrame {

	private PanelNorteTop pNorteTop;
	private PanelCentroTop pCentroTop;
	
	public VentanaTop10() {
		// TODO Auto-generated constructor stub
		setSize( 300, 200 );
        setTitle( "Top 10" );
        setDefaultCloseOperation( DISPOSE_ON_CLOSE );
        setLocationRelativeTo( null );
        
        setLayout( new BorderLayout( ) );
        
        pNorteTop = new PanelNorteTop();
        pCentroTop = new PanelCentroTop();
        add(pCentroTop, BorderLayout.CENTER);
        add(pNorteTop, BorderLayout.NORTH);
        

}
}
