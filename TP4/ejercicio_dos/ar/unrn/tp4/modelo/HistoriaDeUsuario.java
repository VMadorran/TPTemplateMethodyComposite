package ar.unrn.tp4.modelo;

import java.util.ArrayList;
import java.util.List;

public class HistoriaDeUsuario implements ItemDeProyecto {

	private int duracion;
	private List<ItemDeProyecto> items = new ArrayList<ItemDeProyecto>();

	@Override
	public int duracionDeItem() {
		// TODO Auto-generated method stub

		this.duracion = 0;
		for (ItemDeProyecto item : items) {
			duracion += item.duracionDeItem();
		}
		return duracion;
	}

	@Override
	public void agregarItem(ItemDeProyecto item) {
		// TODO Auto-generated method stub

		items.add(item);
	}

}
