package view;


import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import com.sun.javafx.embed.swing.Disposer;

import control.CarrosBLL;
import model.dao.CarroDao;
import model.entities.Carros;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class EstoqueCarros {
	
	private static JTextField txtBusca;
	private static JTable tabela;
	private static DefaultTableModel modelo;
	private static ArrayList<Carros> carros;
	
	public EstoqueCarros(ArrayList<Carros> carrosP) {
		
		carros = carrosP;
		JTable();

		JFrame frame = new JFrame();
		frame.setBounds(100, 100, 650, 421);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblCarro = new JLabel("Carro:");
		
		txtBusca = new JTextField();
		txtBusca.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String filtro = txtBusca.getText();
				CarrosBLL car = new CarrosBLL();		
				ArrayList<Carros> carro = car.selectCarros(filtro);	
				pesquisar(modelo, carro);
			}
		});
		
		JScrollPane barraRolagem = new JScrollPane(tabela);
		barraRolagem.setToolTipText("");
		
		
		JButton btnApagar = new JButton("Apagar");
		btnApagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				
				if (tabela.getSelectedRow() != -1){
					Carros car = new Carros();
					CarrosBLL ca = new CarrosBLL();	

					car.setId((int) tabela.getValueAt(tabela.getSelectedRow(), 0));
					
					ca.deleteCarros(car);
					String filtro = txtBusca.getText();
					ArrayList<Carros> carro = ca.selectCarros(filtro);	
					pesquisar(modelo, carro);
					JOptionPane.showMessageDialog(null, "Carro excluido com sucesso!");
					
				} else {
					JOptionPane.showMessageDialog(null, "Selecione um produto para excluir.");
				}							
			}
		});
		
		JButton btnVoltar = new JButton("Voltar");
				btnVoltar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {				
							new Menu();
							frame.dispose();
							
					}
				});;
	
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(30)
					.addComponent(lblCarro, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtBusca, GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnBuscar)
					.addGap(35))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnVoltar)
					.addGap(18)
					.addComponent(btnApagar)
					.addContainerGap(478, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(barraRolagem, GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(24)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(5)
							.addComponent(lblCarro))
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(txtBusca, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnBuscar)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(barraRolagem, GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnVoltar)
						.addComponent(btnApagar))
					.addGap(30))
		);
		frame.getContentPane().setLayout(groupLayout);
		frame.setVisible(true);
	}
	
	private static void JTable() {
		try {
			modelo = new DefaultTableModel();
			tabela = new JTable(modelo);
			
	        modelo.addColumn("ID");
	        modelo.addColumn("Modelo");
	        modelo.addColumn("Marca");
	        modelo.addColumn("Ano");
	        modelo.addColumn("Cidade");
	        modelo.addColumn("Estado");
	       // modelo.addColumn("Placa");
	       // modelo.addColumn("Chassi");
	        modelo.addColumn("KM rodados");
	        //modelo.addColumn("Preço");
	        modelo.addColumn("Combustível");
	        
	        pesquisar(modelo, carros);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao criar tabela.");
		}
		
	}
     
	private static void pesquisar(DefaultTableModel modelo, ArrayList<Carros> carros) {
		modelo.setNumRows(0);
        
        try {
	        for (Carros car : carros) {
	           /* modelo.addRow(new Object[]{car.getId(), car.getModelo(), car.getMarca(), car.getAno(),
	            		car.getCidade(), car.getEstado(), car.getPlaca(), car.getChassi(), car.getKm(),
	            		car.getPreco(), car.getCombustivel()});*/
	            
	            modelo.addRow(new Object[]{car.getId(), car.getModelo(), car.getMarca(), car.getAno(),
	            		car.getCidade(), car.getEstado(), car.getKm(),
	            		car.getCombustivel()});
	        }
        } catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao preencher a tabela.");
		}
	}
}
