package com.company;
import java.util.Scanner;
import java.util.Random ;
public class Rock_Paper_Scissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int i = 0 , c = 0 , u =0 , w = 0 , t=0 ;
        while( i <= 4 ){
            int comp_Value = r.nextInt(3);
            System.out.println("Enter Your Desired Choice \n 0 = rocks \n  1 = paper \n 2 = scissors :");
            int user_Value = sc.nextInt();
            switch (comp_Value){
                case 0 -> {
                    if (user_Value == 1){
                        System.out.println( "Computer does rock"+" You win");
                        u ++;
                    } else if (user_Value == 2 ) {
                        System.out.println("Computer does rock"+"Computer Wins");
                        c++;
                    }
                    else if (user_Value == 0){
                        System.out.println("Computer does rock"+"It's a tie");
                        t++;
                    }
                    else{
                        System.out.println("Please Behave and Enter from the given Choices");
                        w++;
                    }

                }
                case 1 -> {
                    if (user_Value == 2){
                        System.out.println("Computer does paper"+" You win");
                        u++;
                    } else if (user_Value == 0 ) {
                        System.out.println("Computer does paper"+"Computer Wins");
                        c++;
                    }
                    else if(user_Value == 1){
                        System.out.println("Computer does paper"+"It's a tie");
                        t++;
                    }
                    else{
                        System.out.println("Please Behave and Enter from the given Choices");
                        w++;
                    }

                }
                case 2 -> {
                    if (user_Value == 0){
                        System.out.println("Computer does scissors"+" You win");
                        u++;
                    } else if (user_Value == 1) {
                        System.out.println("Computer does scissors"+"Computer Wins");
                        c++;
                    }
                    else if(user_Value == 2){
                        System.out.println("Computer does scissors"+"It's a tie");
                        t++;
                    }
                    else{
                        System.out.println("Please Behave and Enter from the given Choices");
                        w++;
                    }

                }
            }

            i++;
        }
        System.out.println("Final Results : \n Number of wins for Computer : " + c +
        "\n Number of times you won : " + u + "\n Number of times you both Tied : " + t +
         "\n Number of times you misbehaved : " + w
        );
        if (c>u){
            System.out.println("Computer Wins the Tournament");
        }
        else if (c==u) {
            System.out.println("\n\n\n\nThe Tournament is Tied");
        }
        else{
            System.out.println("\n\n\n\nYou Win the Tournament Congratulations");
        }
    }
}
