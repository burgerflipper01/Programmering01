package Program;

public class Name {
    private String firstName;
    private String middleName;
    private String lastName;

    public Name(String inputFirstName, String inputMiddleName, String inputLastName) {
        this.firstName = inputFirstName;
        this.middleName = inputMiddleName;
        this.lastName = inputLastName;
    }

    public void setFirstName(String inputFirstName) {
        firstName = inputFirstName;
    }

    public String getFirstName(String inputFirstName) {
        return inputFirstName;
    }

    public void setMiddleName(String inputMiddleName) {
        middleName = inputMiddleName;
    }

    public String getMiddleName(String inputMiddleName) {
        return inputMiddleName;
    }

    public void setLastName(String inputLastName) {
        lastName = inputLastName;
    }

    public String getLastName(String inputLastName) {
        return inputLastName;
    }

    public String getInfo() {
        System.out.println(firstName);
        System.out.println(middleName);
        System.out.println(lastName);
        return firstName + middleName + lastName;

    }


    public String getInit() {
        String f1 = firstName.substring(0, 1);
        String m1 = middleName.substring(0, 1);
        String e1 = lastName.substring(0, 1);
        return f1 + m1 + e1;
    }

    public String getUsername() {
        String u1 = firstName.substring(0, 2).toUpperCase();
        int u2 = middleName.length();
        String u3 = lastName.substring((lastName.length() - 2)).toLowerCase();
        return u1 + u2 + u3;
    }
}

















