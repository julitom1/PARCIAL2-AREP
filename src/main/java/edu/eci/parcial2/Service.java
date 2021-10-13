package edu.eci.parcial2;

import java.util.Collection;

public class Service {
	
	
	public Service() {
		
	}
	
	
	/**
	 * Devuelve el log del valor dado
	 * @param value
	 * @return El log del valor dado
	 */
	public Double getLog(Double value) {
		return Math.log(value);
	}
	/**
	 * Devuelve el acos del valor dado
	 * @param value
	 * @return El acos del valor dado
	 */
	public Double getAcos(Double value) {
		return Math.acos(value);
	}

}
