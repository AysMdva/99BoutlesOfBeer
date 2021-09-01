package com.java.learning.session;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
	int beerNum=99;
	String name="bottles";

	while (beerNum > 0)
    {
        if (beerNum == 1)
    {
        name="bottle";
    }

        System.out.println(beerNum+" "+name+" of beer on the wall ");
        System.out.println(beerNum+" "+name+" of beer");
        System.out.println("Take one down.");
        System.out.println("Pass it around.");
        beerNum--;


        if (beerNum > 0)
        {
            System.out.println(beerNum+" "+name);
            System.out.println("*****************************************************");
        }

        if (beerNum == 0)
        {
            System.out.println("No more bottles of beer on the wall.");
        }


    }
  }
}
