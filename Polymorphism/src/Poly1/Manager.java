package Poly1;

	class Manager extends Employee {
		String department;
		public String getDetails() {
			return super.getDetails() +
				"\nDepartment: " + department; 
		}
		public void callMeeting() {
			System.out.println("Call Department ");
		}
		
}
