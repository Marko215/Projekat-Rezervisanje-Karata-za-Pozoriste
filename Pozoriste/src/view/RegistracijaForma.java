package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import domen.Autor;
import domen.Korisnik;
import kontroler.Kontroler;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Frame;
import java.awt.JobAttributes;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import java.awt.Color;

public class RegistracijaForma extends JFrame {

	private JPanel contentPane;
	private JTextField tfIme;
	private JTextField tfPrezime;
	private JTextField tfUsername;
	private JPasswordField tfPassword2;
	private JTextField tfEmail;
	private JPasswordField tfPassword;
    private boolean provera,provera2,pomocna3;
    private String Username;
    private int brojac;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistracijaForma frame = new RegistracijaForma();
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
	public RegistracijaForma() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 469, 521);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(30, 144, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ime");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(43, 49, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Prezime");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(43, 108, 77, 17);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Username");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(43, 160, 77, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Password");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(43, 229, 77, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Password");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(43, 290, 77, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("E-mail");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(43, 353, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		tfIme = new JTextField();
		tfIme.setBounds(130, 46, 86, 20);
		contentPane.add(tfIme);
		tfIme.setColumns(10);
		
		tfPrezime = new JTextField();
		tfPrezime.setBounds(130, 105, 86, 20);
		contentPane.add(tfPrezime);
		tfPrezime.setColumns(10);
		
		tfUsername = new JTextField();
		tfUsername.setBounds(130, 157, 86, 20);
		contentPane.add(tfUsername);
		tfUsername.setColumns(10);
		
		tfPassword2 = new JPasswordField();
		tfPassword2.setBounds(130, 289, 117, 20);
		contentPane.add(tfPassword2);
		
		tfEmail = new JTextField();
		tfEmail.setBounds(130, 352, 112, 20);
		contentPane.add(tfEmail);
		tfEmail.setColumns(10);
		tfPassword = new JPasswordField();
		tfPassword.setBounds(130, 228, 117, 20);
		contentPane.add(tfPassword);
	
		
		JButton btnRegistracija = new JButton("Registruj Se");
		btnRegistracija.setBackground(new Color(255, 215, 0));
		btnRegistracija.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String imekorisnika=tfIme.getText().toString();
				String prezimekorisnika=tfPrezime.getText().toString();
				
				String usernamekorisnika=tfUsername.getText().toString();
				String password=tfPassword.getText().toString();
				String password2=tfPassword2.getText().toString();
				String emial=tfEmail.getText().toString();
				if(password.equals(password2)){
					provera=true;
					
				}
				else {
					provera=false;
					JOptionPane.showMessageDialog(null,"Passwordi nisu isti");
				}
				if(emial.contains("@")) {
					provera2=true;
					
				}
				else {
					provera2=false;
				JOptionPane.showMessageDialog(null,"Email niju unet ispravno");
				}
				if(imekorisnika.equals("")|| emial.equals("") || password.equals("")||password2.equals("")||usernamekorisnika.equals("")) {
					JOptionPane.showMessageDialog(null, "Nisu Uneti Podaci");	
				}else if(provera==true && provera2==true) {
					
					for (Korisnik k : Kontroler.getInstanca().vratiKorisnika2()) {
						if(usernamekorisnika.equals(k.getUsername())) {
							JOptionPane.showMessageDialog(null,"Korisnik postoji");
							
							brojac++;
							
							
						}
							
						
					
						
					
					}
					if(brojac==0) {
						Kontroler.getInstanca().dodajKorisnika(imekorisnika,prezimekorisnika,usernamekorisnika,password,emial);
						JOptionPane.showMessageDialog(null,"Registracija Uspesna");
						Logovanje lf=new Logovanje();
						lf.setVisible(true);
					
				}else {
					brojac=0;
				}
					
				}
				
			   
				
				
					
				
			}
		});
		btnRegistracija.setBounds(130, 423, 112, 23);
		contentPane.add(btnRegistracija);
		
		JCheckBox cbpa2 = new JCheckBox("Show Password");
		cbpa2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cbpa2.isSelected())
		        {
		            tfPassword2.setEchoChar((char)0); 
		        }
		    else
		        {

		            tfPassword2.setEchoChar('*');
		        }
			}
		});
		cbpa2.setBounds(267, 288, 136, 23);
		contentPane.add(cbpa2);
		
		JCheckBox cbpa1 = new JCheckBox("Show Password");
		cbpa1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cbpa1.isSelected())
		        {
		            tfPassword.setEchoChar((char)0); 
		        }
		    else
		        {

		            tfPassword.setEchoChar('*');
		        }
			}
		});
		cbpa1.setBounds(267, 227, 136, 23);
		contentPane.add(cbpa1);
		
		
}
}