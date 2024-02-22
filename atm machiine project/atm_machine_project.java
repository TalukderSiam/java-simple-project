import java.util.Scanner;

class ATM {
    float balance;
    int PIN =123;


    public void GivePin(){
        System.out.println("Enter you A/C Pin");
        Scanner pin=new Scanner(System.in);
        int x = pin.nextInt();
        System.out.println();

        if(x!=PIN){
            System.out.println("Invalid Pin");
        }
        else {
            Menu();
        }
    }


    public void Menu(){
        System.out.println();
        System.out.println("Menu Option");
        System.out.println();
        System.out.println("1.Check A/C");
        System.out.println("2.Deposite Money");
        System.out.println("3.Widraw Money");
        System.out.println("4.Exit");
        System.out.println();
        System.out.println("Enter you choice");
        

        Scanner sc=new Scanner (System.in);
        int opt=sc.nextInt();

        if(opt==1){
          CheckAccount();
        }
        else if(opt==2){
            DepositeMoney();
        }
        else if(opt==3){
            WidrawMoney();
        }
        else if(opt==4){
            return;
        }
        else {
            System.err.println("Enter A  Valid Choice");
        }
    }



        public void CheckAccount(){
            System.out.println();
            System.out.println("Balance :" +balance);
            Menu();
        }



        public void WidrawMoney(){
            System.out.println();
            System.out.println("Enter the amount to widraw");  
            Scanner sc=new Scanner (System.in);
            int amount=sc.nextInt();

            if(amount>balance){
                System.out.println();
                System.out.println("You Don't Have Sufficient Balance");
            }
            else {
                balance=balance-amount;
                System.out.println();
                System.out.println("Widraw Money Successfully");
                System.out.println("Current Balace "+balance);
                for(int i=0;i<1000000000;i++){

                }
                Menu();
            }

        }
        


        public void DepositeMoney(){
            System.out.println();
            System.out.println("Enter the amount to Deposite");  
            Scanner sc=new Scanner (System.in);
            int amount=sc.nextInt();
            balance =balance+amount;
            System.out.println("Deposte money Successfully");
            Menu();
        }






        }
        
        
        

    public class atm_machine_project {
    public static void main (String[] arg){
        ATM input=new ATM();
        input.GivePin();
    }

}
