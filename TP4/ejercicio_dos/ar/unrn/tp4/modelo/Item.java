package ar.unrn.tp4.modelo;

public class Item implements ItemDeProyecto {

	private int duracion;

	public Item(int duracion) {
		this.duracion = duracion;
	}

	@Override
	public int duracionDeItem() {
		// TODO Auto-generated method stub
		return this.duracion;
	}

	@Override
	public void agregarItem(ItemDeProyecto item) {
		// TODO Auto-generated method stub

	}

}
