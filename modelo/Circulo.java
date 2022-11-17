package modelo;

public class Circulo extends Figura
{
    private double radio;
    
    public Circulo(double radio)
    {
        this.radio = radio;
    }  

    //metodos
    public void calcularAreaCirculo()
    {
        area = (radio*radio)* Math.PI;
    }

    public void calcularPerimetroCirculo()
    {
        perimetro = 2*Math.PI*radio;
    } 

}
