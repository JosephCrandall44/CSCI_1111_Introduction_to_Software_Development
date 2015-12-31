import java.io.*;
public class SerializeDemo {
	public static void main (String [] args)
	{
		Employee e = new Employee();
		e.setName("ReyeanAli");
		e.setAdress("1234");
		e.setSSN("jfdhg");
		e.setNumber("46");
		
		try{
			FileOutputStream fileOut = new FileOutputStream("employee.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
			System.out.println("Serialized data employee.ser ");
			
		}
		catch(IOException i){
			System.out.println("The file has not been found");
		}
	
	}
}
