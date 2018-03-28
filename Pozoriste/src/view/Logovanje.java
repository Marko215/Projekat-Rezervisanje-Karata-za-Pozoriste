package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import domen.Korisnik;
import kontroler.Kontroler;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;

public class Logovanje extends JFrame {

	private JPanel contentPane;
	private JTextField tfUser;
	public static int IDKorisnik2;
	private int brojac;
	/**
	 * @return the iDKorisnik2
	 */
	public static int getIDKorisnik2() {
		return IDKorisnik2;
	}

	/**
	 * @param iDKorisnik2 the iDKorisnik2 to set
	 */
	public static void setIDKorisnik2(int iDKorisnik2) {
		IDKorisnik2 = iDKorisnik2;
	}

	private JPasswordField tfPass;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Logovanje frame = new Logovanje();
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
	public Logovanje() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 469, 334);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(30, 144, 255));
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setBounds(61, 60, 86, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1.setBounds(61, 127, 86, 14);
		contentPane.add(lblNewLabel_1);
		
		tfUser = new JTextField();
		tfUser.setBounds(185, 57, 86, 20);
		contentPane.add(tfUser);
		tfUser.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String user=tfUser.getText().toString();
				String pass=tfPass.getText().toString();
				
				  if(user.equals("admin") && pass.equals("admin")) {
				    	 MedjuForma mf=new MedjuForma();
				    	 mf.setVisible(true);
				    	 dispose();
				     }
				  if(user.equals("") && pass.equals("")) {
				    	 JOptionPane.showMessageDialog(null, "Nisu uneti podaci");
				    		 
				     }
				
			   
			     for (Korisnik k : Kontroler.getInstanca().vratiKorisnika2()) {
			    		if(user.equals(k.getUsername())&& pass.equals(k.getPassword())  ) {
			    			IDKorisnik2=k.getIDkorisnika();
			    			
			    			brojac++;
			    			dispose();
			    			
			    		}
			    		
			    	
			     }if(brojac>0) {RezervacijaForma rf=new RezervacijaForma();
	    			rf.setVisible(true);
			    	 
			     }else  {
			    	 
			    	 brojac=0;
			     }
			     
			     
			    
				tfUser.setText("");
				tfPass.setText("");

			}

		});
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnLogin.setBackground(new Color(50, 205, 50));
		btnLogin.setBounds(120, 210, 89, 23);
		contentPane.add(btnLogin);
		
		tfPass = new JPasswordField();
		tfPass.setBounds(185, 126, 86, 20);
		contentPane.add(tfPass);
		
		JCheckBox cbSee = new JCheckBox("Show Password");
		cbSee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cbSee.isSelected())
		        {
		            tfPass.setEchoChar((char)0); 
		        }
		    else
		        {

		            tfPass.setEchoChar('*');
		        }
			}
		});
		cbSee.setBounds(287, 125, 107, 23);
		contentPane.add(cbSee);
		
		JButton btnNewButton = new JButton("Registruj Se");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				RegistracijaForma rf=new RegistracijaForma();
				rf.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBackground(new Color(123, 104, 238));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(271, 212, 144, 23);
		contentPane.add(btnNewButton);
	}
}
