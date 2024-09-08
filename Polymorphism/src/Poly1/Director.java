package Poly1;

class Director extends Manager {
	double carAllowance;
	public String getDetails() {
		return super.getDetails() +
				"\nCar Allowance: " + carAllowance;
	}
	public void playGolf() {
		System.out.println("Play Gold... ");
	}

	public static void doEmployeeStuff(Employee e) {
		e.work();
		if (e instanceof Director) {
			Director d = (Director) e;
			d.playGolf();
		}
		else if(e instanceof Manager) {
			Manager m = (Manager) e;
			m.callMeeting();
		}
	}
	
	//Add PSVM later to see output...

}

