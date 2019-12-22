package view;

import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import control.CarrosBLL;
import control.UsuarioBLL;
import model.entities.Carros;
import model.entities.Usuario;

import javax.swing.JMenu;
import javax.swing.JLabel;
import java.awt.BorderLayout;



public class Menu {

	private JFrame frame;
	UsuarioBLL ctrlUsu = new UsuarioBLL();

	public Menu () {
		frame = new JFrame();
		frame.setBounds(100, 100, 561, 441);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu menuCadastro = new JMenu("Cadastro");
		menuBar.add(menuCadastro);
		
		JMenuItem menuitemCarro = new JMenuItem("Carro");
		menuitemCarro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CadastroCarros();
				frame.dispose();
				
			}
		});
		menuCadastro.add(menuitemCarro);
		
		JMenuItem mntmGerente = new JMenuItem("Usu\u00E1rio");
		mntmGerente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				
				ArrayList<Usuario> usu = ctrlUsu.selectUsuario("");				
				new CadastroUsuario(usu);
				frame.dispose();
			}
		});
		menuCadastro.add(mntmGerente);
		
				JMenu menu = new JMenu("|");
				menuBar.add(menu);
		
		JMenu menuEstoque = new JMenu("Estoque");
		menuBar.add(menuEstoque);
		
		JMenuItem menuitemEstoqueDeCarros = new JMenuItem("Estoque de Carros");
		menuitemEstoqueDeCarros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CarrosBLL ctrl = new CarrosBLL();
				
				ArrayList<Carros> carros = ctrl.selectCarros("");
				
				new EstoqueCarros(carros);				
				frame.dispose();
			}
		});
		menuEstoque.add(menuitemEstoqueDeCarros);
		
		JMenuItem mntmCatalogo = new JMenuItem("Promo\u00E7\u00E3o");
		mntmCatalogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Catalogo();
				frame.dispose();
			}
		});
		menuEstoque.add(mntmCatalogo);
		
		JLabel lblUsuario = new JLabel("Bem Vindo ao Sistema!");
		frame.getContentPane().add(lblUsuario, BorderLayout.SOUTH);
		
		frame.setVisible(true);
	}
}
