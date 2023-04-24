package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Database {

	public static void main(String[] args) {
	    try {
			
	    	ArrayList<Employee> e1=new ArrayList<Employee>();
			
		    e1.add(new Employee("Smith", 7369,  800, "Clerk", "Ford",20,"Research","Dallas"));
			e1.add(new Employee("Allen", 7499,  1600, "Salesman", "Blake",30,"Sales","Chicago"));
			e1.add(new Employee("Ward", 7521,  1250, "Salesman", "Blake",30,"Sales","Chicago"));
			e1.add(new Employee("Jones", 7566,  2975, "Manager", "King",20,"Research","Dallas"));
			e1.add(new Employee("Martin", 7654,  1250, "Salesman", "Blake",30,"Sales","Chicago"));
			e1.add(new Employee("Blake", 7698,  2850, "Manager", "King",30,"Sales","Chicago"));
			e1.add(new Employee("Clark", 7782,  2450, "Manager", "King",10,"Accounting","NewYork"));
			e1.add(new Employee("Scott", 7788,  3000, "Analyst", "Jones",20,"Research","Dallas"));
			e1.add(new Employee("King", 7839,  5000, "President", null,10,"Accounting","NewYork"));
			e1.add(new Employee("Turner", 7844,  1500, "Salesman", "Blake",30,"Sales","Chicago"));
			e1.add(new Employee("Adams", 7876,  1100, "Clerk", "Scott",20,"Research","Dallas"));
			e1.add(new Employee("James", 7900,  950, "Clerk", "Blake",30,"Sales","Chicago"));
			e1.add(new Employee("Ford", 7902,  3000, "Analyst", "Jones",20,"Research","Dallas"));
			e1.add(new Employee("Miller", 7934,  1300, "Clerk", "Clark",10,"Accounting","NewYork"));
			
			
			Scanner s=new Scanner(System.in);
			System.out.println("What to do?");
			System.out.println("1.Check Salary");
			System.out.println("2.Check Job");
			System.out.println("3.Check Employee Details");
			System.out.println("4.Check Manager of Employee");
			int ip=s.nextInt();
			
			switch (ip) {
			case 1:{
				
	            checkSal(e1,s);
					break;
			}
			case 2:{
				
				checkJobE(e1,s);
				break;
			}
			case 3:{
			
				checkDetails(e1, s);	
				break;
			}
			case 4:{
				
				checkManager(e1, s);
				break;
			}
			default:{
				System.out.println("Enter correct Number");
				break;
			}
			}
		} 
	    catch (InputMismatchException e) {
			System.out.println("InputMismatchException: Please Enter Correct Input");
		}
	    catch (Exception e) {
			System.out.println("Enter valid data");
		}
	    catch (Throwable e) {
			System.out.println("Check your entry again");
		}
	    finally {
	   
	    	System.out.println();
			System.out.println("Thank You:)");
		}
		
	}
	
	public static void checkSal(ArrayList<Employee> e1,Scanner s){
        
		System.out.println("1.Less than Salary");
		System.out.println("2.Greater than Salary");
		System.out.println("3.Equal to Salary");
		System.out.println("4.n^th min salary");
		System.out.println("5.n^th max salary");
		
		
		int ip=s.nextInt();
		
		
		
		switch (ip) {
		case 1:{
			System.out.println("Enter Salary");
			double sal=s.nextDouble();
			int ct=0;
			for (int i = 0; i < e1.size(); i++) {
     		  
     		   
     		   if (e1.get(i).sal<sal) {
					ct++;
     			   System.out.println(e1.get(i));
				}
             }
			if (ct==0) {
				System.out.println("NO SUCH ENTRIES FOUND");
			}
			break;
		}
		case 2:{
			System.out.println("Enter Salary");
			double sal=s.nextDouble();
			int ct=0;
			for (int i = 0; i < e1.size(); i++) {
	     		   
	     		   if (e1.get(i).sal>sal) {
	     			   ct++;
						System.out.println(e1.get(i));
					}
	     	   }
			if (ct==0) {
				System.out.println("NO SUCH ENTRIES FOUND");
			}
			break;
		}
		case 3:{
			System.out.println("Enter Salary");
			double sal=s.nextDouble();
			int ct=0;
			for (int i = 0; i < e1.size(); i++) {
	     		   
	     		   if (e1.get(i).sal==sal) {
	     			   ct++;
						System.out.println(e1.get(i));
					}
	     	   }
			if (ct==0) {
				System.out.println("NO SUCH ENTRIES FOUND");
			}
			break;
		}
		case 4:{
			System.out.println("Enter value of n");
			int n=s.nextInt();
			
			Collections.sort(e1);
			System.out.println(e1.get(n-1));
			break;
		}
		case 5:{
			System.out.println("Enter value of n");
			int n=s.nextInt();
			
			Collections.sort(e1);
			System.out.println(e1.get(e1.size()-n));
			break;
		}
		}
		   
	}
	
	public static void checkJobE(ArrayList<Employee> e1,Scanner s) {
		
		System.out.println("1.Job equal to!");
		System.out.println("2.Job not equal to!");
		int ip=s.nextInt();
		
		System.out.println("Enter Job");
		String job=s.next();
		
		switch (ip) {
		case 1:{
			int ct=0;
			for (int i = 0; i < e1.size(); i++) {
		  		   
		  		   if (e1.get(i).job.equalsIgnoreCase(job)) {
		  			   ct++;
							System.out.println(e1.get(i));
						}
		  	   }
			if (ct==0) {
				System.out.println("NO SUCH ENTRIES FOUND");
			}
			break;
		}
		case 2:{
			for (int i = 0; i < e1.size(); i++) {
		  		   
		  		   if (!e1.get(i).job.equalsIgnoreCase(job)) {
							System.out.println(e1.get(i));
						}
		  	   }
			break;
		}
		
	  }
   }
	
	public static void checkDetails(ArrayList<Employee> e1,Scanner s) {

		System.out.println("1.By Employee Name");
		System.out.println("2.By Employee Number");
		System.out.println("3.By Employee Location");
		int ip=s.nextInt();
		
		switch (ip) {
		case 1:{
			System.out.println("Enter Employee Name");
			String name=s.next();
			
			for (int i = 0; i < e1.size(); i++) {
		  		   
		  		   if (e1.get(i).name.equalsIgnoreCase(name)) {
							System.out.println(e1.get(i));
						}
		  	   }
			break;
		}
		case 2:{
			System.out.println("Enter Employee ID");
			int eid=s.nextInt();
			
			for (int i = 0; i < e1.size(); i++) {
		  		   
		  		   if (e1.get(i).eid==eid) {
							System.out.println(e1.get(i));
						}
		  	   }
			break;
		}
		case 3:{
			System.out.println("Enter location");
			String loc=s.next();
			
			for (int i = 0; i < e1.size(); i++) {
			
				if (e1.get(i).loc.equalsIgnoreCase(loc)) {
					System.out.println(e1.get(i));
				}
			}
			break;
		}
		default:{
			System.out.println("Enter Correct Number ");
			break;
		}
		
		}
	}

	public static void checkManager(ArrayList<Employee> e1,Scanner s) {
		
		System.out.println("Enter Employee ID");
		int eid=s.nextInt();
		for (int i = 0; i < e1.size(); i++) {
			
			
			if (e1.get(i).eid==eid) {
				System.out.println("Manager of "+e1.get(i).name+" is "+e1.get(i).manager);
			}
		}
		
	}
}
