package Builder;

public class Main {
	public static void main(String[] args) {
		User user=new User.UserBuilder()
			.setEmailId("mainuddin.01.a@gmail.com")
			.setUserId("mainu_")
			.setUserName("Mainuddin").build();
		
		System.out.println(user);
		
		User user2=new User.UserBuilder()
				.setEmailId("bsse1304@iit.du.ac.bd")
				.setUserId("atikul_")
				.setUserName("Atikul").build();
		System.out.println(user2.toString());
		
	}
}
//problem
//telescopic Constructor
//onek gula constructor and alada alada parameter thakbe ...manage kora kosto
//Immutability 
//order of initialization (depend parameter khetre
