package view;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;

import control.CarrosBLL;
import control.ClienteBLL;

import model.entities.Cliente;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;

public class Catalogo {

	private JFrame frame;
	
	CarrosBLL ctrl = new CarrosBLL();
	ClienteBLL ctrlCli = new ClienteBLL();

	public Catalogo() {
		frame = new JFrame();
		frame.setBounds(100, 100, 923, 496);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Nissan VERSA UNIQUE 1.6 16V FlexStart 4p Aut. 2017 Gasolina", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JLabel lblDestaques = new JLabel("PROMO\u00C7\u00D5ES");
		lblDestaques.setFont(new Font("Mongolian Baiti", Font.PLAIN, 20));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Honda Fit Personal 1.5 Flexone 16V 5p Aut. 2018 Gasolina", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 588, Short.MAX_VALUE)
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 158, Short.MAX_VALUE)
		);
		panel_1.setLayout(gl_panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Ford Ka 1.0 SE/SE Plus TiVCT Flex 5p 2019 Gasolina", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 402, Short.MAX_VALUE)
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 130, Short.MAX_VALUE)
		);
		panel_2.setLayout(gl_panel_2);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Login();
			}
		});
		
		
		JButton btnNissanVersa = new JButton("\r\n\r\nR$ 55.063,00");
		btnNissanVersa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ArrayList<Cliente> cli = ctrlCli.selectCliente("");
				new CadastroCliente(cli);
				frame.dispose();
			}
		});
		btnNissanVersa.setIcon(new ImageIcon("img/2017-Nissan-Versa-01-2.jpg"));
		
		JButton btnR_2 = new JButton("\nR$ 57.340,00");
		btnR_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Cliente> cli = ctrlCli.selectCliente("");
				new CadastroCliente(cli);
				frame.dispose();
			}
		});
		btnR_2.setIcon(new ImageIcon("img/Honda-Fit-EX-2018-CVT-2.jpg"));
		
		JLabel lblNewLabel = new JLabel("Nissan VERSA UNIQUE 1.6 16V FlexStart 4p Aut. 2017 Gasolina");
		
		JLabel lblNewLabel_1 = new JLabel("Honda Fit Personal 1.5 Flexone 16V 5p Aut. 2018 Gasolina");
		
		JButton btnR_1 = new JButton("\r\n\r\nR$ 40.093,00");
		btnR_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Cliente> cli = ctrlCli.selectCliente("");
				new CadastroCliente(cli);
				frame.dispose();
			}
		});
		btnR_1.setIcon(new ImageIcon("img/Ford-Ka-SE-Plus-2019-traseira-2.jpg"));
		
		
		btnR_1.setToolTipText("");
		
		JLabel lblNewLabel_2 = new JLabel("Ford Ka 1.0 SE/SE Plus TiVCT Flex 5p 2019 Gasolina");
		
		JButton button = new JButton("\r\n\r\nR$ 45.364,00");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Cliente> cli = ctrlCli.selectCliente("");
				new CadastroCliente(cli);
				frame.dispose();
			}
		});
		
		button.setIcon(new ImageIcon("img/volkswagen-fox-2018-2.jpg"));
		
		JLabel lblVolkswagenFoxConnect = new JLabel("VolksWagen Fox Connect 1.6 Flex 8V 5p 2019 Gasolina");
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(47)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblVolkswagenFoxConnect)
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(btnNissanVersa, GroupLayout.PREFERRED_SIZE, 351, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 385, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnVoltar, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)))
						.addComponent(button, GroupLayout.PREFERRED_SIZE, 353, GroupLayout.PREFERRED_SIZE))
					.addGap(47)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(btnR_1, GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
								.addComponent(btnR_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
								.addComponent(lblNewLabel_1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 377, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(panel, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
										.addComponent(panel_1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
									.addGap(735))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 414, GroupLayout.PREFERRED_SIZE)
									.addContainerGap())))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 341, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblDestaques)
					.addContainerGap(1467, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(lblDestaques)
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(11)
							.addComponent(lblNewLabel_2)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(btnR_1, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblVolkswagenFoxConnect)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1)
								.addComponent(lblNewLabel))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnNissanVersa, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnR_2, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE))))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnVoltar)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 583, Short.MAX_VALUE)
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 169, Short.MAX_VALUE)
		);
		panel.setLayout(gl_panel);
		frame.getContentPane().setLayout(groupLayout);
		frame.setVisible(true);
	}
}
