package modelo;

public class Rectangulo extends Figura
{
    private double base;
    private double altura;   

    public Rectangulo(double base, double altura)
    {
        this.base=base;
        this.altura=altura;
    }

    //metodos
    public void calcularAreaRectangulo()
    {
        area = altura * base ;
    }

    public void calcularPerimetroRectangulo()
    {
        perimetro = 2*(altura + base);
    }
}