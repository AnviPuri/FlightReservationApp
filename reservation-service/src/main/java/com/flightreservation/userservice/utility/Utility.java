package com.flightreservation.userservice.utility;

import java.util.Date;

public class Utility {

	public static long getEpochTime() {
		Date currentDate = new Date();
		long epochTime = currentDate.getTime() / 1000;
		return epochTime;
	}

}
