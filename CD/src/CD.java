
public class CD {
	
	private String CDname;
    private String CDnumber;
    private double CDprice;
	
	public CD(String CDname, String CDnumber, double CDprice)
	    {
	    	CDname = CDname;
	    	CDnumber = CDnumber;
	    	CDprice = CDprice;
	    	
	    }

	
	public CD(String CDname, String CDnumber)
    {
    	CDname = CDname;
    	CDnumber = CDnumber;
    	
    	
    }
	
	public CD() {
		
	}
   



	
	
	
    public String getCDname() {
		return CDname;
	}


	public void setCDname(String cDname) {
		CDname = cDname;
	}


	public String getCDnumber() {
		return CDnumber;
	}


	public void setCDnumber(String cDnumber) {
		CDnumber = cDnumber;
	}


	public double getCDprice() {
		return CDprice;
	}


	public void setCDprice(double cDprice) {
		CDprice = cDprice;
	}



    
    
   


	public CD(String cDname2, String cDnumber2, int cDprice2) {
		// TODO Auto-generated constructor stub
	}





}