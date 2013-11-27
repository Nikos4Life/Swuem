package Swuem.ECheckBox;

import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class ECheckBox extends JPanel implements Serializable 
{
	boolean estado=true;
	ImageIcon iconoEstado1=new ImageIcon("C:\\Users\\Ra\u00FAl\\WorkSpaceInterfaces\\EButon.jpg");
	ImageIcon iconoEstado2=new ImageIcon("C:\\Users\\Ra\u00FAl\\WorkSpaceInterfaces\\EButonR.jpg");
	ImageIcon iconoEstado3=new ImageIcon("C:\\Users\\Ra\u00FAl\\WorkSpaceInterfaces\\EButon3.jpg");
	//Versión Auto-agregada 
	private static final long serialVersionUID = 429223200735568357L;
	private JCheckBox echeckbox;
	public JCheckBox getEcheckbox1() 
	{
		return echeckbox;
	}
	public void setEbcheckbox1(JCheckBox ebcheckbox1) 
	{
		this.echeckbox = ebcheckbox1;
	}
	public ECheckBox()
	{
		echeckbox = new JCheckBox();		
		echeckbox.setText("UEM Check Box");
		this.add(echeckbox);
		echeckbox.setIcon(iconoEstado1);
		echeckbox.addMouseListener(new MouseAdapter() 
		{
			public void mouseClicked(MouseEvent arg0)
			{
				if(estado==true)
				{
					estado=false;
					echeckbox.setIcon(iconoEstado2);
				}
				else
				{
					estado=true;
					echeckbox.setIcon(iconoEstado1);
				}
			}
		});
		echeckbox.setRolloverIcon(iconoEstado3);
	}	
}