package JavaActivity4;

class CustomException extends Exception {
	private String message;
	
	//constructor
	public CustomException(String s) {
		this.message=s;
	}
	
	//@override
	public String getMessage() {
	    return message;
	}
}
//Exception handling
public class Activity2_4 {

	public static void main(String[] args) {

		try {
            Activity2_4.exceptionTest("Will print to console");
            Activity2_4.exceptionTest(null);
            Activity2_4.exceptionTest("Won't execute");
        } catch(CustomException mae) {
            System.out.println("Inside catch block: " + mae.getMessage());
        }		
	}
	
	static void exceptionTest(String str) throws CustomException {
        if(str == null) {
            throw new CustomException("String value is null");
        } else {
            System.out.println(str);
        }
	}

}
