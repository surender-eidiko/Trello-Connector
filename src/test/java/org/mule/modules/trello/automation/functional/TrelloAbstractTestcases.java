/**
 *
 */
package org.mule.modules.trello.automation.functional;

import org.junit.Before;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.bean.*;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;
import org.mule.tools.devkit.ctf.mockup.ConnectorDispatcher;
import org.mule.tools.devkit.ctf.mockup.ConnectorTestContext;


public class TrelloAbstractTestcases extends AbstractTestCase<TrelloConnector>{

	private TrelloConnector connector;
	  private ConnectorDispatcher<TrelloConnector> dispatcher;
	  public TrelloAbstractTestcases(Class<TrelloConnector> connector){
		    super(connector);
		  }
	protected TrelloConnector getConnector() {
		return connector;
	}
	protected ConnectorDispatcher<TrelloConnector> getDispatcher() {
		return dispatcher;
	}
	
	@SuppressWarnings("deprecation")
	@Before
	  public void init() throws Exception {

	    // Initialization for single-test run
	    ConnectorTestContext.initialize(TrelloConnector.class, false);

	    // Context instance
		ConnectorTestContext<TrelloConnector> context = ConnectorTestContext
	      .getInstance(TrelloConnector.class);

	    // Connector dispatcher
	    dispatcher = context.getConnectorDispatcher();

	    connector = dispatcher.createMockup();

	  }	
	
	
	
	
	public String getMemberId(){
		return "573aa44d31e7e4845190b84e";
	}
	
	String getBoardId(){
	return "573aa4743816a0d9b6db2be1";
	}
	
	public String getIdMember(){
		return "573aa4743816a0d9b6db2be1";
	}
	
	public String getListId(){
		return "5776016c36abb96c439a98ac";
	}
	
	
	public String getWebhookId(){
		return "57767edd18e38155a20ed18a";
	}
	
	public String getMemberIdOrName(){
		return "me";
	}
	
	public BoardsByIdPutRequest getBoardsByIdPutRequest(){
		BoardsByIdPutRequest req = new BoardsByIdPutRequest();
		req.setName("Name Me First");
		req.setClosed(true);
		return req;
	}
	
	public BoardsPostRequest getBoardsPostRequest(){
		BoardsPostRequest req = new BoardsPostRequest();
		req.setName("Post Me");
		return req;
	}
	public String getCardIdOrShortlink(){
		return "5763881daa68f7b3b1fb512a";
	}
	public CardsByIdPutRequest getCardsByIdPutRequest(){
		CardsByIdPutRequest req = new CardsByIdPutRequest();
		req.setName("Card card card");
		req.setDesc("card updated");
		req.setClosed(false);
		req.setPos("top");
		return req;
	}
	
	
	public CardsPostRequest getCardsPostRequest(){
		CardsPostRequest req= new CardsPostRequest();
		req.setName("Test67");
		req.setDue("2016-06-23");
		req.setIdList(getIdList());
		return req;
	}
	public String getIdList(){
		return "575e92ddf212d265218983b6";
	}
	
	public ListsByIdPutRequest getListsByIdPutRequest(){
		ListsByIdPutRequest req = new ListsByIdPutRequest();
		req.setName("updated list");
		return req;
	}
	
	public ListsPostRequest getListsPostRequest(){
		ListsPostRequest req = new ListsPostRequest();
		req.setIdBoard(getBoardId());
		req.setName("list455");
		return req;
	}
	
	
	
	public WebhooksByIdPutRequest getWebhookByIdPutRequest(){
		WebhooksByIdPutRequest req = new WebhooksByIdPutRequest();
		req.setActive(false);
		req.setCallbackURL("http://www.eidiko.com");
		req.setIdModel(getIdMember());
		req.setDescription("This is hook  for eidiko");
		return req;
	}
	public WebhooksPutRequest getWebhooksPutRequest(){
		WebhooksPutRequest req = new WebhooksPutRequest();
		req.setIdModel(getIdMember());
		req.setCallbackURL("http://trello.com");
		return req;
	}
	
	public String getChecklistId(){
		return "576b8db31019f509a85351dc";
	}
	
}
