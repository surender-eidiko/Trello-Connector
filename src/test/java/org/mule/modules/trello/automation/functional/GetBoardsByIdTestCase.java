/**
 *
 */
package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.BoardsByIdGetResponse;

public class GetBoardsByIdTestCase extends TrelloAbstractTestcases{

	public GetBoardsByIdTestCase() {
		super(TrelloConnector.class);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetBoardsById() {
		String boardId=getBoardId();
		BoardsByIdGetResponse boardsByIdGetResponse=getConnector().getBoardById(boardId,null);
		assertNotNull(boardsByIdGetResponse);
	}

}
