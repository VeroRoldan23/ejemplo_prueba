package Cajero.dispensadores;

class DispensadorBase implements IDispensador {
    protected int denominacion;
    protected IDispensador siguiente;

    public DispensadorBase(int denominacion) {
        this.denominacion = denominacion;
        this.siguiente = null;
    }

    @Override
    public void setSiguiente(IDispensador dispensador) {
        this.siguiente = dispensador;
    }

    @Override
    public void dispensar(int cantidad) {
        if (cantidad % 5000 != 0) {
            throw new IllegalArgumentException("Error: La cantidad debe ser múltiplo de 5.000");
        }

        int numBilletes = cantidad / denominacion;
        int restante = cantidad % denominacion;

        if (numBilletes > 0) {
            System.out.println("Dispensando " + numBilletes + " billete(s) de " + denominacion);
        }

        if (restante > 0 && siguiente != null) {
            siguiente.dispensar(restante);
        }
    }
}