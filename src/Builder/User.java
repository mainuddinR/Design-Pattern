package Builder;


public class User {
	private final String userId;
	private String userName;
	private String emailId;
	private User(UserBuilder builder){
	
		this.userId=builder.userId;
		this.emailId=builder.emailId;
		this.userName=builder.userName;
	}
	
	public String getUserId() {
		return userId;
	}
	public String getUserName() {
		return userName;
	}
	public String getEmailId() {
		return emailId;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.userName+"\n "+this.emailId+"\n"+this.userId;
	}
	
	//inner cladd to create object
	static class UserBuilder{
		private String userId;
		private String userName;
		private String emailId;
		
		public UserBuilder() {
		}
		
		
		public UserBuilder setUserId(String userId) {
			this.userId = userId;
			return this;
		}
		public UserBuilder setEmailId(String emailId) {
			this.emailId = emailId;
			return this;
		}
		public UserBuilder setUserName(String userName) {
			this.userName = userName;
			return this;
		}
		public User build() {
			User user=new User(this);
			return user;
		}
	}
}
