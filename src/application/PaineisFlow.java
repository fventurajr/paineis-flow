package application;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PaineisFlow extends JFrame {

	public PaineisFlow() {
		
		super("Painéis com layout flow");
		
		FlowLayout layoutTela = new FlowLayout();
		FlowLayout layoutPainel1 = new FlowLayout();
		FlowLayout layoutPainel2 = new FlowLayout();
		
		layoutPainel1.setAlignment(FlowLayout.LEFT);
		layoutPainel2.setAlignment(FlowLayout.RIGHT);
		
		Container tela = this.getContentPane();
		tela.setLayout(layoutTela);
		
		JPanel painel1 = new JPanel();
		painel1.setBackground(Color.GREEN);
		painel1.setPreferredSize(new Dimension(250, 35));
		painel1.setLayout(layoutPainel1);
		
		JPanel painel2 = new JPanel();
		painel2.setBackground(Color.ORANGE);
		painel2.setPreferredSize(new Dimension(250, 35));
		painel2.setLayout(layoutPainel2);
		
		tela.add(painel1);
		tela.add(painel2);
		
		JButton botao1 = new JButton("Botão A");
		JButton botao2 = new JButton("Botão B");
		
		painel1.add(botao1);
		painel1.add(botao2);
		
		JButton botao3 = new JButton("Botão C");
		JButton botao4 = new JButton("Botão D");
		
		painel2.add(botao3);
		painel2.add(botao4);
		
		this.setSize(280,  200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
		
	}
	public static void main(String[] args) {
		
		new PaineisFlow();
		
	}

}
