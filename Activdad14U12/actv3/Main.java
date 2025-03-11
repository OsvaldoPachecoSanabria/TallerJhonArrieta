package Activdad14U12.actv3;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("user1", "password123");
        AuthService authService = new AuthService();
        ValidationService validationService = new ValidationService();

        if (validationService.validateUsername(usuario.getUsername())
                && validationService.validatePassword(usuario.getPassword())) {
            if (authService.authenticate(usuario, "password123")) {
                System.out.println("Authentication successful!");
            } else {
                System.out.println("Authentication failed!");
            }
        } else {
            System.out.println("Validation failed!");
        }
    }
}
