package org.example.Sweets;

public class Chocolates extends Sweet {
    public int chocolates[] ;
    public Chocolates(int weight, int number, int choc[], String name[] )
    {
        sweetWeight = weight;
        numberOfChildren = number;

        chocolates = new int[numberOfChildren];
        childrenNames = new String[numberOfChildren];

        for(int i = 0 ; i < numberOfChildren ; i++)
        {
            childrenNames[i] = name[i];
            chocolates[i] = choc[i];
        }
    }

    void displayChildrenAndChocolates()
    {
        for(int i = 0 ; i < numberOfChildren ; i++)
            System.out.println( childrenNames[i] + " have " + chocolates[i] + ".");
    }

    public int numberOfChocolates()
    {
        int temp = 0;
        for(int i = 0 ; i < numberOfChildren ; i++)
        {
            temp = temp + chocolates[i];
        }
        return temp;
    }

    public int weightOfChocolates()
    {
        return sweetWeight*numberOfChocolates();
    }

    public void sort()
    {
        for(int i = 0 ; i < numberOfChildren ; i++)
        {
            for(int j = 0 ; j < numberOfChildren-1 ; j++)
            {
                if(chocolates[i] < chocolates[j])
                {
                    int temp = chocolates[i];
                    chocolates[i] = chocolates[j];
                    chocolates[j] = temp;

                    String strTemp = childrenNames[i];
                    childrenNames[i] = childrenNames[j];
                    childrenNames[j] = strTemp;

                }
            }
        }

        System.out.println("Children names and their chocolates in sorted order : ");
        displayChildrenAndChocolates();

    }

    public void findMaximumChocolate()
    {
        int max = -1, pos=-1;

        for(int i = 0 ; i < numberOfChildren ; i++)
        {
            if(max < chocolates[i])
            {
                max = chocolates[i];
                pos = i;
            }
        }

        System.out.println(childrenNames[pos] + " have max chocolates i.e " + max);
    }

    public void display()
    {
        System.out.println("Total number of Chocolates are " + numberOfChocolates());

        System.out.println("Total weight of Chocolates are " + weightOfChocolates());

        System.out.println("Children with the no. of chocolates they have : " );
        displayChildrenAndChocolates();

        findMaximumChocolate();
    }

    public int[] getList()
    {
        int total[] = new int[numberOfChildren];
        for(int i = 0 ; i < numberOfChildren ; i++)
        {
            total[i] = chocolates[i] * sweetWeight;
        }
        return total;
    }
}
