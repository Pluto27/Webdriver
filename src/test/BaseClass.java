package test;

import java.util.Date;

public class BaseClass {
	 private final Date createdDate = new java.util.Date();
	protected int getAgeInSeconds() {
		
        java.util.Date now = new java.util.Date();
        return (int)((now.getTime() - this.createdDate.getTime()) / 1000);
    }

}
