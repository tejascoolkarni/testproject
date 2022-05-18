package testproject;

import org.testng.annotations.Test;

public class movieinfovalidation {
	@Test(priority = 1)
	public void countrytest() {
		String imdb = "india";
		String wiki = "india";
		boolean countryresult = (imdb.equals(wiki));
		System.out.println("countryresult :" + countryresult);
		if (countryresult == true) {
			System.out.println("testcase is pass");
		} else {
			System.out.println("test case is failed");
		}
	}

	@Test(priority = 2)
	public void releasedatetest() {
		String imdb = "December 17, 2021";
		String wiki = "17 December 2021";

		boolean dateresult = (imdb.equals(wiki));
		System.out.println("dateresult :" + dateresult);
		if (dateresult == true) {
			System.out.println("testcase is pass");
		} else {
			System.out.println("test case is failed");
		}
	}

}
