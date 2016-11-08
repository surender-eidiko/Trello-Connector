/**
 *
 */
package org.mule.modules.trello;

import java.util.List;

import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Processor;
import org.mule.api.annotations.lifecycle.Start;
import org.mule.api.annotations.param.Default;
import org.mule.api.annotations.param.Optional;
import org.mule.modules.trello.bean.BoardsByIdGetResponse;
import org.mule.modules.trello.bean.BoardsByIdPutRequest;
import org.mule.modules.trello.bean.BoardsByIdPutResponse;
import org.mule.modules.trello.bean.BoardsPostRequest;
import org.mule.modules.trello.bean.BoardsPostResponse;
import org.mule.modules.trello.bean.CardListGetResponse;
import org.mule.modules.trello.bean.CardsByIdGetResponse;
import org.mule.modules.trello.bean.CardsByIdPutRequest;
import org.mule.modules.trello.bean.CardsPostRequest;
import org.mule.modules.trello.bean.CheckListsByIdGetResponse;
import org.mule.modules.trello.bean.ListPostResponse;
import org.mule.modules.trello.bean.ListsByIdGetResponse;
import org.mule.modules.trello.bean.ListsByIdPutRequest;
import org.mule.modules.trello.bean.ListsPostRequest;
import org.mule.modules.trello.bean.ListsUnderBoardsGetResponse;
import org.mule.modules.trello.bean.MemberByIdGetresponse;
import org.mule.modules.trello.bean.MembersBoardsGetResponse;
import org.mule.modules.trello.bean.StatusResponse;
import org.mule.modules.trello.bean.WebhooksByIdPutRequest;
import org.mule.modules.trello.bean.WebhooksPostResponse;
import org.mule.modules.trello.bean.WebhooksPutRequest;
import org.mule.modules.trello.config.ConnectorConfig;
/**
 * This is Cisco Spark Connector Class
 * @author Surender
 *
 * 
 */
@Connector(name = "Trello", friendlyName = "Trello", minMuleVersion = "3.7.2")
public class TrelloConnector {

	/** The config. */
	@Config
	ConnectorConfig config;
	
	/** The client. */
	private TrelloClient client;

	/**
	 * DataSense processor.
	 *
	 * @return Some string
	 */
	@Start
	public void init() {
		setClient(new TrelloClient(this));
	}

	
	//boards GET methods
	/**
	 * This method gets the Board details by passing board id.
	 * {@sample.xml ../../../doc/trello-connector.xml.sample Trello:get-boards-by-id}
	 *
	 * @param boardId the board id
	 * @param actions the actions
	 * @param actions_entities the actions_entities
	 * @param actions_display the actions_display
	 * @param actions_format the actions_format
	 * @param actions_since the actions_since
	 * @param actions_limit the actions_limit
	 * @param action_fields the action_fields
	 * @param action_member the action_member
	 * @param action_member_fields the action_member_fields
	 * @param action_memberCreator the action_member creator
	 * @param action_memberCreator_fields the action_member creator_fields
	 * @param cards the cards
	 * @param card_fields the card_fields
	 * @param card_attachments the card_attachments
	 * @param card_attachment_fields the card_attachment_fields
	 * @param card_checklists the card_checklists
	 * @param card_stickers the card_stickers
	 * @param boardStars the board stars
	 * @param labels the labels
	 * @param label_fields the label_fields
	 * @param labels_limit the labels_limit
	 * @param lists the lists
	 * @param list_fields the list_fields
	 * @param memberships the memberships
	 * @param memberships_member the memberships_member
	 * @param memberships_member_fields the memberships_member_fields
	 * @param members the members
	 * @param member_fields the member_fields
	 * @param membersInvited the members invited
	 * @param membersInvited_fields the members invited_fields
	 * @param checklists the checklists
	 * @param checklist_fields the checklist_fields
	 * @param organization the organization
	 * @param organization_fields the organization_fields
	 * @param organization_memberships the organization_memberships
	 * @param myPrefs the my prefs
	 * @param tags the tags
	 * @param fields the fields
	 * @param token the token
	 * @return the boards by id
	 */
	//Boards GET Methods
	@Processor
	public BoardsByIdGetResponse getBoardById(String boardId,String token) {
		return getClient().getBoardById(boardId,token);
	}
	
	/**
	 * Gets  all the lists under board.
	 * {@sample.xml ../../../doc/trello-connector.xml.sample Trello:get-all-lists-under-board}
	 * 
	 *
	 * @param boardId the board id
	 * @param cards the cards
	 * @param card_fields the card_fields
	 * @param filter the filter
	 * @param fields the fields
	 * @param token the token
	 * @return the all lists under board
	 */
	@Processor
	public List<ListsUnderBoardsGetResponse> getAllListsUnderBoard(String boardId,String token){
		return getClient().getAllListsUnderBoard(boardId,token);
	}

	// Board PUT Methods
	
	/**
	 * update boards by boardId.
	 * {@sample.xml ../../../doc/trello-connector.xml.sample Trello:put-board-by-id}
	 * 
	 *
	 * @param boardId the board id
	 * @param boardsByIdPutReq the boards by id put req
	 * @param token the token
	 * @return the string
	 */
	@Processor
	  public BoardsByIdPutResponse putBoardById(String boardId, @Default("#[payload]") BoardsByIdPutRequest boardsByIdPutReq,@Optional
			   String token) {
	    return  getClient().putBoardsById(boardId,boardsByIdPutReq,token);
	  }
	
	
/**
 * create a board.
 * {@sample.xml ../../../doc/trello-connector.xml.sample Trello:post-board}
 *
 * @param boardsPostRequest the boards post request
 * @param token the token
 * @return the boards post response
 */
//Boards POST Methods
	@Processor
	  public BoardsPostResponse postBoard( @Default("#[payload]") BoardsPostRequest boardsPostRequest,String token) {
	    return getClient().postBoard(boardsPostRequest,token);
	  }
// Boards DELETE Methods	
	/**
 * Delete member under board by id.
 * {@sample.xml ../../../doc/trello-connector.xml.sample Trello:delete-member-under-board-by-id}
 *
 * @param boardId the board id
 * @param memberId the member id
 * @param token the token
 * @return the string
 */
	@Processor
	  public StatusResponse deleteMemberUnderBoardById(String boardId,String memberId,String token) {
	    return getClient().deleteMemberUnderBoardById(boardId,memberId,token);
	  }
	

	//Cards GET Methods
	/**
	 * Gets the cards by id.
	 * {@sample.xml ../../../doc/trello-connector.xml.sample Trello:get-card-by-id}
	 *
	 * @param cardIdOrShortlink the card id or shortlink
	 * @param actions the actions
	 * @param actions_entities the actions_entities
	 * @param actions_display the actions_display
	 * @param actions_limit the actions_limit
	 * @param action_fields the action_fields
	 * @param action_memberCreator_fields the action_member creator_fields
	 * @param attachments the attachments
	 * @param attachment_fields the attachment_fields
	 * @param members the members
	 * @param member_fields the member_fields
	 * @param membersVoted the members voted
	 * @param memberVoted_fields the member voted_fields
	 * @param checkItemStates the check item states
	 * @param checkItemState_fields the check item state_fields
	 * @param checklists the checklists
	 * @param checklist_fields the checklist_fields
	 * @param board the board
	 * @param board_fields the board_fields
	 * @param list the list
	 * @param list_fields the list_fields
	 * @param stickers the stickers
	 * @param sticker_fields the sticker_fields
	 * @param fields the fields
	 * @param token the token
	 * @return the cards by id
	 */
	//Cards GET Methods
	@Processor
	public CardsByIdGetResponse getCardById(String cardIdOrShortlink,String token){
		return getClient().getCardById(cardIdOrShortlink,token);
	}
	
	@Processor
	public CardListGetResponse getCardListByCardId(String cardIdOrShortlink,String token, @Optional String fields){
		return getClient().getCardListByCardId(cardIdOrShortlink,token,fields);
	}
	
	/**
	 * Update cards by id.
	 * {@sample.xml ../../../doc/trello-connector.xml.sample Trello:update-cards-by-id}
	 *
	 * @param cardIdOrShortlink the card id or shortlink
	 * @param membershipsIdPutRequest the memberships id put request
	 * @param token the token
	 * @return the string
	 */
	//Cards PUT Methots 
	@Processor
	  public CardsByIdGetResponse updateCardById(String cardIdOrShortlink, @Default("#[payload]") CardsByIdPutRequest membershipsIdPutRequest,String token) {
	    return getClient().updateCardById(cardIdOrShortlink,membershipsIdPutRequest,token);
	  }
	
	/**
	 * create cards .
	 * {@sample.xml ../../../doc/trello-connector.xml.sample Trello:create-card}
	 *
	 * @param cardsPosrReq the cards posr req
	 * @param token the token
	 * @return the string
	 */
	// Cards POST Methods
	@Processor
	  public CardsByIdGetResponse createCard( @Default("#[payload]") CardsPostRequest cardsPosrReq,String token) {
	    return getClient().createCard(cardsPosrReq,token);
	  }
	
	//Cards DELETE methods
	
	/**
	 * Delete cards by id.
	 * {@sample.xml ../../../doc/trello-connector.xml.sample Trello:delete-card-by-id}
	 *
	 * @param cardIdOrShortLink the card id or short link
	 * @param token the token
	 * @return the status response
	 */
	@Processor
	  public StatusResponse deleteCardById(String cardIdOrShortLink,String token) {
	    return getClient().deleteCardById(cardIdOrShortLink,token);
	  }
	//Lists Get method
	/**
	 * Gets the lists by id.
	 * {@sample.xml ../../../doc/trello-connector.xml.sample Trello:get-list-by-id}
	 *
	 * @param listId the list id
	 * @param cards the cards
	 * @param card_fields the card_fields
	 * @param board the board
	 * @param board_fields the board_fields
	 * @param fields the fields
	 * @param token the token
	 * @return the lists by id
	 */

	@Processor
	public ListsByIdGetResponse getListById(String listId,@Optional String board,String token) {
		return getClient().getListById( listId, board,  token);
	}
	
	
	/**
	 * Update lists by id.
	 *{@sample.xml ../../../doc/trello-connector.xml.sample Trello:update-list-by-id}
	 *
	 * @param listId the list id
	 * @param listsPutReq the lists put req
	 * @param token the token
	 * @return the lists by id get response
	 */
	//PUT methods for Lists
		@Processor
		  public ListsByIdGetResponse updateListById(String listId, @Default("#[payload]") ListsByIdPutRequest listsPutReq,String token) {
		    return getClient().updateListById(listId,listsPutReq,token);
		  }
	
	/**
	 * Creates the list.
	 * {@sample.xml ../../../doc/trello-connector.xml.sample Trello:create-list}
	 *
	 * @param listsPostReq the lists post req
	 * @param token the token
	 * @return the list post response
	 */
	//POST lists methods
		@Processor
		  public ListPostResponse createList( @Default("#[payload]") ListsPostRequest listsPostReq,String token) {
		    return getClient().createList(listsPostReq,token);
		  }
		
	//GET Checklists
		
		/**
	 * Gets the checklists by id.
	 * {@sample.xml ../../../doc/trello-connector.xml.sample Trello:get-checklists-by-id}
	 *
	 * @param checklistId the checklist id
	 * @param cards the cards
	 * @param card_fields the card_fields
	 * @param checkItems the check items
	 * @param checkItem_fields the check item_fields
	 * @param fields the fields
	 * @param token the token
	 * @return the checklists by id
	 */
	@Processor
		public CheckListsByIdGetResponse getChecklistsById(String checklistId,@Optional String cards,@Optional String cardFields, @Optional String checkItems,@Optional String checkItemFields,@Optional String fields,String token) {
		  return getClient().getChecklistsById(checklistId,cards,cardFields,checkItems,checkItemFields,fields,token);
		}


		
    //WebHooks GET Methods
  	/**
     * Gets the webhooks by id.
     *{@sample.xml ../../../doc/trello-connector.xml.sample Trello:get-webhooks-by-id}
     *
     * @param idWebhook the id webhook
     * @param token the token
     * @return the webhooks by id
     */
	  @Processor
	  public WebhooksPostResponse getWebhooksById(String idWebhook,String token) {
	    return getClient().getWebhooksById(idWebhook,token);
	  }
	  
	  	//PUT Webhooks
  	/**
	  	 * Update webhook by id.
	  	 * {@sample.xml ../../../doc/trello-connector.xml.sample Trello:update-webhooks-by-id}
	  	 *
	  	 * @param idWebhook the id webhook
	  	 * @param webhooksByIdPutReq the webhooks by id put req
	  	 * @param token the token
	  	 * @return the string
	  	 */
	  @Processor
	  public WebhooksPostResponse updateWebhookById(String idWebhook,@Default("#[payload]") WebhooksByIdPutRequest webhooksByIdPutReq,String token) {
	    return getClient().updateWebhookById(idWebhook,webhooksByIdPutReq,token);
	  }
	  
  	/**
	   * Update webhook by passing WebhookPutRequest object.
	   * {@sample.xml ../../../doc/trello-connector.xml.sample Trello:update-webhook}
	   *
	   * @param webhookPutReq the webhook put req
	   * @param token the token
	   * @return the string
	   */
  	@Processor
	  public WebhooksPostResponse updateWebhook( @Default("#[payload]") WebhooksPutRequest webhookPutReq,String token) {
	    return getClient().updateWebhook(webhookPutReq,token);
	  }
	  
  	//POST Webhooks
  	/**
	   * create webhook.
	   * {@sample.xml ../../../doc/trello-connector.xml.sample Trello:poat-webhook}
	   *
	   * @param webhooksPostReq the webhooks post req
	   * @param token the token
	   * @return the string
	   */
	  @Processor
	  public WebhooksPostResponse postWebhook( @Default("#[payload]") WebhooksPutRequest webhooksPostReq, String token) {
	    return getClient().postWebhook(webhooksPostReq, token);
	  }
	  
  	/**
	   * Delete webhook by id.
	   * {@sample.xml ../../../doc/trello-connector.xml.sample Trello:delete-webhook-by-id}
	   *
	   * @param idWebhook the id webhook
	   * @param token the token
	   * @return the status response
	   */
  	//DELETE webhooks
	  @Processor
	  public StatusResponse deleteWebhookById(String idWebhook,String token) {
	    return  getClient().deleteWebhookById(idWebhook,token);
	  }
  //Members API 
  	
  	
	  /**
   * Gets the member by id or username.
   *
   * @param idOrUserName the id or user name
   * @param fields the fields
   * @param boards the boards
   * @param organizations the organizations
   * @param organization_fields the organization_fields
   * @param token the token
   * @return the member by id or username
   */
  @Processor
	public MemberByIdGetresponse getMemberByIdOrUsername(@Default("all") String boards,@Default("all") String organizations, String token){
		return getClient().getMemberByIdOrUsername(boards,organizations,token); 
	}
	  
	  /**
	  	 * Gets  all the boards of the member.
	  	 *{@sample.xml ../../../doc/trello-connector.xml.sample Trello:get-all-boards}
	  	 *
	  	 * @param token the token
	  	 * @return the all boards
	  	 */
		@Processor
		public List<MembersBoardsGetResponse> getAllBoards(String token){
			return  getClient().getAllBoards(token);
		}
	  
  	/**
  	 * Gets the boards by passing member id.
  	 * {@sample.xml ../../../doc/trello-connector.xml.sample Trello:get-boards}
  	 * 
  	 *
  	 * @param memberId the id
  	 * @param filter the filter
  	 * @param fields the fields
  	 * @param actions the actions
  	 * @param actions_entities the actions_entities
  	 * @param actions_limit the actions_limit
  	 * @param actions_format the actions_format
  	 * @param actions_since the actions_since
  	 * @param action_fields the action_fields
  	 * @param memberships the memberships
  	 * @param organization the organization
  	 * @param organization_fields the organization_fields
  	 * @param lists the lists
  	 * @param token the token
  	 * @return the boards
  	 */
  	@Processor
		public List<MembersBoardsGetResponse>  getBoards(String memberId,String token){
			return  getClient().getBoards(memberId,token);
		}
		
	
	  

	/**
	 * Gets the config.
	 *
	 * @return the config
	 */
	public ConnectorConfig getConfig() {
		return config;
	}

	/**
	 * Sets the config.
	 *
	 * @param config the new config
	 */
	public void setConfig(ConnectorConfig config) {
		this.config = config;
	}

	/**
	 * Sets the client.
	 *
	 * @param client the new client
	 */
	public void setClient(TrelloClient client) {
		this.client = client;
	}

	/**
	 * Gets the client.
	 *
	 * @return TrelloClient Object
	 */
	public TrelloClient getClient() {
		return client;
	}


}