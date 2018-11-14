package application;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

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
		
		
		
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
