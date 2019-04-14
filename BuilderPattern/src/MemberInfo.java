
public class MemberInfo {
	
	private String name;
	private String phone;
	private String address;
	private String age;
	private String email;
	
	private MemberInfo(MemberInfoBuilder builder) {
		this.name = builder.name;
		this.phone = builder.phone;
		this.address = builder.address;
		this.age = builder.age;
		this.email = builder.email;
	}
	
	@Override
	public String toString() {
		return "MemberInfo [name=" + name + ", phone=" + phone + ", address=" + address + ", age=" + age + ", email="
				+ email + "]";
	}

	public static class MemberInfoBuilder {
		
		// Required parameters
		private String name;
		private String phone;
		
		// Optional parameters
		private String address = "";
		private String age = "";
		private String email = "";
		
		public MemberInfoBuilder(String name, String phone) {
			this.name = name;
			this.phone = phone;
		}

		public MemberInfoBuilder setAddress(String address) {
			this.address = address;
			return this;
		}

		public MemberInfoBuilder setAge(String age) {
			this.age = age;
			return this;
		}

		public MemberInfoBuilder setEmail(String email) {
			this.email = email;
			return this;
		}	
		
		public MemberInfo build() {
			return new MemberInfo(this);
		}
		
		
	}

}
