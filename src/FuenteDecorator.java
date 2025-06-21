/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pablo
 */
public class FuenteDecorator extends ReporteDecorator{

    public FuenteDecorator(Reporte reporte) {
        super(reporte);
    }

    @Override
    public void generar() {
        super.generar();
        System.out.println("Aplicando fuente personalizada");
    }

}
