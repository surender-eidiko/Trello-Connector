/**
 *
 */
package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;

public class GetBoardsByIdAndFieldTestCase extends TrelloAbstractTestcases {
	public GetBoardsByIdAndFieldTestCase() {
		// TODO Auto-generated constructor stub
		super(TrelloConnector.class);
	}

	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetBoardsByIdAndField() {
		String boardId=getBoardId();
		String field=getField();
		String boardsByIdAndFieldGetResponse=getConnector().getBoardsByIdAndField(boardId, field);
		assertNotNull(boardsByIdAndFieldGetResponse);

	}

}
