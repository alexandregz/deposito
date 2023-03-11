package cuentas;
public class CCuenta {

	/**
	 * Nome do cliente
	 */
	private String nombre;
	
	/**
	 * IBAN da conta
	 */
    private String cuenta;
    
    /**
     * saldo da conta
     */
    private double saldo;
    
    /**
     * Tipo de interese aplicable
     */
    private double tipoInterés;
	
	

	/**
	 * getter nombre
	 * @return
	 */
    public String getNombre() {
		return nombre;
	}

    /**
     * setter nombre
     * @param nombre
     */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * getter cuenta
	 * @return
	 */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * setter cuenta
	 * @param cuenta
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * getter saldo
	 * @return
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * setter saldo
	 * @param saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * getter tipoInterés
	 * @return
	 */
	public double getTipoInterés() {
		return tipoInterés;
	}

	/**
	 * setter tipoInterés
	 * @param tipoInterés
	 */
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}



	/**
	 * Constructor sen parámetros, por defecto
	 */
    public CCuenta()
    {
    }

    /**
     * Constructor con todos os atributos. Nota: tipo pasase pero co código actual non se popula.
     * @param nom
     * @param cue
     * @param sal
     * @param tipo
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Devolve o saldo da conta
     * 
     * @return saldo
     */
    public double estado()
    {
        return saldo;
    }

    /**
     * Ingreso en conta. Lanza Exception se "cantidad" é negativa.
     * @param cantidad
     * @throws Exception
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Retirada de saldo da conta. Lanza Exception se "cantidad" é negativa.
     * @param cantidad
     * @throws Exception
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
