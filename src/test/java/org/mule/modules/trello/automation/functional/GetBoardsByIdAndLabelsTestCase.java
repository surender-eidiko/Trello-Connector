package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.BoardsByIdAndLabelsGetResponse;

public class GetBoardsByIdAndLabelsTestCase extends TrelloAbstractTestcases {

	public GetBoardsByIdAndLabelsTestCase() {
		super(TrelloConnector.class);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetBoardsByIdAndLabels() {
		String boardId=getBoardId();
		BoardsByIdAndLabelsGetResponse boardsByIdAndLabelsGetResponse=getConnector().getBoardsByIdAndLabels(boardId, null, null);
		assertNotNull(boardsByIdAndLabelsGetResponse);
		assertEquals("200", boardsByIdAndLabelsGetResponse.getStatusCode());
	}

}
