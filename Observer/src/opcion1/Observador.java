package opcion1;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.util.Observable;
import java.util.Observer;
import java.util.Scanner;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Observador implements Observer {
	JFrame ventana = new JFrame();
	Elemento elemento = new Elemento();
	JLabel etiqueta = new JLabel();
	JTextField textfield = new JTextField();
	Scanner scanner = new Scanner(System.in);

	public Observador() {
		elemento.addObserver(this);
		ajustarComponentes();
		cargaEventos();
	}

	private void cargaEventos() {
		Action action = new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				elemento.actualizarTexto(textfield.getText());
			}
		};
		textfield.setAction(action);

	}

	private void ajustarComponentes() {
		ventana.setSize(400, 100);
		ventana.setLayout(new GridLayout(1, 2));
		ventana.add(textfield);
		ventana.add(etiqueta);
		ventana.setLocationRelativeTo(null);
		ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		ventana.setVisible(true);
	}

	@Override
	public void update(Observable o, Object arg) {
		etiqueta.setText(elemento.getTexto());
		textfield.setText("");
		ventana.repaint();
	}

}
