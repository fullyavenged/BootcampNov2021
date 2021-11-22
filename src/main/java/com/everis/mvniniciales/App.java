package com.everis.mvniniciales;
import org.apache.commons.lang3.SystemUtils;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
    	Person p = new Person();
        System.out.println(SystemUtils.getUserName());
        System.out.println(p);
        
    }
    
    public static class Person{
    	String name = "Ivan";
    	Integer age = 23;
    	
    public Person() {
    	
    }	
    	public String toString() {
    		return "Nombre: " + name + "\nEdad: " + age;
    	}
    }
}
