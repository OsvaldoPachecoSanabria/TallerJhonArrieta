package Activdad14U12.actv3;

public class ValidationService {
    public boolean validateUsername(String username) {
        // Add validation logic (e.g., non-empty, specific format, etc.)
        return username != null && !username.trim().isEmpty();
    }

    public boolean validatePassword(String password) {
        // Add validation logic (e.g., minimum length, complexity, etc.)
        return password != null && password.length() >= 6;
    }
}
