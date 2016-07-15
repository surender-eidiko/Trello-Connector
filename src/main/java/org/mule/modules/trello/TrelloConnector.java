/**
 *
 */
package org.mule.modules.trello;

import java.util.List;
import java.util.Map;

import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.MetaDataScope;
import org.mule.api.annotations.Processor;
import org.mule.api.annotations.licensing.RequiresEnterpriseLicense;
import org.mule.api.annotations.lifecycle.Start;
import org.mule.api.annotations.param.Default;
import org.mule.api.annotations.param.MetaDataKeyParam;
import org.mule.api.annotations.param.Optional;
import org.mule.modules.trello.bean.BoardsByChecklistsIdGetResponse;
import org.mule.modules.trello.bean.BoardsByIdGetResponse;
import org.mule.modules.trello.bean.BoardsByIdPutRequest;
import org.mule.modules.trello.bean.BoardsByIdPutResponse;
import org.mule.modules.trello.bean.BoardsPostRequest;
import org.mule.modules.trello.bean.BoardsPostResponse;
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


// TODO: Auto-generated Javadoc
/**
 * This is Cisco Spark Connector Class
 * @author Surender
 *
 * 
 */

@Connector(name = "Trello", friendlyName = "Trello", minMuleVersion = "3.7.2")
@RequiresEnterpriseLicense
@MetaDataScope(DataSenseResolver.class)
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
	public BoardsByIdGetResponse getBoardById(String boardId,@Optional String actions,
			@Optional Boolean actions_entities,	@Optional Boolean actions_display, @Optional String actions_format,
			@Optional String actions_since,@Optional Integer actions_limit,@Optional String action_fields,@Optional Boolean action_member,@Optional String action_member_fields,@Optional Boolean action_memberCreator,@Optional String action_memberCreator_fields,@Optional String cards,@Optional String card_fields,@Optional String card_attachments,@Optional String card_attachment_fields,@Optional String card_checklists,@Optional Boolean card_stickers,@Optional String boardStars,@Optional String labels,@Optional String label_fields,@Optional Integer labels_limit,
			@Optional String lists,@Optional String list_fields,@Optional String memberships,@Optional Boolean memberships_member,@Optional String memberships_member_fields,@Optional String members,@Optional String member_fields,@Optional String membersInvited,@Optional String membersInvited_fields,@Optional String checklists,@Optional String checklist_fields,@Optional Boolean organization,@Optional String organization_fields,@Optional String organization_memberships,@Optional Boolean myPrefs,@Optional Boolean tags ,@Optional String fields,@Optional
			   String token) {
		return getClient().getBoardById(boardId,actions, actions_entities, actions_display, actions_format,actions_since, actions_limit, action_fields,
				action_member,action_member_fields,action_memberCreator,action_memberCreator_fields,cards,card_fields,card_attachments,card_attachment_fields,card_checklists,
				card_stickers,boardStars,labels,label_fields,labels_limit,lists,list_fields,memberships,memberships_member,memberships_member_fields,members,member_fields,membersInvited,membersInvited_fields,checklists,checklist_fields,organization,organization_fields,organization_memberships,myPrefs,tags,fields,token);
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
	public List<ListsUnderBoardsGetResponse> getAllListsUnderBoard(String boardId,@Optional String cards,@Optional String card_fields,@Optional String filter,@Optional String fields,String token){
		return getClient().getAllListsUnderBoard(boardId,cards,card_fields,filter,fields,token);
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
	public CardsByIdGetResponse getCardById(String cardIdOrShortlink,@Optional String actions,@Optional Boolean actions_entities,@Optional Boolean actions_display,@Optional Integer actions_limit,@Optional String action_fields,@Optional String action_memberCreator_fields,@Optional String attachments,@Optional String attachment_fields,@Optional Boolean members,@Optional String member_fields,@Optional Boolean membersVoted,@Optional String memberVoted_fields,
			@Optional Boolean checkItemStates,@Optional String checkItemState_fields,@Optional String checklists,@Optional String checklist_fields,@Optional Boolean board,@Optional String board_fields,@Optional Boolean list,@Optional String list_fields,@Optional Boolean stickers,@Optional String sticker_fields,@Optional String fields,String token){
		return getClient().getCardById(cardIdOrShortlink,actions,  actions_entities,  actions_display,actions_limit,action_fields,action_memberCreator_fields,attachments,attachment_fields,  members,member_fields,  membersVoted,memberVoted_fields,
				  checkItemStates,checkItemState_fields,checklists,checklist_fields,  board,board_fields,  list,list_fields,  stickers,sticker_fields,fields,token);
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
	public ListsByIdGetResponse getListById(String listId,@Optional String cards,@Optional String card_fields,@Optional String board,@Optional String board_fields,@Optional String fields,String token) {
		return getClient().getListById( listId,  cards,  card_fields,  board,  board_fields,  fields,  token);
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
		public CheckListsByIdGetResponse getChecklistsById(String checklistId,@Optional String cards,@Optional String card_fields, @Optional String checkItems,@Optional String checkItem_fields,@Optional String fields,String token) {
		  return getClient().getChecklistsById(checklistId,cards,card_fields,checkItems,checkItem_fields,fields,token);
		}

		/**
		 * Gets the board with checklist id.
		 * {@sample.xml ../../../doc/trello-connector.xml.sample Trello:get-boards-with-checklist-id}
		 *
		 * @param checklistId the checklist id
		 * @param fields the fields
		 * @param token the token
		 * @return the boards with checklist id
		 */
		@Processor
		  public BoardsByChecklistsIdGetResponse getBoardWithChecklistId(String checklistId,@Optional String fields,String token) {
		    return getClient().getBoardsWithChecklistId(checklistId,fields,token);
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
  	 * {@sample.xml ../../../doc/trello-connector.xml.sample Trello:get-member-by-id-username}
  	 *
  	 * @param idOrUserName the id
  	 * @param actions the actions
  	 * @param actions_entities the actions_entities
  	 * @param actions_display the actions_display
  	 * @param actions_limit the actions_limit
  	 * @param action_fields the action_fields
  	 * @param action_since the action_since
  	 * @param action_before the action_before
  	 * @param cards the cards
  	 * @param card_fields the card_fields
  	 * @param card_members the card_members
  	 * @param card_member_fields the card_member_fields
  	 * @param card_attachments the card_attachments
  	 * @param card_attachment_fields the card_attachment_fields
  	 * @param card_stickers the card_stickers
  	 * @param boards the boards
  	 * @param board_fields the board_fields
  	 * @param board_actions the board_actions
  	 * @param board_actions_entities the board_actions_entities
  	 * @param board_actions_display the board_actions_display
  	 * @param board_actions_format the board_actions_format
  	 * @param board_actions_since the board_actions_since
  	 * @param board_actions_limit the board_actions_limit
  	 * @param board_action_fields the board_action_fields
  	 * @param board_lists the board_lists
  	 * @param board_memberships the board_memberships
  	 * @param board_organization the board_organization
  	 * @param board_organization_fields the board_organization_fields
  	 * @param boardsInvited the boards invited
  	 * @param boardsInvited_fields the boards invited_fields
  	 * @param boardStars the board stars
  	 * @param savedSearches the saved searches
  	 * @param organizations the organizations
  	 * @param organization_fields the organization_fields
  	 * @param organization_paid_account the organization_paid_account
  	 * @param organizationsInvited the organizations invited
  	 * @param organizationsInvited_fields the organizations invited_fields
  	 * @param notifications the notifications
  	 * @param notifications_entities the notifications_entities
  	 * @param notifications_display the notifications_display
  	 * @param notifications_limit the notifications_limit
  	 * @param notification_fields the notification_fields
  	 * @param notification_memberCreator the notification_member creator
  	 * @param notification_memberCreator_fields the notification_member creator_fields
  	 * @param notification_before the notification_before
  	 * @param notification_since the notification_since
  	 * @param tokens the tokens
  	 * @param paid_account the paid_account
  	 * @param boardBackgrounds the board backgrounds
  	 * @param customBoardBackgrounds the custom board backgrounds
  	 * @param customStickers the custom stickers
  	 * @param customEmoji the custom emoji
  	 * @param fields the fields
  	 * @return the member by id or username
  	 */
  	
	  @Processor
		public MemberByIdGetresponse getMemberByIdOrUsername(String idOrUserName, @Optional String actions,  @Default("false") Boolean actions_entities,
				 @Default("false") Boolean actions_display,  @Default("50") String actions_limit,  @Default("all") String action_fields, @Optional String action_since, @Optional String action_before,  @Default("none") String cards,  @Default("all") String card_fields,  @Default("false") Boolean card_members, @Optional String card_member_fields,  @Default("false") String card_attachments, @Optional String card_attachment_fields,  @Default("false") Boolean card_stickers, @Optional String boards, @Optional String board_fields, @Optional String board_actions,  @Default("false") Boolean board_actions_entities, @Default("false") Boolean board_actions_display, @Default("list") String board_actions_format, @Optional String board_actions_since, @Default("50") String board_actions_limit, @Default("all") String board_action_fields, @Default("none") String  board_lists, @Default("none") String board_memberships, @Default("false") Boolean board_organization, @Optional String board_organization_fields, @Optional String boardsInvited, @Optional String boardsInvited_fields, @Default("false") Boolean boardStars, @Default("false") Boolean savedSearches, @Default("none") String organizations, @Default("all") String organization_fields, @Default("false") Boolean organization_paid_account, @Default("none") String organizationsInvited, @Default("all") String organizationsInvited_fields, @Optional String notifications, @Default("false") Boolean notifications_entities, @Default("false") Boolean notifications_display, @Default("50") String notifications_limit, @Default("all") String notification_fields, @Default("true") Boolean notification_memberCreator, @Optional String notification_memberCreator_fields, @Optional String notification_before, @Optional String notification_since, @Default("none") String tokens, @Default("false") Boolean paid_account, @Default("none") String boardBackgrounds, @Default("none") String customBoardBackgrounds, @Default("none") String customStickers, @Default("none") String customEmoji, @Default("all") String fields,String token){
			return getClient().getMemberByIdOrUsername(idOrUserName,actions,    actions_entities,
					   actions_display,    actions_limit,    action_fields,   action_since,
					   action_before,    cards,    card_fields,    card_members,   card_member_fields,
					   card_attachments,   card_attachment_fields,    card_stickers,   boards,   
					   board_fields,   board_actions,    board_actions_entities,   board_actions_display,   
					   board_actions_format,   board_actions_since,   board_actions_limit,   board_action_fields,    
					   board_lists,   board_memberships,   board_organization,   board_organization_fields,   boardsInvited,   
					   boardsInvited_fields,   boardStars,   savedSearches,   organizations,   organization_fields,   
					   organization_paid_account,   organizationsInvited,   organizationsInvited_fields,   notifications,   
					   notifications_entities,   notifications_display,  notifications_limit,   notification_fields,   
					   notification_memberCreator,   notification_memberCreator_fields,   notification_before,   
					   notification_since,   tokens,   paid_account,   boardBackgrounds,   
					   customBoardBackgrounds,   customStickers,   customEmoji,  fields,token);
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
		public List<MembersBoardsGetResponse>  getBoards(String memberId, @Default("all") String filter, @Default("all") String fields, @Optional String actions, @Default("false") Boolean actions_entities, @Default("50") String actions_limit, @Default("list") String actions_format, @Optional String actions_since, @Default("all") String action_fields, @Default("none") String memberships, @Default("false") Boolean organization, @Optional String organization_fields, @Default("none") String lists,String token){
			return  getClient().getBoards(memberId, filter, fields, actions, actions_entities, actions_limit, actions_format, actions_since, action_fields, memberships, organization, organization_fields, lists,token);
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

	
	
	/**
	 * Adds the entity.
	 *
	 * @param key the key
	 * @param entity the entity
	 * @return the map
	 */
	@Processor
	public Map<String, Object> addEntity(@MetaDataKeyParam String key,
			@Default("#[payload]") Map<String, Object> entity) {
		/*
		 * USE THE KEY AND THE MAP TO DO SOMETHING
		 */
		return entity;
	}

}