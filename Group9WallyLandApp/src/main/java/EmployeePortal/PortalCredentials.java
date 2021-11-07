package EmployeePortal;

/**
 * Method to access employee login
 *
 * @author Justin
 */
public class PortalCredentials {

    private Boolean validated;

    /*
    * @param username stores input credential
    * @param password stores input password in String
    * @param validated boolean stores status of 
     */
    public boolean checkCredentials(String username, String password) {
        /*
        TODO: 
        Validate credentials on submit
         */
        validated = false;
        // placeholder valid user credentials
        String validUser = "admin";
        String validPass = "password";
        // update view on validation
        if (username.equals(validUser) && password.equals(validPass)) {
            validated = true;
            System.out.println("Authentication successful");
        } else {
            System.out.println("Invalid credentials");
        }
        return validated;
    }
}
