package icehs.science.chapter08;

public class SunInTest {

	public static void main(String[] args) {
		/*
		 * SunIn [] sun = new SunIn[7]; sun[0] = new SunIn(); sun[1] = new SunIn();
		 * sun[2] = new SunIn(); sun[3] = new SunIn(); sun[4] = new SunIn(); sun[5] =
		 * new SunIn(); sun[6] = new SunIn(); // sun[7] = new SunIn();
		 */
		
		SunIn [] sun = { 
				new SunIn(), 
				new SunIn(),
				new SunIn(), 
				new SunIn(),
				new SunIn(), 
				new SunIn() 
				};
		
		sun[0].printSunInInfo();
		sun[1].printSunInInfo();
		sun[2].printSunInInfo();
		sun[3].printSunInInfo();

	}

}
