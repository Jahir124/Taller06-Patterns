/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pablo
 */
public class ColorDecorator extends ReporteDecorator{

    public ColorDecorator(Reporte reporte) {
        super(reporte);
    }

    @Override
    public void generar() {
        super.generar();
        System.out.println("Aplicando color personalizado");
    }

}
