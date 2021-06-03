package lk.kogula.assignment02;

import java.util.*;
import java.io.*;
public class DefaultMember extends StudentMember
{
    ArrayList<String > Amembers =new ArrayList<String>();
    ArrayList<String >AStno=new ArrayList<String>();
    ArrayList<String >AName=new ArrayList<String>();
    ArrayList<String >AAddress=new ArrayList<String>();
    ArrayList<String >ATelephone=new ArrayList<String>();
    ArrayList<String >AEmail=new ArrayList<String>();
    ArrayList<String >Amembertype=new ArrayList<String>();
    ArrayList<String >AEntereddate=new ArrayList<String>();
    ArrayList<String >ABloodSugarLvl= new ArrayList<String>();
    ArrayList<String >ACholesterolLVl=new ArrayList<String>();
    ArrayList<String >ABloodPressureLvl=new ArrayList<String>();
    ArrayList<String >AOverallBodyCond=new ArrayList<String>();

    String File="./members.txt";
    public int choice=0;
    String enterDate="";
    Scanner sn = new Scanner(System.in);
    int membertype=0;
    int Count=0;

    // Manager Operator menu
    void menu()
    {
        System.out.println("*************************");
        System.out.println("*                       *");
        System.out.println("*  Add a new member:0   *");
        System.out.println("*  Delete a member :1   *");
        System.out.println("*  list of members :2   *");
        System.out.println("*  Sort the members:3   *");
        System.out.println("*  GUI List        :4   *");
        System.out.println("*  Exit            :5   *");
        System.out.println("*                       *");
        System.out.println("*************************");
        System.out.println("Enter Your Choice");
        choice=sn.nextInt();
    }

    //Add a new member menu
    public void NewMember()
    {
        System.out.println("**********************");
        System.out.println("* Student member :0  *" );
        System.out.println("* Over60 member  :1  *");
        System.out.println("**********************");
        System.out.println("Enter your Member type");
        membertype=sn.nextInt();

    }
    public void AddNewmember()
    {

        String s="";
        char s1='y';
        while(s1=='y')
        {

            NewMember();
            switch(membertype)
            {
                case 0:
                {
                    System.out.println("Student member" );
                    AddStudentMember();
                    break;
                }
                case 1:
                {
                    System.out.println("Over60 member");
                    AddOver60();
                    break;
                }
                default:
                {
                    System.out.println("wrong choice");
                    break;
                }
            }
            System.out.println("Do you want to continue to add New Members?");
            s=sn.next();
            s1=s.charAt(0);
        }
    }

    //Student Member type
    public void AddStudentMember()
    {
        try
        {
            CountRecords();
            System.out.println("Enter Member ID");
            setStNo(sn.next());
            System.out.println("Enter the Name");
            setName(sn.next());
            System.out.println("Enter the Address");
            setAddress(sn.next());
            sn.next();
            System.out.println("Enter the Telephone");
            setTelephone(sn.next());
            System.out.println("Enter the Email");
            setEmail(sn.next());
            System.out.println("Enter the Date");
            enterDate=sn.next();

            String save=getStNo()+ "-"+getName()+"-" +getAddress() + "-"
                    + getTelephone() + "-" + getEmail() + "-" + membertype
                    + "-" +enterDate+"-"+ "Null" + "-" + "Null" + "-" +"Null"+ "-" +"Null";

            System.out.println(save);
            FileWriter writer = new FileWriter(File, true);
            writer.write(save);
            writer.write("\r\n");   // write new line
            writer.close();

        }
        catch(Exception e){System.out.println(e);}
        System.out.println("Success...");
    }

    // Over 60 Member type
    public void AddOver60()
    {
        try
        {
            CountRecords();
            System.out.println("Enter Member ID");
            setStNo(sn.next());
            System.out.println("Enter the Name");
            setName(sn.next());
            System.out.println("Enter the Address");
            setAddress(sn.next());
            sn.next();
            System.out.println("Enter the Telephone");
            setTelephone(sn.next());
            System.out.println("Enter the Email");
            setEmail(sn.next());
            System.out.println("Enter the Date");
            enterDate=sn.next();
            System.out.println("Enter the BloodSugarLvl");
            setBloodSugarLvl(sn.next());
            System.out.println("Enter the CholesterolLVl");
            setCholesterolLVl(sn.next());
            System.out.println("Enter the BloodPressureLvl");
            setBloodPressureLvl(sn.next());
            System.out.println("Enter the OverallBodyCond");
            setOverallBodyCond(sn.next());

            String save=getStNo()+ "-"+getName()+"-" +getAddress() + "-"
                    + getTelephone() + "-" + getEmail() + "-" + membertype
                    +  "-" +enterDate+"-"+ getBloodSugarLvl() + "-" + getCholesterolLVl() + "-" +getBloodPressureLvl()
                    +"-" + getOverallBodyCond();

            System.out.println(save);

            FileWriter writer = new FileWriter(File, true);
            writer.write(save);
            writer.write("\r\n");   // write new line
            writer.close();

        }
        catch(Exception e){System.out.println(e);}
        System.out.println("Success...");
    }

    //Print the list of members
    public void ListMembers()
    {
        try {
            Load();
            System.out.println("***********************************************");
            System.out.print("Member ID\t");
            System.out.print("Name\t");
            System.out.print("Address\t\t");
            System.out.print("Telephone\t");
            System.out.print("Email\t\t");
            System.out.print("Member Type\t");
            System.out.print("Entered Date\t");
            System.out.print("Blood Sugar\t");
            System.out.print("Cholesterol\t");
            System.out.print("Blood Pressure\t");
            System.out.print("Over All Body Condition\t");
            System.out.println();

            for(int j=0;j<Amembers.size();j++)
            {
                System.out.print(AStno.get(j)+"\t\t");
                System.out.print(AName.get(j)+"\t");
                System.out.print(AAddress.get(j)+"\t");
                System.out.print(ATelephone.get(j)+"\t\t");
                System.out.print(AEmail.get(j)+"\t\t");
                System.out.print(Amembertype.get(j)+"\t");
                System.out.print(AEntereddate.get(j)+"\t\t");
                System.out.print(ABloodSugarLvl.get(j)+"\t\t");
                System.out.print(ACholesterolLVl.get(j)+"\t\t");
                System.out.print(ABloodPressureLvl.get(j)+"\t\t");
                System.out.print(AOverallBodyCond.get(j)+"\t\t");
                System.out.println("");
            }

            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Load()
    {
        try
        {
            Amembers.clear();
            AStno.clear();
            AName.clear();
            AAddress.clear();
            ATelephone.clear();
            AEmail.clear();
            Amembertype.clear();
            AEntereddate.clear();
            ABloodSugarLvl.clear();
            ACholesterolLVl.clear();
            ABloodPressureLvl.clear();
            AOverallBodyCond.clear();


            FileReader reader = new FileReader(File);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            int DX=0;
            while ((line = bufferedReader.readLine()) != null)
            {
                Amembers.add(line);
                DX ++;
            }
            reader.close();
            for(int i=0;i<Amembers.size();i++)

            {
                String[] words=Amembers.get(i).split("-");
                AStno.add(words[0]);
                AName.add(words[1]);
                AAddress.add(words[2]);
                ATelephone.add(words[3]);
                AEmail.add(words[4]);
                Amembertype.add(words[5]);
                AEntereddate.add(words[6]);
                ABloodSugarLvl.add(words[7]);
                ACholesterolLVl.add(words[8]);
                ABloodPressureLvl.add(words[9]);
                AOverallBodyCond.add(words[10]);

            }
        }catch(Exception ex)
        {
        }

    }

    public void Delete()
    {
        try
        {
            Load();
            System.out.println("Enter the member ID:");
            String str=sn.next();
            int DX=AStno.indexOf(str);
            System.out.println("Member ID          :"+ AStno.get(DX));
            System.out.println("Name               :"+ AName.get(DX));
            System.out.println("Address            :"+ AAddress.get(DX));
            System.out.println("Telephone          :"+ ATelephone.get(DX));
            System.out.println("Email              :"+ AEmail.get(DX));
            System.out.println("Member Type        :"+ Amembertype.get(DX));
            System.out.println("Entered date        :"+ AEntereddate.get(DX));
            System.out.println("BloodSugar Level   :" + ABloodSugarLvl.get(DX));
            System.out.println("Cholesterol Level   :"+ ACholesterolLVl.get(DX));
            System.out.println("Blood Pressure     :"+ ABloodPressureLvl.get(DX));
            System.out.println("Overall  Condition :"+ AOverallBodyCond.get(DX));
            System.out.println("**************************");
            System.out.println("Are you sure to delete? ");

            String str2=sn.next();
            char ctr=str2.charAt(0);
            if(ctr=='y')
            {
                Amembers.remove(DX);
                AStno.remove(DX);
                AName.remove(DX);
                AAddress.remove(DX);
                ATelephone.remove(DX);
                AEmail.remove(DX);
                Amembertype.remove(DX);
                AEntereddate.remove(DX);
                ABloodSugarLvl.remove(DX);
                ACholesterolLVl.remove(DX);
                ABloodPressureLvl.remove(DX);
                AOverallBodyCond.remove(DX);


                File file = new File(File);

                if(file.delete()) {
                    System.out.println("Record is deleted!");
                }
                else {
                    System.out.println("Delete operation is failed.");
                }

                for(int k=0;k<AStno.size();k++)
                {
                    String Line=AStno.get(k)+"-"+
                            AName.get(k)+"-"+
                            AAddress.get(k)+"-"+
                            ATelephone.get(k)+"-"+
                            AEmail.get(k)+"-"+
                            Amembertype.get(k)+"-"+
                            AEntereddate.get(k)+"-"+
                            ABloodSugarLvl.get(k)+"-"+
                            ACholesterolLVl.get(k)+"-"+
                            ABloodPressureLvl.get(k)+"-"+
                            AOverallBodyCond.get(k)+"-";
                    FileWriter writer = new FileWriter(File, true);
                    writer.write(Line);
                    writer.write("\r\n");   // write new line
                    writer.close();
                }
            }
        }
        catch(Exception ex)
        {
        }
    }

    public void Report()
    {
        try
        {
            Load();
            System.out.println("***************************************");
            for(int DX=0;DX<AStno.size();DX++)
            {
                System.out.println("Record :"+(DX+1));
                System.out.println("Member ID          :"+ AStno.get(DX));
                System.out.println("Name               :"+ AName.get(DX));
                System.out.println("Address            :"+ AAddress.get(DX));
                System.out.println("Telephone          :"+ ATelephone.get(DX));
                System.out.println("Email              :"+ AEmail.get(DX));
                System.out.println("Member Type        :"+ Amembertype.get(DX));
                System.out.println("Entered date        :"+ AEntereddate.get(DX));
                System.out.println("BloodSugar Level   :" + ABloodSugarLvl.get(DX));
                System.out.println("Cholesterol Level   :"+ ACholesterolLVl.get(DX));
                System.out.println("Blood Pressure     :"+ ABloodPressureLvl.get(DX));
                System.out.println("Overall  Condition :"+ AOverallBodyCond.get(DX));
                System.out.println("***************************************");
            }
        }
        catch(Exception e)
        {
        }
    }

    public void SortList()
    {

        Load();
        ArrayList<String> SortName= (ArrayList<String>)AName.clone();
        Collections.sort(SortName);
        System.out.print(padLeftSpaces("Member ID",1));
        System.out.print(padLeftSpaces("Name",20));
        System.out.print(padLeftSpaces("Address",24));
        System.out.print(padLeftSpaces("Telephone",24));
        System.out.println(padLeftSpaces("Email",24));
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        for(int i=0;i<SortName.size();i++)
        {
            String Str=SortName.get(i);
            int DX= AName.indexOf(Str);
            System.out.print(padLeftSpaces(AStno.get(DX),1));
            System.out.print(padLeftSpaces(AName.get(DX),25));
            System.out.print(padLeftSpaces(AAddress.get(DX),25));
            System.out.print(padLeftSpaces(ATelephone.get(DX),25));
            System.out.print(padLeftSpaces(AEmail.get(DX),25));
            System.out.println();
            System.out.println("------------------------------------------------------------------------------------------------------------------");
        }
    }
    public static String padLeftSpaces(String str, int n) {     //Alignment for Left pad with spaces
        return String.format("%1$" + n + "s", str);
    }

    public void CountRecords()
    {
        try
        {
            FileReader reader = new FileReader(File);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            int DX=0;
            while ((line = bufferedReader.readLine()) != null)
            {
                Count ++;
            }
            reader.close();
            System.out.println("-------------------------");
            System.out.println("Your Record No :"+ (Count+1) );
            System.out.println("-------------------------");
            if(Count>100)
            {
                System.out.println("Your Records are reach 100 ");
            }
            Count=0;
        }
        catch(Exception ex)
        {
        }
    }
}
