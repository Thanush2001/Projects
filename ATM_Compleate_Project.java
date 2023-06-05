import java.util.*;
public class ATM_Compleate_Project
{
    public static void main(String[] args)
    {
        int pin = 1234;
        int balance = 10000;

        int Addamount=0;
        int Takeamount=0;

        String name;
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter your pin number:"); // we have take an input by an user

        int password=scanner.nextInt();

        if(password==pin)
        {
            System.out.print("Enter your name:");
            name=scanner.next();
            System.out.println("Welcome "+name);

            while (true)
            {
                System.out.println("press 1 to check your balance:");
                System.out.println("press 2 to add amount:");
                System.out.println("press 3 to take amount:");
                System.out.println("press 4 take rescipt:");
                System.out.print("press 5 to EXIT:");

                int opt=scanner.nextInt();
                switch(opt)
                {
                    case 1:
                        System.out.println("Your current balance is "+balance);
                        break;
                    case 2:
                        System.out.print("Hoe much amount did you want to ADD to your account:");
                        Addamount=scanner.nextInt();
                        System.out.println("Successfully credited");
                        balance=Addamount+balance;
                        break;
                    case 3:
                        System.out.print("How much amount did you want to take:");
                        Takeamount=scanner.nextInt();
                        if(Takeamount>balance)
                        {
                            System.out.println("your balance is insufficient");
                            System.out.println("try less than your avaliable balance");
                        }
                        else
                        {
                        System.out.println("Sucessfully taken");
                        balance=balance-Takeamount;
                         }
                        break;
                    case 4:
                            System.out.println("Welcome to ATM Project");
                            System.out.println("Availiable balance is "+balance);
                            System.out.println("Amount deposited      "+Addamount);
                            System.out.println("Amount taken          "+Takeamount);
                            System.out.println("Thanks for Coming");
                            break;
                }
                if(opt==5)
                {
                    System.out.println("Thank you");
                    break;
                }
            }
        }
        else
        {
            System.out.println("Wrong pin number");
        }
    }
}

