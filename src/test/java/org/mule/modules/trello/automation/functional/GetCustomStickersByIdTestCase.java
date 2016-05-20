package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetCustomStickersByIdTestCase extends TrelloAbstractTestcases {

	public GetCustomStickersByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetCustomStickersById(){
		String memId = getMemberIdOrName(); 
		String idCustomSticker = getidCustomSticker();
		String response = getConnector().getCustomStickersById(memId, idCustomSticker,null);
		assertNotNull(response);
	}
}
