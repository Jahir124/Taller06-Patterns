public class App {
    public static void main(String[] args) throws Exception {
        // Singleton con Factory
        GeneradorReportes generador = GeneradorReportes.getInstancia();
        ReporteCreator creadorPDF = new PDFCreator();
        generador.generarReporte(creadorPDF);

        // Decorator
        Reporte base = new ReportePDF();
        Reporte personalizado = new FuenteDecorator(new ColorDecorator(base));
        personalizado.generar();

        // Bridge con Adapter
        TelegramAPI telegramAPI = new TelegramAPI();
        CanalNotificacion canalTelegram = new TelegramAdapter(telegramAPI);

        ReporteConNotificacion notificador = new ReporteConNotificacion(canalTelegram);
        notificador.notificar("Reporte generado y enviado");

    }
}