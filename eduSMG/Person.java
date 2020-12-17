package eduSMG;

public class Person {
		private String name;
		private String adress;
		private String phoneNumber;
		private String eMailAdress;
		
		public Person( String name, String adress, String phoneNumber, String eMailAdress){
//			this.setName(name);
//			this.setAdress(adress);
//			this.setPhoneNumber(phoneNumber);
//			this.seteMailAdress(eMailAdress);
			this.name = name;
			this.adress = adress;
			this.phoneNumber = phoneNumber;
			this.eMailAdress = eMailAdress;
	}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAdress() {
			return adress;
		}

		public void setAdress(String adress) {
			this.adress = adress;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String geteMailAdress() {
			return eMailAdress;
		}

		public void seteMailAdress(String eMailAdress) {
			this.eMailAdress = eMailAdress;
		}
		
		public String toString() {
			return "\nName: " + name + "\nAdress: " + adress + "\nPhone number: " + phoneNumber + "\nE-Mail: " + eMailAdress;
		}
		
}
