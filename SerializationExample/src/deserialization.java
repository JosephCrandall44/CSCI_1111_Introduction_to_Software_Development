import java.io.*;
public class deserialization{
	public static void main (String [] args)
	{
		Employee e = null;
		try{
			//in.class();
			//fileIn.class();
			
			FileInputStream fileIn = new FileInputStream("/Users/josephcrandall/Documents/GW/Spring_2014/Java/JavaCode/Employee/src/employee.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			
			e = (Employee) in.readObject();
			
		}catch(IOException i)
		{
			i.printStackTrace();
			return;
		}catch(ClassNotFoundException c){
			System.out.println("Employee class not found");
			c.printStackTrace();	
		}
		System.out.println("Deserialized Employee");
		System.out.println("Name" + e.getName());
		
		
		
		
	}
	}
