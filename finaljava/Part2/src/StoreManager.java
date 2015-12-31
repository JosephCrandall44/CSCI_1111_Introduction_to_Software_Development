import java.util.*;
import java.util.Scanner;
public class StoreManager {
	private String FistName;
	private String LastName;
	private String ManagerNumber;
	private String UserName;
	private String Password;
	
	
	public StoreManager(String FistName, String LastName, String ManagerNumber, String UserName,  String Password ){
		this.FistName=FistName;
		this.LastName= LastName;
		this.ManagerNumber = ManagerNumber;
		this.UserName = UserName;
		this.Password = Password;
	}
	
	@Override
	public String toString(){
		return("Manager:"+ this.getFistName() + this.getLastName()+ this.getManagerNumber());
	}
	
	
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	public String getFistName() {
		return FistName;
	}
	public void setFistName(String fistName) {
		FistName = fistName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getManagerNumber() {
		return ManagerNumber;
	}
	public void setManagerNumber(String managerNumber) {
		ManagerNumber = managerNumber;
	}
	

}
