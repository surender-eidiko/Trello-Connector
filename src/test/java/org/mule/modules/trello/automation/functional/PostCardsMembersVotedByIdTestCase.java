package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.CardsMembersVotedPostRequest;

public class PostCardsMembersVotedByIdTestCase extends TrelloAbstractTestcases {

	public PostCardsMembersVotedByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testPostCardsMembersVotedById(){
		String cardIdOrShortlink=getCardIdOrShortlink();
		CardsMembersVotedPostRequest request = getCardsMembersVotedPostRequest();
		String response = getConnector().postCardsMembersVotedById(cardIdOrShortlink,request);
		assertNotNull(response);
	}
}
