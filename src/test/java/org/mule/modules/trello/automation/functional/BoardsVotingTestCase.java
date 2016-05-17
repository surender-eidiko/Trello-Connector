package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.modules.trello.bean.BoardsVotingPutRequest;

public class BoardsVotingTestCase extends TrelloAbstractTestcases {

	public BoardsVotingTestCase(Class<TrelloConnector> connector) {
		super(connector);
		// TODO Auto-generated constructor stub
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void testBoardsVoting(){
		String boardId=getBoardId();
		BoardsVotingPutRequest request = getBoardsVotingPutRequest();
		String response = getConnector().boardsVoting(boardId, request);
		assertNotNull(response);
	}
}
