package org.example.Sweets;

public abstract class Sweet {
    public int sweetWeight;
    public int numberOfChildren;
    public String childrenNames[];
    public int price;
    public abstract void display();
    public abstract int[] getList();
    public abstract void sort();
}
