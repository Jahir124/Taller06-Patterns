/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pablo
 */
public class ExcelCreator extends ReporteCreator{

    @Override
    public Reporte crearReporte() {
        return new ReporteExcel();
    }

}
