package Actividad15U13.actv3;

public class PushNotificacionMensaje implements MensajeStrategy {
    @Override
    public void enviarMensaje(String destinatario, String mensaje) {
        System.out.println("Enviando notificación push a " + destinatario + ": " + mensaje);
    }
}