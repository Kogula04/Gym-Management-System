package lk.kogula.assignment02;
/**
 * Kogula Kangaiveniyan
 * IIT No: 20191101
 * UoW No: w1790354
 * Main Functions in MyGymManger class
 */

import java.util.*;

public class MyGymManager
{
    public static void main(String[] args)
    {
        char Response='y';
        String R="";
        int count=0;
        Scanner sn=new Scanner(System.in);
        DefaultMember obj=new DefaultMember();
        System.out.println("Enter User Name......");
        String UserName =sn.next();
        System.out.println("Enter Password........");
        String Password =sn.next();

        if((UserName.compareTo("Operator")==0 ) &&(Password.compareTo("1234")==0))
        {
            System.out.println("Welcome Operator");
            System.out.println("***********************");
            System.out.println("*  Add a new member   *");
            System.out.println("***********************");
            obj.AddNewmember();
            System.out.println("***********************");
        }
        else if((UserName.compareTo("Manager")==0 ) &&(Password.compareTo("1234")==0))
        {
            System.out.println("Welcome Manager");

            while(Response=='y'|| Response== 'Y')
            {
                obj.menu();

                switch(obj.choice)
                {
                    case 0:
                    {
                        System.out.println("*  Add a new member   *");
                        obj.AddNewmember();
                        break;
                    }
                    case 1:
                    {
                        System.out.println("*  Delete a member   *");
                        obj.Delete();
                        break;
                    }
                    case 2:
                    {
                        System.out.println("*  list of members     *");
                        obj.Report();
                        obj.ListMembers();
                        break;
                    }
                    case 3:
                    {
                        System.out.println("*  Sort the members   *");
                        obj.SortList();
                        break;
                    }
                    case 4:
                    {
                        System.out.println("Select Your Choice *");
                        System.out.println("All Members List : 0");
                        System.out.println("Find a Members   : 1");
                        int Ch=sn.nextInt();
                        if(Ch==0)
                        {
                            TableViewExample objT=new TableViewExample();
                            objT.Display();
                        }
                        else if(Ch==1)
                        {
                            TableViewFindRecord objTT=new TableViewFindRecord();
                            objTT.Display();
                        }

                        break;
                    }
                    case 5:
                    {
                        System.out.println("*  Exit            *");
                        System.exit(0);
                        break;
                    }
                    default:
                    {
                        System.out.println("* In valid Selection *");
                        break;
                    }
                }

                System.out.println("Do you want to Continue again");
                R=sn.next();
                Response=R.charAt(0);

            }
        }
        else {
            System.out.println("* In valid User ID or Password *");
        }
    }
}
