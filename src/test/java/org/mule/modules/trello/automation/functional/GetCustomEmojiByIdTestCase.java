package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetCustomEmojiByIdTestCase extends TrelloAbstractTestcases {

	public GetCustomEmojiByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetCustomEmojiById(){
		String memId = getMemberIdOrName(); 
		String idCustomEmoji = getCustomEmojiId();
		String response = getConnector().getCustomEmojiById(memId, idCustomEmoji,null);
		assertNotNull(response);
	}
}
