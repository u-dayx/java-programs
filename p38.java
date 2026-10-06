import java.util.Scanner;
public class p1 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
         int hero_hp = 100;
        int monster_hp =100;
        int remaining_hp1;
        int remaining_hp2;
        int response;
        int n =10;
        int   m=3;
        int heal;
        int def;
        int opp;



        
        System.out.println("Enter 'Begin' to start the game : ");
        String beg = sc.nextLine();
        String var = "Begin";
        for (int j=1;j<m;){ 
        if (beg==var){
             System.out.println("THE BATTLE BEGINS !!!");
        }
        else{
            System.out.println("please type Begin to start ")
        } j++;

        if (j==3){
            System.out.println("the program terminates here please re run the program to start the game ");
            break;
        }
        }

        
            
      


        while(hero_hp>0 && monster_hp>0){
              System.out.println("Choose your option");
        System.out.println("1. Attack ");
        System.out.println("2. Heal ");
        System.out.println("3. Defend ");
        System.out.println("4.Run away ");
        response  = sc.nextInt();
        if(response==4){
            System.out.println("You choose to run away ");
            break;

        }
        }

        

        
      
        switch(response){
            case 1:
                System.out.println("You attacked the opponent ");
                remaining_hp1=(int)(Math.random()*50 )+1;
                remaining_hp2=(int)(Math.random()*50 )+1;
                hero_hp-=remaining_hp1;
                monster_hp-=remaining_hp2;
                System.out.println("Your  remaining hp is "+ hero_hp);
                System.out.println(" Opponent remaining hp is "+ monster_hp);
                break;

            case 2:
                System.out.println("you are healing ");
                heal = (int)(Math.random()*20)+1;
                hero_hp+=heal;
                
                
                System.out.println("The restored hp is :"+heal);
                System.out.println("Your total reamaining hp is "+hero_hp);
                System.out.println("Opponent remaining hp is "+monster_hp);
                break;
            case 3 : 
                System.out.println("You defended the opponent ");
                def = (int)(Math.random()*5)+1;
                hero_hp-=def;
                opp =(int)(Math.random()*3)+1;
                monster_hp-=opp;
                System.out.println("Your remaining hp is :"+hero_hp);
                System.out.println("opponent remaining hp is :"+monster_hp);
                break;
        }
        if (monster_hp>0 && hero_hp<=0){
            System.out.println("Opponent WON !!");
            System.out.println("Please try again in next game");
            break;
        }
        else if (hero_hp>0 && monster_hp<=0){
            System.out.println("Congratulations");
            System.out.println("You WON !!");
            break;
        
        }
        else if (hero_hp==0 && monster_hp==0){
            System.out.println("The match has been tied !! ");
            break;
        }

    }
}

                


                

        
      
       
