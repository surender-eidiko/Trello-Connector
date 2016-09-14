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
		return "5769e574ea65f1715aa74795";
	}
	
	String getBoardId(){
	return "57763e76fa453a2e7a0fb68b";
	}
	
	public String getIdMember(){
		return "57763e76fa453a2e7a0fb68b";
	}
	
	public String getListId(){
		return "57d8deb072b1ac4f644d8c00";
	}
	
	
	public String getWebhookId(){
		return "57d8d77f351d3414d9f054c2";
	}
	public BoardsByIdPutRequest getBoardsByIdPutRequest(){
		BoardsByIdPutRequest req = new BoardsByIdPutRequest();
		req.setName("Name Me First");
		req.setClosed(true);
		return req;
	}
	
	public BoardsPostRequest getBoardsPostRequest(){
		BoardsPostRequest req = new BoardsPostRequest();
		req.setName("EidikoTest123");
		return req;
	}
	public String getCardIdOrShortlink(){
		return "57d8dfaee35596ab5967cda5";
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
		req.setName("Testc67cc");
		req.setDue("2016-12-23");
		req.setIdList(getIdList());
		return req;
	}
	public String getIdList(){
		return "57d8deb072b1ac4f644d8c00";
	}
	
	public ListsByIdPutRequest getListsByIdPutRequest(){
		ListsByIdPutRequest req = new ListsByIdPutRequest();
		req.setName("updated list");
		return req;
	}
	
	public ListsPostRequest getListsPostRequest(){
		ListsPostRequest req = new ListsPostRequest();
		req.setIdBoard(getBoardId());
		req.setName("New List");
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
		req.setCallbackURL("http://google.com");
		return req;
	}
	
	public String getChecklistId(){
		return "576b8db31019f509a85351dc";
	}
	
}
