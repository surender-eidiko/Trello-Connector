package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.bean.BoardsByIdAndDeltasGetResponse;

public class GetBoardsByIdAndDeltasTestCase extends TrelloAbstractTestcases {

	public GetBoardsByIdAndDeltasTestCase() {
		super(TrelloConnector.class);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetBoardsByIdAndDeltas() {
		String boardId=getBoardId();
		String tags=getTags();
		String ixLastUpdate=getIxLastUpdate();
		BoardsByIdAndDeltasGetResponse boardsByIdAndDeltasGetResponse=getConnector().getBoardsByIdAndDeltas(boardId, tags, ixLastUpdate);
		assertNotNull(boardsByIdAndDeltasGetResponse);
		assertEquals("200", boardsByIdAndDeltasGetResponse.getStatusCode());
	}

}
