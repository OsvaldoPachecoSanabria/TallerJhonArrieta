package Activdad14U12.actv3;

public class AuthService {
    public boolean authenticate(Usuario usuario, String password) {
        return usuario.getPassword().equals(password);
    }
}