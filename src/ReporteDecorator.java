/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pablo
 */
public abstract class ReporteDecorator implements Reporte{

    private Reporte reporte;

    public ReporteDecorator(Reporte reporte) {
        this.reporte = reporte;
    }

    @Override
    public void generar() {
        reporte.generar();
    }

}
