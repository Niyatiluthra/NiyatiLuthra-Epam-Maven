package org.example.Sweets;

public class Candies extends Sweet
{
    public int candies[] ;
    public Candies(int weight, int number, int candy[], String name[] )
    {
        sweetWeight = weight;
        numberOfChildren = number;

        candies = new int[numberOfChildren];
        childrenNames = new String[numberOfChildren];

        for(int i = 0 ; i < numberOfChildren ; i++)
        {
            childrenNames[i] = name[i];
            candies[i] = candy[i];
        }
    }

    void displayChildrenAndCandies()
    {
        for(int i = 0 ; i < numberOfChildren ; i++)
            System.out.println( childrenNames[i] + " have " + candies[i] + ".");
    }

    public int numberOfCandies()
    {
        int temp = 0;
        for(int i = 0 ; i < numberOfChildren ; i++)
        {
            temp = temp + candies[i];
        }
        return temp;
    }

    public int weightOfCandies()
    {
        return sweetWeight*numberOfCandies();
    }

    public void sort()
    {
        for(int i = 0 ; i < numberOfChildren ; i++)
        {
            for(int j = 0 ; j < numberOfChildren-1 ; j++)
            {
                if(candies[i] < candies[j])
                {
                    int temp = candies[i];
                    candies[i] = candies[j];
                    candies[j] = temp;

                    String strTemp = childrenNames[i];
                    childrenNames[i] = childrenNames[j];
                    childrenNames[j] = strTemp;

                }
            }
        }

        System.out.println("Children names and their candies in sorted order : ");
        displayChildrenAndCandies();

    }

    public void findMaximumCandies()
    {
        int max = -1, pos=-1;

        for(int i = 0 ; i < numberOfChildren ; i++)
        {
            if(max < candies[i])
            {
                max = candies[i];
                pos = i;
            }
        }

        System.out.println(childrenNames[pos] + " have max candies i.e " + max);
    }

    public void display()
    {
        System.out.println("Total number of candies are " + numberOfCandies());

        System.out.println("Total weight of candies are " + weightOfCandies());

        System.out.println("Children with the no. of candies they have : " );
        displayChildrenAndCandies();

        findMaximumCandies();
    }

    public int[] getList()
    {
        int total[] = new int[numberOfChildren];
        for(int i = 0 ; i < numberOfChildren ; i++)
        {
            total[i] = candies[i] * sweetWeight;
        }
        return total;
    }
}
