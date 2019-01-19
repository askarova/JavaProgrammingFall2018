package day43_static;


	public class AppUser {
		private static String userId;
		private String name;
		private String password;
		private static int count=0;

		public AppUser() {
			count++;
		}

		public AppUser(String userId, String name, String password) {
			this.userId = userId;
			this.name = name;
			this.password = password;	
			count++;
		}
		
		public String getUserId() {
			return userId;
		}
		
		public void setUserId(String userId) {
			this.userId = userId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public int getCount() {
			return count;
		}
		public void setCount(int count) {
			this.count = count;
		}
		
		
		
	}


