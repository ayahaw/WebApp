package AppLayer;

public class User {
    public boolean isValidUserCredentials(String sUsername, String sUserPassword){
        if (sUsername.equals("admin") && sUserPassword.equals("root123")){
            return true;
        }
            return false;
    }

}
