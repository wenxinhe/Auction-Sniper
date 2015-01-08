package com.markupandgouge;

import org.jivesoftware.smack.Chat;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.tcp.XMPPTCPConnection;

/**
 * Created by vincent on 14-12-24.
 */
public class FakeAuctionServer {
	public static final String ITEM_ID_AS_LOGIN = "auction-%s";
	public static final String AUCTION_RESOURCE = "Auction";
	public static final String XMPP_HOSTNAME = "localhost";
	private static final String AUCTION_PASSWORD = "auction";

	private final String itemId;
	private final XMPPConnection connection;
	private Chat currentChat;

	public FakeAuctionServer(String itemId) {
		this.itemId = itemId;
		this.connection = new XMPPTCPConnection(XMPP_HOSTNAME);
	}

	public void start
}
