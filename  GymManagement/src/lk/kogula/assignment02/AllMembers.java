package lk.kogula.assignment02;

import java.util.Scanner;

/**
 * Kogula Kangaiveniyan
 * IIT No: 20191101
 * UoW No: w1790354
 */

public class AllMembers
{

    private String StNo="";
    private String Name="";
    private String Address="";
    private String Telephone ="";
    private String Email="";
    private String BloodSugarLvl="";
    private String CholesterolLVl="";
    private String BloodPressureLvl="";
    private String OverallBodyCond="";

    AllMembers(String StNo,String Name, String Address, String Telephone,
               String Email,String BloodSugarLvl,String CholesterolLVl,
               String BloodPressureLvl,String OverallBodyCond)
    {
        this.StNo=StNo;
        this.Name=Name;
        this.Address=Address;
        this.Telephone=Telephone;
        this.Email=Email;
        this.BloodSugarLvl=BloodSugarLvl;
        this.CholesterolLVl=CholesterolLVl;
        this.BloodPressureLvl=BloodPressureLvl;
        this.OverallBodyCond=OverallBodyCond;

    }

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

    public String getBloodSugarLvl() {
        return BloodSugarLvl;
    }

    public void setBloodSugarLvl(String BloodSugarLvl) {
        this.BloodSugarLvl=BloodSugarLvl;
    }

    public String getCholesterolLVl() {
        return CholesterolLVl;
    }

    public void setCholesterolLVl(String CholesterolLVl) {
        this.CholesterolLVl=CholesterolLVl;
    }

    public String getBloodPressureLvl() {
        return BloodPressureLvl;
    }

    public void setBloodPressureLvl(String BloodPressureLvl) {
        this.BloodPressureLvl=BloodPressureLvl;
    }

    public String getOverallBodyCond() {
        return OverallBodyCond;
    }

    public void setOverallBodyCond(String OverallBodyCond) {
        this.OverallBodyCond=OverallBodyCond;
    }

}