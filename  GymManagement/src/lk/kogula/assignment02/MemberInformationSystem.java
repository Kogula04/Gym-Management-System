package lk.kogula.assignment02;

import java.util.*;
public class MemberInformationSystem
{

    public static void main(String[] args)
    {
        System.out.println("Members Information System");
        Members obj=new Members();
        char Response='y';
        String R="";
        int count=0;
        Scanner sn=new Scanner(System.in);


        while(Response=='y')
        {
            obj.menu();
            switch(obj.choise)
            {
                case 0:
                {
                    System.out.println("*  Add a new member   *");
                    obj.AddNew();
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
                    obj.Display();
                    break;
                }

                case 3:
                {
                    System.out.println("*  Exit            *");
                    break;
                }
                default:
                {
                    System.out.println("* In valid Selection *");
                    break;
                }
            }

            System.out.println("DO you want to Continue again");
            R=sn.next();
            Response=R.charAt(0);

        }

    }

}
