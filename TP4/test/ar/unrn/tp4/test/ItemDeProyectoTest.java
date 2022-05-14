package ar.unrn.tp4.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ar.unrn.tp4.modelo.HistoriaDeUsuario;
import ar.unrn.tp4.modelo.Item;
import ar.unrn.tp4.modelo.Spike;

public class ItemDeProyectoTest {

	@Test
	public void spike() {

		var itemA = new Item(2);
		var itemB = new Item(1);
		var itemC = new Item(4);

		var spike = new Spike();

		spike.agregarItem(itemA);
		spike.agregarItem(itemB);
		spike.agregarItem(itemC);

		assertEquals(7, spike.duracionDeItem());
	}

	@Test
	public void historiaDeUsuario() {

		var itemA = new Item(2);
		var itemB = new Item(1);
		var itemC = new Item(4);
		var itemD = new Item(3);

		var historiaDeUsuario = new HistoriaDeUsuario();

		historiaDeUsuario.agregarItem(itemA);
		historiaDeUsuario.agregarItem(itemB);
		historiaDeUsuario.agregarItem(itemC);
		historiaDeUsuario.agregarItem(itemD);

		assertEquals(10, historiaDeUsuario.duracionDeItem());

	}
}
