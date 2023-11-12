package Methods;

public class CallByRef {

	public static void sendEmail(CallByRef ref)
	{
		System.out.println("Send Email");
		ref.readEmail();
	}
	public void readEmail()
	{
		System.out.println("Read email");
	}
	public static void main(String[] args) {
		CallByRef obj=new CallByRef();
		CallByRef.sendEmail(obj);
	}

}
