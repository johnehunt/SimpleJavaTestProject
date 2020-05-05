package com.jjh.sample;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Calculator c = new Calculator();
        c.add(5);
        System.out.println(c.getTotal());
    }
}
