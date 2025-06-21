/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pablo
 */
public class GeneradorReportes {
    
    private static GeneradorReportes instancia;

    private GeneradorReportes() {}

    public static GeneradorReportes getInstancia() {
        if (instancia == null) {
            instancia = new GeneradorReportes();
        }
        return instancia;
    }

    public void generarReporte(ReporteCreator creator) {
        creator.mostrarReporte();
    }

}
