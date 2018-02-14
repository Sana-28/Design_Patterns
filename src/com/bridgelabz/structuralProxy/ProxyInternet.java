package com.bridgelabz.structuralProxy;

import java.util.ArrayList;
import java.util.List;

/**Purpose: This class implements the Internet interface,
 * and override its define method.
 * @author SANa SHAiKH
 * @since 13/01/2018
*/
public class ProxyInternet implements Internet {
	private Internet internet = new RealInternet();

	private static List<String> bannedSites;
	static {
		bannedSites = new ArrayList<String>();
		bannedSites.add("abc.com");
		bannedSites.add("google.com");
	}

	@Override
	public void connectTo(String serverHost) throws Exception {
		if (bannedSites.contains(serverHost.toLowerCase())) {
			throw new Exception("Access Denied");
		}

		internet.connectTo(serverHost);

	}

}
