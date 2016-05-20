package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.CreateCustomStickerPostRequest;

public class CreateCustomStickersTestCase extends TrelloAbstractTestcases {

	public CreateCustomStickersTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testCreateCustomStickers(){
		String memId = getMemberIdOrName(); 
		CreateCustomStickerPostRequest request = getCreateCustomStickerPostRequest();
		String response = getConnector().createCustomStickers(memId,request);
		assertNotNull(response);
	}
}
