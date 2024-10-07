import java.util.Random;

public class Caesars extends MyPassword {
    private int key = 0;

    Caesars(char[] password) {
        super(password);
        key = new Random().nextInt(25) + 1;
        encryptedPassword = new char[password.length];
        decryptedPassword = new char[encryptedPassword.length];
    }

    int getKey() {
        return key;
    }

    // Encrypts a password according to Caesars cipher. It does this by converting to ASCII.
    char[] Encrypt() {
        System.out.println("Your key is: " + key);
        for (int i = 0; i < password.length; i++) {
            char ch = password[i];
            if (Character.isLetter(ch)) {
                int base = Character.isUpperCase(ch) ? 'A' : 'a';
                encryptedPassword[i] = (char) ((ch - base + key) % 26 + base);
            } else {
                encryptedPassword[i] = ch;
            }
        }
        return encryptedPassword;
    }

    char[] Decrypt() {
            for (int k = 1; k <= 25; k++) {
                for (int j = 0; j < encryptedPassword.length; j++) {
                    char a = encryptedPassword[j];
                    if (Character.isLetter(a)) {
                        int base = Character.isUpperCase(a) ? 'A' : 'a';
                        decryptedPassword[j] = (char) ((a - base - k + 26) % 26 + base);
                    } else {
                        decryptedPassword[j] = a;
                    }
                }
                System.out.println("Key: " + k + " " + new String(decryptedPassword));
                if (new String(decryptedPassword).equals(new String(password))) {
                    System.out.println("Decrypted with key: " + key);
                    return decryptedPassword;
                }

            }
            return decryptedPassword;
    }
}
