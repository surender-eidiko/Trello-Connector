package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetBoardsByIdAndLabelsTestCase extends TrelloAbstractTestcases {

	public GetBoardsByIdAndLabelsTestCase() {
		super(TrelloConnector.class);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetBoardsByIdAndLabels() {
		String boardId=getBoardId();
		String boardsByIdAndLabelsGetResponse=getConnector().getBoardsByIdAndLabels(boardId, null, null);
		assertNotNull(boardsByIdAndLabelsGetResponse);
	}

}
