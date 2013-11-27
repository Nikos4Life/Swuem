package Swuem.ETextField;

import java.awt.TextField;
import java.io.Serializable;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class ETextField extends JPanel implements Serializable{
	private TextField tx1;
	private JLabel lb1;

	public TextField getTx1() {
		return tx1;
	}

	/**
	 * @wbp.parser.entryPoint
	 */
	public void setTx1(TextField tx1) {
		this.tx1 = tx1;
	}
	/**
	 * @wbp.parser.entryPoint
	 */
	
	public JLabel getLb1() {
		return lb1;
	}

	public void setLb1(JLabel lb1) {
		this.lb1 = lb1;
	}

	public ETextField(){
		
		lb1=new JLabel("Nombre");
		lb1.setEnabled(false);
		lb1.setBounds(71, 129, 37, 20);
		this.add(lb1);
		
		tx1=new TextField();
		tx1.setBounds(59, 129, 311, 20);
		tx1.setColumns(10);
		this.add(tx1);
		tx1.setVisible(true);
		
		
	}
}