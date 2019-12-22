package view;

import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JTextField;

import model.dao.Acesso;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class Login {
	
	public static void main(String[] args) {
			
		// Criando o JFrame
		JFrame frmLogin = new JFrame("Loja Carros");		
		frmLogin.setTitle("Sistema de Software | Loja de Carros");
		frmLogin.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frmLogin.setSize(486, 260);
		frmLogin.setLocationRelativeTo(null);
		frmLogin.getContentPane().setLayout(null);
		
		JLabel lblLogin = new JLabel("LOGIN:");
		lblLogin.setBounds(265, 99, 46, 14);
		frmLogin.getContentPane().add(lblLogin);
		
		JTextField txtLogin = new JTextField();
		txtLogin.setBounds(326, 96, 134, 20);
		frmLogin.getContentPane().add(txtLogin);
		txtLogin.setColumns(10);
		
		JLabel lblSenha = new JLabel("SENHA:");
		lblSenha.setBounds(265, 130, 57, 14);
		frmLogin.getContentPane().add(lblSenha);
		
		JPasswordField pwdSenha = new JPasswordField();
		pwdSenha.addKeyListener(new KeyAdapter() {
			@SuppressWarnings("deprecation")
			@Override
			public void keyPressed(KeyEvent evt) {
				if (evt.getKeyCode() == KeyEvent.VK_ENTER){
					Acesso acesso = new Acesso();				
					
					acesso.Logar(txtLogin.getText(), pwdSenha.getText());
					
					if(acesso.permissao == true) {
											
						new Menu();						
						frmLogin.dispose();
					}
					
					if(acesso.permissao == false) {
						txtLogin.setText("");
						pwdSenha.setText("");
						txtLogin.requestFocus();
					}
					
					acesso.permissao = false;
		        }
			}
		});
		pwdSenha.setBounds(326, 127, 134, 20);
		frmLogin.getContentPane().add(pwdSenha);
		
		/** BOT�O ENTRAR **/
		JButton btnEntrar = new JButton("ENTRAR");
		
		btnEntrar.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				
				Acesso acesso = new Acesso();				
				
				acesso.Logar(txtLogin.getText(), pwdSenha.getText());
				
				if(acesso.permissao == true) {
										
					new Menu();
					frmLogin.dispose();
				}
				
				if(acesso.permissao == false) {
					txtLogin.setText("");
					pwdSenha.setText("");
					txtLogin.requestFocus();
				}
				
				acesso.permissao = false;
			}
		});
		btnEntrar.setBounds(294, 187, 87, 23);
		frmLogin.getContentPane().add(btnEntrar);
		
		/** BOT�O CANCELAR **/
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
			
		});
		btnSair.setBounds(391, 187, 69, 23);
		frmLogin.getContentPane().add(btnSair);
		
		JLabel lblFarmcia = new JLabel("Loja de Carros");
		lblFarmcia.setForeground(new Color(0, 128, 0));
		lblFarmcia.setFont(new Font("Calibri", Font.BOLD, 60));
		lblFarmcia.setBackground(new Color(255, 69, 0));
		lblFarmcia.setBounds(21, 11, 439, 74);
		frmLogin.getContentPane().add(lblFarmcia);
		
		JLabel lblUseATecla = new JLabel("use a tecla ENTER para entrar ou o bot\u00E3o");
		lblUseATecla.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblUseATecla.setForeground(Color.RED);
		lblUseATecla.setBounds(294, 155, 220, 14);
		frmLogin.getContentPane().add(lblUseATecla);
		
		JButton btnNewButton = new JButton("Promo\u00E7\u00F5es");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Catalogo();
				frmLogin.dispose();
			}
		});
		btnNewButton.setBounds(21, 130, 139, 68);
		frmLogin.getContentPane().add(btnNewButton);		
		frmLogin.setVisible(true);
		
		}
}


