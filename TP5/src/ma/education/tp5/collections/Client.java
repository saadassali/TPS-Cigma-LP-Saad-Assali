package ma.education.tp5.collections;

public class Client {

	Integer code;
	String name;
	public Client(Integer code, String name) {
	this.code = code;
	this.name = name;
	}
	
	  @Override
	    public int hashCode() {
	  
	  
	  return code;
	  }
	  @Override
	  public boolean equals(Object o) {
		  Client c=(Client)o;
	  
	  return this.code==c.code && this.name=="tkhrbi9a";
	  }
	@Override
	public String toString() {
	return "Client{" +
	"code=" + code +
	", name='" + name + '\'' +
	'}';
	}

/*	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Client c=(Client)o;
		
		return -this.code+c.code;
	}
*/
}
