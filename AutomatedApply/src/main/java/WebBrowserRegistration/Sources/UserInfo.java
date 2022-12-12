package WebBrowserRegistration.Sources;

public class UserInfo {
    public String addUser(String firstName, String lastName, String password, String email){
        return"{\n" +
                "\n" +
                "\"name\":\"" + firstName +"\",\n"+
                "\"isbn\":\"" + lastName +"\",\n" +
                "\"aisle\":\"" + password + "\",\n" +
                "\"author\":\"" + email + "\"\n" +
                "}\n";
    }
}
