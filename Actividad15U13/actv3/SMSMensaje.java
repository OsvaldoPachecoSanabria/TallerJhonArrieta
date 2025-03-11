package Actividad15U13.actv3;

public class SMSMensaje implements MensajeStrategy {
    @Override
    public void enviarMensaje(String destinatario, String mensaje) {
        System.out.println("Enviando SMS a " + destinatario + ": " + mensaje);
    }
}