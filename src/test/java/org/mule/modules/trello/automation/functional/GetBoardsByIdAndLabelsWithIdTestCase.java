package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetBoardsByIdAndLabelsWithIdTestCase extends TrelloAbstractTestcases {

	public GetBoardsByIdAndLabelsWithIdTestCase() {
		super(TrelloConnector.class);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetBoardsByIdAndLabelsWithId() {
		String boardId=getBoardId();
		String labelId=getLabelId();
		String boardsByIdAndLabelsGetResponse=getConnector().getBoardsByIdAndLabelsWithId(boardId, labelId, null);
		assertNotNull(boardsByIdAndLabelsGetResponse);
	}

}
