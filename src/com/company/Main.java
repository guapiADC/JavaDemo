package com.company;

public class Main {

    public static void print(int index,Object object){
        System.out.println(String.format("%d,%s",index,object.toString()));
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World!");
        print(1,5>>2);
    }
}
