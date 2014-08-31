package pixelhahn;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

public class WhatName extends JFrame {

	private JPanel contentPane;
	private AbstractButton editorPane_1;
	private AbstractButton editorPane;
	private AbstractButton editorPane_2;
	private AbstractButton editorPane_3;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WhatName frame = new WhatName();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public WhatName() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(WhatName.class.getResource("/pixelhahn/h.png")));
		setBackground(new Color(153, 255, 102));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 448, 528);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(153, 255, 153));
		setResizable(false);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		  
		
	    String newVorname = new String(editorPane.getText());
	    String newNachname = new String(editorPane_1.getText());
	    String newGeschlecht = new String(editorPane_2.getText());
	    String newWohnort = new String(editorPane_3.getText());
		
		
		 JTextPane txtpnVorname = new JTextPane();
		 txtpnVorname.setForeground(new Color(0, 0, 0));
		 txtpnVorname.setFont(new Font("Tahoma", Font.PLAIN, 11));
		 txtpnVorname.setBackground(SystemColor.info);
		   txtpnVorname.setEditable(false);
		   txtpnVorname.setText("Vorname");
		   txtpnVorname.setBounds(38, 19, 155, 20);
		   contentPane.add(txtpnVorname);
		   
		   JTextPane txtpnNachname = new JTextPane();
		   txtpnNachname.setBackground(SystemColor.info);
		   txtpnNachname.setEditable(false);
		   txtpnNachname.setText("Nachname");
		   txtpnNachname.setBounds(252, 19, 155, 20);
		   contentPane.add(txtpnNachname);
		   
		   JTextPane txtpnGeschlecht = new JTextPane();
		   txtpnGeschlecht.setBackground(SystemColor.info);
		   txtpnGeschlecht.setEditable(false);
		   txtpnGeschlecht.setText("Geschlecht");
		   txtpnGeschlecht.setBounds(38, 90, 155, 20);
		   contentPane.add(txtpnGeschlecht);
		   
		   JTextPane txtpnWohnort = new JTextPane();
		   txtpnWohnort.setBackground(SystemColor.info);
		   txtpnWohnort.setEditable(false);
		   txtpnWohnort.setText("Wohnort");
		   txtpnWohnort.setBounds(252, 90, 155, 20);
		   contentPane.add(txtpnWohnort);
		   
		   JEditorPane editorPane = new JEditorPane();
		   editorPane.setBounds(38, 50, 155, 20);
		   contentPane.add(editorPane);
		  
		   
		   JEditorPane editorPane_1 = new JEditorPane();
		   editorPane_1.setBounds(252, 50, 155, 20);
		   contentPane.add(editorPane_1);
		   
		   
		   JEditorPane editorPane_2 = new JEditorPane();
		   editorPane_2.setBounds(38, 121, 155, 20);
		   contentPane.add(editorPane_2);
		   
		   
		   JEditorPane editorPane_3 = new JEditorPane();
		   editorPane_3.setBounds(252, 121, 155, 20);
		   contentPane.add(editorPane_3);
		  
		   
		   JTextArea txtrGebenSieIhre = new JTextArea();
		   txtrGebenSieIhre.setLineWrap(true);
		   txtrGebenSieIhre.setWrapStyleWord(true);
		   txtrGebenSieIhre.setEditable(false);
		   txtrGebenSieIhre.setBackground(SystemColor.info);
		   txtrGebenSieIhre.setText("Geben Sie ihre Daten an.");
		   txtrGebenSieIhre.setBounds(38, 186, 369, 241);
		   contentPane.add(txtrGebenSieIhre);
		   
		
		JButton btn4 = new JButton("Zu den Angaben");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtrGebenSieIhre.setText("Name " + newVorname);
				
			}
		});
	   btn4.setBounds(10, 463, 424, 23);
	   contentPane.add(btn4);
	   
	   
	   
	
	   
		
	}
}
