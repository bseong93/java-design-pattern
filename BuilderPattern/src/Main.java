
public class Main {
	
	public static void main(String args[]) {
		MemberInfo memberInfo = new MemberInfo.MemberInfoBuilder("name", "phone").setEmail("email").build();
		
		System.out.println(memberInfo.toString());
	}

}
