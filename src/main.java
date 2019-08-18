import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int passsword;
        int id;
        Scanner input=new Scanner(System.in);
        System.out.println("enter id:");
        id=input.nextInt();
        if(id==123){
            System.out.println("enter pin");
            passsword=input.nextInt();
            if(passsword==8899)
            {
                System.out.println("you have LOGED IN");
                n obj=new n();
                String name="";
                String rollno="";
                System.out.println("enter your name");
                name=input.next();
                System.out.println("Mr. "+name+" plese enter your roll number");
                rollno=input.next();
                System.out.println("thanks your information have been saved\nyour name is : "+name+"\nyour rollno is : "+rollno);

                obj.setName(name);
                obj.setRollno(rollno);
            }
            else
                System.out.println("wrog password");
        }
        else
            System.out.println("try agrin you are wrong");
    }
}
class n{
    private String name;
    private String rollno;
    public void setName(String name)
        {this.name=name;}
    public void setRollno(String rollno)
        {this.rollno=rollno;}

     public String getName()
     {return name;}
     public String getRollno()
        {return rollno;}

}