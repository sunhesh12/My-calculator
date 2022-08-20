package calc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;


import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;


public class Calculater {

	private JFrame frmCalculater;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;
	
	
	
	
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btn0;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btnP;
	private JButton btnD;
	private JButton btnS;
	private JButton btnAnswer;
	private JButton btnBack;
	private JButton btnClear;
	private JButton btnFulstop;
	private JButton btnX;
	private ButtonGroup buttonGroup = new ButtonGroup();

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculater window = new Calculater();
					window.frmCalculater.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculater() {
		initialize();

	}
	
	public void enable() {             //enable line
		textField.setEnabled(true);
		btn7.setEnabled(true);
		btn8.setEnabled(true);
		btn9.setEnabled(true);
		btn0.setEnabled(true);
		btn1.setEnabled(true);
		btn2.setEnabled(true);
		btn3.setEnabled(true);
		btn4.setEnabled(true);
		btn5.setEnabled(true);
		btn6.setEnabled(true);
		btnP.setEnabled(true);
		btnS.setEnabled(true);
		btnD.setEnabled(true);
		btnX.setEnabled(true);
		btnAnswer.setEnabled(true);
		btnBack.setEnabled(true);
		btnFulstop.setEnabled(true);
		btnClear.setEnabled(true);
	}
	
	public void disable() {                  //disable line
		textField.setEnabled(false);
		btn7.setEnabled(false);
		btn8.setEnabled(false);
		btn9.setEnabled(false);
		btn0.setEnabled(false);
		btn1.setEnabled(false);
		btn2.setEnabled(false);
		btn3.setEnabled(false);
		btn4.setEnabled(false);
		btn5.setEnabled(false);
		btn6.setEnabled(false);
		btnP.setEnabled(false);
		btnS.setEnabled(false);
		btnD.setEnabled(false);
		btnX.setEnabled(false);
		btnAnswer.setEnabled(false);
		btnBack.setEnabled(false);
		btnFulstop.setEnabled(false);
		btnClear.setEnabled(false);
		
	}
	


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculater = new JFrame();
		frmCalculater.setIconImage(Toolkit.getDefaultToolkit().getImage(Calculater.class.getResource("/img/icons8-calculator-64.png")));
		frmCalculater.setTitle("CALCULATER");
		frmCalculater.getContentPane().setBackground(Color.DARK_GRAY);
		frmCalculater.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();  //number panel
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(8, 96, 328, 297);
		frmCalculater.getContentPane().add(panel);
		panel.setLayout(null);
		
		btn7 = new JButton("7");  //button 7 
		btn7.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {

			}
		});
		btn7.addMouseListener(new MouseAdapter() {  //button 7 mouse enter
			@Override
			public void mouseEntered(MouseEvent e) {
				btn7.setBackground(Color.GRAY);
				btn7.setForeground(Color.black);
				
			}
			@Override
			public void mouseExited(MouseEvent e) { //button 7 mouse exit
				btn7.setForeground(SystemColor.menu);
				btn7.setBackground(Color.BLACK);
			}
		});
		btn7.addActionListener(new ActionListener() { //button 7 action listener
			public void actionPerformed(ActionEvent e) {
				String number =textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setForeground(SystemColor.menu);  ////button 7 design
		btn7.setFont(new Font("Candara", Font.BOLD, 25));
		btn7.setBackground(Color.BLACK);
		btn7.setBounds(1, 1, 74, 50);
		panel.add(btn7);
		
		btn8 = new JButton("8");  //button 8
		btn8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) { //button 8 mouse enter
				btn8.setBackground(Color.GRAY);
				btn8.setForeground(Color.black);
			}
			@Override
			public void mouseExited(MouseEvent e) {//button 8 exit
				btn8.setForeground(SystemColor.menu);
				btn8.setBackground(Color.BLACK);
			}
		});
		btn8.addActionListener(new ActionListener() { //button 8 action listener
			public void actionPerformed(ActionEvent e) {
				String number =textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setForeground(SystemColor.menu);//button 8 design
		btn8.setFont(new Font("Candara", Font.BOLD, 25));
		btn8.setBackground(Color.BLACK);
		btn8.setBounds(85, 1, 74, 50);
		panel.add(btn8);
		                  
		btn9 = new JButton("9"); //button 9
		btn9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) { //button 9 mouse enter
				btn9.setBackground(Color.GRAY);
				btn9.setForeground(Color.black);
			}
			@Override
			public void mouseExited(MouseEvent e) {//button 9 mouse enter
				btn9.setForeground(SystemColor.menu);
				btn9.setBackground(Color.BLACK);
			}
		});
		btn9.addActionListener(new ActionListener() { //button 9 action listener
			public void actionPerformed(ActionEvent e) {
				String number =textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setForeground(SystemColor.menu);  //button 9 design
		btn9.setFont(new Font("Candara", Font.BOLD, 25));
		btn9.setBackground(Color.BLACK);
		btn9.setBounds(169, 1, 74, 50);
		panel.add(btn9);
		
		btn4 = new JButton("4");//button 4
		btn4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {  //button 4 mouse enter
				btn4.setBackground(Color.GRAY);
				btn4.setForeground(Color.black);;
			}
			@Override
			public void mouseExited(MouseEvent e) { //button 4 mouse exit
				btn4.setForeground(SystemColor.menu);
				btn4.setBackground(Color.BLACK);
			}
		});
		btn4.addActionListener(new ActionListener() { //button 4 action listener
			public void actionPerformed(ActionEvent e) {
				String number =textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setForeground(SystemColor.menu); //button 4 design
		btn4.setFont(new Font("Candara", Font.BOLD, 25));
		btn4.setBackground(Color.BLACK);
		btn4.setBounds(1, 61, 74, 50);
		panel.add(btn4);
		
		btn5 = new JButton("5");  //button 5
		btn5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {  //button 5 mouse enter
				btn5.setBackground(Color.GRAY);
				btn5.setForeground(Color.black);
			}
			@Override
			public void mouseExited(MouseEvent e) {  //button 5 mouse exit
				btn5.setForeground(SystemColor.menu);
				btn5.setBackground(Color.BLACK);
			}
		});
		btn5.addActionListener(new ActionListener() {  //button 5 action listener
			public void actionPerformed(ActionEvent e) {
				String number =textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setForeground(SystemColor.menu);  //button 5 design
		btn5.setFont(new Font("Candara", Font.BOLD, 25));
		btn5.setBackground(Color.BLACK);
		btn5.setBounds(85, 61, 74, 50);
		panel.add(btn5);
		
		btn6 = new JButton("6");  //button 6
		btn6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {  //button 6 mouse enter
				btn6.setBackground(Color.GRAY);
				btn6.setForeground(Color.black);
			}
			@Override
			public void mouseExited(MouseEvent e) {  //button 6 mouse exit
				btn6.setForeground(SystemColor.menu);
				btn6.setBackground(Color.BLACK);
			}
		});
		btn6.addActionListener(new ActionListener() {  //button 6 action listener
			public void actionPerformed(ActionEvent e) {
				String number =textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setForeground(SystemColor.menu);  //button 4 design
		btn6.setFont(new Font("Candara", Font.BOLD, 25));
		btn6.setBackground(Color.BLACK);
		btn6.setBounds(169, 61, 74, 50);
		panel.add(btn6);
		
		btn1 = new JButton("1");  //button 1
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {  //button 1 mouse enter
				btn1.setBackground(Color.GRAY);
				btn1.setForeground(Color.black);
			}
			@Override
			public void mouseExited(MouseEvent e) {  //button 4 mouse exit
				btn1.setForeground(SystemColor.menu);
				btn1.setBackground(Color.BLACK);
			}
		});
		btn1.addActionListener(new ActionListener() {  //button 4 action listener
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setForeground(SystemColor.menu);  //button 1 design
		btn1.setFont(new Font("Candara", Font.BOLD, 25));
		btn1.setBackground(Color.BLACK);
		btn1.setBounds(1, 122, 74, 50);
		panel.add(btn1);
		
		btn2 = new JButton("2");  //button 2 
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {  //button 2 mouse enter
				btn2.setBackground(Color.GRAY);
				btn2.setForeground(Color.black);
			}
			@Override
			public void mouseExited(MouseEvent e) {  //button 2 mouse exit
				btn2.setForeground(SystemColor.menu);
				btn2.setBackground(Color.BLACK);
			}
		});
		btn2.addActionListener(new ActionListener() {  //button 2 action listener
			public void actionPerformed(ActionEvent e) {
				String number =textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setForeground(SystemColor.menu);  //button 2 design
		btn2.setFont(new Font("Candara", Font.BOLD, 25));
		btn2.setBackground(Color.BLACK);
		btn2.setBounds(85, 122, 74, 50);
		panel.add(btn2);
		
		btn3 = new JButton("3");  //button
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {  //button 3 mouse enter
				btn3.setBackground(Color.GRAY);
				btn3.setForeground(Color.black);
			}
			@Override
			public void mouseExited(MouseEvent e) {  //button 2 mouse exit
				btn3.setForeground(SystemColor.menu);
				btn3.setBackground(Color.BLACK);
			}
		});
		btn3.addActionListener(new ActionListener() {  // button 3 action listener
			public void actionPerformed(ActionEvent e) {
				String number =textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setForeground(SystemColor.menu);  //button 3 design
		btn3.setFont(new Font("Candara", Font.BOLD, 25));
		btn3.setBackground(Color.BLACK);
		btn3.setBounds(169, 122, 74, 50);
		panel.add(btn3);
		
		btn0 = new JButton("0");  //button 0
		btn0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {  //button 0 mouse enter
				btn0.setBackground(Color.GRAY);
				btn0.setForeground(Color.black);
			}
			@Override
			public void mouseExited(MouseEvent e) {  //button 0 mouse exit
				btn0.setForeground(SystemColor.menu);
				btn0.setBackground(Color.BLACK);
			}
		});
		btn0.addActionListener(new ActionListener() {  //button 0 action listener
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setForeground(SystemColor.menu);  // button 0 design
		btn0.setFont(new Font("Candara", Font.BOLD, 25));
		btn0.setBackground(Color.BLACK);
		btn0.setBounds(1, 183, 74, 50);
		panel.add(btn0);
		
		btnFulstop = new JButton(".");  //button fulStop
		btnFulstop.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {  // button fulStop mouse enter
				btnFulstop.setBackground(Color.GRAY);
				btnFulstop.setForeground(Color.black);
			}
			@Override
			public void mouseExited(MouseEvent e) {  // button fulStop mouse exit
				btnFulstop.setForeground(SystemColor.menu);
				btnFulstop.setBackground(Color.BLACK);
			}
		});
		btnFulstop.addActionListener(new ActionListener() {  //button fulStop action listener
			public void actionPerformed(ActionEvent e) {
				
				if(textField.getText().contains(".")) {
					return;
				}else{
					String stop = textField.getText() + btnFulstop.getText();
					
					textField.setText(stop);
				}
				
				

			}
		});
		btnFulstop.setForeground(SystemColor.menu);  // button fulStop design
		btnFulstop.setFont(new Font("Candara", Font.BOLD, 25));
		btnFulstop.setBackground(Color.BLACK);
		btnFulstop.setBounds(85, 183, 74, 50);
		panel.add(btnFulstop);
		
		btnAnswer = new JButton("=");  //button equal
		btnAnswer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				second = Double.parseDouble(textField.getText());
				if(operation == "+") {
					result = first + second;
							
                 
                    if (Double.toString(result).endsWith(".0")) {
                        textField.setText(Double.toString(result).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(result));
                    }
                    
			
					
				}else if(operation == "-") {
					result = first - second;

					
                    if (Double.toString(result).endsWith(".0")) {
                        textField.setText(Double.toString(result).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(result));
                    }
                    
					
				}else if(operation == "/"){
					result = first / second;

					
                    if (Double.toString(result).endsWith(".0")) {
                        textField.setText(Double.toString(result).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(result));
                    }
					
				}else if(operation == "*"){
					result = first * second;

					
                    if (Double.toString(result).endsWith(".0")) {
                        textField.setText(Double.toString(result).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(result));
                    }
				}
			}
		});
		btnAnswer.addMouseListener(new MouseAdapter() {  
			@Override
			public void mouseEntered(MouseEvent e) {
				btnAnswer.setBackground(Color.GRAY);
				btnAnswer.setForeground(Color.black);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnAnswer.setForeground(SystemColor.menu);
				btnAnswer.setBackground(Color.BLACK);
			}
		});
		btnAnswer.setForeground(SystemColor.menu);
		btnAnswer.setFont(new Font("Candara", Font.BOLD, 25));
		btnAnswer.setBackground(Color.BLACK);
		btnAnswer.setBounds(169, 183, 74, 50);
		panel.add(btnAnswer);
		
		btnX = new JButton("x"); //button multiplication
		btnX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnX.setBackground(Color.GRAY);
				btnX.setForeground(Color.black);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnX.setForeground(SystemColor.menu);
				btnX.setBackground(Color.BLACK);
			}
		});
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";

			}
		});
		btnX.setForeground(SystemColor.menu);
		btnX.setFont(new Font("Candara", Font.BOLD, 25));
		btnX.setBackground(Color.BLACK);
		btnX.setBounds(253, 1, 74, 50);
		panel.add(btnX);
		
		btnD = new JButton("/"); //button division
		btnD.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnD.setBackground(Color.GRAY);
				btnD.setForeground(Color.black);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnD.setForeground(SystemColor.menu);
				btnD.setBackground(Color.BLACK);
			}
		});
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";

				
			}
		});
		btnD.setForeground(SystemColor.menu);
		btnD.setFont(new Font("Candara", Font.BOLD, 25));
		btnD.setBackground(Color.BLACK);
		btnD.setBounds(253, 61, 74, 50);
		panel.add(btnD);
		
		btnS = new JButton("-");  //subtraction
		btnS.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnS.setBackground(Color.GRAY);
				btnS.setForeground(Color.black);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnS.setForeground(SystemColor.menu);
				btnS.setBackground(Color.BLACK);
			}
		});
		btnS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";

				
			}
		});
		btnS.setForeground(SystemColor.menu);
		btnS.setFont(new Font("Candara", Font.BOLD, 25));
		btnS.setBackground(Color.BLACK);
		btnS.setBounds(253, 122, 74, 50);
		panel.add(btnS);
		
		btnP = new JButton("+");  //addition
		btnP.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnP.setBackground(Color.GRAY);
				btnP.setForeground(Color.black);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnP.setForeground(SystemColor.menu);
				btnP.setBackground(Color.BLACK);
			}
		});
		btnP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
				
				
				
			}
		});
		btnP.setForeground(SystemColor.menu);
		btnP.setFont(new Font("Candara", Font.BOLD, 25));
		btnP.setBackground(Color.BLACK);
		btnP.setBounds(253, 183, 74, 111);
		panel.add(btnP);
		
		btnClear = new JButton("Clear");  //clear button
		btnClear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnClear.setBackground(Color.GRAY);
				btnClear.setForeground(Color.black);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnClear.setForeground(SystemColor.menu);
				btnClear.setBackground(Color.BLACK);
			}
		});
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setForeground(SystemColor.menu);
		btnClear.setFont(new Font("Candara", Font.BOLD, 25));
		btnClear.setBackground(Color.BLACK);
		btnClear.setBounds(1, 244, 158, 50);
		panel.add(btnClear);
		
		btnBack = new JButton("\uF0E7"); //back button
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnBack.setBackground(Color.GRAY);
				btnBack.setForeground(Color.black);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnBack.setForeground(Color.WHITE);
				btnBack.setBackground(Color.BLACK);
				
			}
		});
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Backspace = null;
				if(textField.getText().length()>0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					Backspace = str.toString();
					textField.setText(Backspace);
					
				}
			}
			
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Wingdings", Font.BOLD, 30));
		btnBack.setBackground(Color.BLACK);
		btnBack.setBounds(169, 244, 74, 50);
		panel.add(btnBack);
		
		
		textField = new JTextField();  //settings button
		textField.setEditable(false);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Arial", Font.PLAIN, 15));
		textField.setBounds(10, 38, 326, 50);
		frmCalculater.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Settings");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {

				
				lblNewLabel.setIcon(new ImageIcon(Calculater.class.getResource("/img/103170_settings_tools_preferences_gear_icon.png")));
				lblNewLabel.setForeground(Color.black);
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel.setIcon(new ImageIcon(Calculater.class.getResource("/img/7504225_settings_gear_options_cogwheel_icon.png")));
				lblNewLabel.setForeground(Color.GRAY);
				
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				


			}
		});
		lblNewLabel.setLabelFor(frmCalculater);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setIcon(new ImageIcon(Calculater.class.getResource("/img/7504225_settings_gear_options_cogwheel_icon.png")));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel.setForeground(Color.GRAY);
		lblNewLabel.setBounds(10, 3, 95, 34);
		frmCalculater.getContentPane().add(lblNewLabel);
		
		JRadioButton on = new JRadioButton("ON");
		on.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				on.setForeground(Color.black);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				on.setForeground(Color.GRAY);
			}
		});
		on.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enable();
				textField.setBackground(new Color(255, 255, 255));
				textField.setText(null);
			}
		});
		on.setBackground(Color.DARK_GRAY);
		on.setForeground(Color.GRAY);
		buttonGroup.add(on);
		on.setFont(new Font("Arial", Font.BOLD, 15));
		on.setBounds(226, 8, 55, 23);
		frmCalculater.getContentPane().add(on);
		
		JRadioButton off = new JRadioButton("OFF");
		off.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				off.setForeground(Color.black);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				off.setForeground(Color.GRAY);
			}
		});
		off.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				disable();
				textField.setBackground(Color.DARK_GRAY);
				textField.setText("Calculater off");
			
				
			}
		});
		off.setBackground(Color.DARK_GRAY);
		off.setForeground(Color.GRAY);
		buttonGroup.add(off);
		off.setFont(new Font("Arial", Font.BOLD, 15));
		off.setBounds(283, 8, 55, 23);
		frmCalculater.getContentPane().add(off);
		frmCalculater.setBounds(100, 100, 359, 440);
		frmCalculater.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
