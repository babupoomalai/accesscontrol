package accesscontrol;

import java.util.Date;

import accesscontrol.controller.AccessManager;

public class App {

	public static void main(String args[]) {
		AccessManager accessManager = AccessManager.getInstance();

		accessManager.addUser("User1", "u1");
		accessManager.restrictPage("u1", "/bin");
//		accessManager.showRestrictedPages("u1");
		accessManager.restrictPage("u1", "/home/movies/english");
		accessManager.restrictPage("u1", "/home/movies/tamil");
		accessManager.restrictPage("u1", "/home/movies/hindi");
		accessManager.showRestrictedPages("u1");

//		System.out.println(accessManager.isPageRestricted("u1", "/"));
		Date fromDate = new Date();
		System.out.println(accessManager.isPageRestricted("u1", "/bin/"));
		System.out.println(accessManager.isPageRestricted("u1", "/"));
		Date toDate = new Date();
		System.out.println(accessManager.getAudits("u1", fromDate, toDate));
	}

}
