package EmployeePortal;

/**
 * Method to include employee functions and update view accordingly
 * @author Justin
 */
public class EmployeeFunctions {
    private String employee;
	private Boolean validated;
    /*
    * @param username stores input credential
    * @param password stores input password in String
    * @param validated boolean stores status of 
    * @return credentials of the current employee 
     */
    public String getCredentials(String username, String password) {
        this.employee = username;
        
        return employee;
    }
    
    
}
