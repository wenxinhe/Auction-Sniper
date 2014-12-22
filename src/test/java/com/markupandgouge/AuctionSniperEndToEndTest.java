package com.markupandgouge;

import org.junit.After;
import org.junit.Test;

/**
 * Created by vincent on 14-12-22.
 */
public class AuctionSniperEndToEndTest {
	private final FakeAuctionServer auction = new FakeAuctionServer("item-54321");
	private final ApplicationRunner application = new ApplicationRunner();

	@Test
	public void sniperJoinAuctionUntilAuctionCloses() throws Exception {
		auction.startSellingItem();
		application.startBiddingIn(auction);
		auction.hasReceivedJoinRequestFromSniper();
		auction.announceClosed();
		application.showSniperHasLostAuction();
	}

	@After
	public void stopAuction() throws Exception {
		auction.stop();
	}

	@After
	public void stopApplication() throws Exception {
		application.stop();
	}
}
