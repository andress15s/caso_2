package ejecutable;

import javax.swing.JOptionPane;

import modelo.Circulo;
import modelo.Rectangulo;

public class Test 
{
    
    public static void main(String[] args)

    {

         
        double radio = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del radio del circulo: "));


        Circulo miCirculo = new Circulo(radio);
        miCirculo.calcularAreaCirculo();
        miCirculo.calcularPerimetroCirculo();
        JOptionPane.showMessageDialog(null, "El area del Circulo es = " + miCirculo.getArea());
        JOptionPane.showMessageDialog(null, "El perimetro del Circulo es = " + miCirculo.getPerimetro());

        double base  = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de la altura del Rectangulo: "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de la altura del Rectangulo: "));

        Rectangulo miRectangulo = new Rectangulo(base, altura);
        miRectangulo.calcularAreaRectangulo();
        miRectangulo.calcularPerimetroRectangulo();
        JOptionPane.showMessageDialog(null, "El area del Circulo es = " + miRectangulo.getArea());
        JOptionPane.showMessageDialog(null, "El perimetro del Circulo es = " + miRectangulo.getPerimetro());


    }
}



