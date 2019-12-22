package view;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import control.ClienteBLL;
import control.UsuarioBLL;
import model.entities.Cliente;
import model.entities.Usuario;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class CadastroUsuario {

	private JFrame frame;
	private JTextField txtNome;
	private JTextField txtRegistro;
	private static JTable tabela;	
	private static DefaultTableModel modelo;
	private static ArrayList<Usuario> usuarios;

	public CadastroUsuario(ArrayList<Usuario> usuarioP) {
		usuarios = usuarioP;
		JTable();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 391, 403);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Usuário", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JLabel lblAtivo = new JLabel("Cargo:");
		
		JComboBox cbCargo = new JComboBox();
		cbCargo.setModel(new DefaultComboBoxModel(new String[] {" ", "Gerente", "Funcionario"}));
		
		JLabel lblRegistro = new JLabel("Senha:");
		
		JLabel lblNome = new JLabel("Nome:");
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
						
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtNome.getText() == " " || txtRegistro.getText() == " " || cbCargo.getSelectedItem() == null) {
					JOptionPane.showMessageDialog(null, "Favor, preencher todos os campos.");
				}else {
					
					UsuarioBLL gen = new UsuarioBLL();
					try {
						gen.insertUsuario (new Usuario(
								txtNome.getText(), 
								txtRegistro.getText(),
								cbCargo.getSelectedItem().toString()));		
						
						
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
					txtNome.setText("");
					txtRegistro.setText("");
					cbCargo.setSelectedIndex(-1);
					String filtro = txtNome.getText();
					ArrayList<Usuario> usuario = gen.selectUsuario(filtro);	
					pesquisar(modelo, usuario);
					
				}
			}
		});
		
		txtRegistro = new JTextField();
		txtRegistro.setColumns(10);
		
		JScrollPane barraRolagem = new JScrollPane(tabela);
		barraRolagem.setToolTipText("");
		
		JButton btnApagar = new JButton("Apagar");
		btnApagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (tabela.getSelectedRow() != -1){
					Usuario usu = new Usuario();
					UsuarioBLL usuBll = new UsuarioBLL();	

					usu.setUsuId((int) tabela.getValueAt(tabela.getSelectedRow(), 0));
					
					usuBll.deleteUsuario(usu);
					String filtro = txtNome.getText();
					ArrayList<Usuario> usuario = usuBll.selectUsuario(filtro);	
					pesquisar(modelo, usuario);
					JOptionPane.showMessageDialog(null, "Usuario excluido com sucesso!");
					
				} else {
					JOptionPane.showMessageDialog(null, "Selecione um Usuario para excluir.");
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
		
		JScrollPane scrollPane = new JScrollPane();
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(20)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addComponent(btnCancelar)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnApagar)
							.addPreferredGap(ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
							.addComponent(btnSalvar)
							.addContainerGap())
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNome, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblRegistro, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblAtivo, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(cbCargo, 0, 160, Short.MAX_VALUE)
								.addComponent(txtRegistro, GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
								.addComponent(txtNome, GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
							.addGap(45))))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(22)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNome)
						.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtRegistro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblRegistro))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAtivo)
						.addComponent(cbCargo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSalvar)
						.addComponent(btnCancelar)
						.addComponent(btnApagar))
					.addContainerGap())
		);
		
		tabela = new JTable(modelo);
		scrollPane.setViewportView(tabela);
		panel.setLayout(gl_panel);
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(49)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 299, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(27, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(19, Short.MAX_VALUE)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 334, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		frame.getContentPane().setLayout(groupLayout);
		frame.setVisible(true);
	}
	
	private static void JTable() {
		try {
			modelo = new DefaultTableModel();
			
	        modelo.addColumn("ID");
	        modelo.addColumn("Login");	        
	        modelo.addColumn("Cargo");
	        	        
	        pesquisar(modelo, usuarios);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao criar tabela.");
		}
		
	}
	
	private static void pesquisar(DefaultTableModel modelo, ArrayList<Usuario> usua) {
		modelo.setNumRows(0);
        
        try {
	        for (Usuario usu : usua) {
	           	            
	            modelo.addRow(new Object[]{usu.getUsuId(), usu.getUsuLogin(), 
	            		 usu.getUsuCargo()});
	        }
        } catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao preencher a tabela.");
		}
	}
}
