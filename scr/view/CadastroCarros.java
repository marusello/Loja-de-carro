package view;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import model.entities.Carros;
import model.entities.Cidades;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import com.toedter.calendar.JYearChooser;

import control.CarrosBLL;
import control.CidadesBLL;

public class CadastroCarros {

	JFrame frame;
	private JTextField txtModelo;
	private JTextField txtChassi;
	
	
	public CadastroCarros() {
		frame = new JFrame();
		frame.setBounds(100, 100, 373, 518);
		
		JPanel panelCarro = new JPanel();
		panelCarro.setBorder(new TitledBorder(null, "Carro", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JPanel panelDoc = new JPanel();
		panelDoc.setBorder(new TitledBorder(null, "Documentacao", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JLabel lblChassi = new JLabel("Chassi:");
		
		txtChassi = new JTextField();
		txtChassi.setColumns(10);
		
		JLabel lblPlaca = new JLabel("Placa:");
		
		JLabel lblKm = new JLabel("Km:");
		
		JLabel lblPreo = new JLabel("Pre\u00E7o:");
		
		JLabel lblCombustivel = new JLabel("Combustivel:");
		
		JComboBox cbCombustivel = new JComboBox();
		cbCombustivel.setModel(new DefaultComboBoxModel(new String[] {null, "Flex", "Gasolina", "Diesel"}));
		
		
		JFormattedTextField ftxtPreco = new JFormattedTextField();
		
		JFormattedTextField ftxtPlaca = new JFormattedTextField();
		
		JFormattedTextField ftxtKm = new JFormattedTextField();
		
		JLabel lblEstado = new JLabel("Estado:");
		
		
		JComboBox cbEstado = new JComboBox();
		
		cbEstado.setModel(new DefaultComboBoxModel(new String[] {null, "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"}));
		
		JLabel lblCidade = new JLabel("Cidade:");
		
		CidadesBLL cid = new CidadesBLL();
		JComboBox<Cidades> cbCidade = new JComboBox<Cidades>();
		
		cbEstado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cbEstado.getSelectedItem().toString() == "AC") {
					cbCidade.setModel(new DefaultComboBoxModel(new String[] {null}));
					for (Cidades c : cid.getACCidades()) {
						cbCidade.addItem(c);
					}
				}else if(cbEstado.getSelectedItem().toString() == "AL") {
					cbCidade.setModel(new DefaultComboBoxModel(new String[] {null}));
					for (Cidades c : cid.getALCidades()) {
						cbCidade.addItem(c);
					}
				}else if(cbEstado.getSelectedItem().toString() == "AP") {
					cbCidade.setModel(new DefaultComboBoxModel(new String[] {null}));
					for (Cidades c : cid.getAPCidades()) {
						cbCidade.addItem(c);
					}
				}else if(cbEstado.getSelectedItem().toString() == "AM") {
					cbCidade.setModel(new DefaultComboBoxModel(new String[] {null}));
					for (Cidades c : cid.getAMCidades()) {
						cbCidade.addItem(c);
					}
				}else if(cbEstado.getSelectedItem().toString() == "BA") {
					cbCidade.setModel(new DefaultComboBoxModel(new String[] {null}));
					for (Cidades c : cid.getBACidades()) {
						cbCidade.addItem(c);
					}
				}else if(cbEstado.getSelectedItem().toString() == "CE") {
					cbCidade.setModel(new DefaultComboBoxModel(new String[] {null}));
					for (Cidades c : cid.getCECidades()) {
						cbCidade.addItem(c);
					}
				}else if(cbEstado.getSelectedItem().toString() == "DF") {
					cbCidade.setModel(new DefaultComboBoxModel(new String[] {null}));
					for (Cidades c : cid.getDFCidades()) {
						cbCidade.addItem(c);
					}
				}else if(cbEstado.getSelectedItem().toString() == "ES") {
					cbCidade.setModel(new DefaultComboBoxModel(new String[] {null}));
					for (Cidades c : cid.getESCidades()) {
						cbCidade.addItem(c);
					}
				}else if(cbEstado.getSelectedItem().toString() == "GO") {
					cbCidade.setModel(new DefaultComboBoxModel(new String[] {null}));
					for (Cidades c : cid.getGOCidades()) {
						cbCidade.addItem(c);
					}
				}else if(cbEstado.getSelectedItem().toString() == "MA") {
					cbCidade.setModel(new DefaultComboBoxModel(new String[] {null}));
					for (Cidades c : cid.getMACidades()) {
						cbCidade.addItem(c);
					}
				}else if(cbEstado.getSelectedItem().toString() == "MT") {
					cbCidade.setModel(new DefaultComboBoxModel(new String[] {null}));
					for (Cidades c : cid.getMTCidades()) {
						cbCidade.addItem(c);
					}
				}else if(cbEstado.getSelectedItem().toString() == "MS") {
					cbCidade.setModel(new DefaultComboBoxModel(new String[] {null}));
					for (Cidades c : cid.getMSCidades()) {
						cbCidade.addItem(c);
					}
				}else if(cbEstado.getSelectedItem().toString() == "MG") {
					cbCidade.setModel(new DefaultComboBoxModel(new String[] {null}));
					for (Cidades c : cid.getMGCidades()) {
						cbCidade.addItem(c);
					}
				}else if(cbEstado.getSelectedItem().toString() == "PA") {
					cbCidade.setModel(new DefaultComboBoxModel(new String[] {null}));
					for (Cidades c : cid.getPACidades()) {
						cbCidade.addItem(c);
					}
				}else if(cbEstado.getSelectedItem().toString() == "PB") {
					cbCidade.setModel(new DefaultComboBoxModel(new String[] {null}));
					for (Cidades c : cid.getPBCidades()) {
						cbCidade.addItem(c);
					}
				}else if(cbEstado.getSelectedItem().toString() == "PE") {
					cbCidade.setModel(new DefaultComboBoxModel(new String[] {null}));
					for (Cidades c : cid.getPECidades()) {
						cbCidade.addItem(c);
					}
				}else if(cbEstado.getSelectedItem().toString() == "PI") {
					cbCidade.setModel(new DefaultComboBoxModel(new String[] {null}));
					for (Cidades c : cid.getPICidades()) {
						cbCidade.addItem(c);
					}
				}else if(cbEstado.getSelectedItem().toString() == "PR") {
					cbCidade.setModel(new DefaultComboBoxModel(new String[] {null}));
					for (Cidades c : cid.getPRCidades()) {
						cbCidade.addItem(c);
					}
				}else if(cbEstado.getSelectedItem().toString() == "RJ") {
					cbCidade.setModel(new DefaultComboBoxModel(new String[] {null}));
					for (Cidades c : cid.getRJCidades()) {
						cbCidade.addItem(c);
					}
				}else if(cbEstado.getSelectedItem().toString() == "RN") {
					cbCidade.setModel(new DefaultComboBoxModel(new String[] {null}));
					for (Cidades c : cid.getRNCidades()) {
						cbCidade.addItem(c);
					}
				}else if(cbEstado.getSelectedItem().toString() == "RS") {
					cbCidade.setModel(new DefaultComboBoxModel(new String[] {null}));
					for (Cidades c : cid.getRSCidades()) {
						cbCidade.addItem(c);
					}
				}else if(cbEstado.getSelectedItem().toString() == "RO") {
					cbCidade.setModel(new DefaultComboBoxModel(new String[] {null}));
					for (Cidades c : cid.getROCidades()) {
						cbCidade.addItem(c);
					}
				}else if(cbEstado.getSelectedItem().toString() == "RR") {
					cbCidade.setModel(new DefaultComboBoxModel(new String[] {null}));
					for (Cidades c : cid.getRRCidades()) {
						cbCidade.addItem(c);
					}
				}else if(cbEstado.getSelectedItem().toString() == "SC") {
					cbCidade.setModel(new DefaultComboBoxModel(new String[] {null}));
					for (Cidades c : cid.getSCCidades()) {
						cbCidade.addItem(c);
					}
				}else if(cbEstado.getSelectedItem().toString() == "SE") {
					cbCidade.setModel(new DefaultComboBoxModel(new String[] {null}));
					for (Cidades c : cid.getSECidades()) {
						cbCidade.addItem(c);
					}
				}else if(cbEstado.getSelectedItem().toString() == "SP") {
					cbCidade.setModel(new DefaultComboBoxModel(new String[] {null}));
					for (Cidades c : cid.getSPCidades()) {
						cbCidade.addItem(c);
					}
				}else if(cbEstado.getSelectedItem().toString() == "TO") {
					cbCidade.setModel(new DefaultComboBoxModel(new String[] {null}));
					for (Cidades c : cid.getTOCidades()) {
						cbCidade.addItem(c);
					}
				}else {
					cbCidade.setModel(new DefaultComboBoxModel(new String[] {null}));
				}
			}
		});
		
		
		GroupLayout gl_panelDoc = new GroupLayout(panelDoc);
		gl_panelDoc.setHorizontalGroup(
			gl_panelDoc.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelDoc.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelDoc.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelDoc.createSequentialGroup()
							.addGroup(gl_panelDoc.createParallelGroup(Alignment.LEADING)
								.addComponent(lblChassi, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
								.addComponent(lblPlaca, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
								.addComponent(lblCidade, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
								.addComponent(lblEstado, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(gl_panelDoc.createSequentialGroup()
							.addComponent(lblCombustivel, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
							.addGap(18))
						.addGroup(gl_panelDoc.createSequentialGroup()
							.addComponent(lblKm, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
							.addGap(71))
						.addGroup(gl_panelDoc.createSequentialGroup()
							.addComponent(lblPreo, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGap(17)
					.addGroup(gl_panelDoc.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panelDoc.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panelDoc.createParallelGroup(Alignment.LEADING, false)
								.addComponent(cbCidade, 0, 130, Short.MAX_VALUE)
								.addComponent(ftxtPlaca, GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
								.addComponent(txtChassi))
							.addComponent(ftxtKm, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
							.addComponent(ftxtPreco, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
							.addComponent(cbCombustivel, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
						.addComponent(cbEstado, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE))
					.addGap(33))
		);
		gl_panelDoc.setVerticalGroup(
			gl_panelDoc.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelDoc.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelDoc.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEstado)
						.addComponent(cbEstado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelDoc.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCidade)
						.addComponent(cbCidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelDoc.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPlaca)
						.addComponent(ftxtPlaca, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelDoc.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblChassi)
						.addComponent(txtChassi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelDoc.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblKm)
						.addComponent(ftxtKm, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelDoc.createParallelGroup(Alignment.BASELINE)
						.addComponent(ftxtPreco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPreo))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panelDoc.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCombustivel)
						.addComponent(cbCombustivel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(18, Short.MAX_VALUE))
		);
		panelDoc.setLayout(gl_panelDoc);
		
		JLabel lblModelo = new JLabel("Modelo:");
		
		txtModelo = new JTextField();
		txtModelo.setColumns(10);
		
		JLabel lblMarca = new JLabel("Marca:");
		
		JLabel lblAno = new JLabel("Ano:");
		
		JComboBox cbMarca = new JComboBox();
		cbMarca.setModel(new DefaultComboBoxModel(new String[] {null, "Audi", "BMW", "Chevrolet", "Chrysler", "Dodge", "Fiat", "Ford", "Honda", "Hyundai", "Jeep", "Kia", "Lamborghini", "Mitsubishi", "Nissan","Renault", "Subaru", "Toyota", "Volkswagen"}));
		
		JYearChooser yearChooser = new JYearChooser();
		GroupLayout gl_panelCarro = new GroupLayout(panelCarro);
		gl_panelCarro.setHorizontalGroup(
			gl_panelCarro.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelCarro.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelCarro.createParallelGroup(Alignment.LEADING)
						.addComponent(lblAno, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblMarca, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblModelo))
					.addGap(60)
					.addGroup(gl_panelCarro.createParallelGroup(Alignment.LEADING)
						.addComponent(yearChooser, GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
						.addComponent(txtModelo, GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
						.addComponent(cbMarca, 0, 162, Short.MAX_VALUE))
					.addGap(31))
		);
		gl_panelCarro.setVerticalGroup(
			gl_panelCarro.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelCarro.createSequentialGroup()
					.addGroup(gl_panelCarro.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtModelo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblModelo))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelCarro.createParallelGroup(Alignment.BASELINE)
						.addComponent(cbMarca, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblMarca))
					.addGap(18)
					.addGroup(gl_panelCarro.createParallelGroup(Alignment.LEADING)
						.addComponent(lblAno)
						.addComponent(yearChooser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(11))
		);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtModelo.getText() == " " || cbMarca.getSelectedItem() == null || yearChooser.equals(null)
						|| cbEstado.getSelectedItem() == null || cbCidade.getSelectedItem() == null 
						|| ftxtPlaca.getText() == " " || txtChassi.getText() == " " || ftxtKm.getText() == " " 
						|| ftxtPreco.getText() == " " || cbCombustivel.getSelectedItem() == null) {
					JOptionPane.showMessageDialog(null, "Favor, preencher todos os campos.");
				}else {
					
					CarrosBLL car = new CarrosBLL();
					car.insertCarros(new Carros(
							txtModelo.getText(), 
							cbMarca.getSelectedItem().toString(), 
							yearChooser.getValue(),
							cbCidade.getSelectedItem().toString(),
							cbEstado.getSelectedItem().toString(), 
							ftxtPlaca.getText(), 
							txtChassi.getText(), 
							Double.parseDouble(ftxtKm.getText()), 
							Double.parseDouble(ftxtPreco.getText()), 
							cbCombustivel.getSelectedItem().toString()));
					
					JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
				}
			}
		});
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Menu();
				frame.dispose();
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(22)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panelDoc, 0, 0, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnCancelar)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnSalvar))
						.addComponent(panelCarro, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(28)
					.addComponent(panelCarro, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panelDoc, GroupLayout.PREFERRED_SIZE, 233, GroupLayout.PREFERRED_SIZE)
					.addGap(14)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCancelar)
						.addComponent(btnSalvar))
					.addContainerGap(55, Short.MAX_VALUE))
		);
		
		panelCarro.setLayout(gl_panelCarro);
		frame.getContentPane().setLayout(groupLayout);
		frame.setVisible(true);
	}
}
