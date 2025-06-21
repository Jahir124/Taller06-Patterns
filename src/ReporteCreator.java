/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pablo
 */
public abstract class ReporteCreator {
    
    public abstract Reporte crearReporte();

    public void mostrarReporte(){
        Reporte reporte = crearReporte();
        reporte.generar();
    }

}
