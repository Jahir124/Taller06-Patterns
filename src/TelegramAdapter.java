/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pablo
 */
public class TelegramAdapter implements CanalNotificacion {
    private TelegramAPI api;

    public TelegramAdapter(TelegramAPI api) {
        this.api = api;
    }

    @Override
    public void enviar(String mensaje) {
        api.sendTelegram(mensaje);
    }

}
