package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class MedjuForma extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MedjuForma frame = new MedjuForma();
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
	public MedjuForma() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 545, 413);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(30, 144, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAutor = new JButton("Autor");
		btnAutor.setBackground(new Color(50, 205, 50));
		btnAutor.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAutor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AutorForma af=new AutorForma();
				af.setVisible(true);
			}
		});
		btnAutor.setBounds(72, 92, 89, 23);
		contentPane.add(btnAutor);
		
		JButton btnPozoriste = new JButton("Pozoriste");
		btnPozoriste.setBackground(new Color(50, 205, 50));
		btnPozoriste.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnPozoriste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PozoristeForma pf=new PozoristeForma();
				pf.setVisible(true);
			}
		});
		btnPozoriste.setBounds(323, 92, 118, 23);
		contentPane.add(btnPozoriste);
		
		JButton btnZanr = new JButton("Zanr");
		btnZanr.setBackground(new Color(50, 205, 50));
		btnZanr.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnZanr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ZanrForma zf=new ZanrForma();
				zf.setVisible(true);
			}
		});
		btnZanr.setBounds(72, 254, 89, 23);
		contentPane.add(btnZanr);
		
		JButton btnPredstava = new JButton("Predstava");
		btnPredstava.setBackground(new Color(50, 205, 50));
		btnPredstava.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnPredstava.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PredstavaForma prf=new PredstavaForma();
				prf.setVisible(true);
			}
		});
		btnPredstava.setBounds(323, 254, 118, 23);
		contentPane.add(btnPredstava);
	}
}
