package com.example.demo.modelo.enums;

public enum ECategoria {

	PERCIBIDO("Percibido"), GASTOSHORMIGAS("Gastos Hormigas"), GASTOSFIJOS("Gastos Fijos"), CAPRICHO("capricho"),
	AHORRO("Ahorro"), PRESTAMO("Prestamo"), TERJETA("tarjeta");

	private String categoria;

	private ECategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getCategoria() {
		return categoria;
	}

}
