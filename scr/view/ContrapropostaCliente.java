package view;


import javax.swing.JFrame;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import control.ClienteBLL;
import control.ContraPropostaBLL;
import model.entities.Cliente;
import model.entities.ContraProposta;

import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JFormattedTextField;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class ContrapropostaCliente {

	private JFrame frame;

	
	public ContrapropostaCliente() {
		frame = new JFrame();
		frame.setBounds(100, 100, 437, 241);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panelCliente = new JPanel();
		panelCliente.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Cliente", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		ClienteBLL cli = new ClienteBLL();
		JComboBox<Cliente> comboBox = new JComboBox<Cliente>();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {null}));
		for (Cliente c : cli.selectCliente("")) {
			comboBox.addItem(c);
		}
		
		GroupLayout gl_panelCliente = new GroupLayout(panelCliente);
		gl_panelCliente.setHorizontalGroup(
			gl_panelCliente.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panelCliente.createSequentialGroup()
					.addContainerGap()
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 368, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(21, Short.MAX_VALUE))
		);
		gl_panelCliente.setVerticalGroup(
			gl_panelCliente.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panelCliente.createSequentialGroup()
					.addContainerGap()
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(12, Short.MAX_VALUE))
		);
		panelCliente.setLayout(gl_panelCliente);
		
		JPanel panelContraproposta = new JPanel();
		panelContraproposta.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Contraproposta", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JFormattedTextField ftxtValor = new JFormattedTextField();
		GroupLayout gl_panelContraproposta = new GroupLayout(panelContraproposta);
		gl_panelContraproposta.setHorizontalGroup(
			gl_panelContraproposta.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panelContraproposta.createSequentialGroup()
					.addContainerGap(140, Short.MAX_VALUE)
					.addComponent(ftxtValor, GroupLayout.PREFERRED_SIZE, 221, GroupLayout.PREFERRED_SIZE)
					.addGap(34))
		);
		gl_panelContraproposta.setVerticalGroup(
			gl_panelContraproposta.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelContraproposta.createSequentialGroup()
					.addComponent(ftxtValor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(10, Short.MAX_VALUE))
		);
		panelContraproposta.setLayout(gl_panelContraproposta);
		
		JButton button = new JButton("Cancelar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedItem() == null || ftxtValor.getText() == " ") {
					JOptionPane.showMessageDialog(null, "Favor, preencher todos os campos.");
				}else {
					
					ContraPropostaBLL car = new ContraPropostaBLL();
					car.insertContraProposta(new ContraProposta(
							Double.parseDouble(ftxtValor.getText())));
							//comboBox.getSelectedItem().toString()));
					 
					JOptionPane.showMessageDialog(null, "Contraproposta enviada!");
					frame.dispose();
				}
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(button, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnEnviar, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(15)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(panelContraproposta, GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
								.addComponent(panelCliente, GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE))))
					.addGap(15))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(panelCliente, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panelContraproposta, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnEnviar)
						.addComponent(button))
					.addGap(243))
		);
		frame.getContentPane().setLayout(groupLayout);
		frame.setVisible(true);
	}
}
