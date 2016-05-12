package org.mule.modules.trello.automation.functional;

import org.junit.Before;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.bean.ActionsByIdPutRequest;
import org.mule.modules.trello.bean.ActionsTextByIdPutRequest;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;
import org.mule.tools.devkit.ctf.mockup.ConnectorDispatcher;
import org.mule.tools.devkit.ctf.mockup.ConnectorTestContext;

public class TrelloAbstractTestcases extends AbstractTestCase<TrelloConnector>{

	private TrelloConnector connector;
	  private ConnectorDispatcher<TrelloConnector> dispatcher;
	  
	  
	  
	  public TrelloAbstractTestcases(Class<TrelloConnector> connector){
		    super();
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
	
	
	public String getActionId()
	{
		return null;
	}
	public String getField()
	{
		return null;
	}
	public ActionsByIdPutRequest getActionByIdPutRequest()
	{
		return null;
	}
	public ActionsTextByIdPutRequest getActionTextByIdPutRequest()
	{
		return null;
	}
	public String getValue()
	{
		return null;
	}
	public String getMembershipId()
	{
		return null;
	}
	String getBoardId(){
	return null;
	}
	public String getFilter()
	{
		return null;
	}
	public String getIdCard()
	{
		return null;
	}
	public String getCards()
	{
		return null;
	}
	public String getTags()
	{
		return null;
	}
	public String getIxLastUpdate()
	{
		return null;
	}
	public String getLabelId()
	{
		return null;
	}
}
