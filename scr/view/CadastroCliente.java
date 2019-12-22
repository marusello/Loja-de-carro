package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

import control.CarrosBLL;
import control.ClienteBLL;
import control.ContraPropostaBLL;
import model.entities.Carros;
import model.entities.Cliente;
import model.entities.ContraProposta;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class CadastroCliente {

	private JFrame frame;
	private JTextField txtNome;
	private JFormattedTextField ftxtTelefone;
	private static JTable tabela;	
	private static DefaultTableModel modelo;
	private static ArrayList<Cliente> clientes;

	public CadastroCliente(ArrayList<Cliente> clienteP) {
		
		clientes = clienteP;
		JTable();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 389);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Cadastro de Cliente", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JLabel lblNome = new JLabel("Nome:");
		
		JLabel lblTelefone = new JLabel("Telefone:");
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		
		
		try{
			MaskFormatter tel = new MaskFormatter("####-####");
			ftxtTelefone = new JFormattedTextField(tel);
			ftxtTelefone.setText("");
			
		}catch (Exception e){
		}
		
		JLabel lblEmail = new JLabel("E-mail:");
		
		JFormattedTextField ftxtEmail = new JFormattedTextField();
		
		JLabel lblCarros = new JLabel("Carros de interesse:");
		
		JButton btnApagar = new JButton("Apagar");
		btnApagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (tabela.getSelectedRow() != -1){
					Cliente cli = new Cliente();
					ClienteBLL cliBll = new ClienteBLL();	

					cli.setCliid((int) tabela.getValueAt(tabela.getSelectedRow(), 0));
					
					cliBll.deleteCliente(cli);
					String filtro = txtNome.getText();
					ArrayList<Cliente> cliente = cliBll.selectCliente(filtro);	
					pesquisar(modelo, cliente);
					JOptionPane.showMessageDialog(null, "Cliente excluido com sucesso!");
					
				} else {
					JOptionPane.showMessageDialog(null, "Selecione um Cliente para excluir.");
				}	
			}
		});
		
		JScrollPane barraRolagem = new JScrollPane(tabela);
		barraRolagem.setToolTipText("");
		
		JFormattedTextField txtvalor = new JFormattedTextField();
		
		JLabel lblContraproposta = new JLabel("Contraproposta");
		
		JScrollPane scrollPane = new JScrollPane();
		
		//tabela = new JTable();
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(40)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNome)
								.addComponent(lblTelefone)
								.addComponent(lblEmail)
								.addComponent(lblContraproposta)
								.addComponent(lblCarros, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
											.addComponent(ftxtEmail, Alignment.LEADING)
											.addComponent(txtNome, Alignment.LEADING)
											.addComponent(ftxtTelefone, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
										.addComponent(txtvalor, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED, 6, Short.MAX_VALUE))
								.addComponent(btnApagar))))
					.addGap(13))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNome)
						.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTelefone)
						.addComponent(ftxtTelefone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEmail)
						.addComponent(ftxtEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(12)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblContraproposta)
						.addComponent(txtvalor, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(24)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnApagar)
						.addComponent(lblCarros))
					.addGap(20)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
					.addContainerGap())
		);
		tabela = new JTable(modelo);
		scrollPane.setViewportView(tabela);
		panel.setLayout(gl_panel);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtNome.getText() == " " || ftxtEmail.getText() == " " || txtvalor.getText() == " ") {
					JOptionPane.showMessageDialog(null, "Favor, preencher todos os campos.");
				}else {
					ClienteBLL cli = new ClienteBLL();
					ContraPropostaBLL car = new ContraPropostaBLL();
					
					cli.insertCliente(new Cliente(
							txtNome.getText(), 
							ftxtTelefone.getText(), 
							ftxtEmail.getText()));				
					
					car.insertContraProposta(new ContraProposta(
							Double.parseDouble(txtvalor.getText())));
					
					JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
					new Catalogo();	
					frame.dispose();
				}
			}
		});
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Catalogo();				
				frame.dispose();
			}
		});
		
		JButton btnLimparTudo = new JButton("Limpar Tudo");
		btnLimparTudo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNome.setText("");
				ftxtTelefone.setValue("");
				ftxtEmail.setText("");
				txtvalor.setText("");
				
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(21)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnLimparTudo)
							.addGap(7)
							.addComponent(btnCancelar)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnSalvar))
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 407, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(12)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 299, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnSalvar)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnLimparTudo)
							.addComponent(btnCancelar)))
					.addGap(5))
		);
		frame.getContentPane().setLayout(groupLayout);
		frame.setVisible(true);
	}
	
	private static void JTable() {
		try {
			modelo = new DefaultTableModel();
			
	        modelo.addColumn("ID");
	        modelo.addColumn("Nome");
	        modelo.addColumn("E-mail");
	        modelo.addColumn("Telefone");
	      
	        
	        pesquisar(modelo, clientes);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao criar tabela.");
		}
		
	}
     
	private static void pesquisar(DefaultTableModel modelo, ArrayList<Cliente> clientes) {
		modelo.setNumRows(0);
        
        try {
	        for (Cliente cli : clientes) {
	           /* modelo.addRow(new Object[]{car.getId(), car.getModelo(), car.getMarca(), car.getAno(),
	            		car.getCidade(), car.getEstado(), car.getPlaca(), car.getChassi(), car.getKm(),
	            		car.getPreco(), car.getCombustivel()});*/
	            
	            modelo.addRow(new Object[]{cli.getCliid(), cli.getClinome(), 
	            		cli.getCliemail(), cli.getClitelefone()});
	        }
        } catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao preencher a tabela.");
		}
	}
}
