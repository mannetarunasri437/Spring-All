package com.mvn.DependencyInjection;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Product p=new Product();
    	p.setPId(103);
    	p.setPname("books");
    	
    	Order o=new Order(102,"book",p);
    	o.setProduct(p);
    	o.print();
    	
    	
    }
}
