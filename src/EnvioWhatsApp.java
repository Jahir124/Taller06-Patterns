/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pablo
 */
public class EnvioWhatsApp implements CanalNotificacion {

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando por WhatsApp: " + mensaje);
    }
    
}
