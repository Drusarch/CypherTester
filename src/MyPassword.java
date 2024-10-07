import java.util.*;
abstract public class MyPassword {
    char[] password;
    char[] encryptedPassword;
    char[] decryptedPassword;

    MyPassword(char[] password) {
    this.password = password;
    }

}