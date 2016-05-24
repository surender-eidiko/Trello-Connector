package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.CreateCustomEmojiPostRequest;

public class CreateCustomEmojiTestCase extends TrelloAbstractTestcases {

	public CreateCustomEmojiTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testCreateCustomEmoji(){
		String memId = getMemberIdOrName(); 
		CreateCustomEmojiPostRequest request = getCreateCustomEmojiPostRequest();
		String response = getConnector().createCustomEmoji(memId,request);
		assertNotNull(response);
	}
}