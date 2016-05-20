package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.StatusResponse;

public class DeleteMembersCustomStickersByIdTestCase extends
		TrelloAbstractTestcases {

	public DeleteMembersCustomStickersByIdTestCase(
			Class<TrelloConnector> connector) {
		super(connector);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testDeleteMembersCustomStickersById(){
		String memId = getMemberIdOrName(); 
		String customStickeerId = getidCustomSticker();
		StatusResponse response = getConnector().deleteMembersCustomStickersById(memId,customStickeerId);
		assertNotNull(response);
	}
}
