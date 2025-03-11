package Actividad15U13.actv3;

public class EmailMensaje implements MensajeStrategy {
    @Override
    public void enviarMensaje(String destinatario, String mensaje) {
        System.out.println("Enviando correo electrónico a " + destinatario + ": " + mensaje);
    }
}