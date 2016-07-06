package opcion1;

import java.util.Observable;

public class Elemento extends Observable{
	private String texto;
	public Elemento() {
	}
	public void actualizarTexto(String nuevoTexto){
		setTexto(nuevoTexto);
		setChanged();
		notifyObservers();
	}
	public String getTexto() {
		return texto;
	}
	private void setTexto(String texto) {
		this.texto = texto;
	}
	
	

}
