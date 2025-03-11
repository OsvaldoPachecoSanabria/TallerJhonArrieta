package Actividad15U13.actv3;

public class Mensajero {
    private MensajeStrategy estrategia;

    public Mensajero(MensajeStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public void setEstrategia(MensajeStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public void enviar(String destinatario, String mensaje) {
        estrategia.enviarMensaje(destinatario, mensaje);
    }
}
