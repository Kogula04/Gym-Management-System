package lk.kogula.assignment02;

import java.util.*;

public class Members {
    int ID[]=new int[15];
    String Name[]=new String[15];
    String Telephone[]=new String[15];
    String Email[]=new String[15];
    public int choise=0;
    int count=0;
    Scanner sn=new Scanner(System.in);

    void menu() {
        System.out.println("*************************");
        System.out.println("*                       *");
        System.out.println("*  Add a new member:0   *");
        System.out.println("*  Delete a member :1   *");
        System.out.println("*  list of members :2   *");
        System.out.println("*  Exit            :3   *");
        System.out.println("*                       *");
        System.out.println("*************************");
        System.out.println("Enter Your Choice");
        choise=sn.nextInt();
    }

    public void AddNew() {
        System.out.println("Enter Your ID");
        ID[count]=sn.nextInt();
        System.out.println("Enter Your Name");
        Name[count]=sn.next();
        System.out.println("Enter Your Telephone");
        Telephone[count]=sn.next();
        System.out.println("Enter Your Email");
        Email[count]=sn.next();
        count++;
    }

    public void Display() {

        for (int i=0;i<15;i++)
        {
            System.out.println(ID[i]+"|"+Name[i]+"|"+ Telephone[i]+"|"+Email[i]);
            if( ID[i]==0)
            {
                break;
            }
        }
    }

    public void Delete() {
        System.out.println("Enter Your ID");
        int dy=sn.nextInt();
        int dx=0;
        for(int j=0;j<15;j++) {
            if(ID[j]==dy)
            {
                dx=j;
                break;
            }

        }
        System.out.println("Name      :"+Name[dx]);
        System.out.println("Telephone :"+Telephone[dx]);
        System.out.println("Email     :"+Email[dx]);

        System.out.println("****************************");
        System.out.println("Do you want Delete this Record y//n ");
        String S=sn.next();
        char Dz=S.charAt(0);
        if(Dz=='y') {
            ID[dx]=0;
            Name[dx]="";
            Telephone[dx]="";
            Email[dx]="";
        }
    }
}