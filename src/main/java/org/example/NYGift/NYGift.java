package org.example.NYGift;

public class NYGift {
    public int choc[];
    public int candy[];
    public String children[];

    public NYGift(String []childrenNames,int[] chocList,int[] candyList)
    {
        children = new String[childrenNames.length];
        candy = new int[childrenNames.length];
        choc = new int[childrenNames.length];
        for(int i = 0 ; i < childrenNames.length ; i++) {
            children[i] = childrenNames[i];
            choc[i] = chocList[i];
            candy[i] = candyList[i];
        }
    }

    public void display()
    {
        for(int i = 0 ; i < children.length ; i++)
        {
            int temp = candy[i] + choc[i];
            System.out.println(children[i] + " has total weight of gifts : " + temp);
        }
    }
}
