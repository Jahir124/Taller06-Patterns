/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pablo
 */
public class ReporteConNotificacion {
    
    private CanalNotificacion canal;

    public ReporteConNotificacion(CanalNotificacion canal) {
        this.canal = canal;
    }

    public void notificar(String mensaje) {
        canal.enviar(mensaje);
    }

}
