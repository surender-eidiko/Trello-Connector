package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.StatusResponse;

public class DeleteCardsByIdMembersVotedTestCase extends
		TrelloAbstractTestcases {

	public DeleteCardsByIdMembersVotedTestCase(Class<TrelloConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testDeleteCardsByIdMembersVoted(){
		String cardIdOrShortlink=getCardIdOrShortlink();
		String idMember = getIdMember();
		StatusResponse response = getConnector().deleteCardsByIdMembersVoted(cardIdOrShortlink,idMember);
		assertNotNull(response);
		assertEquals("200",response.getStatusCode());
	}
}
