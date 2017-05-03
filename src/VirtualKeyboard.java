import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import java.awt.Toolkit;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import java.awt.Component;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

/**
 * @author Alex Cherniak
 * this class represents a virtual keyboard that you can use with your mouse with standard keyboard options
 * the text will appear on the screen of the application
 */
public class VirtualKeyboard
{
	/**********************************************************************************************************************
	 * Instance Variables
	 **********************************************************************************************************************/
	protected JFrame frmVirtualKeyboard;
	protected JButton row1BTN1;
	protected JButton row1BTN2;
	protected JButton row1BTN3;
	protected JButton row1BTN4;
	protected JButton row1BTN5;
	protected JButton row1BTN6;
	protected JButton row1BTN7;
	protected JButton row1BTN8;
	protected JButton row1BTN9;
	protected JButton row1BTN10;
	protected JButton row1BTN11;
	protected JButton row1BTN12;
	protected JButton row1BTN13;
	protected JButton row1BTN14;
	protected JToggleButton row3BTN1;
	protected JButton row3BTN2;
	protected JButton row3BTN3;
	protected JButton row3BTN4;
	protected JButton row3BTN5;
	protected JButton row3BTN6;
	protected JButton row3BTN7;
	protected JButton row3BTN8;
	protected JButton row3BTN9;
	protected JButton row3BTN10;
	protected JButton row3BTN11;
	protected JButton row3BTN12;
	protected JButton row3BTN13;
	protected JToggleButton row4BTN1;
	protected JButton row4BTN2;
	protected JButton row4BTN3;
	protected JButton row4BTN4;
	protected JButton row4BTN5;
	protected JButton row4BTN6;
	protected JButton row4BTN7;
	protected JButton row4BTN8;
	protected JButton row4BTN9;
	protected JButton row4BTN10;
	protected JButton row4BTN11;
	protected JToggleButton row4BTN12;
	protected JButton spaceBtn;
	private JPanel row4JP;
	private JPanel row3JP;
	private JPanel row2JP;
	private JPanel row1JP;
	private JPanel mainPanel;
	protected JTextArea screenJTA;
	private JButton btnClearScreen;

	/*******************************************************************************************************************
	 * Launch the application - Main
	 *******************************************************************************************************************/
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					VirtualKeyboard window = new VirtualKeyboard();
					window.frmVirtualKeyboard.setVisible(true);
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**************************************************************************************************************************************
	 * Create the application.
	 *************************************************************************************************************************************/
	public VirtualKeyboard() 
	{
		initialize();
	}

	/*************************************************************************************************************************************
	 * Initialize the contents of the frame.
	 ************************************************************************************************************************************/
	private void initialize() {
		frmVirtualKeyboard = new JFrame();
		frmVirtualKeyboard.setResizable(false);
		frmVirtualKeyboard.setTitle("Virtual Keyboard");
		frmVirtualKeyboard.setIconImage(Toolkit.getDefaultToolkit().getImage(VirtualKeyboard.class.getResource("/com/sun/java/swing/plaf/windows/icons/Computer.gif")));
		frmVirtualKeyboard.setBounds(100, 100, 1361, 833);
		frmVirtualKeyboard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmVirtualKeyboard.getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		
		//create the main panel
		mainPanel = new JPanel();
		mainPanel.setBackground(new Color(255, 255, 224));
		frmVirtualKeyboard.getContentPane().add(mainPanel);
		
		
		//create row1 Jpanel
		row1JP = new JPanel();
		row1JP.setBounds(51, 415, 1245, 42);
		row1JP.setLayout(null);
		
		/*********************************************************************************************************************************
		 * create row1 buttons
		 *********************************************************************************************************************************/
		row1BTN1 = new JButton("`/~");
		row1BTN1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				if(row4BTN1.isSelected() || row4BTN12.isSelected()) //means that shift is pressed
				{
					screenJTA.setText(screenJTA.getText()+'~');
				}
				else //shift not pressed
				{
					screenJTA.setText(screenJTA.getText()+'`');
				}
			}
		});
		row1BTN1.setBounds(0, 0, 84, 42);
		row1JP.add(row1BTN1);
		
		row1BTN2 = new JButton("1 / !");
		row1BTN2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(row4BTN1.isSelected() || row4BTN12.isSelected()) //means that shift is pressed
				{
					screenJTA.setText(screenJTA.getText()+'!');
				}
				else //shift not pressed
				{
					screenJTA.setText(screenJTA.getText()+'1');
				}
			}
		});
		row1BTN2.setBounds(96, 0, 68, 42);
		row1JP.add(row1BTN2);
		
		row1BTN3 = new JButton("2 / @");
		row1BTN3.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(row4BTN1.isSelected() || row4BTN12.isSelected()) //means that shift is pressed
				{
					screenJTA.setText(screenJTA.getText()+'@');
				}
				else //shift not pressed
				{
					screenJTA.setText(screenJTA.getText()+'2');
				}
			}
		});
		row1BTN3.setBounds(176, 0, 68, 42);
		row1JP.add(row1BTN3);
		
		row1BTN4 = new JButton("3 / #");
		row1BTN4.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				if(row4BTN1.isSelected() || row4BTN12.isSelected()) //means that shift is pressed
				{
					screenJTA.setText(screenJTA.getText()+'#');
				}
				else //shift not pressed
				{
					screenJTA.setText(screenJTA.getText()+'3');
				}
			}
		});
		row1BTN4.setBounds(256, 0, 68, 42);
		row1JP.add(row1BTN4);
		
		row1BTN5 = new JButton("4 / $");
		row1BTN5.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				if(row4BTN1.isSelected() || row4BTN12.isSelected()) //means that shift is pressed
				{
					screenJTA.setText(screenJTA.getText()+'$');
				}
				else //shift not pressed
				{
					screenJTA.setText(screenJTA.getText()+'4');
				}
			}
		});
		row1BTN5.setBounds(336, 0, 68, 42);
		row1JP.add(row1BTN5);
		
		row1BTN6 = new JButton("5 / %");
		row1BTN6.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				if(row4BTN1.isSelected() || row4BTN12.isSelected()) //means that shift is pressed
				{
					screenJTA.setText(screenJTA.getText()+'%');
				}
				else //shift not pressed
				{
					screenJTA.setText(screenJTA.getText()+'5');
				}
			}
		});
		row1BTN6.setBounds(416, 0, 68, 42);
		row1JP.add(row1BTN6);
		
		row1BTN7 = new JButton("6 / ^");
		row1BTN7.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(row4BTN1.isSelected() || row4BTN12.isSelected()) //means that shift is pressed
				{
					screenJTA.setText(screenJTA.getText()+'^');
				}
				else //shift not pressed
				{
					screenJTA.setText(screenJTA.getText()+'6');
				}
			}
		});
		row1BTN7.setBounds(496, 0, 68, 42);
		row1JP.add(row1BTN7);
		
		row1BTN8 = new JButton("7 / &");
		row1BTN8.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(row4BTN1.isSelected() || row4BTN12.isSelected()) //means that shift is pressed
				{
					screenJTA.setText(screenJTA.getText()+'&');
				}
				else //shift not pressed
				{
					screenJTA.setText(screenJTA.getText()+'7');
				}
			}
		});
		row1BTN8.setBounds(576, 0, 68, 42);
		row1JP.add(row1BTN8);
		
		row1BTN9 = new JButton("8 / *");
		row1BTN9.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(row4BTN1.isSelected() || row4BTN12.isSelected()) //means that shift is pressed
				{
					screenJTA.setText(screenJTA.getText()+'*');
				}
				else //shift not pressed
				{
					screenJTA.setText(screenJTA.getText()+'8');
				}
			}
		});
		row1BTN9.setBounds(656, 0, 68, 42);
		row1JP.add(row1BTN9);
		
		row1BTN10 = new JButton("9 / (");
		row1BTN10.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(row4BTN1.isSelected() || row4BTN12.isSelected()) //means that shift is pressed
				{
					screenJTA.setText(screenJTA.getText()+'(');
				}
				else //shift not pressed
				{
					screenJTA.setText(screenJTA.getText()+'9');
				}
			}
		});
		row1BTN10.setBounds(736, 0, 68, 42);
		row1JP.add(row1BTN10);
		
		row1BTN11 = new JButton("0 / )");
		row1BTN11.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(row4BTN1.isSelected() || row4BTN12.isSelected()) //means that shift is pressed
				{
					screenJTA.setText(screenJTA.getText()+')');
				}
				else //shift not pressed
				{
					screenJTA.setText(screenJTA.getText()+'0');
				}
			}
		});
		row1BTN11.setBounds(816, 0, 68, 42);
		row1JP.add(row1BTN11);
		
		row1BTN12 = new JButton("- / _");
		row1BTN12.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(row4BTN1.isSelected() || row4BTN12.isSelected()) //means that shift is pressed
				{
					screenJTA.setText(screenJTA.getText()+'_');
				}
				else //shift not pressed
				{
					screenJTA.setText(screenJTA.getText()+'-');
				}
			}
		});
		row1BTN12.setBounds(896, 0, 74, 42);
		row1JP.add(row1BTN12);
		
		row1BTN13 = new JButton("= / +");
		row1BTN13.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(row4BTN1.isSelected() || row4BTN12.isSelected()) //means that shift is pressed
				{
					screenJTA.setText(screenJTA.getText()+'+');
				}
				else //shift not pressed
				{
					screenJTA.setText(screenJTA.getText()+'=');
				}
			}
		});
		row1BTN13.setBounds(982, 0, 57, 42);
		row1JP.add(row1BTN13);
		
		row1BTN14 = new JButton("<--   BackSpace");
		row1BTN14.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(screenJTA.getText().length() == 1) //empty the screen
				{
					screenJTA.setText("");
				}
				else if(screenJTA.getText().length() > 1) //remove the last character
				{
					screenJTA.setText(screenJTA.getText().substring(0, screenJTA.getText().length()-1));
				}
				
				//if none of the above , it will do nothing
			}
		});
		row1BTN14.setBounds(1067, 0, 178, 42);
		row1JP.add(row1BTN14);
		
		//create row2 Jpanel
		row2JP = new JPanel();
		row2JP.setBounds(94, 485, 1166, 42);
		row2JP.setLayout(null);
		
		/***************************************************************************************************************************
		 * Create row2 buttons
		 **************************************************************************************************************************/
		JButton row2BTN1 = new JButton("Tab");
		row2BTN1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				screenJTA.setText(screenJTA.getText()+"    ");
			}
		});
		row2BTN1.setBounds(0, 0, 118, 42);
		row2JP.add(row2BTN1);
		
		JButton row2BTN2 = new JButton("Q");
		row2BTN2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(row4BTN1.isSelected() || row4BTN12.isSelected() || row3BTN1.isSelected()) //means that shift/caps is pressed
				{
					screenJTA.setText(screenJTA.getText()+'Q');
				}
				else //shift/caps not pressed
				{
					screenJTA.setText(screenJTA.getText()+'q');
				}
			}
		});
		row2BTN2.setBounds(130, 0, 68, 42);
		row2JP.add(row2BTN2);
		
		JButton row2BTN3 = new JButton("W");
		row2BTN3.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(row4BTN1.isSelected() || row4BTN12.isSelected() || row3BTN1.isSelected()) //means that shift/caps is pressed
				{
					screenJTA.setText(screenJTA.getText()+'W');
				}
				else //shift/caps not pressed
				{
					screenJTA.setText(screenJTA.getText()+'w');
				}
			}
		});
		row2BTN3.setBounds(210, 0, 68, 42);
		row2JP.add(row2BTN3);
		
		JButton row2BTN4 = new JButton("E");
		row2BTN4.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(row4BTN1.isSelected() || row4BTN12.isSelected() || row3BTN1.isSelected()) //means that shift/caps is pressed
				{
					screenJTA.setText(screenJTA.getText()+'E');
				}
				else //shift/caps not pressed
				{
					screenJTA.setText(screenJTA.getText()+'e');
				}
			}
		});
		row2BTN4.setBounds(290, 0, 68, 42);
		row2JP.add(row2BTN4);
		
		JButton row2BTN5 = new JButton("R");
		row2BTN5.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(row4BTN1.isSelected() || row4BTN12.isSelected() || row3BTN1.isSelected()) //means that shift/caps is pressed
				{
					screenJTA.setText(screenJTA.getText()+'R');
				}
				else //shift/caps not pressed
				{
					screenJTA.setText(screenJTA.getText()+'r');
				}
			}
		});
		row2BTN5.setBounds(370, 0, 68, 42);
		row2JP.add(row2BTN5);
		
		JButton row2BTN6 = new JButton("T");
		row2BTN6.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(row4BTN1.isSelected() || row4BTN12.isSelected() || row3BTN1.isSelected()) //means that shift/caps is pressed
				{
					screenJTA.setText(screenJTA.getText()+'T');
				}
				else //shift/caps not pressed
				{
					screenJTA.setText(screenJTA.getText()+'t');
				}
			}
		});
		row2BTN6.setBounds(450, 0, 68, 42);
		row2JP.add(row2BTN6);
		
		JButton row2BTN7 = new JButton("Y");
		row2BTN7.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(row4BTN1.isSelected() || row4BTN12.isSelected() || row3BTN1.isSelected()) //means that shift/caps is pressed
				{
					screenJTA.setText(screenJTA.getText()+'Y');
				}
				else //shift/caps not pressed
				{
					screenJTA.setText(screenJTA.getText()+'y');
				}
			}
		});
		row2BTN7.setBounds(530, 0, 68, 42);
		row2JP.add(row2BTN7);
		
		JButton row2BTN8 = new JButton("U");
		row2BTN8.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(row4BTN1.isSelected() || row4BTN12.isSelected() || row3BTN1.isSelected()) //means that shift/caps is pressed
				{
					screenJTA.setText(screenJTA.getText()+'U');
				}
				else //shift/caps not pressed
				{
					screenJTA.setText(screenJTA.getText()+'u');
				}
			}
		});
		row2BTN8.setBounds(610, 0, 68, 42);
		row2JP.add(row2BTN8);
		
		JButton row2BTN9 = new JButton("I");
		row2BTN9.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(row4BTN1.isSelected() || row4BTN12.isSelected() || row3BTN1.isSelected()) //means that shift/caps is pressed
				{
					screenJTA.setText(screenJTA.getText()+'I');
				}
				else //shift/caps not pressed
				{
					screenJTA.setText(screenJTA.getText()+'i');
				}
			}
		});
		row2BTN9.setBounds(690, 0, 68, 42);
		row2JP.add(row2BTN9);
		
		JButton row2BTN10 = new JButton("O");
		row2BTN10.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(row4BTN1.isSelected() || row4BTN12.isSelected() || row3BTN1.isSelected()) //means that shift/caps is pressed
				{
					screenJTA.setText(screenJTA.getText()+'O');
				}
				else //shift/caps not pressed
				{
					screenJTA.setText(screenJTA.getText()+'o');
				}
			}
		});
		row2BTN10.setBounds(770, 0, 68, 42);
		row2JP.add(row2BTN10);
		
		JButton row2BTN11 = new JButton("P");
		row2BTN11.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(row4BTN1.isSelected() || row4BTN12.isSelected() || row3BTN1.isSelected()) //means that shift/caps is pressed
				{
					screenJTA.setText(screenJTA.getText()+'P');
				}
				else //shift/caps not pressed
				{
					screenJTA.setText(screenJTA.getText()+'p');
				}
			}
		});
		row2BTN11.setBounds(850, 0, 68, 42);
		row2JP.add(row2BTN11);
		
		JButton row2BTN12 = new JButton("[ / {");
		row2BTN12.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(row4BTN1.isSelected() || row4BTN12.isSelected()) //means that shift is pressed
				{
					screenJTA.setText(screenJTA.getText()+'{');
				}
				else //shift not pressed
				{
					screenJTA.setText(screenJTA.getText()+'[');
				}
			}
		});
		row2BTN12.setBounds(930, 0, 68, 42);
		row2JP.add(row2BTN12);
		
		JButton row2BTN13 = new JButton("] / }");
		row2BTN13.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(row4BTN1.isSelected() || row4BTN12.isSelected()) //means that shift is pressed
				{
					screenJTA.setText(screenJTA.getText()+'}');
				}
				else //shift not pressed
				{
					screenJTA.setText(screenJTA.getText()+']');
				}
			}
		});
		row2BTN13.setBounds(1010, 0, 68, 42);
		row2JP.add(row2BTN13);
		
		JButton row2BTN14 = new JButton("\\ / |");
		row2BTN14.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(row4BTN1.isSelected() || row4BTN12.isSelected()) //means that shift is pressed
				{
					screenJTA.setText(screenJTA.getText()+'|');
				}
				else //shift not pressed
				{
					screenJTA.setText(screenJTA.getText()+'\\');
				}
			}
		});
		row2BTN14.setBounds(1090, 0, 76, 42);
		row2JP.add(row2BTN14);
		
		//create row 3 Jpanel
		row3JP = new JPanel();
		row3JP.setBounds(112, 556, 1135, 44);
		row3JP.setLayout(null);
		
		/**************************************************************************************************************************
		 * Create row 3 Buttons
		 *************************************************************************************************************************/
		row3BTN1 = new JToggleButton("Caps");
		row3BTN1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				if(row3BTN1.isSelected())
				{
					row3BTN1.setForeground(Color.GREEN);
				}
				else
					row3BTN1.setForeground(Color.BLACK);
			}
		});
		row3BTN1.setBounds(0, 0, 118, 42);
		row3JP.add(row3BTN1);
		
		row3BTN2 = new JButton("A");
		row3BTN2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(row4BTN1.isSelected() || row4BTN12.isSelected() || row3BTN1.isSelected()) //means that shift/caps is pressed
				{
					screenJTA.setText(screenJTA.getText()+'A');
				}
				else //shift/caps not pressed
				{
					screenJTA.setText(screenJTA.getText()+'a');
				}
			}
		});
		row3BTN2.setBounds(130, 0, 68, 42);
		row3JP.add(row3BTN2);
		
		row3BTN3 = new JButton("S");
		row3BTN3.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(row4BTN1.isSelected() || row4BTN12.isSelected() || row3BTN1.isSelected()) //means that shift/caps is pressed
				{
					screenJTA.setText(screenJTA.getText()+'S');
				}
				else //shift/caps not pressed
				{
					screenJTA.setText(screenJTA.getText()+'s');
				}
			}
		});
		row3BTN3.setBounds(210, 0, 68, 42);
		row3JP.add(row3BTN3);
		
		row3BTN4 = new JButton("D");
		row3BTN4.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(row4BTN1.isSelected() || row4BTN12.isSelected() || row3BTN1.isSelected()) //means that shift/caps is pressed
				{
					screenJTA.setText(screenJTA.getText()+'D');
				}
				else //shift/caps not pressed
				{
					screenJTA.setText(screenJTA.getText()+'d');
				}
			}
		});
		row3BTN4.setBounds(290, 0, 68, 42);
		row3JP.add(row3BTN4);
		
		row3BTN5 = new JButton("F");
		row3BTN5.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(row4BTN1.isSelected() || row4BTN12.isSelected() || row3BTN1.isSelected()) //means that shift/caps is pressed
				{
					screenJTA.setText(screenJTA.getText()+'F');
				}
				else //shift/caps not pressed
				{
					screenJTA.setText(screenJTA.getText()+'f');
				}
			}
		});
		row3BTN5.setBounds(370, 0, 68, 42);
		row3JP.add(row3BTN5);
		
		row3BTN6 = new JButton("G");
		row3BTN6.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(row4BTN1.isSelected() || row4BTN12.isSelected() || row3BTN1.isSelected()) //means that shift/caps is pressed
				{
					screenJTA.setText(screenJTA.getText()+'G');
				}
				else //shift/caps not pressed
				{
					screenJTA.setText(screenJTA.getText()+'g');
				}
			}
		});
		row3BTN6.setBounds(450, 0, 68, 42);
		row3JP.add(row3BTN6);
		
		row3BTN7 = new JButton("H");
		row3BTN7.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(row4BTN1.isSelected() || row4BTN12.isSelected() || row3BTN1.isSelected()) //means that shift/caps is pressed
				{
					screenJTA.setText(screenJTA.getText()+'H');
				}
				else //shift/caps not pressed
				{
					screenJTA.setText(screenJTA.getText()+'h');
				}
			}
		});
		row3BTN7.setBounds(530, 0, 68, 42);
		row3JP.add(row3BTN7);
		
		row3BTN8 = new JButton("J");
		row3BTN8.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(row4BTN1.isSelected() || row4BTN12.isSelected() || row3BTN1.isSelected()) //means that shift/caps is pressed
				{
					screenJTA.setText(screenJTA.getText()+'J');
				}
				else //shift/caps not pressed
				{
					screenJTA.setText(screenJTA.getText()+'j');
				}
			}
		});
		row3BTN8.setBounds(610, 0, 68, 42);
		row3JP.add(row3BTN8);
		
		row3BTN9 = new JButton("K");
		row3BTN9.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(row4BTN1.isSelected() || row4BTN12.isSelected() || row3BTN1.isSelected()) //means that shift/caps is pressed
				{
					screenJTA.setText(screenJTA.getText()+'K');
				}
				else //shift/caps not pressed
				{
					screenJTA.setText(screenJTA.getText()+'k');
				}
			}
		});
		row3BTN9.setBounds(690, 0, 68, 42);
		row3JP.add(row3BTN9);
		
		row3BTN10 = new JButton("L");
		row3BTN10.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(row4BTN1.isSelected() || row4BTN12.isSelected() || row3BTN1.isSelected()) //means that shift/caps is pressed
				{
					screenJTA.setText(screenJTA.getText()+'L');
				}
				else //shift/caps not pressed
				{
					screenJTA.setText(screenJTA.getText()+'l');
				}
			}
		});
		row3BTN10.setBounds(770, 0, 68, 42);
		row3JP.add(row3BTN10);
		
		row3BTN11 = new JButton("; / :");
		row3BTN11.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(row4BTN1.isSelected() || row4BTN12.isSelected()) //means that shift is pressed
				{
					screenJTA.setText(screenJTA.getText()+':');
				}
				else //shift not pressed
				{
					screenJTA.setText(screenJTA.getText()+';');
				}
			}
		});
		row3BTN11.setBounds(850, 0, 68, 42);
		row3JP.add(row3BTN11);
		
		row3BTN12 = new JButton("' / \"");
		row3BTN12.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				if(row4BTN1.isSelected() || row4BTN12.isSelected()) //means that shift is pressed
				{
					screenJTA.setText(screenJTA.getText()+'"');
				}
				else //shift not pressed
				{
					screenJTA.setText(screenJTA.getText()+'\'');
				}
			}
		});
		row3BTN12.setBounds(930, 0, 68, 42);
		row3JP.add(row3BTN12);
		
		row3BTN13 = new JButton("Enter");
		row3BTN13.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				screenJTA.setText(screenJTA.getText()+"\n");
			}
		});
		row3BTN13.setBounds(1010, 0, 124, 42);
		row3JP.add(row3BTN13);
		
		
		//Create row4 Jpanel
		row4JP = new JPanel();
		row4JP.setBounds(145, 627, 1089, 42);
		row4JP.setLayout(null);
		
		
		/*************************************************************************************************************************
		 * Create row4 Buttons
		 *************************************************************************************************************************/
		row4BTN1 = new JToggleButton("Shift");
		row4BTN1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				if(row4BTN1.isSelected())
				{
					row4BTN1.setForeground(Color.GREEN);
				}
				else
					row4BTN1.setForeground(Color.BLACK);
			}
		});
		row4BTN1.setBounds(0, 0, 118, 42);
		row4JP.add(row4BTN1);
		
		row4BTN2 = new JButton("Z");
		row4BTN2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(row4BTN1.isSelected() || row4BTN12.isSelected() || row3BTN1.isSelected()) //means that shift/caps is pressed
				{
					screenJTA.setText(screenJTA.getText()+'Z');
				}
				else //shift/caps not pressed
				{
					screenJTA.setText(screenJTA.getText()+'z');
				}
			}
		});
		row4BTN2.setBounds(130, 0, 68, 42);
		row4JP.add(row4BTN2);
		
		row4BTN3 = new JButton("X");
		row4BTN3.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(row4BTN1.isSelected() || row4BTN12.isSelected() || row3BTN1.isSelected()) //means that shift/caps is pressed
				{
					screenJTA.setText(screenJTA.getText()+'X');
				}
				else //shift/caps not pressed
				{
					screenJTA.setText(screenJTA.getText()+'x');
				}
			}
		});
		row4BTN3.setBounds(210, 0, 68, 42);
		row4JP.add(row4BTN3);
		
		row4BTN4 = new JButton("C");
		row4BTN4.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(row4BTN1.isSelected() || row4BTN12.isSelected() || row3BTN1.isSelected()) //means that shift/caps is pressed
				{
					screenJTA.setText(screenJTA.getText()+'C');
				}
				else //shift/caps not pressed
				{
					screenJTA.setText(screenJTA.getText()+'c');
				}
			}
		});
		row4BTN4.setBounds(290, 0, 68, 42);
		row4JP.add(row4BTN4);
		
		row4BTN5 = new JButton("V");
		row4BTN5.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(row4BTN1.isSelected() || row4BTN12.isSelected() || row3BTN1.isSelected()) //means that shift/caps is pressed
				{
					screenJTA.setText(screenJTA.getText()+'V');
				}
				else //shift/caps not pressed
				{
					screenJTA.setText(screenJTA.getText()+'v');
				}
			}
		});
		row4BTN5.setBounds(370, 0, 68, 42);
		row4JP.add(row4BTN5);
		
		row4BTN6 = new JButton("B");
		row4BTN6.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(row4BTN1.isSelected() || row4BTN12.isSelected() || row3BTN1.isSelected()) //means that shift/caps is pressed
				{
					screenJTA.setText(screenJTA.getText()+'B');
				}
				else //shift/caps not pressed
				{
					screenJTA.setText(screenJTA.getText()+'b');
				}
			}
		});
		row4BTN6.setBounds(450, 0, 68, 42);
		row4JP.add(row4BTN6);
		
		row4BTN7 = new JButton("N");
		row4BTN7.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(row4BTN1.isSelected() || row4BTN12.isSelected() || row3BTN1.isSelected()) //means that shift/caps is pressed
				{
					screenJTA.setText(screenJTA.getText()+'N');
				}
				else //shift/caps not pressed
				{
					screenJTA.setText(screenJTA.getText()+'n');
				}
			}
		});
		row4BTN7.setBounds(530, 0, 68, 42);
		row4JP.add(row4BTN7);
		
		row4BTN8 = new JButton("M");
		row4BTN8.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(row4BTN1.isSelected() || row4BTN12.isSelected() || row3BTN1.isSelected()) //means that shift/caps is pressed
				{
					screenJTA.setText(screenJTA.getText()+'M');
				}
				else //shift/caps not pressed
				{
					screenJTA.setText(screenJTA.getText()+'m');
				}
			}
		});
		row4BTN8.setBounds(610, 0, 68, 42);
		row4JP.add(row4BTN8);
		
		row4BTN9 = new JButton(", / <");
		row4BTN9.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(row4BTN1.isSelected() || row4BTN12.isSelected()) //means that shift is pressed
				{
					screenJTA.setText(screenJTA.getText()+'<');
				}
				else //shift not pressed
				{
					screenJTA.setText(screenJTA.getText()+',');
				}
			}
		});
		row4BTN9.setBounds(690, 0, 68, 42);
		row4JP.add(row4BTN9);
		
		row4BTN10 = new JButton(". / >");
		row4BTN10.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(row4BTN1.isSelected() || row4BTN12.isSelected()) //means that shift is pressed
				{
					screenJTA.setText(screenJTA.getText()+'>');
				}
				else //shift not pressed
				{
					screenJTA.setText(screenJTA.getText()+'.');
				}
			}
		});
		row4BTN10.setBounds(770, 0, 68, 42);
		row4JP.add(row4BTN10);
		
		row4BTN11 = new JButton("/ / ?");
		row4BTN11.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(row4BTN1.isSelected() || row4BTN12.isSelected()) //means that shift is pressed
				{
					screenJTA.setText(screenJTA.getText()+'?');
				}
				else //shift not pressed
				{
					screenJTA.setText(screenJTA.getText()+'/');
				}
			}
		});
		row4BTN11.setBounds(850, 0, 68, 42);
		row4JP.add(row4BTN11);
		
		row4BTN12 = new JToggleButton("Shift");
		row4BTN12.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(row4BTN12.isSelected())
				{
					row4BTN12.setForeground(Color.GREEN);
				}
				else
					row4BTN12.setForeground(Color.BLACK);
			}
		});
		row4BTN12.setBounds(930, 0, 159, 42);
		row4JP.add(row4BTN12);
		
		spaceBtn = new JButton("Space");
		spaceBtn.setBounds(248, 698, 844, 33);
		spaceBtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				screenJTA.setText(screenJTA.getText()+" ");
			}
		});
		
		/*
		 * create scrollpane for the screen
		 */
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 13, 1319, 384);
		
		/*
		 * create the screen
		 */
		screenJTA = new JTextArea();
		screenJTA.setEditable(false);
		screenJTA.setFont(new Font("Comic Sans MS", Font.PLAIN, 22));
		scrollPane.setViewportView(screenJTA);
		
		JLabel lblCreatedByAlex = new JLabel("Created By: Alex Cherniak");
		lblCreatedByAlex.setBounds(1172, 757, 159, 16);
		lblCreatedByAlex.setForeground(new Color(255, 0, 0));
		lblCreatedByAlex.setFont(new Font("Nirmala UI", Font.ITALIC, 13));
		
		
		/*
		 * create clear screen button
		 */
		btnClearScreen = new JButton("Clear Screen");
		btnClearScreen.setBounds(29, 698, 129, 33);
		btnClearScreen.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				screenJTA.setText("");
			}
		});
		btnClearScreen.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(139, 69, 19), null, null, null));
		btnClearScreen.setBackground(new Color(240, 248, 255));
		btnClearScreen.setForeground(new Color(255, 0, 0));
		mainPanel.setLayout(null);
		mainPanel.add(row1JP);
		mainPanel.add(btnClearScreen);
		mainPanel.add(spaceBtn);
		mainPanel.add(lblCreatedByAlex);
		mainPanel.add(scrollPane);
		mainPanel.add(row4JP);
		mainPanel.add(row3JP);
		mainPanel.add(row2JP);
	}
	
}
