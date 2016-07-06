
public abstract class Sandwich {

	void makeSandwich() {
		cortarPan();
		if (conVegetales()) {
			agregarVegetales();
		}
		if (conCarne()) {
			agregarCarne();
		}
		empacar();
	}

	boolean conCarne() {
		return true;
	}

	boolean conVegetales() {
		return true;
	}

	abstract void agregarCarne();

	abstract void agregarVegetales();

	void cortarPan() {
		System.out.println("Cortando pan...");
	}

	void empacar() {
		System.out.println("Sandwich empacado...\n");
	}

}
