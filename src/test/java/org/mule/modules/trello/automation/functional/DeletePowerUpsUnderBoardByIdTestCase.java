package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.StatusResponse;

public class DeletePowerUpsUnderBoardByIdTestCase extends
		TrelloAbstractTestcases {

	public DeletePowerUpsUnderBoardByIdTestCase(Class<TrelloConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testDeletePowerUpsUnderBoardById(){
		String boardId=getBoardId();
		String powerUp = getPowerUp();
		StatusResponse response = getConnector().deletePowerUpsUnderBoardById(boardId, powerUp);
		assertNotNull(response);
		assertEquals("200",response.getStatusCode());
	}
}
