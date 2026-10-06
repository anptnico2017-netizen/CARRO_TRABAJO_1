package Negocio;

public class Carro {
    int potencia;
    double velocidad;

    void acelerar(){
        velocidad+=potencia;
    }
    void frenar(){
        velocidad /=2;
    }
    public void setPotencia(int potencia){
        this.potencia=potencia;
    }
    public void setVelocidad(double velocidad){
        this.velocidad=velocidad;
    }
}
