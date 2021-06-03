package lk.kogula.assignment02;

import java.util.Scanner;

public class StudentMember extends Over60Member {
    private String StNo="";
    private String Name="";
    private String Address="";
    private String Telephone ="";
    private String Email="";

    public String getStNo() {
        return StNo;
    }

    public void setStNo(String StNo) {
        this.StNo=StNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name=Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address=Address;
    }

    public String getTelephone() {
        return Telephone;
    }

    public void setTelephone(String Telephone) {
        Scanner sn = new Scanner(System.in);
        while(!sn.hasNextInt()) {
            System.out.println("Invalid data type.");
            System.out.println("Enter the Telephone:");
            sn.next();
        }
        this.Telephone=Telephone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        Scanner sn = new Scanner(System.in);
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$";
        while(!(Email.matches(emailRegex))){
            System.out.println("Invalid Email Address.");
            System.out.println("Enter Your Email:");
            sn.next();
        }
        this.Email=Email;
    }
}
