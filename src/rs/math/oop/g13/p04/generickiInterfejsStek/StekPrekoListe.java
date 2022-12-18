package rs.math.oop.g13.p04.generickiInterfejsStek;

public class StekPrekoListe<T> implements Stek<T> {

	private PovezanaLista<T> elementi = new PovezanaLista();

	@Override
	public void dodaj(T elem) {
		elementi.dodajNaPocetak(elem);
	}

	@Override
	public T ukloni() throws RuntimeException {
		try {
			T elem = elementi.ukloniSaPocetka();
			return elem;
		}
		catch(RuntimeException exp){
			throw new RuntimeException("Није могуће уклањање из празног стека", exp);
		}
	}

	@Override
	public int brojElemenata() {
		return elementi.brojElemenata();
	}
}
