package Cajero.dispensadores;

public interface IDispensador {

    void setSiguiente(IDispensador dispensador);
    void dispensar(int cantidad);
}
