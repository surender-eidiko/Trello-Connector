package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetCustomEmojiTestCase extends TrelloAbstractTestcases {

	public GetCustomEmojiTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetBoardsInvited(){
		String memId = getMemberIdOrName(); 
		String field = getField();
		String response = getConnector().getCustomEmoji(memId, field);
		assertNotNull(response);
	}
}
