package org.example;

import java.util.Scanner;
import org.example.NYGift.*;
import org.example.Sweets.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter no. of children : ");
        int numberOfChildren = sc.nextInt();

        System.out.println("Enter weight of chocolate : ");
        int chocolateWeight = sc.nextInt();

        System.out.println("Enter weight of candy : ");
        int candyWeight = sc.nextInt();

        String childrenNames[] = new String[numberOfChildren];
        int chocolate[] = new int[numberOfChildren];
        int candy[] = new int[numberOfChildren];

        System.out.println("Enter child name followed by the no of chocolates and candies he have : ");

        for ( int i = 0 ; i < numberOfChildren ; i++ )
        {
            childrenNames[i] = sc.next();
            chocolate[i] = sc.nextInt();
            candy[i] = sc.nextInt();
        }

        Sweet chocolates = new Chocolates (chocolateWeight, numberOfChildren, chocolate, childrenNames);
        Sweet candies = new Candies (candyWeight, numberOfChildren, candy, childrenNames);

        chocolates.display();
        candies.display();

        int chocList[] = new int[numberOfChildren];
        chocList = chocolates.getList();
        int candyList[] = new int[numberOfChildren];
        candyList = candies.getList();

        chocolates.sort();
        candies.sort();

        NYGift gift = new NYGift(childrenNames, chocList, candyList);
        gift.display();

    }
}
