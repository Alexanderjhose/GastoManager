/**
 * 
 */
package com.example.demo.modelo.enums;

/**
 * 
 */
public enum ETipoMovimiento {

	ENTRADA("entrada"), SALIDA("salida");

	private String movimiento;

	private ETipoMovimiento(String etipoEntrada) {
		this.movimiento = etipoEntrada;
	}

	public String getEtipoEntrada() {
		return movimiento;
	}

}
