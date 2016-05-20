/**
 *
 */
package org.mule.modules.trello;

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
import org.mule.modules.trello.bean.*;
import org.mule.modules.trello.config.ConnectorConfig;


// TODO: Auto-generated Javadoc
/**
 * This is Trello Connector Class.
 *
 * @author Surender
 */
@Connector(name = "trello", friendlyName = "Trello", minMuleVersion = "3.7.0")
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

	/**
	 * Gets the actions by id.
	 *
	 * @param actionId the action id
	 * @param display the display
	 * @param entities the entities
	 * @param fields the fields
	 * @param member the member
	 * @param member_fields the member_fields
	 * @param memberCreator the member creator
	 * @param memberCreator_fields the member creator_fields
	 * @return the actions by id
	 */
	@Processor
	public String getActionsById(String actionId,@Optional Boolean display,
			@Optional Boolean entities, @Optional String fields,
			@Optional Boolean member, @Optional String member_fields,
			@Optional Boolean memberCreator,
			@Optional String memberCreator_fields) {
		return getClient().getActionsById(actionId,display, entities, fields, member,
				member_fields, memberCreator, memberCreator_fields);
	}
	
	/**
	 * Gets the actions by id and field.
	 *
	 * @param actionId the action id
	 * @param field the field
	 * @return the actions by id and field
	 */
	@Processor
	public String getActionsByIdAndField(String actionId,String field){
		return getClient().getActionsByIdAndField(actionId,field);
	}
	
	/**
	 * Gets the actions by id and board.
	 *
	 * @param actionId the action id
	 * @param fields the fields
	 * @return the actions by id and board
	 */
	@Processor
	public String getActionsByIdAndBoard(String actionId,String fields){
		return getClient().getActionsByIdAndBoard(actionId,fields);
	}
	
	/**
	 * Gets the actions by id and board with field.
	 *
	 * @param actionId the action id
	 * @param field the field
	 * @return the actions by id and board with field
	 */
	@Processor
	public String getActionsByIdAndBoardWithField(String actionId,String field){
		return getClient().getActionsByIdAndBoardWithField(actionId,field);
	}
	
	/**
	 * Gets the actions by id and card.
	 *
	 * @param actionId the action id
	 * @param fields the fields
	 * @return the actions by id and card
	 */
	@Processor
	public String getActionsByIdAndCard(String actionId,@Optional String fields){
		return getClient().getActionsByIdAndCard(actionId,fields);
	}
	
	/**
	 * Gets the actions by id and card with field.
	 *
	 * @param actionId the action id
	 * @param field the field
	 * @return the actions by id and card with field
	 */
	@Processor
	public String getActionsByIdAndCardWithField(String actionId,String field){
		return getClient().getActionsByIdAndCardWithField(actionId,field);
	}
	
	/**
	 * Gets the actions by id with dispaly.
	 *
	 * @param actionId the action id
	 * @return the actions by id with dispaly
	 */
	@Processor
	public String getActionsByIdWithDispaly(String actionId){
		return getClient().getActionsByIdWithDispaly(actionId);
	}
	
	/**
	 * Gets the actions by id with entities.
	 *
	 * @param actionId the action id
	 * @return the actions by id with entities
	 */
	@Processor
	public String getActionsByIdWithEntities(String actionId){
		return getClient().getActionsByIdWithEntities(actionId);
	}
	
	/**
	 * Gets the actions by id and list.
	 *
	 * @param actionId the action id
	 * @param fields the fields
	 * @return the actions by id and list
	 */
	@Processor
	public String getActionsByIdAndList(String actionId,@Optional String fields){
		return getClient().getActionsByIdAndList(actionId,fields);
	}
	
	/**
	 * Gets the actions by id and list with field.
	 *
	 * @param actionId the action id
	 * @param field the field
	 * @return the actions by id and list with field
	 */
	@Processor
	public String getActionsByIdAndListWithField(String actionId,String field){
		return getClient().getActionsByIdAndListWithField(actionId,field);
	}
	
	/**
	 * Gets the actions by id and member.
	 *
	 * @param actionId the action id
	 * @param fields the fields
	 * @return the actions by id and member
	 */
	@Processor
	public String getActionsByIdAndMember(String actionId,@Optional String fields){
		return getClient().getActionsByIdAndMember(actionId,fields);
	}
	
	/**
	 * Gets the actions by id and member with field.
	 *
	 * @param actionId the action id
	 * @param field the field
	 * @return the actions by id and member with field
	 */
	@Processor
	public String getActionsByIdAndMemberWithField(String actionId,String field){
		return getClient().getActionsByIdAndMemberWithField(actionId,field);
	}
	
	/**
	 * Gets the actions by id and member creater.
	 *
	 * @param actionId the action id
	 * @param fields the fields
	 * @return the actions by id and member creater
	 */
	@Processor
	public String getActionsByIdAndMemberCreater(String actionId,@Optional String fields){
		return getClient().getActionsByIdAndMemberCreater(actionId,fields);
	}
	
	/**
	 * Gets the actions by id and member creater with field.
	 *
	 * @param actionId the action id
	 * @param field the field
	 * @return the actions by id and member creater with field
	 */
	@Processor
	public String getActionsByIdAndMemberCreaterWithField(String actionId,String field){
		return getClient().getActionsByIdAndMemberCreaterWithField(actionId,field);
	}
	
	/**
	 * Gets the actions by id and organization.
	 *
	 * @param actionId the action id
	 * @param fields the fields
	 * @return the actions by id and organization
	 */
	@Processor
	public String getActionsByIdAndOrganization(String actionId,@Optional String fields){
		return getClient().getActionsByIdAndOrganizationWithField(actionId,fields);
	}
	
	/**
	 * Put read actions by id.
	 *
	 * @param actionId the action id
	 * @param actionIdPutRequest the action id put request
	 * @return the string
	 */
	@Processor
	  public String putReadActionsById(String actionId,ActionsByIdPutRequest actionIdPutRequest) {
	    return getClient().putReadActionsById(actionId,actionIdPutRequest);
	  }
	
	/**
	 * Put write actions by id.
	 *
	 * @param actionId the action id
	 * @param value the value
	 * @param actionIdPutRequest the action id put request
	 * @return the string
	 */
	@Processor
	  public String putWriteActionsById(String actionId,String value, ActionsTextByIdPutRequest actionIdPutRequest) {
	    return getClient().putWriteActionsById(actionId,value,actionIdPutRequest);
	  }
	
	/**
	 * Delete actions by id.
	 *
	 * @param membershipId the membership id
	 * @return the status response
	 */
	@Processor
	  public StatusResponse deleteActionsById(String membershipId) {
	    return getClient().deleteActionsById(membershipId);
	  }
	
	/**
	 * Gets the boards by id.
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
	 * @return the boards by id
	 */
	//Boards GET Methods
	@Processor
	public BoardsByIdGetResponse getBoardsById(String boardId,@Optional String actions,
			@Optional Boolean actions_entities,	@Optional Boolean actions_display, @Optional String actions_format,
			@Optional String actions_since,@Optional Integer actions_limit,@Optional String action_fields,@Optional Boolean action_member,@Optional String action_member_fields,@Optional Boolean action_memberCreator,@Optional String action_memberCreator_fields,@Optional String cards,@Optional String card_fields,@Optional String card_attachments,@Optional String card_attachment_fields,@Optional String card_checklists,@Optional Boolean card_stickers,@Optional String boardStars,@Optional String labels,@Optional String label_fields,@Optional Integer labels_limit,
			@Optional String lists,@Optional String list_fields,@Optional String memberships,@Optional Boolean memberships_member,@Optional String memberships_member_fields,@Optional String members,@Optional String member_fields,@Optional String membersInvited,@Optional String membersInvited_fields,@Optional String checklists,@Optional String checklist_fields,@Optional Boolean organization,@Optional String organization_fields,@Optional String organization_memberships,@Optional Boolean myPrefs,@Optional Boolean tags ,@Optional String fields) {
		return getClient().getBoardsById(boardId,actions, actions_entities, actions_display, actions_format,actions_since, actions_limit, action_fields,
				action_member,action_member_fields,action_memberCreator,action_memberCreator_fields,cards,card_fields,card_attachments,card_attachment_fields,card_checklists,
				card_stickers,boardStars,labels,label_fields,labels_limit,lists,list_fields,memberships,memberships_member,memberships_member_fields,members,member_fields,membersInvited,membersInvited_fields,checklists,checklist_fields,organization,organization_fields,organization_memberships,myPrefs,tags,fields);
	}
	
	/**
	 * Gets the boards by id and field.
	 *
	 * @param boardId the board id
	 * @param field the field
	 * @return the boards by id and field
	 */
	@Processor
	public String getBoardsByIdAndField(String boardId,String field){
		return getClient().getBoardsByIdAndField(boardId,field);
	}
	
	/**
	 * Gets the boards by id and actions.
	 *
	 * @param boardId the board id
	 * @param entities the entities
	 * @param display the display
	 * @param filter the filter
	 * @param fields the fields
	 * @param limit the limit
	 * @param format the format
	 * @param since the since
	 * @param before the before
	 * @param page the page
	 * @param idModels the id models
	 * @param member the member
	 * @param member_fields the member_fields
	 * @param memberCreator the member creator
	 * @param memberCreator_fields the member creator_fields
	 * @return the boards by id and actions
	 */
	@Processor
	public BoardsByIdAndActionsGetResponse getBoardsByIdAndActions(String boardId,@Optional String entities,@Optional Boolean display,@Optional String filter,@Optional String fields,@Optional Integer limit,@Optional String format,@Optional String since,@Optional String before,@Optional Integer page,@Optional String idModels,
			@Optional Boolean member,@Optional String member_fields,@Optional Boolean memberCreator,@Optional String memberCreator_fields){
		
		return getClient().getBoardsByIdAndActions(boardId,entities,display,filter,fields,limit,format,since,
				before,page,idModels,member,member_fields,memberCreator,memberCreator_fields);
	}
	
	/**
	 * Gets the boards by id and board stars.
	 *
	 * @param boardId the board id
	 * @param filter the filter
	 * @return the boards by id and board stars
	 */
	@Processor
	public String getBoardsByIdAndBoardStars(String boardId,@Optional String filter){
		return getClient().getBoardsByIdAndBoardStars(boardId,filter);
	}
	
	/**
	 * Gets the boards by id and cards.
	 *
	 * @param boardId the board id
	 * @param actions the actions
	 * @param attachments the attachments
	 * @param attachment_fields the attachment_fields
	 * @param stickers the stickers
	 * @param members the members
	 * @param member_fields the member_fields
	 * @param checklists the checklists
	 * @param since the since
	 * @param before the before
	 * @param filter the filter
	 * @param fields the fields
	 * @return the boards by id and cards
	 */
	@Processor
	public BoardsByIdAndCardsGetResponse getBoardsByIdAndCards(String boardId,@Optional String actions,@Optional String attachments,@Optional String attachment_fields,@Optional Boolean stickers,@Optional Boolean members,@Optional String member_fields,@Optional String checklists,@Optional String since,@Optional String before,@Optional String filter,@Optional String fields){
		return getClient().getBoardsByIdAndCards(boardId,actions,attachments,attachment_fields,stickers,members,member_fields,checklists,since,before,filter,fields);
	}
	
	/**
	 * Gets the boards by id and cards with filter.
	 *
	 * @param boardId the board id
	 * @param filter the filter
	 * @return the boards by id and cards with filter
	 */
	@Processor
	public String getBoardsByIdAndCardsWithFilter(String boardId,String filter){
		return getClient().getBoardsByIdAndCardsWithFilter(boardId,filter);
	}
	
	/**
	 * Gets the boards by id and cards with id cards.
	 *
	 * @param boardId the board id
	 * @param idCard the id card
	 * @param attachments the attachments
	 * @param attachment_fields the attachment_fields
	 * @param actions the actions
	 * @param actions_entities the actions_entities
	 * @param actions_display the actions_display
	 * @param actions_limit the actions_limit
	 * @param action_fields the action_fields
	 * @param action_memberCreator_fields the action_member creator_fields
	 * @param members the members
	 * @param member_fields the member_fields
	 * @param checkItemStates the check item states
	 * @param checkItemState_fields the check item state_fields
	 * @param labels the labels
	 * @param checklists the checklists
	 * @param checklist_fields the checklist_fields
	 * @param fields the fields
	 * @return the boards by id and cards with id cards
	 */
	@Processor
	public String getBoardsByIdAndCardsWithIdCards(String boardId,String idCard,@Optional String attachments,@Optional String attachment_fields,@Optional String actions,@Optional Boolean actions_entities,@Optional Boolean actions_display,@Optional Integer actions_limit,@Optional String action_fields,@Optional String action_memberCreator_fields,@Optional Boolean members,@Optional String member_fields,@Optional Boolean checkItemStates,@Optional String checkItemState_fields,@Optional Boolean labels,@Optional String checklists,@Optional String checklist_fields,@Optional String fields){
		return getClient().getBoardsByIdAndCardsWithIdCards(boardId,idCard,attachments,attachment_fields,actions,actions_entities,actions_display,actions_limit,action_fields,action_memberCreator_fields,members,member_fields,checkItemStates,checkItemState_fields,labels,checklists,checklist_fields,fields);
	}
	
	/**
	 * Gets the boards by id and check lists.
	 *
	 * @param boardId the board id
	 * @param cards the cards
	 * @param card_fields the card_fields
	 * @param check_Items the check_ items
	 * @param checkItem_fields the check item_fields
	 * @param filter the filter
	 * @param fields the fields
	 * @return the boards by id and check lists
	 */
	@Processor
	public BoardsByIdAndCheckListsGetResponse getBoardsByIdAndCheckLists(String boardId,String cards,@Optional String card_fields,@Optional String check_Items,@Optional String checkItem_fields,@Optional String filter,@Optional String fields){
		return getClient().getBoardsByIdAndCheckLists(boardId,cards,card_fields,check_Items,checkItem_fields,filter,fields);
	}
	
	/**
	 * Gets the boards by id and deltas.
	 *
	 * @param boardId the board id
	 * @param tags the tags
	 * @param ixLastUpdate the ix last update
	 * @return the boards by id and deltas
	 */
	@Processor
	public String getBoardsByIdAndDeltas(String boardId,String tags,String ixLastUpdate){
		return getClient().getBoardsByIdAndDeltas(boardId,tags,ixLastUpdate);
	}
	
	/**
	 * Gets the boards by id and labels.
	 *
	 * @param boardId the board id
	 * @param fields the fields
	 * @param limit the limit
	 * @return the boards by id and labels
	 */
	@Processor
	public String getBoardsByIdAndLabels(String boardId,@Optional String fields,@Optional String limit){
		return getClient().getBoardsByIdAndLimit(boardId,fields,limit);
	}
	
	/**
	 * Gets the boards by id and labels with id.
	 *
	 * @param boardId the board id
	 * @param labelId the label id
	 * @param fields the fields
	 * @return the boards by id and labels with id
	 */
	@Processor
	public String getBoardsByIdAndLabelsWithId(String boardId,String labelId,@Optional String fields){
		return getClient().getBoardsByIdAndLabelsWithId(boardId,labelId,fields);
	}
	
	/**
	 * Gets the boards by id and lists.
	 *
	 * @param boardId the board id
	 * @param cards the cards
	 * @param card_fields the card_fields
	 * @param filter the filter
	 * @param fields the fields
	 * @return the boards by id and lists
	 */
	@Processor
	public BoardsByIdAndListsGetResponse getBoardsByIdAndLists(String boardId,@Optional String cards,@Optional String card_fields,@Optional String filter,@Optional String fields){
		return getClient().getBoardsByIdAndLists(boardId,cards,card_fields,filter,fields);
	}
	
	/**
	 * Gets the boards by id and lists with filter.
	 *
	 * @param boardId the board id
	 * @param filter the filter
	 * @return the boards by id and lists with filter
	 */
	@Processor
	public String getBoardsByIdAndListsWithFilter(String boardId,String filter){
		return getClient().getBoardsByIdAndListsWithFilter(boardId,filter);
	}
	
	/**
	 * Gets the board members by board id.
	 *
	 * @param boardId the board id
	 * @param filter the filter
	 * @param fields the fields
	 * @param activity the activity
	 * @return the board members by board id
	 */
	@Processor
	public String getBoardMembersByBoardId(String boardId,@Optional String filter,@Optional String fields,@Optional Boolean activity){
		return getClient().getBoardMembersByBoardId(boardId,filter,fields,activity);
	}
	
	/**
	 * Gets the board members by board id with filter.
	 *
	 * @param boardId the board id
	 * @param filter the filter
	 * @return the board members by board id with filter
	 */
	@Processor
	public String getBoardMembersByBoardIdWithFilter(String boardId,String filter){
		return getClient().getBoardMembersByBoardIdWithFilter(boardId,filter);
	}
	
	/**
	 * Gets the boards by id and members by id with cards.
	 *
	 * @param boardId the board id
	 * @param memberId the member id
	 * @param actions the actions
	 * @param attachments the attachments
	 * @param attachment_fields the attachment_fields
	 * @param member the member
	 * @param member_fields the member_fields
	 * @param checkItemStates the check item states
	 * @param checkLists the check lists
	 * @param boards the boards
	 * @param board_fields the board_fields
	 * @param list the list
	 * @param list_fields the list_fields
	 * @param filter the filter
	 * @param fields the fields
	 * @return the boards by id and members by id with cards
	 */
	@Processor
	public String getBoardsByIdAndMembersByIdWithCards(String boardId,String memberId,@Optional String actions,@Optional String attachments,@Optional String attachment_fields,@Optional Boolean member,@Optional String member_fields,@Optional Boolean checkItemStates,@Optional String checkLists,@Optional Boolean boards,
			@Optional String board_fields,@Optional Boolean list,@Optional String list_fields,@Optional
			 String filter,@Optional String fields){
		return getClient().getBoardsByIdAndMembersByIdWithCards(boardId,memberId,actions, attachments, attachment_fields, member,member_fields,checkItemStates,checkLists,boards,
				 board_fields, list, list_fields, filter, fields);
	}
	
	/**
	 * Gets the board members invited.
	 *
	 * @param boardId the board id
	 * @param fields the fields
	 * @return the board members invited
	 */
	@Processor
	public String getBoardMembersInvited(String boardId,@Optional String fields){
		return getClient().getBoardMembersInvited(boardId,fields);
	}
	
	/**
	 * Gets the board members invited with field.
	 *
	 * @param boardId the board id
	 * @param field the field
	 * @return the board members invited with field
	 */
	@Processor
	public String getBoardMembersInvitedWithField(String boardId,String field){
		return getClient().getBoardMembersInvitedWithField(boardId,field);
	}
	
	/**
	 * Gets the board member ships.
	 *
	 * @param boardId the board id
	 * @param filter the filter
	 * @param member the member
	 * @param member_fields the member_fields
	 * @return the board member ships
	 */
	@Processor
	public String getBoardMemberShips(String boardId,@Optional String filter,@Optional Boolean member,@Optional String member_fields){
		return getClient().getBoardMemberShips(boardId,filter,member,member_fields);
	}
	
	/**
	 * Gets the board member ships by id.
	 *
	 * @param boardId the board id
	 * @param membershipId the membership id
	 * @param member the member
	 * @param member_fields the member_fields
	 * @return the board member ships by id
	 */
	@Processor
	public String getBoardMemberShipsById(String boardId,String membershipId,
			@Optional Boolean member,@Optional String member_fields){
		return getClient().getBoardMemberShipsById(boardId,membershipId,member,member_fields);
	}
	
	/**
	 * Gets the boards with my pref.
	 *
	 * @param boardId the board id
	 * @return the boards with my pref
	 */
	@Processor
	public String getBoardsWithMyPref(String boardId){
		return getClient().getBoardsWithMyPref(boardId);
	}
	
	/**
	 * Gets the boards by id and organization.
	 *
	 * @param boardId the board id
	 * @param fields the fields
	 * @return the boards by id and organization
	 */
	@Processor
	public String getBoardsByIdAndOrganization(String boardId,@Optional String fields){
		return getClient().getBoardsByIdAndOrganization(boardId,fields);
	}
	
	/**
	 * Gets the boards by id and organization with field.
	 *
	 * @param boardId the board id
	 * @param fields the fields
	 * @return the boards by id and organization with field
	 */
	@Processor
	public String getBoardsByIdAndOrganizationWithField(String boardId, String fields){
		return getClient().getBoardsByIdAndOrganizationWithField(boardId,fields);
	}
	
	/**
	 * Put boards by id.
	 *
	 * @param boardId the board id
	 * @param boardsByIdPutReq the boards by id put req
	 * @return the string
	 */
	// Board PUT Methods
	@Processor
	  public String putBoardsById(String boardId,BoardsByIdPutRequest boardsByIdPutReq) {
	    return getClient().putBoardsById(boardId,boardsByIdPutReq);
	  }
	
	/**
	 * Put boards closed by id.
	 *
	 * @param boardId the board id
	 * @param boardsClosedByIdPutReq the boards closed by id put req
	 * @return the string
	 */
	@Processor
	  public String putBoardsClosedById(String boardId,BoardsClosedByIdPutRequest boardsClosedByIdPutReq) {
	    return getClient().putBoardsClosedById(boardId,boardsClosedByIdPutReq);
	  }
	
	/**
	 * Update boards description by id.
	 *
	 * @param boardId the board id
	 * @param boardsClosedByIdPutReq the boards closed by id put req
	 * @return the string
	 */
	@Processor
	  public String updateBoardsDescriptionById(String boardId,BoardsDescriptionByIdPutRequest boardsClosedByIdPutReq) {
	    return getClient().updateBoardsDescriptionById(boardId,boardsClosedByIdPutReq);
	  }
	
	/**
	 * Update boards organization by id.
	 *
	 * @param boardId the board id
	 * @param boardsOrganizationByIdPutReq the boards organization by id put req
	 * @return the string
	 */
	@Processor
	  public String updateBoardsOrganizationById(String boardId,BoardsOrganizationByIdPutRequest boardsOrganizationByIdPutReq) {
	    return getClient().updateBoardsOrganizationById(boardId,boardsOrganizationByIdPutReq);
	  }
	
	/**
	 * Update boards label name by blue.
	 *
	 * @param boardId the board id
	 * @param boardsLabelNameByColorPutReq the boards label name by color put req
	 * @return the string
	 */
	@Processor
	  public String updateBoardsLabelNameByBlue(String boardId,BoardsLabelNameByColorPutRequest boardsLabelNameByColorPutReq) {
	    return getClient().updateBoardsLabelNameByBlue(boardId,boardsLabelNameByColorPutReq);
	  }
	
	/**
	 * Update boards label name by green.
	 *
	 * @param boardId the board id
	 * @param boardsLabelNameByColorPutReq the boards label name by color put req
	 * @return the string
	 */
	@Processor
	  public String updateBoardsLabelNameByGreen(String boardId,BoardsLabelNameByColorPutRequest boardsLabelNameByColorPutReq) {
	    return getClient().updateBoardsLabelNameByGreen(boardId,boardsLabelNameByColorPutReq);
	  }
	
	/**
	 * Update boards label name by orange.
	 *
	 * @param boardId the board id
	 * @param boardsLabelNameByColorPutReq the boards label name by color put req
	 * @return the string
	 */
	@Processor
	  public String updateBoardsLabelNameByOrange(String boardId,BoardsLabelNameByColorPutRequest boardsLabelNameByColorPutReq) {
	    return getClient().updateBoardsLabelNameByOrange(boardId,boardsLabelNameByColorPutReq);
	  }
	
	/**
	 * Update boards label name by purple.
	 *
	 * @param boardId the board id
	 * @param boardsLabelNameByColorPutReq the boards label name by color put req
	 * @return the string
	 */
	@Processor
	  public String updateBoardsLabelNameByPurple(String boardId,BoardsLabelNameByColorPutRequest boardsLabelNameByColorPutReq) {
	    return getClient().updateBoardsLabelNameByPurple(boardId,boardsLabelNameByColorPutReq);
	  }
	
	/**
	 * Update boards label name by red.
	 *
	 * @param boardId the board id
	 * @param boardsLabelNameByColorPutReq the boards label name by color put req
	 * @return the string
	 */
	@Processor
	  public String updateBoardsLabelNameByRed(String boardId,BoardsLabelNameByColorPutRequest boardsLabelNameByColorPutReq) {
	    return getClient().updateBoardsLabelNameByRed(boardId,boardsLabelNameByColorPutReq);
	  }
	
	/**
	 * Update boards label name by yellow.
	 *
	 * @param boardId the board id
	 * @param boardsLabelNameByColorPutReq the boards label name by color put req
	 * @return the string
	 */
	@Processor
	  public String updateBoardsLabelNameByYellow(String boardId,BoardsLabelNameByColorPutRequest boardsLabelNameByColorPutReq) {
	    return getClient().updateBoardsLabelNameByYellow(boardId,boardsLabelNameByColorPutReq);
	  }
	
	/**
	 * Update board members by id.
	 *
	 * @param boardId the board id
	 * @param boardMembersPutReq the board members put req
	 * @return the string
	 */
	@Processor
	  public String updateBoardMembersById(String boardId,BoardsMembersPutRequest boardMembersPutReq) {
	    return getClient().updateBoardMembersById(boardId,boardMembersPutReq);
	  }
	
	/**
	 * Update board member by member id.
	 *
	 * @param boardId the board id
	 * @param idMember the id member
	 * @param boardMembersByMemberIdPutReq the board members by member id put req
	 * @return the string
	 */
	@Processor
	  public String updateBoardMemberByMemberId(String boardId,String idMember,BoardsMembersByMemberIdPutRequest boardMembersByMemberIdPutReq) {
	    return getClient().updateBoardMemberByMemberId(boardId,idMember,boardMembersByMemberIdPutReq);
	  }
	
	/**
	 * Update boards membership by membership id.
	 *
	 * @param boardId the board id
	 * @param idMembership the id membership
	 * @param boardMembershipsPutReq the board memberships put req
	 * @return the string
	 */
	@Processor
	  public String updateBoardsMembershipByMembershipId(String boardId,String idMembership,BoardsMembershipsPutRequest boardMembershipsPutReq) {
	    return getClient().updateBoardsMembershipByMembershipId(boardId,idMembership,boardMembershipsPutReq);
	  }
	
	/**
	 * Update boards email pos pref.
	 *
	 * @param boardId the board id
	 * @param boardEmailPosPrefPutReq the board email pos pref put req
	 * @return the string
	 */
	@Processor
	  public String updateBoardsEmailPosPref(String boardId,BoardsEmailPosPrefPutRequest boardEmailPosPrefPutReq) {
	    return getClient().updateBoardsEmailPosPref(boardId,boardEmailPosPrefPutReq);
	  }
	
	/**
	 * Update boards email list id pref.
	 *
	 * @param boardId the board id
	 * @param boardEmailListIdPrefPutReq the board email list id pref put req
	 * @return the string
	 */
	@Processor
	  public String updateBoardsEmailListIdPref(String boardId,BoardsEmailListPrefPutRequest boardEmailListIdPrefPutReq) {
	    return getClient().updateBoardsEmailListIdPref(boardId,boardEmailListIdPrefPutReq);
	  }	
	
	/**
	 * Show boards list guide.
	 *
	 * @param boardId the board id
	 * @param boardsListGuidePrefPutReq the boards list guide pref put req
	 * @return the string
	 */
	@Processor
	  public String showBoardsListGuide(String boardId,BoardsListGuidePutRequest boardsListGuidePrefPutReq) {
	    return getClient().showBoardsListGuide(boardId,boardsListGuidePrefPutReq);
	  }	
	
	/**
	 * Show boards sidebar.
	 *
	 * @param boardId the board id
	 * @param boardsListGuidePrefPutReq the boards list guide pref put req
	 * @return the string
	 */
	@Processor
	  public String showBoardsSidebar(String boardId,BoardsListGuidePutRequest boardsListGuidePrefPutReq) {
	    return getClient().showBoardsSidebar(boardId,boardsListGuidePrefPutReq);
	  }	
	
	/**
	 * Show boards sidebar activity.
	 *
	 * @param boardId the board id
	 * @param boardsListGuidePrefPutReq the boards list guide pref put req
	 * @return the string
	 */
	@Processor
	  public String showBoardsSidebarActivity(String boardId,BoardsListGuidePutRequest boardsListGuidePrefPutReq) {
	    return getClient().showBoardsSidebarActivity(boardId,boardsListGuidePrefPutReq);
	  }	
	
	/**
	 * Show boards sidebar board activity.
	 *
	 * @param boardId the board id
	 * @param boardsListGuidePrefPutReq the boards list guide pref put req
	 * @return the string
	 */
	@Processor
	  public String showBoardsSidebarBoardActivity(String boardId,BoardsListGuidePutRequest boardsListGuidePrefPutReq) {
	    return getClient().showBoardsListGuide(boardId,boardsListGuidePrefPutReq);
	  }	
	
	/**
	 * Show boards sidebar members.
	 *
	 * @param boardId the board id
	 * @param boardsListGuidePrefPutReq the boards list guide pref put req
	 * @return the string
	 */
	@Processor
	  public String showBoardsSidebarMembers(String boardId,BoardsListGuidePutRequest boardsListGuidePrefPutReq) {
	    return getClient().showBoardsSidebarMembers(boardId,boardsListGuidePrefPutReq);
	  }	
	
	/**
	 * Update board name by id.
	 *
	 * @param boardId the board id
	 * @param boardsNamePutReq the boards name put req
	 * @return the string
	 */
	@Processor
	  public String updateBoardNameById(String boardId,BoardsNamePutRequest boardsNamePutReq) {
	    return getClient().updateBoardNameById(boardId,boardsNamePutReq);
	  }	
	
	/**
	 * Update boards background by id.
	 *
	 * @param boardId the board id
	 * @param boardsBackgroundPrefPutReq the boards background pref put req
	 * @return the string
	 */
	@Processor
	  public String updateBoardsBackgroundById(String boardId,BoardsBackgroundPrefPutRequest boardsBackgroundPrefPutReq) {
	    return getClient().updateBoardsBackgroundById(boardId,boardsBackgroundPrefPutReq);
	  }	
	
	/**
	 * Boards calender feed enabled.
	 *
	 * @param boardId the board id
	 * @param boardsCalenderFeedsEnabledPutReq the boards calender feeds enabled put req
	 * @return the string
	 */
	@Processor
	  public String boardsCalenderFeedEnabled(String boardId,BoardsCalenderFeedEnabledPutRequest boardsCalenderFeedsEnabledPutReq) {
	    return getClient().boardsCalenderFeedEnabled(boardId,boardsCalenderFeedsEnabledPutReq);
	  }	
	
	/**
	 * Update boards card aging.
	 *
	 * @param boardId the board id
	 * @param boardsCardsPutReq the boards cards put req
	 * @return the string
	 */
	@Processor
	  public String updateBoardsCardAging(String boardId,BoardsCardsPutRequest boardsCardsPutReq) {
	    return getClient().updateBoardsCardAging(boardId,boardsCardsPutReq);
	  }	
	
	/**
	 * Update boards card covers.
	 *
	 * @param boardId the board id
	 * @param boardsCardCoversPutReq the boards card covers put req
	 * @return the string
	 */
	@Processor
	  public String updateBoardsCardCovers(String boardId,BoardsCardCoversPutRequest boardsCardCoversPutReq) {
	    return getClient().updateBoardsCardCover(boardId,boardsCardCoversPutReq);
	  }	
	
	/**
	 * Update boards comments.
	 *
	 * @param boardId the board id
	 * @param boardsCommentsPutReq the boards comments put req
	 * @return the string
	 */
	@Processor
	  public String updateBoardsComments(String boardId,BoardsCommentsPutRequest boardsCommentsPutReq) {
	    return getClient().updateBoardsComments(boardId,boardsCommentsPutReq);
	  }	
	
	/**
	 * Update boards invitations.
	 *
	 * @param boardId the board id
	 * @param boardsInvitationsPutReq the boards invitations put req
	 * @return the string
	 */
	@Processor
	  public String updateBoardsInvitations(String boardId,BoardsInvitationPutRequest boardsInvitationsPutReq) {
	    return getClient().updateBoardsInvitations(boardId,boardsInvitationsPutReq);
	  }	
	
	/**
	 * Update boards permission level.
	 *
	 * @param boardId the board id
	 * @param boardsInvitationsPutReq the boards invitations put req
	 * @return the string
	 */
	@Processor
	  public String updateBoardsPermissionLevel(String boardId,BoardsPermissionLevelPutRequest boardsInvitationsPutReq) {
	    return getClient().updateBoardsPermissionLevel(boardId,boardsInvitationsPutReq);
	  }	
	
	/**
	 * Update self join boards.
	 *
	 * @param boardId the board id
	 * @param boardsSelfJoinPutReq the boards self join put req
	 * @return the string
	 */
	@Processor
	  public String updateSelfJoinBoards(String boardId,BoardsCardCoversPutRequest boardsSelfJoinPutReq) {
	    return getClient().updateSelfJoinBoards(boardId,boardsSelfJoinPutReq);
	  }	
	
	/**
	 * Boards voting.
	 *
	 * @param boardId the board id
	 * @param boardsVotingPutReq the boards voting put req
	 * @return the string
	 */
	@Processor
	  public String boardsVoting(String boardId,BoardsVotingPutRequest boardsVotingPutReq) {
	    return getClient().boardsVoting(boardId,boardsVotingPutReq);
	  }	
	
	/**
	 * Update subscribed boards by id.
	 *
	 * @param boardId the board id
	 * @param boardsSubscriberPutReq the boards subscriber put req
	 * @return the string
	 */
	@Processor
	  public String updateSubscribedBoardsById(String boardId,BoardsSubscriberPutRequest boardsSubscriberPutReq) {
	    return getClient().updateSubscribedBoardsById(boardId,boardsSubscriberPutReq);
	  }	

/**
 * Post boards.
 *
 * @param boardssPostRequest the boardss post request
 * @return the boards post response
 */
//Boards POST Methods
	@Processor
	  public BoardsPostResponse postBoards(BoardsPostRequest boardssPostRequest) {
		
	    return getClient().postBoards(boardssPostRequest);
	  }
	
	/**
	 * Post boards calenderkey generate.
	 *
	 * @param boardId the board id
	 * @param boardsCalenderkeyGenPostRequest the boards calenderkey gen post request
	 * @return the string
	 */
	@Processor
	  public String postBoardsCalenderkeyGenerate(String boardId,BoardsCalendekeyGeneratePostRequest boardsCalenderkeyGenPostRequest) {
	    return getClient().postBoardsCalenderkeyGenerate(boardId,boardsCalenderkeyGenPostRequest);
	  }
	
	/**
	 * Post boards checklists.
	 *
	 * @param boardId the board id
	 * @param boardsChecklistPostRequest the boards checklist post request
	 * @return the string
	 */
	@Processor
	  public String postBoardsChecklists(String boardId,BoardsChecklistPostRequest boardsChecklistPostRequest) {
	    return getClient().postBoardsChecklists(boardId,boardsChecklistPostRequest);
	  }
	
	/**
	 * Post boards emailkey generation.
	 *
	 * @param boardId the board id
	 * @param boardsEmailkeyGenPostRequest the boards emailkey gen post request
	 * @return the string
	 */
	@Processor
	  public String postBoardsEmailkeyGeneration(String boardId,BoardsCalendekeyGeneratePostRequest boardsEmailkeyGenPostRequest) {
	    return getClient().postBoardsEmailkeyGeneration(boardId,boardsEmailkeyGenPostRequest);
	  }
	
	/**
	 * Post boards by id and label.
	 *
	 * @param boardId the board id
	 * @param boardsIdLabelPostRequest the boards id label post request
	 * @return the string
	 */
	@Processor
	  public String postBoardsByIdAndLabel(String boardId,BoardsByIdLabelPostRequest boardsIdLabelPostRequest) {
	    return getClient().postBoardsByIdAndLabel(boardId,boardsIdLabelPostRequest);
	  }
	
	/**
	 * Post boards by and list.
	 *
	 * @param boardId the board id
	 * @param boardsIdListPostRequest the boards id list post request
	 * @return the string
	 */
	@Processor
	  public String postBoardsByAndList(String boardId,BoardsByIdListPostRequest boardsIdListPostRequest) {
	    return getClient().postBoardsByAndList(boardId,boardsIdListPostRequest);
	  }
	
	/**
	 * Post boards mark as viewd.
	 *
	 * @param boardId the board id
	 * @param boardsMarkAsVieedPostReq the boards mark as vieed post req
	 * @return the string
	 */
	@Processor
	  public String postBoardsMarkAsViewd(String boardId,BoardsCalendekeyGeneratePostRequest boardsMarkAsVieedPostReq ) {
	    return getClient().postBoardsMarkAsViewd(boardId,boardsMarkAsVieedPostReq);
	  }
	
	/**
	 * Post boards power ups.
	 *
	 * @param boardId the board id
	 * @param value the value
	 * @param boardsByIdAndPoerUps the boards by id and poer ups
	 * @return the string
	 */
	@Processor
	  public String postBoardsPowerUps(String boardId,String value,BoardsPoweUpsPostRequest boardsByIdAndPoerUps) {
	    return getClient().postBoardsPowerUps(boardId,value,boardsByIdAndPoerUps);
	  }
	
	/**
	 * Delete member under board by id.
	 *
	 * @param boardId the board id
	 * @param memberId the member id
	 * @return the string
	 */
	@Processor
	  public StatusResponse deleteMemberUnderBoardById(String boardId,String memberId) {
	    return getClient().deleteMemberUnderBoardById(boardId,memberId);
	  }
	
	/**
	 * Delete power ups under board by id.
	 *
	 * @param boardId the board id
	 * @param powerUp the power up
	 * @return the status response
	 */
	@Processor
	  public StatusResponse deletePowerUpsUnderBoardById(String boardId,String powerUp) {
	    return getClient().deletePowerUpsUnderBoardById(boardId,powerUp);
	  }
	
	/**
	 * Gets the cards by id.
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
	 * @return the cards by id
	 */
	//Cards GET Methods
	@Processor
	public CardsByIdGetResponse getCardsById(String cardIdOrShortlink,@Optional String actions,@Optional Boolean actions_entities,@Optional Boolean actions_display,@Optional Integer actions_limit,@Optional String action_fields,@Optional String action_memberCreator_fields,@Optional String attachments,@Optional String attachment_fields,@Optional Boolean members,@Optional String member_fields,@Optional Boolean membersVoted,@Optional String memberVoted_fields,
			@Optional Boolean checkItemStates,@Optional String checkItemState_fields,@Optional String checklists,@Optional String checklist_fields,@Optional Boolean board,@Optional String board_fields,@Optional Boolean list,@Optional String list_fields,@Optional Boolean stickers,@Optional String sticker_fields,@Optional String fields){
		return getClient().getCardsById(cardIdOrShortlink,actions,  actions_entities,  actions_display,actions_limit,action_fields,action_memberCreator_fields,attachments,attachment_fields,  members,member_fields,  membersVoted,memberVoted_fields,
				  checkItemStates,checkItemState_fields,checklists,checklist_fields,  board,board_fields,  list,list_fields,  stickers,sticker_fields,fields);
	}
	
	/**
	 * Gets the cards by id with field.
	 *
	 * @param cardIdOrShortlink the card id or shortlink
	 * @param field the field
	 * @return the cards by id with field
	 */
	@Processor
	public String getCardsByIdWithField(String cardIdOrShortlink,String field){
		return getClient().getCardsByIdWithField(cardIdOrShortlink,field);
	}
	
	/**
	 * Gets the card actions by id.
	 *
	 * @param cardIdOrShortlink the card id or shortlink
	 * @param entities the entities
	 * @param display the display
	 * @param filter the filter
	 * @param fields the fields
	 * @param limit the limit
	 * @param format the format
	 * @param since the since
	 * @param before the before
	 * @param idModels the id models
	 * @param member the member
	 * @param member_fields the member_fields
	 * @param memberCreator the member creator
	 * @param memberCreator_fields the member creator_fields
	 * @return the card actions by id
	 */
	@Processor
	public String getCardActionsById(String cardIdOrShortlink,@Optional Boolean entities,@Optional Boolean display,@Optional String filter,@Optional String fields,
			@Optional Integer limit,@Optional String format,@Optional String since,@Optional String before,@Optional String idModels,@Optional Boolean member,@Optional String member_fields,@Optional Boolean memberCreator,@Optional String memberCreator_fields){
		return getClient().getCardActionsById(cardIdOrShortlink, entities, display, filter,fields,limit,format,since,before,idModels,member,member_fields,memberCreator,memberCreator_fields);
	}
	
	/**
	 * Gets the cards attachments.
	 *
	 * @param cardIdOrShortlink the card id or shortlink
	 * @param fields the fields
	 * @return the cards attachments
	 */
	@Processor
	public String getCardsAttachments(String cardIdOrShortlink,@Optional String fields){
		return getClient().getCardsAttachments(cardIdOrShortlink,fields);
	}
	
	/**
	 * Gets the cards attachments by id.
	 *
	 * @param cardIdOrShortlink the card id or shortlink
	 * @param idAttachment the id attachment
	 * @param fields the fields
	 * @return the cards attachments by id
	 */
	@Processor
	public String getCardsAttachmentsById(String cardIdOrShortlink,String idAttachment,@Optional String fields){
		return getClient().getCardsAttachmentsById(cardIdOrShortlink,idAttachment,fields);
	}
	
	/**
	 * Gets the boards under cars by id.
	 *
	 * @param cardIdOrShortlink the card id or shortlink
	 * @param fields the fields
	 * @return the boards under cars by id
	 */
	@Processor
	public String getBoardsUnderCarsById(String cardIdOrShortlink,@Optional String fields){
		return getClient().getBoardsUnderCarsById(cardIdOrShortlink,fields);
	}
	
	/**
	 * Gets the boards under cars by id with field.
	 *
	 * @param cardIdOrShortlink the card id or shortlink
	 * @param fields the fields
	 * @return the boards under cars by id with field
	 */
	@Processor
	public String getBoardsUnderCarsByIdWithField(String cardIdOrShortlink,String fields){
		return getClient().getBoardsUnderCarsByIdWithField(cardIdOrShortlink,fields);
	}
	
	/**
	 * Gets the cards by id with check item states.
	 *
	 * @param cardIdOrShortlink the card id or shortlink
	 * @param fields the fields
	 * @return the cards by id with check item states
	 */
	@Processor
	public String getCardsByIdWithCheckItemStates(String cardIdOrShortlink,@Optional String fields){
		return getClient().getCardsByIdWithCheckItemStates(cardIdOrShortlink,fields);
	}
	
	/**
	 * Gets the cards by id with check lists.
	 *
	 * @param cardIdOrShortlink the card id or shortlink
	 * @param cards the cards
	 * @param card_fields the card_fields
	 * @param checkItems the check items
	 * @param checkItem_fields the check item_fields
	 * @param filter the filter
	 * @param fields the fields
	 * @return the cards by id with check lists
	 */
	@Processor
	public String getCardsByIdWithCheckLists(String cardIdOrShortlink,@Optional String cards,@Optional String card_fields,@Optional String checkItems,@Optional String checkItem_fields,@Optional String filter,@Optional String fields){
		return getClient().getCardsByIdWithCheckLists(cardIdOrShortlink,cards,card_fields,checkItems,checkItem_fields,filter,fields);
	}
	
	/**
	 * Gets the cards by id with list.
	 *
	 * @param cardIdOrShortlink the card id or shortlink
	 * @param fields the fields
	 * @return the cards by id with list
	 */
	@Processor
	public String getCardsByIdWithList(String cardIdOrShortlink,@Optional String fields){
		return getClient().getCardsByIdWithList(cardIdOrShortlink,fields);
	}
	
	/**
	 * Gets the cards by id with list field.
	 *
	 * @param cardIdOrShortlink the card id or shortlink
	 * @param field the field
	 * @return the cards by id with list field
	 */
	@Processor
	public String getCardsByIdWithListField(String cardIdOrShortlink,@Optional String field){
		return getClient().getCardsByIdWithListField(cardIdOrShortlink,field);
	}
	
	/**
	 * Gets the cards members by id.
	 *
	 * @param cardIdOrShortlink the card id or shortlink
	 * @param fields the fields
	 * @return the cards members by id
	 */
	@Processor
	public String getCardsMembersById(String cardIdOrShortlink,@Optional String fields){
		return getClient().getCardsMembersById(cardIdOrShortlink,fields);
	}
	
	/**
	 * Gets the cards members voted by id.
	 *
	 * @param cardIdOrShortlink the card id or shortlink
	 * @param fields the fields
	 * @return the cards members voted by id
	 */
	@Processor
	public String getCardsMembersVotedById(String cardIdOrShortlink,@Optional String fields){
		return getClient().getCardsMembersVotedById(cardIdOrShortlink,fields);
	}
	
	/**
	 * Gets the cards stickers.
	 *
	 * @param cardIdOrShortlink the card id or shortlink
	 * @param fields the fields
	 * @return the cards stickers
	 */
	@Processor
	public String getCardsStickers(String cardIdOrShortlink,@Optional String fields){
		return getClient().getCardsStickers(cardIdOrShortlink,fields);
	}
	
	/**
	 * Gets the cards stickers by id.
	 *
	 * @param cardIdOrShortlink the card id or shortlink
	 * @param idSticker the id sticker
	 * @param fields the fields
	 * @return the cards stickers by id
	 */
	@Processor
	public String getCardsStickersById(String cardIdOrShortlink,String idSticker,@Optional String fields){
		return getClient().getCardsStickersById(cardIdOrShortlink,idSticker,fields);
	}
	
	/**
	 * Put cards by id.
	 *
	 * @param cardIdOrShortlink the card id or shortlink
	 * @param membershipsIdPutRequest the memberships id put request
	 * @return the string
	 */
	//PUT Methots for Cards
	@Processor
	  public String putCardsById(String cardIdOrShortlink,CardsByIdPutRequest membershipsIdPutRequest) {
	    return getClient().putCardsById(cardIdOrShortlink,membershipsIdPutRequest);
	  }
	
	/**
	 * Put comments on actions by id.
	 *
	 * @param cardIdOrShortlink the card id or shortlink
	 * @param idAction the id action
	 * @param membershipsIdPutRequest the memberships id put request
	 * @return the string
	 */
	@Processor
	  public String putCommentsOnActionsById(String cardIdOrShortlink,String idAction,CardsCommentsByIdPutRequest membershipsIdPutRequest) {
	    return getClient().putCommentsOnActionsById(cardIdOrShortlink,idAction,membershipsIdPutRequest);
	  }
	
	/**
	 * Updatecheck item name on cards.
	 *
	 * @param cardIdOrShortlink the card id or shortlink
	 * @param idChecklist the id checklist
	 * @param idCheckItem the id check item
	 * @param udatecheckItemNamePostRequest the udatecheck item name post request
	 * @return the string
	 */
	@Processor
	  public String updatecheckItemNameOnCards(String cardIdOrShortlink,String idChecklist,String  idCheckItem, CardsCheckListNamePutRequest udatecheckItemNamePostRequest) {
	    return getClient().updatecheckItemNameOnCards(cardIdOrShortlink,idChecklist,idCheckItem,udatecheckItemNamePostRequest);
	  }
	
	/**
	 * Updatecheck ite position on cards.
	 *
	 * @param cardIdOrShortlink the card id or shortlink
	 * @param idChecklist the id checklist
	 * @param idCheckItem the id check item
	 * @param udatecheckItemPosPostRequest the udatecheck item pos post request
	 * @return the string
	 */
	@Processor
	  public String updatecheckItePositionOnCards(String cardIdOrShortlink,String idChecklist,String  idCheckItem, CardsCheckListPositionPutRequest udatecheckItemPosPostRequest) {
	    return getClient().updatecheckItePositionOnCards(cardIdOrShortlink,idChecklist,idCheckItem,udatecheckItemPosPostRequest);
	  }
	
	/**
	 * Updatecheck ite state on cards.
	 *
	 * @param cardIdOrShortlink the card id or shortlink
	 * @param idChecklist the id checklist
	 * @param idCheckItem the id check item
	 * @param udatecheckItemPosPostRequest the udatecheck item pos post request
	 * @return the string
	 */
	@Processor
	  public String updatecheckIteStateOnCards(String cardIdOrShortlink,String idChecklist,String  idCheckItem, CardsCheckListStatePutRequest udatecheckItemPosPostRequest) {
	    return getClient().updatecheckIteStateOnCards(cardIdOrShortlink,idChecklist,idCheckItem,udatecheckItemPosPostRequest);
	  }
	
	/**
	 * Update currentcheck list on cards.
	 *
	 * @param cardIdOrShortlink the card id or shortlink
	 * @param idChecklistCurrent the id checklist current
	 * @param idCheckItem the id check item
	 * @param updateCurrentcheckListyIdPosPostRequest the update currentcheck listy id pos post request
	 * @return the string
	 */
	@Processor
	  public String updateCurrentcheckListOnCards(String cardIdOrShortlink,String idChecklistCurrent ,String  idCheckItem, CardsCurrentCheckListPutRequest updateCurrentcheckListyIdPosPostRequest) {
	    return getClient().updateCurrentcheckListOnCards(cardIdOrShortlink,idChecklistCurrent,idCheckItem,updateCurrentcheckListyIdPosPostRequest);
	  }
	
	/**
	 * Update closed cards by id.
	 *
	 * @param cardIdOrShortlink the card id or shortlink
	 * @param updateClosedCardsById the update closed cards by id
	 * @return the string
	 */
	@Processor
	  public String updateClosedCardsById(String cardIdOrShortlink,CardsClosedPutRequest updateClosedCardsById) {
	    return getClient().updateClosedCardsById(cardIdOrShortlink,updateClosedCardsById);
	  }
	
	/**
	 * Update cards desc by id.
	 *
	 * @param cardIdOrShortlink the card id or shortlink
	 * @param updateCardsDescById the update cards desc by id
	 * @return the string
	 */
	@Processor
	  public String updateCardsDescById(String cardIdOrShortlink,CardsDescriptionPutRequest updateCardsDescById) {
	    return getClient().updateCardsDescById(cardIdOrShortlink,updateCardsDescById);
	  }
	
	/**
	 * Update cards due by id.
	 *
	 * @param cardIdOrShortlink the card id or shortlink
	 * @param updateCardsDueById the update cards due by id
	 * @return the string
	 */
	@Processor
	  public String updateCardsDueById(String cardIdOrShortlink,CardsDuePutRequest updateCardsDueById) {
	    return getClient().updateCardsDueById(cardIdOrShortlink,updateCardsDueById);
	  }
	
	/**
	 * Update cards id attachment by id.
	 *
	 * @param cardIdOrShortlink the card id or shortlink
	 * @param updateCardsidAttachmentById the update cardsid attachment by id
	 * @return the string
	 */
	@Processor
	  public String updateCardsIdAttachmentById(String cardIdOrShortlink,CardsIdAttachmentPutRequest updateCardsidAttachmentById) {
	    return getClient().updateCardsIdAttachmentById(cardIdOrShortlink,updateCardsidAttachmentById);
	  }
	
	/**
	 * Update cards board id by id.
	 *
	 * @param cardIdOrShortlink the card id or shortlink
	 * @param updateCardsBoardIdPutReq the update cards board id put req
	 * @return the string
	 */
	@Processor
	  public String updateCardsBoardIdById(String cardIdOrShortlink,CardsBoardIdPutRequest updateCardsBoardIdPutReq) {
	    return getClient().updateCardsBoardIdById(cardIdOrShortlink,updateCardsBoardIdPutReq);
	  }
	
	/**
	 * Update cards list id by id.
	 *
	 * @param cardIdOrShortlink the card id or shortlink
	 * @param updateCardsListIdPutReq the update cards list id put req
	 * @return the string
	 */
	@Processor
	  public String updateCardsListIdById(String cardIdOrShortlink,CardsListPutRequest updateCardsListIdPutReq) {
	    return getClient().updateCardsListIdById(cardIdOrShortlink,updateCardsListIdPutReq);
	  }
	
	/**
	 * Update card member by id.
	 *
	 * @param cardIdOrShortlink the card id or shortlink
	 * @param updateCardMemberPutReq the update card member put req
	 * @return the string
	 */
	@Processor
	  public String updateCardMemberById(String cardIdOrShortlink,CardsMemberPutRequest updateCardMemberPutReq) {
	    return getClient().updateCardMemberById(cardIdOrShortlink,updateCardMemberPutReq);
	  }
	
	/**
	 * Update card name by id.
	 *
	 * @param cardIdOrShortlink the card id or shortlink
	 * @param updateCardsNamePutReq the update cards name put req
	 * @return the string
	 */
	@Processor
	  public String updateCardNameById(String cardIdOrShortlink,CardsNamePutRequest updateCardsNamePutReq) {
	    return getClient().updateCardNameById(cardIdOrShortlink,updateCardsNamePutReq);
	  }
	
	/**
	 * Update card pos by id.
	 *
	 * @param cardIdOrShortlink the card id or shortlink
	 * @param updateCardsNamePutReq the update cards name put req
	 * @return the string
	 */
	@Processor
	  public String updateCardPosById(String cardIdOrShortlink,CardsNamePostRequest updateCardsNamePutReq) {
	    return getClient().updateCardPosById(cardIdOrShortlink,updateCardsNamePutReq);
	  }
	
	/**
	 * Update card stickers by id.
	 *
	 * @param cardIdOrShortlink the card id or shortlink
	 * @param idSticker the id sticker
	 * @param updateCardsStickerPutReq the update cards sticker put req
	 * @return the string
	 */
	@Processor
	  public String updateCardStickersById(String cardIdOrShortlink,String idSticker,CardsStickerPutRequest updateCardsStickerPutReq) {
	    return getClient().updateCardStickersById(cardIdOrShortlink,idSticker,updateCardsStickerPutReq);
	  }
	
	/**
	 * Read subsribed cards.
	 *
	 * @param cardIdOrShortlink the card id or shortlink
	 * @param readSubscribedCarsdsPutReq the read subscribed carsds put req
	 * @return the string
	 */
	@Processor
	  public String readSubsribedCards(String cardIdOrShortlink,CardsSubscribedPutRequest readSubscribedCarsdsPutReq) {
	    return getClient().readSubsribedCards(cardIdOrShortlink,readSubscribedCarsdsPutReq);
	  }
	
	/**
	 * Post cards.
	 *
	 * @param cardsPosrReq the cards posr req
	 * @return the string
	 */
	@Processor
	  public String postCards(CardsPostRequest cardsPosrReq) {
	    return getClient().postCards(cardsPosrReq);
	  }
	
	/**
	 * Post cards acion comments.
	 *
	 * @param cardIdOrShortlink the card id or shortlink
	 * @param cardsActionCommentsPostReq the cards action comments post req
	 * @return the string
	 */
	@Processor
	  public String postCardsAcionComments(String cardIdOrShortlink,CardsAcionCommentsByIdPostRequest cardsActionCommentsPostReq) {
	    return getClient().postCardsAcionComments(cardIdOrShortlink,cardsActionCommentsPostReq);
	  }
	
	/**
	 * Post cards attachments by id.
	 *
	 * @param cardIdOrShortlink the card id or shortlink
	 * @param postCardsAttachmentsById the post cards attachments by id
	 * @return the string
	 */
	@Processor
	  public String postCardsAttachmentsById(String cardIdOrShortlink,CardsAttachmentsByIdPostRequest postCardsAttachmentsById) {
	    return getClient().postCardsAttachmentsById(cardIdOrShortlink,postCardsAttachmentsById);
	  }
	
	/**
	 * Post cards check lists by id.
	 *
	 * @param cardIdOrShortlink the card id or shortlink
	 * @param idCheckList the id check list
	 * @param postCardChecklistsByIdPostReq the post card checklists by id post req
	 * @return the string
	 */
	@Processor
	  public String postCardsCheckListsById(String cardIdOrShortlink,String idCheckList,CardsCheckListsByIdPostRequest postCardChecklistsByIdPostReq) {
	    return getClient().postCardsCheckListsById(cardIdOrShortlink,idCheckList,postCardChecklistsByIdPostReq);
	  }
	
	/**
	 * Convert checklist to cards by id.
	 *
	 * @param cardIdOrShortlink the card id or shortlink
	 * @param idChecklist the id checklist
	 * @param idCheckItem the id check item
	 * @param postCardChecklistsToCardByIdPostReq the post card checklists to card by id post req
	 * @return the string
	 */
	@Processor
	  public String convertChecklistToCardsById(String cardIdOrShortlink,String idChecklist,String idCheckItem ,CheckListsToCardByIdPostRequest postCardChecklistsToCardByIdPostReq) {
	    return getClient().convertChecklistToCardsById(cardIdOrShortlink,idChecklist,idCheckItem,postCardChecklistsToCardByIdPostReq);
	  }
	
	/**
	 * Post cards checklist by id.
	 *
	 * @param cardIdOrShortlink the card id or shortlink
	 * @param checkListUpdatePostReq the check list update post req
	 * @return the string
	 */
	@Processor
	  public String postCardsChecklistById(String cardIdOrShortlink,CheckListsUpdatePostRequest checkListUpdatePostReq) {
	    return getClient().postCardsChecklistById(cardIdOrShortlink,checkListUpdatePostReq);
	  }
	
	/**
	 * Post cards id label by id.
	 *
	 * @param cardIdOrShortlink the card id or shortlink
	 * @param postCardsIdListPostReq the post cards id list post req
	 * @return the string
	 */
	@Processor
	  public String postCardsIdLabelById(String cardIdOrShortlink,CardsIdLabelByIdPostRequest postCardsIdListPostReq) {
	    return getClient().postCardsIdLabelById(cardIdOrShortlink,postCardsIdListPostReq);
	  }
	
	/**
	 * Post cards id members by id.
	 *
	 * @param cardIdOrShortlink the card id or shortlink
	 * @param postCardsIdMemberPostReq the post cards id member post req
	 * @return the string
	 */
	@Processor
	  public String postCardsIdMembersById(String cardIdOrShortlink,CardsIdMembersPostRequest postCardsIdMemberPostReq) {
	    return getClient().postCardsIdMembersById(cardIdOrShortlink,postCardsIdMemberPostReq);
	  }
	
	/**
	 * Post cards labels by id.
	 *
	 * @param cardIdOrShortlink the card id or shortlink
	 * @param postCardsIdMemberPostReq the post cards id member post req
	 * @return the string
	 */
	@Processor
	  public String postCardsLabelsById(String cardIdOrShortlink,CardsLabelsPostRequest postCardsIdMemberPostReq) {
	    return getClient().postCardsLabelsById(cardIdOrShortlink,postCardsIdMemberPostReq);
	  }
	
	/**
	 * Post cards members voted by id.
	 *
	 * @param cardIdOrShortlink the card id or shortlink
	 * @param postCardsMembedrsVotedPostReq the post cards membedrs voted post req
	 * @return the string
	 */
	@Processor
	  public String postCardsMembersVotedById(String cardIdOrShortlink,CardsMembersVotedPostRequest postCardsMembedrsVotedPostReq) {
	    return getClient().postCardsMembersVotedById(cardIdOrShortlink,postCardsMembedrsVotedPostReq);
	  }
	
	/**
	 * Post card stickers by id.
	 *
	 * @param cardIdOrShortlink the card id or shortlink
	 * @param postCardsStickersPostReq the post cards stickers post req
	 * @return the string
	 */
	@Processor
	  public String postCardStickersById(String cardIdOrShortlink,CardsStickersPostRequest postCardsStickersPostReq) {
	    return getClient().postCardStickersById(cardIdOrShortlink,postCardsStickersPostReq);
	  }
	
	/**
	 * Post mark associated notification id.
	 *
	 * @param cardIdOrShortlink the card id or shortlink
	 * @return the string
	 */
	@Processor
	  public String postMarkAssociatedNotificationId(String cardIdOrShortlink) {
	    return getClient().getMarkAssociatedNotificationId(cardIdOrShortlink);
	  }
	
	
	//Cards DELETE methods
	
	/**
	 * Delete cards by id.
	 *
	 * @param cardIdOrShortLink the card id or short link
	 * @return the status response
	 */
	@Processor
	  public StatusResponse deleteCardsById(String cardIdOrShortLink) {
	    return getClient().deleteCardsById(cardIdOrShortLink);
	  }
	
	/**
	 * Delete cards action comments by id.
	 *
	 * @param cardIdOrShortLink the card id or short link
	 * @param idAction the id action
	 * @return the status response
	 */
	@Processor
	  public StatusResponse deleteCardsActionCommentsById(String cardIdOrShortLink,String idAction) {
	    return getClient().deleteCardsActionCommentsById(cardIdOrShortLink,idAction);
	  }
	
	/**
	 * Delete cards id attachment by id.
	 *
	 * @param cardIdOrShortLink the card id or short link
	 * @param idAttachment the id attachment
	 * @return the status response
	 */
	@Processor
	  public StatusResponse deleteCardsIdAttachmentById(String cardIdOrShortLink,String idAttachment) {
	    return getClient().deleteCardsIdAttachmentById(cardIdOrShortLink,idAttachment);
	  }
	
	/**
	 * Delete cards check items by id.
	 *
	 * @param cardIdOrShortLink the card id or short link
	 * @param idChecklist the id checklist
	 * @param idCheckItem the id check item
	 * @return the status response
	 */
	@Processor
	  public StatusResponse deleteCardsCheckItemsById(String cardIdOrShortLink,String idChecklist,String idCheckItem) {
	    return getClient().deleteCardsCheckItemsById(cardIdOrShortLink,idChecklist,idCheckItem);
	  }
	
	/**
	 * Delete cards check lists by id.
	 *
	 * @param cardIdOrShortLink the card id or short link
	 * @param idChecklist the id checklist
	 * @return the status response
	 */
	@Processor
	  public StatusResponse deleteCardsCheckListsById(String cardIdOrShortLink,String idChecklist) {
	    return getClient().deleteCardsChecklistsById(cardIdOrShortLink,idChecklist);
	  }
	
	/**
	 * Delete cards id label by id.
	 *
	 * @param cardIdOrShortLink the card id or short link
	 * @param idLabel the id label
	 * @return the status response
	 */
	@Processor
	  public StatusResponse deleteCardsIdLabelById(String cardIdOrShortLink,String idLabel) {
	    return getClient().deleteCardsIdLabelById(cardIdOrShortLink,idLabel);
	  }
	
	/**
	 * Delete cards by id member.
	 *
	 * @param cardIdOrShortLink the card id or short link
	 * @param idMember the id member
	 * @return the status response
	 */
	@Processor
	  public StatusResponse deleteCardsByIdMember(String cardIdOrShortLink,String idMember) {
	    return getClient().deleteCardsByIdMember(cardIdOrShortLink,idMember);
	  }
	
	/**
	 * Delete cards by id members voted.
	 *
	 * @param cardIdOrShortLink the card id or short link
	 * @param idMember the id member
	 * @return the status response
	 */
	@Processor
	  public StatusResponse deleteCardsByIdMembersVoted(String cardIdOrShortLink,String idMember) {
	    return getClient().deleteCardsByIdMembersVoted(cardIdOrShortLink,idMember);
	  }
	
	/**
	 * Delete cards stickers by id.
	 *
	 * @param cardIdOrShortLink the card id or short link
	 * @param idMember the id member
	 * @return the status response
	 */
	@Processor
	  public StatusResponse deleteCardsStickersById(String cardIdOrShortLink,String idSticker) {
	    return getClient().deleteCardsStickersById(cardIdOrShortLink,idSticker);
	  }
	
	/**
	 * Gets the checklists by id.
	 *
	 * @param checklistId the checklist id
	 * @param cards the cards
	 * @param card_fields the card_fields
	 * @param checkItems the check items
	 * @param checkItem_fields the check item_fields
	 * @param fields the fields
	 * @return the checklists by id
	 */
	//Checklist Get methods
	@Processor
	  public CheckListsGetResponse getChecklistsById(String checklistId,@Optional String cards,@Optional String card_fields, @Optional String checkItems,@Optional String checkItem_fields,@Optional String fields) {
	    return getClient().getChecklistsById(checklistId,cards,card_fields,checkItems,checkItem_fields,fields);
	  }
	
	/**
	 * Gets the checklists field by id.
	 *
	 * @param checklistId the checklist id
	 * @param field the field
	 * @return the checklists field by id
	 */
	@Processor
	  public String getChecklistsFieldById(String checklistId,String field) {
	    return getClient().getChecklistsFieldById(checklistId,field);
	  }
	
	/**
	 * Gets the checklists boards by id.
	 *
	 * @param checklistId the checklist id
	 * @param fields the fields
	 * @return the checklists boards by id
	 */
	@Processor
	  public String getChecklistsBoardsById(String checklistId,@Optional String fields) {
	    return getClient().getChecklistsBoardsById(checklistId,fields);
	  }
	
	/**
	 * Gets the checklists board field by id.
	 *
	 * @param checklistId the checklist id
	 * @param field the field
	 * @return the checklists board field by id
	 */
	@Processor
	  public String getChecklistsBoardFieldById(String checklistId,String field) {
	    return getClient().getChecklistsBoardFieldById(checklistId,field);
	  }
	
	/**
	 * Gets the checklists cards by id.
	 *
	 * @param checklistId the checklist id
	 * @param actions the actions
	 * @param attachments the attachments
	 * @param attachment_fields the attachment_fields
	 * @param stickers the stickers
	 * @param members the members
	 * @param member_fields the member_fields
	 * @param checkItemStates the check item states
	 * @param checklists the checklists
	 * @param limit the limit
	 * @param since the since
	 * @param before the before
	 * @param filter the filter
	 * @param fields the fields
	 * @return the checklists cards by id
	 */
	@Processor
	  public String getChecklistsCardsById(String checklistId,@Optional String actions,@Optional String attachments,@Optional String attachment_fields,@Optional Boolean stickers,@Optional Boolean members,@Optional String member_fields,@Optional Boolean checkItemStates,@Optional String checklists,@Optional Integer limit,@Optional String since,@Optional String before,@Optional String filter,@Optional  String fields) {
	    return getClient().getChecklistsCardsById(checklistId,actions,attachments,attachment_fields,stickers,members,member_fields,checkItemStates,checklists,limit,since,before,filter,fields);
	  }
	
	/**
	 * Gets the checklists cards field by id.
	 *
	 * @param checklistId the checklist id
	 * @param filter the filter
	 * @return the checklists cards field by id
	 */
	@Processor
	  public String getChecklistsCardsFieldById(String checklistId,String filter) {
	    return getClient().getChecklistsCardsFieldById(checklistId,filter);
	  }
	
	/**
	 * Gets the check items by id.
	 *
	 * @param checklistId the checklist id
	 * @param filter the filter
	 * @param fields the fields
	 * @return the check items by id
	 */
	@Processor
	  public CheckItems getCheckItemsById(String checklistId,@Optional String filter,@Optional String fields) {
	    return getClient().getCheckItemsById(checklistId,filter,fields);
	  }
	
	/**
	 * Gets the check items by checked id by id.
	 *
	 * @param checklistId the checklist id
	 * @param idCheckItems the id check items
	 * @param fields the fields
	 * @return the check items by checked id by id
	 */
	@Processor
	  public CheckItems getCheckItemsByCheckedIdById(String checklistId,String idCheckItems,@Optional String fields) {
	    return getClient().getCheckItemsByCheckedIdById(checklistId,idCheckItems,fields);
	  }
	
	/**
	 * Gets the checklists by checked id by id.
	 *
	 * @param checklistId the checklist id
	 * @param idCheckItems the id check items
	 * @param fields the fields
	 * @return the checklists by checked id by id
	 */
	@Processor
	  public CheckItems getChecklistsByCheckedIdById(String checklistId,String idCheckItems,@Optional String fields) {
	    return getClient().getCheckItemsByCheckedIdById(checklistId,idCheckItems,fields);
	  }
	
	/**
	 * Put checklists by id.
	 *
	 * @param idChecklist the id checklist
	 * @param checklistsPutReq the checklists put req
	 * @return the string
	 */
	//checklists PUT methods
	@Processor
	  public String putChecklistsById(String idChecklist,ChecklistsByIdPutRequest checklistsPutReq) {
	    return getClient().putChecklistsById(idChecklist,checklistsPutReq);
	  }
	
	/**
	 * Put checklists name by id.
	 *
	 * @param idChecklist the id checklist
	 * @param checklistsNamePutReq the checklists name put req
	 * @return the string
	 */
	@Processor
	  public String putChecklistsNameById(String idChecklist,ChecklistsNameByIdPutRequest checklistsNamePutReq) {
	    return getClient().putChecklistsNameById(idChecklist,checklistsNamePutReq);
	  }
	
	/**
	 * Put checklists pos by id.
	 *
	 * @param idChecklist the id checklist
	 * @param checklistsPosPutReq the checklists pos put req
	 * @return the string
	 */
	@Processor
	  public String putChecklistsPosById(String idChecklist,ChecklistsPosByIdPutRequest checklistsPosPutReq) {
	    return getClient().putChecklistsPosById(idChecklist,checklistsPosPutReq);
	  }
	
	/**
	 * Post checklists.
	 *
	 * @param checklistsPostReq the checklists post req
	 * @return the string
	 */
	//Post checklists methods
	@Processor
	  public String postChecklists(ChecklistsPostRequest checklistsPostReq) {
	    return getClient().postChecklistsById(checklistsPostReq);
	  }
	
	/**
	 * Post check items by id.
	 *
	 * @param idChecklist the id checklist
	 * @param checkItemsPostReq the check items post req
	 * @return the string
	 */
	@Processor
	  public String postCheckItemsById(String idChecklist,CheckItemsPostRequest checkItemsPostReq) {
	    return getClient().postCheckItemsById(idChecklist,checkItemsPostReq);
	  }
	
	/**
	 * Delete checklists by id.
	 *
	 * @param idChecklist the id checklist
	 * @return the status response
	 */
	//DELETE checklist methods
	@Processor
	  public StatusResponse deleteChecklistsById(String idChecklist) {
	    return getClient().deleteChecklistsById(idChecklist);
	  }
	
	/**
	 * Delete checklists check items by id.
	 *
	 * @param idChecklist the id checklist
	 * @param idCheckItem the id check item
	 * @return the status response
	 */
	@Processor
	  public StatusResponse deleteChecklistsCheckItemsById(String idChecklist,String idCheckItem) {
	    return getClient().deleteChecklistsCheckItemsById(idChecklist,idCheckItem);
	  }
	
	/**
	 * Gets the labels by id.
	 *
	 * @param idLabel the id label
	 * @param fields the fields
	 * @return the labels by id
	 */
	//GET Methods for label
	@Processor
	  public String getLabelsById(String idLabel,@Optional String fields) {
	    return getClient().getLabelsById(idLabel,fields);
	  }
	
	/**
	 * Gets the labels boards by id.
	 *
	 * @param idLabel the id label
	 * @param fields the fields
	 * @return the labels boards by id
	 */
	@Processor
	  public String getLabelsBoardsById(String idLabel,@Optional String fields) {
	    return getClient().getLabelsBoardsById(idLabel,fields);
	  }
	
	/**
	 * Gets the labels boards field by id.
	 *
	 * @param idLabel the id label
	 * @param field the field
	 * @return the labels boards field by id
	 */
	@Processor
	  public String getLabelsBoardsFieldById(String idLabel,String field) {
	    return getClient().getLabelsBoardsFieldById(idLabel,field);
	  }
	
	/**
	 * Update label by id.
	 *
	 * @param idLabel the id label
	 * @param labelByIdPutReq the label by id put req
	 * @return the string
	 */
	//label PUT methods
	@Processor
	  public String updateLabelById(String idLabel,LabelByIdPutRequest labelByIdPutReq) {
	    return getClient().updateLabelById(idLabel,labelByIdPutReq);
	  }
	
	/**
	 * Update label color by id.
	 *
	 * @param idLabel the id label
	 * @param labelcolorByIdPutReq the labelcolor by id put req
	 * @return the string
	 */
	@Processor
	  public String updateLabelColorById(String idLabel,LabelColorByIdPutRequest labelcolorByIdPutReq) {
	    return getClient().updateLabelColorById(idLabel,labelcolorByIdPutReq);
	  }
	
	/**
	 * Update label name by id.
	 *
	 * @param idLabel the id label
	 * @param labelNameByIdPutReq the label name by id put req
	 * @return the string
	 */
	@Processor
	  public String updateLabelNameById(String idLabel,LabelNameByIdPutRequest labelNameByIdPutReq) {
	    return getClient().updateLabelNameById(idLabel,labelNameByIdPutReq);
	  }
	
	/**
	 * Post labels.
	 *
	 * @param labelsPostReq the labels post req
	 * @return the string
	 */
	//POST methods for labels
	@Processor
	  public String postLabels(LabelsPostRequest labelsPostReq) {
	    return getClient().postLabels(labelsPostReq);
	  }
	//DELETE Label Methods
	
	/**
	 * Delete label by id.
	 *
	 * @param labelId the label id
	 * @return the status response
	 */
	@Processor
	  public StatusResponse deleteLabelById(String labelId) {
	    return getClient().deleteLabelById(labelId);
	  }
	//List GET Method Requests
	
	/**
	 * Gets the list by id.
	 *
	 * @param listId the list id
	 * @param cards the cards
	 * @param card_fields the card_fields
	 * @param board the board
	 * @param board_fields the board_fields
	 * @param fields the fields
	 * @return the list by id
	 */
	@Processor
	public ListsByIdGetResponse getListById(String listId,@Optional String cards,@Optional String card_fields,@Optional String board ,@Optional String board_fields,@Optional String fields){
		return getClient().getListById(listId,cards,card_fields,board,board_fields,fields);
	}
	
	/**
	 * Gets the list field by id.
	 *
	 * @param listId the list id
	 * @param field the field
	 * @return the list field by id
	 */
	@Processor
	public ListsFieldByIdGetResponse getListFieldById(String listId,String field){
		return getClient().getListFieldById(listId,field);
	}
	
	/**
	 * Gets the list action by id.
	 *
	 * @param listId the list id
	 * @param entities the entities
	 * @param display the display
	 * @param filter the filter
	 * @param fields the fields
	 * @param limit the limit
	 * @param format the format
	 * @param since the since
	 * @param before the before
	 * @param page the page
	 * @param idModels the id models
	 * @param member the member
	 * @param member_fields the member_fields
	 * @param memberCreator the member creator
	 * @param memberCreator_fields the member creator_fields
	 * @return the list action by id
	 */
	@Processor
	public ListsActionsByIdGetResponse getListActionById(String listId,@Optional Boolean entities,@Optional Boolean display,@Optional String filter,@Optional String fields,@Optional Integer limit,@Optional String format,@Optional String since,@Optional String before,@Optional Integer page,@Optional String idModels,@Optional Boolean member,@Optional String member_fields,@Optional Boolean memberCreator,@Optional String memberCreator_fields){
		return getClient().getListActionById(listId,entities,display,filter,fields,limit,format,since,before,page,idModels,member,member_fields,memberCreator,memberCreator_fields);
	}
	
	/**
	 * Gets the list boards by id.
	 *
	 * @param listId the list id
	 * @param fields the fields
	 * @return the list boards by id
	 */
	@Processor
	public String getListBoardsById(String listId,@Optional String fields){
		return getClient().getListBoardsById(listId,fields);
	}
	
	/**
	 * Gets the list boards field by id.
	 *
	 * @param listId the list id
	 * @param field the field
	 * @return the list boards field by id
	 */
	@Processor
	public String getListBoardsFieldById(String listId, String field){
		return getClient().getListBoardsFieldById(listId,field);
	}
	
	/**
	 * Gets the lists cards by id.
	 *
	 * @param listId the list id
	 * @param actions the actions
	 * @param attachments the attachments
	 * @param attachment_fields the attachment_fields
	 * @param stickers the stickers
	 * @param members the members
	 * @param member_fields the member_fields
	 * @param checkItemStates the check item states
	 * @param checklists the checklists
	 * @param limit the limit
	 * @param since the since
	 * @param before the before
	 * @param filter the filter
	 * @param fields the fields
	 * @return the lists cards by id
	 */
	@Processor
	  public ListCardsGetResponse  getListsCardsById(String listId,@Optional String actions,@Optional String attachments,@Optional String attachment_fields,@Optional Boolean stickers,@Optional Boolean members,@Optional String member_fields,@Optional Boolean checkItemStates,@Optional String checklists,@Optional Integer limit,@Optional String since,@Optional String before,@Optional String filter,@Optional  String fields) {
	    return getClient().getListsCardsById(listId,actions,attachments,attachment_fields,stickers,members,member_fields,checkItemStates,checklists,limit,since,before,filter,fields);
	  }
	
	/**
	 * Gets the list cards filter by id.
	 *
	 * @param listId the list id
	 * @param filter the filter
	 * @return the list cards filter by id
	 */
	@Processor
	public String getListCardsFilterById(String listId, String filter){
		return getClient().getListCardsFilterById(listId,filter);
	}
	
	/**
	 * Update lists by id.
	 *
	 * @param listId the list id
	 * @param listsPutReq the lists put req
	 * @return the string
	 */
	//PUT methods for Lists
	@Processor
	  public String updateListsById(String listId,ListsByIdPutRequest listsPutReq) {
	    return getClient().updateListsById(listId,listsPutReq);
	  }
	
	/**
	 * Update lists closedd by id.
	 *
	 * @param listId the list id
	 * @param listsClosedPutReq the lists closed put req
	 * @return the string
	 */
	@Processor
	  public String updateListsCloseddById(String listId,ListsClosedByIdPutRequest listsClosedPutReq) {
	    return getClient().updateListsCloseddById(listId,listsClosedPutReq);
	  }
	
	/**
	 * Update lists boards by id.
	 *
	 * @param listId the list id
	 * @param listsBoardsPutReq the lists boards put req
	 * @return the string
	 */
	@Processor
	  public String updateListsBoardsById(String listId,ListsBoardsByIdPutRequest listsBoardsPutReq) {
	    return getClient().updateListsBoardsById(listId,listsBoardsPutReq);
	  }
	
	/**
	 * Update lists name by id.
	 *
	 * @param listId the list id
	 * @param listNamesPutReq the list names put req
	 * @return the string
	 */
	@Processor
	  public String updateListsNameById(String listId,ChecklistsNameByIdPutRequest listNamesPutReq) {
	    return getClient().updateListsNameById(listId,listNamesPutReq);
	  }
	
	/**
	 * Update lists position by id.
	 *
	 * @param listId the list id
	 * @param listPosPutReq the list pos put req
	 * @return the string
	 */
	@Processor
	  public String updateListsPositionById(String listId,ChecklistsPosByIdPutRequest listPosPutReq) {
	    return getClient().updateListsPositionById(listId,listPosPutReq);
	  }
	
	/**
	 * Update lists subscribed by id.
	 *
	 * @param listId the list id
	 * @param listSubscribedPutReq the list subscribed put req
	 * @return the string
	 */
	@Processor
	  public String updateListsSubscribedById(String listId,CardsSubscribedPutRequest listSubscribedPutReq) {
	    return getClient().updateListsSubscribedById(listId,listSubscribedPutReq);
	  }
	
	/**
	 * Post lists.
	 *
	 * @param listssPostReq the listss post req
	 * @return the string
	 */
	//POST lists methods
	@Processor
	  public String postLists(ListsPostRequest listssPostReq) {
	    return getClient().postLists(listssPostReq);
	  }
	
	/**
	 * Post lists cards by id.
	 *
	 * @param idList the id list
	 * @param listsCardsPostReq the lists cards post req
	 * @return the string
	 */
	@Processor
	  public String postListsCardsById(String idList,ListsCardsPostRequest listsCardsPostReq) {
	    return getClient().postListsCardsById(idList,listsCardsPostReq);
	  }
	
	/**
	 * Post lists moved cards by id.
	 *
	 * @param idList the id list
	 * @param listsMovedCardsPostReq the lists moved cards post req
	 * @return the string
	 */
	@Processor
	  public String postListsMovedCardsById(String idList,ListsMovedCardsPostRequest listsMovedCardsPostReq) {
	    return getClient().postListsMovedCardsById(idList,listsMovedCardsPostReq);
	  }
	
	/**
	 * Gets the notifications by id.
	 *
	 * @param notificationId the notification id
	 * @param display the display
	 * @param entities the entities
	 * @param fields the fields
	 * @param memberCreator the member creator
	 * @param memberCreator_fields the member creator_fields
	 * @param board the board
	 * @param board_fields the board_fields
	 * @param list the list
	 * @param card the card
	 * @param card_fields the card_fields
	 * @param organization the organization
	 * @param organization_fields the organization_fields
	 * @param member the member
	 * @param member_fields the member_fields
	 * @return the notifications by id
	 */
	//notifications GET methods
	@Processor
	  public String getNotificationsById(String notificationId,@Optional Boolean display,@Optional Boolean entities,@Optional String fields,@Optional String memberCreator,@Optional String memberCreator_fields,@Optional Boolean board,@Optional String board_fields,@Optional Boolean list,@Optional Boolean card,@Optional String card_fields,@Optional Boolean organization,@Optional String  organization_fields,@Optional Boolean member,@Optional String member_fields) {
	    return getClient().getNotificationsById( notificationId,  display,  entities,  fields,  memberCreator,  memberCreator_fields,  board,  board_fields,  list,  card,  card_fields,  organization,   organization_fields,  member,  member_fields);
	  }
	
	/**
	 * Gets the notifications with field by id.
	 *
	 * @param notificationId the notification id
	 * @param field the field
	 * @return the notifications with field by id
	 */
	@Processor
	  public String getNotificationsWithFieldById(String notificationId,String field) {
	    return getClient().getNotificationsWithById( notificationId,field);
	  }
	
	/**
	 * Gets the notifications boards by id.
	 *
	 * @param notificationId the notification id
	 * @param fields the fields
	 * @return the notifications boards by id
	 */
	@Processor
	  public String getNotificationsBoardsById(String notificationId,@Optional String fields) {
	    return getClient().getNotificationsBoardsById( notificationId,fields);
	  }
/**
 * Gets the notifications boards field by id.
 *
 * @param notificationId the notification id
 * @param field the field
 * @return the notifications boards field by id
 */
@Processor
	  public String getNotificationsBoardsFieldById(String notificationId,String field) {
		    return getClient().getNotificationsBoardsFieldById( notificationId,field);
		  }
	  
  	/**
  	 * Gets the notifications cards by id.
  	 *
  	 * @param notificationId the notification id
  	 * @param fields the fields
  	 * @return the notifications cards by id
  	 */
  	@Processor
	  public String getNotificationsCardsById(String notificationId,@Optional String fields) {
	    return getClient().getNotificationsCardsById( notificationId,fields);
	  }
	  
  	/**
  	 * Gets the notifications cards field by id.
  	 *
  	 * @param notificationId the notification id
  	 * @param field the field
  	 * @return the notifications cards field by id
  	 */
  	@Processor
	  public String getNotificationsCardsFieldById(String notificationId,String field) {
		    return getClient().getNotificationsCardsFieldById( notificationId,field);
		  }
	  
  	/**
  	 * Gets the notifications display by id.
  	 *
  	 * @param notificationId the notification id
  	 * @return the notifications display by id
  	 */
  	@Processor
	  public String getNotificationsDisplayById(String notificationId) {
		    return getClient().getNotificationsDisplayById( notificationId);
		  }
	  
  	/**
  	 * Gets the notifications entities by id.
  	 *
  	 * @param notificationId the notification id
  	 * @return the notifications entities by id
  	 */
  	@Processor
	  public String getNotificationsEntitiesById(String notificationId) {
		    return getClient().getNotificationsEntitiesById( notificationId);
		  }
	  
  	/**
  	 * Gets the notifications list by id.
  	 *
  	 * @param notificationId the notification id
  	 * @param fields the fields
  	 * @return the notifications list by id
  	 */
  	@Processor
	  public String getNotificationsListById(String notificationId,@Optional String fields) {
		    return getClient().getNotificationsListById(notificationId,fields);
		  }
	  
  	/**
  	 * Gets the notifications list field by id.
  	 *
  	 * @param notificationId the notification id
  	 * @param field the field
  	 * @return the notifications list field by id
  	 */
  	@Processor
	  public String getNotificationsListFieldById(String notificationId,String field) {
		    return getClient().getNotificationsListFieldById(notificationId,field);
		  }
	  
  	/**
  	 * Gets the member notifications by id.
  	 *
  	 * @param notificationId the notification id
  	 * @param fields the fields
  	 * @return the member notifications by id
  	 */
  	@Processor
	  public String getMemberNotificationsById(String notificationId,@Default("all") String fields) {
		    return getClient().getMemberNotificationsById(notificationId,fields);
		  }
	  
  	/**
  	 * Gets the member notifications field by id.
  	 *
  	 * @param notificationId the notification id
  	 * @param field the field
  	 * @return the member notifications field by id
  	 */
  	@Processor
	  public String getMemberNotificationsFieldById(String notificationId,String field) {
		    return getClient().getMemberNotificationsFieldById(notificationId,field);
		  }
	  
  	/**
  	 * Gets the member creator notifications by id.
  	 *
  	 * @param notificationId the notification id
  	 * @param fields the fields
  	 * @return the member creator notifications by id
  	 */
  	@Processor
	  public String getMemberCreatorNotificationsById(String notificationId,@Default("all")  String fields) {
		    return getClient().getMemberCreatorNotificationsById(notificationId,fields);
		  }
	  
  	/**
  	 * Gets the member creater notifications field by id.
  	 *
  	 * @param notificationId the notification id
  	 * @param field the field
  	 * @return the member creater notifications field by id
  	 */
  	@Processor
	  public String getMemberCreaterNotificationsFieldById(String notificationId,String field) {
		    return getClient().getMemberCreaterNotificationsFieldById(notificationId,field);
		  }
	  
  	/**
  	 * Gets the organizations notifications by id.
  	 *
  	 * @param notificationId the notification id
  	 * @param fields the fields
  	 * @return the organizations notifications by id
  	 */
  	@Processor
	  public String getOrganizationsNotificationsById(String notificationId,@Default("all")  String fields) {
		    return getClient().getOrganizationsNotificationsById(notificationId,fields);
		  }
	  
  	/**
  	 * Gets the organizations field notifications by id.
  	 *
  	 * @param notificationId the notification id
  	 * @param field the field
  	 * @return the organizations field notifications by id
  	 */
  	@Processor
	  public String getOrganizationsFieldNotificationsById(String notificationId,String field) {
		    return getClient().getOrganizationsFieldNotificationsById(notificationId,field);
		  }
	  
  	/**
  	 * Update notifications by id.
  	 *
  	 * @param notificationId the notification id
  	 * @param notificationsPutReq the notifications put req
  	 * @return the string
  	 */
  	//PUT Notifications methods
	  @Processor
	  public String updateNotificationsById(String notificationId,NotificationsByIdPutRequest notificationsPutReq) {
	    return getClient().updateNotificationsById(notificationId,notificationsPutReq);
	  }
	  
  	/**
  	 * Update unread notifications by id.
  	 *
  	 * @param notificationId the notification id
  	 * @param notificationsUnreadPutReq the notifications unread put req
  	 * @return the string
  	 */
  	@Processor
	  public String updateUnreadNotificationsById(String notificationId,NotificationsUnreadByIdPutRequest notificationsUnreadPutReq) {
	    return getClient().updateUnreadNotificationsById(notificationId,notificationsUnreadPutReq);
	  }
	  
  	/**
  	 * Post all notifications.
  	 *
  	 * @param notificationsPostReq the notifications post req
  	 * @return the string
  	 */
  	//POST notification method
	  @Processor
	  public String postAllNotifications(NotificationsPostRequest notificationsPostReq) {
	    return getClient().postAllNotifications(notificationsPostReq);
	  }
	  
  	/**
  	 * Gets the search query.
  	 *
  	 * @param query the query
  	 * @param idBoards the id boards
  	 * @param idOrganizations the id organizations
  	 * @param idCards the id cards
  	 * @param modelTypes the model types
  	 * @param board_fields the board_fields
  	 * @param card_fields the card_fields
  	 * @param boards_limit the boards_limit
  	 * @param cards_limit the cards_limit
  	 * @param cards_page the cards_page
  	 * @param card_board the card_board
  	 * @param card_list the card_list
  	 * @param card_members the card_members
  	 * @param card_stickers the card_stickers
  	 * @param card_attachments the card_attachments
  	 * @param organization_fields the organization_fields
  	 * @param organizations_limit the organizations_limit
  	 * @param member_fields the member_fields
  	 * @param members_limit the members_limit
  	 * @param partial the partial
  	 * @return the search query
  	 */
  	//Get Method requests for Search
	  @Processor
	  public String getSearchQuery(String query,@Optional String idBoards,@Optional String idOrganizations,@Optional String idCards,@Default("all") @Optional String modelTypes,@Optional String board_fields,@Optional String card_fields,@Optional Integer boards_limit,@Optional Integer cards_limit,@Optional Integer cards_page,@Default("false") @Optional Boolean card_board,@Default("false") @Optional String  card_list,@Default("false") @Optional Boolean card_members,@Default("false")@Optional Boolean card_stickers, @Default("false")@Optional String card_attachments,@Optional String organization_fields,@Default("10")@Optional Integer organizations_limit,@Optional String member_fields,@Default("10")@Optional Integer members_limit,@Default("false")@Optional Boolean partial) {
	    return getClient().getSearchQuery(query,idBoards,  idOrganizations,  idCards,  modelTypes,  board_fields,  card_fields,   boards_limit,  cards_limit,  cards_page,  card_board,   card_list,  card_members,  card_stickers,card_attachments,organization_fields,organizations_limit,member_fields,members_limit,partial);
	  }
	  
  	/**
  	 * Gets the search members.
  	 *
  	 * @param query the query
  	 * @param limit the limit
  	 * @param idBoard the id board
  	 * @param idOrganization the id organization
  	 * @param onlyOrgMembers the only org members
  	 * @return the search members
  	 */
  	@Processor
	  public String getSearchMembers(String query,@Optional String limit,@Optional String idBoard,@Optional String idOrganization,@Default("false") @Optional Boolean onlyOrgMembers) {
		    return getClient().getSearchMembers(query,limit,  idBoard,  idOrganization,  onlyOrgMembers);
	  }
	
	/**
	 * Gets the sessions socket.
	 *
	 * @return the sessions socket
	 */
	//Session Get method
	  @Processor
	  public String getSessionsSocket() {
		    return getClient().getSessionsSocket();
	  }
	  
  	/**
  	 * Update session by id.
  	 *
  	 * @param sessionId the session id
  	 * @param sessionByIdPutReq the session by id put req
  	 * @return the string
  	 */
  	//PUT Sessions methods
	  @Processor
	  public String updateSessionById(String sessionId,SessionByIdPutRequest sessionByIdPutReq) {
	    return getClient().updateSessionById(sessionId,sessionByIdPutReq);
	  }
	  
  	/**
  	 * Update session status by id.
  	 *
  	 * @param sessionId the session id
  	 * @param sessionStatusByIdPutReq the session status by id put req
  	 * @return the string
  	 */
  	@Processor
	  public String updateSessionStatusById(String sessionId,SessionStatusByIdPutRequest sessionStatusByIdPutReq) {
	    return getClient().updateSessionStatusById(sessionId,sessionStatusByIdPutReq);
	  }
	  
  	/**
  	 * Post sessions.
  	 *
  	 * @param sessionsPOstReq the sessions p ost req
  	 * @return the string
  	 */
  	//post session methods
	  @Processor
	  public String postSessions(SessionsPostRequest sessionsPOstReq) {
	    return getClient().postSessions(sessionsPOstReq);
	  }
	 
 	/**
 	 * Gets the tokens by token.
 	 *
 	 * @param token the token
 	 * @param fields the fields
 	 * @param webhooks the webhooks
 	 * @return the tokens by token
 	 */
 	//Token GET methods
	  @Processor
	  public TokensGetResponse getTokensByToken(String token,@Optional String fields,@Optional Boolean webhooks) {
		    return getClient().getTokensByToken(token,fields,webhooks);
	  }
	  
  	/**
  	 * Gets the tokens field by token.
  	 *
  	 * @param token the token
  	 * @param field the field
  	 * @return the tokens field by token
  	 */
  	@Processor
	  public String getTokensFieldByToken(String token,String field) {
		    return getClient().getTokensFieldByToken(token,field);
	  }
	  
  	/**
  	 * Gets the member token by token.
  	 *
  	 * @param token the token
  	 * @param fields the fields
  	 * @return the member token by token
  	 */
  	@Processor
	  public String getMemberTokenByToken(String token,@Optional String fields) {
		    return getClient().getMemberTokenByToken(token,fields);
	  }
	  
  	/**
  	 * Gets the member field token by token.
  	 *
  	 * @param token the token
  	 * @param field the field
  	 * @return the member field token by token
  	 */
  	@Processor
	  public String getMemberFieldTokenByToken(String token,String field) {
		    return getClient().getMemberFieldTokenByToken(token,field);
	  }
	  
  	/**
  	 * Gets the tokens webhooks.
  	 *
  	 * @param token the token
  	 * @return the tokens webhooks
  	 */
  	@Processor
	  public String getTokensWebhooks(String token) {
		    return getClient().getTokensWebhooks(token);
	  }
	  
  	/**
  	 * Gets the tokens webhooks by webhook id.
  	 *
  	 * @param token the token
  	 * @param idWebhook the id webhook
  	 * @return the tokens webhooks by webhook id
  	 */
  	@Processor
	  public String getTokensWebhooksByWebhookId(String token,String idWebhook) {
		    return getClient().getTokensWebhooksByWebhookId(token,idWebhook);
	  }
	  
  	/**
  	 * Update token webhook by token.
  	 *
  	 * @param token the token
  	 * @param tokensPutReq the tokens put req
  	 * @return the string
  	 */
  	//PUT Token methods
	  @Processor
	  public String updateTokenWebhookByToken(String token,TokensPutRequest tokensPutReq) {
	    return getClient().updateTokenWebhookByToken(token,tokensPutReq);
	  }
	  
  	/**
  	 * Post token webhook by token.
  	 *
  	 * @param token the token
  	 * @param tokensPutReq the tokens put req
  	 * @return the string
  	 */
  	//POST Token Method
	  @Processor
	  public String postTokenWebhookByToken(String token,TokensPutRequest tokensPutReq) {
	    return getClient().postTokenWebhookByToken(token,tokensPutReq);
	  }
	  
  	/**
  	 * Delete token by token.
  	 *
  	 * @param token the token
  	 * @return the status response
  	 */
  	//DELETE
	  @Processor
	  public StatusResponse deleteTokenByToken(String token) {
	    return getClient().deleteTokenByToken(token);
	  }
	  
  	/**
  	 * Delete token webhook by token.
  	 *
  	 * @param token the token
  	 * @param idWebhook the id webhook
  	 * @return the status response
  	 */
  	@Processor
	  public StatusResponse deleteTokenWebhookByToken(String token,String idWebhook) {
	    return getClient().deleteTokenWebhookByToken(token,idWebhook);
	  }
	  
  	/**
  	 * Gets the type by id.
  	 *
  	 * @param typeId the type id
  	 * @return the type by id
  	 */
  	//Get Types
	  @Processor
	  public TypesGetResponse getTypeById(String typeId) {
	    return getClient().getTypeById(typeId);
	  }
	  
  	/**
  	 * Gets the webhooks by id.
  	 *
  	 * @param idWebhook the id webhook
  	 * @return the webhooks by id
  	 */
  	//WebHooks GET Methods
	  @Processor
	  public String getWebhooksById(String idWebhook) {
	    return getClient().getWebhooksById(idWebhook);
	  }
	  
  	/**
  	 * Gets the webhooks field by id.
  	 *
  	 * @param idWebhook the id webhook
  	 * @param field the field
  	 * @return the webhooks field by id
  	 */
  	@Processor
	  public String getWebhooksFieldById(String idWebhook,String field) {
	    return getClient().getWebhooksFieldById(idWebhook,field);
	  }
	  
  	/**
  	 * Update webhook by id.
  	 *
  	 * @param idWebhook the id webhook
  	 * @param webhooksByIdPutReq the webhooks by id put req
  	 * @return the string
  	 */
  	//PUT Webhooks
	  @Processor
	  public String updateWebhookById(String idWebhook,WebhooksByIdPutRequest webhooksByIdPutReq) {
	    return getClient().updateWebhookById(idWebhook,webhooksByIdPutReq);
	  }
	  
  	/**
  	 * Update webhook.
  	 *
  	 * @param webhookPutReq the webhook put req
  	 * @return the string
  	 */
  	@Processor
	  public String updateWebhook(WebhooksPutRequest webhookPutReq) {
	    return getClient().updateWebhook(webhookPutReq);
	  }
	  
  	/**
  	 * Update active webhook.
  	 *
  	 * @param idWebhook the id webhook
  	 * @param webhooksActivePutReq the webhooks active put req
  	 * @return the string
  	 */
  	@Processor
	  public String updateActiveWebhook(String idWebhook,WebhooksActivePutRequest webhooksActivePutReq) {
	    return getClient().updateActiveWebhook(idWebhook,webhooksActivePutReq);
	  }
	  
  	/**
  	 * Update callback url webhook.
  	 *
  	 * @param idWebhook the id webhook
  	 * @param webhooksCallbackActivePutReq the webhooks callback active put req
  	 * @return the string
  	 */
  	@Processor
	  public String updateCallbackURLWebhook(String idWebhook,WebhooksCallBackURLPutRequest webhooksCallbackActivePutReq) {
	    return getClient().updateCallbackURLWebhook(idWebhook,webhooksCallbackActivePutReq);
	  }
	  
  	/**
  	 * Update webhook description.
  	 *
  	 * @param idWebhook the id webhook
  	 * @param webhooksDescPutReq the webhooks desc put req
  	 * @return the string
  	 */
  	@Processor
	  public String updateWebhookDescription(String idWebhook,WebhooksDescPutRequest webhooksDescPutReq) {
	    return getClient().updateWebhookDescription(idWebhook,webhooksDescPutReq);
	  }
	  
  	/**
  	 * Update webhooks id model.
  	 *
  	 * @param idWebhook the id webhook
  	 * @param webhooksDescPutReq the webhooks desc put req
  	 * @return the string
  	 */
  	@Processor
	  public String updateWebhooksIdModel(String idWebhook,WebhooksDescPutRequest webhooksDescPutReq) {
	    return getClient().updateWebhooksIdModel(idWebhook,webhooksDescPutReq);
	  }
	  
  	/**
  	 * Post webhook.
  	 *
  	 * @param webhooksPostReq the webhooks post req
  	 * @return the string
  	 */
  	//POST Webhooks
	  @Processor
	  public String postWebhook(WebhooksPutRequest webhooksPostReq) {
	    return getClient().postWebhook(webhooksPostReq);
	  }
	  
  	/**
  	 * Delete webhook by id.
  	 *
  	 * @param idWebhook the id webhook
  	 * @return the status response
  	 */
  	//DELETE webhooks
	  @Processor
	  public StatusResponse deleteWebhookById(String idWebhook) {
	    return  getClient().deleteWebhookById(idWebhook);
	  }
	  
  	/**
  	 * Gets the organization by id.
  	 *
  	 * @param OrganizationId the organization id
  	 * @param actions the actions
  	 * @param actions_entities the actions_entities
  	 * @param actions_display the actions_display
  	 * @param actions_limit the actions_limit
  	 * @param action_fields the action_fields
  	 * @param memberships the memberships
  	 * @param memberships_member the memberships_member
  	 * @param memberships_member_fields the memberships_member_fields
  	 * @param members the members
  	 * @param member_fields the member_fields
  	 * @param member_activity the member_activity
  	 * @param membersInvited the members invited
  	 * @param membersInvited_fields the members invited_fields
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
  	 * @param paid_account the paid_account
  	 * @param fields the fields
  	 * @return the organization by id
  	 */
  	//Organization GET Methods
	  @Processor
	  public OrganizationGetResponse getOrganizationById(String OrganizationId,@Optional String actions,@Optional Boolean actions_entities,@Optional Boolean actions_display,@Optional Integer actions_limit,@Optional String action_fields,@Optional String memberships,@Optional Boolean memberships_member,@Optional String memberships_member_fields,@Optional String members,@Optional String member_fields,@Optional Boolean  member_activity, @Optional String membersInvited,@Optional String membersInvited_fields, @Optional String boards,@Optional String board_fields,@Optional String board_actions,@Optional Boolean board_actions_entities,@Optional Boolean board_actions_display,@Optional String board_actions_format,@Optional String board_actions_since,@Optional Integer board_actions_limit,@Optional String board_action_fields,@Optional String board_lists,@Optional String paid_account,@Optional String fields) {
	    return getClient().getOrganizationById(OrganizationId,actions,  actions_entities,  actions_display,  actions_limit,action_fields,memberships,memberships_member,memberships_member_fields,members,member_fields,member_activity,membersInvited,membersInvited_fields,boards,board_fields,board_actions,board_actions_entities,board_actions_display,board_actions_format,board_actions_since,board_actions_limit,board_action_fields,board_lists,paid_account,fields);
	  }
	  
  	/**
  	 * Gets the organization by id and field.
  	 *
  	 * @param OrganizationId the organization id
  	 * @param field the field
  	 * @return the organization by id and field
  	 */
  	@Processor
	  public String getOrganizationByIdAndField(String OrganizationId,String field) {
	    return getClient().getOrganizationByIdAndField(OrganizationId,field);
	  }
	  
  	/**
  	 * Gets the organization actions by id.
  	 *
  	 * @param OrganizationId the organization id
  	 * @param entities the entities
  	 * @param display the display
  	 * @param filter the filter
  	 * @param fields the fields
  	 * @param limit the limit
  	 * @param format the format
  	 * @param since the since
  	 * @param before the before
  	 * @param page the page
  	 * @param idModels the id models
  	 * @param member the member
  	 * @param member_fields the member_fields
  	 * @param memberCreator the member creator
  	 * @param memberCreator_fields the member creator_fields
  	 * @return the organization actions by id
  	 */
  	@Processor
	  public OrganizationActionGetResponse getOrganizationActionsById(String OrganizationId,@Optional Boolean entities,@Optional Boolean display,@Optional String filter ,@Optional String fields,@Optional Integer limit,@Optional String format,@Optional String since,@Optional String before,@Optional String page,@Optional String idModels ,@Optional Boolean member,@Optional String member_fields,@Optional Boolean memberCreator,@Optional String memberCreator_fields) {
	    return getClient().getOrganizationActionsById(OrganizationId,  entities,  display,  filter ,  fields,  limit,  format,  since,  before,  page,  idModels ,  member,  member_fields,  memberCreator,  memberCreator_fields);
	  }
	  
  	/**
  	 * Gets the organization boards by id.
  	 *
  	 * @param OrganizationId the organization id
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
  	 * @return the organization boards by id
  	 */
  	@Processor
	  public OrganizationBoardsGetResponse getOrganizationBoardsById(String OrganizationId,@Optional String filter,@Optional String fields,@Optional String actions ,@Optional Boolean actions_entities,@Optional Integer actions_limit,@Optional String actions_format,@Optional String actions_since,@Optional String action_fields,@Optional String memberships,@Optional Boolean organization ,@Optional String organization_fields,@Optional String lists) {
	    return getClient().getOrganizationBoardsById(OrganizationId,  filter,  fields,  actions ,  actions_entities,  actions_limit,  actions_format,  actions_since,  action_fields,  memberships,  organization ,  organization_fields,  lists);
	  }
	  
  	/**
  	 * Gets the organization boards by id with filter.
  	 *
  	 * @param OrganizationId the organization id
  	 * @param filter the filter
  	 * @return the organization boards by id with filter
  	 */
  	@Processor
	  public String getOrganizationBoardsByIdWithFilter(String OrganizationId,String filter) {
	    return getClient().getOrganizationBoardsByIdWithFilter(OrganizationId,filter);
	  }
	  
  	/**
  	 * Gets the organization deltas by id.
  	 *
  	 * @param OrganizationId the organization id
  	 * @param tags the tags
  	 * @param ixLastUpdate the ix last update
  	 * @return the organization deltas by id
  	 */
  	@Processor
	  public String getOrganizationDeltasById(String OrganizationId,String tags,@Optional String ixLastUpdate) {
	    return getClient().getOrganizationDeltasById(OrganizationId,tags,ixLastUpdate);
	  }
	  
  	/**
  	 * Gets the organization members by id.
  	 *
  	 * @param OrganizationId the organization id
  	 * @param filters the filters
  	 * @param fields the fields
  	 * @param activity the activity
  	 * @return the organization members by id
  	 */
  	@Processor
	  public OrganizationMemberResponse getOrganizationMembersById(String OrganizationId,@Optional String filters,@Optional String fields,@Optional Boolean activity) {
	    return getClient().getOrganizationMembersById(OrganizationId,filters,fields,activity);
	  }
	  
  	/**
  	 * Gets the organization members by id with filter.
  	 *
  	 * @param OrganizationId the organization id
  	 * @param filter the filter
  	 * @return the organization members by id with filter
  	 */
  	@Processor
	  public OrganizationMemberResponse getOrganizationMembersByIdWithFilter(String OrganizationId,String filter) {
	    return getClient().getOrganizationMembersByIdWithFilter(OrganizationId,filter);
	  }
	  
  	/**
  	 * Gets the organization members cards by id.
  	 *
  	 * @param OrganizationId the organization id
  	 * @param idMember the id member
  	 * @param actions the actions
  	 * @param attachments the attachments
  	 * @param attachment_fields the attachment_fields
  	 * @param members the members
  	 * @param member_fields the member_fields
  	 * @param checkItemStates the check item states
  	 * @param checklists the checklists
  	 * @param board the board
  	 * @param board_fields the board_fields
  	 * @param list the list
  	 * @param list_fields the list_fields
  	 * @param filter the filter
  	 * @param fields the fields
  	 * @return the organization members cards by id
  	 */
  	@Processor
	  public String getOrganizationMembersCardsById(String OrganizationId,String idMember,@Optional String actions,@Optional String attachments ,@Optional String attachment_fields,@Optional Boolean members,@Optional String member_fields,@Optional Boolean checkItemStates,@Optional String checklists,@Optional Boolean board,@Optional String board_fields ,@Optional String list,@Optional String list_fields,@Optional String filter,@Optional String fields) {
	    return getClient().getOrganizationMembersCardsById(OrganizationId,  idMember,  actions,  attachments,  attachment_fields,  members,  member_fields,  checkItemStates,  checklists,  board ,  board_fields,list,fields,filter);
	  }
	  
  	/**
  	 * Gets the organization members invited by id.
  	 *
  	 * @param OrganizationId the organization id
  	 * @param fields the fields
  	 * @return the organization members invited by id
  	 */
  	@Processor
	  public String getOrganizationMembersInvitedById(String OrganizationId,@Optional String fields) {
	    return getClient().getOrganizationMembersInvitedById(OrganizationId,fields);
	  }
	  
  	/**
  	 * Gets the organization members invited by id with field.
  	 *
  	 * @param OrganizationId the organization id
  	 * @param field the field
  	 * @return the organization members invited by id with field
  	 */
  	@Processor
	  public String getOrganizationMembersInvitedByIdWithField(String OrganizationId,String field) {
	    return getClient().getOrganizationMembersInvitedByIdWithField(OrganizationId,field);
	  }
	  
  	/**
  	 * Gets the organization memberships by id.
  	 *
  	 * @param OrganizationId the organization id
  	 * @param filter the filter
  	 * @param member the member
  	 * @param member_fields the member_fields
  	 * @return the organization memberships by id
  	 */
  	@Processor
	  public String getOrganizationMembershipsById(String OrganizationId,@Optional String filter,@Optional Boolean member,@Optional String member_fields ) {
	    return getClient().getOrganizationMembershipsById(OrganizationId,filter,member,member_fields);
	  }
	  
  	/**
  	 * Gets the organization memberships by membership id.
  	 *
  	 * @param OrganizationId the organization id
  	 * @param idMembership the id membership
  	 * @param member the member
  	 * @param member_fields the member_fields
  	 * @return the organization memberships by membership id
  	 */
  	@Processor
	  public String getOrganizationMembershipsByMembershipId(String OrganizationId,String idMembership,@Optional Boolean member,@Optional String member_fields ) {
	    return getClient().getOrganizationMembershipsByMembershipId(OrganizationId,idMembership,member,member_fields);
	  }
	  
  	/**
  	 * Update organizations by id or name.
  	 *
  	 * @param OrganizationId the organization id
  	 * @param organizationPutReq the organization put req
  	 * @return the string
  	 */
  	//organization put methods
	  @Processor
	  public String updateOrganizationsByIdOrName(String organizationId,OrganizationPutRequest organizationPutReq) {
	    return getClient().updateOrganizationsById(organizationId,organizationPutReq);
	  }
	  
  	/**
  	 * Update organizations desc by id or name.
  	 *
  	 * @param OrganizationIdOrName the organization id or name
  	 * @param updateOrgDecPutReq the update org dec put req
  	 * @return the string
  	 */
  	@Processor
	  public String updateOrganizationsDescByIdOrName(String OrganizationIdOrName,OrganizationDescPutRequest updateOrgDecPutReq) {
	    return getClient().updateOrganizationsDescByIdOrName(OrganizationIdOrName,updateOrgDecPutReq);
	  }
	  
  	/**
  	 * Update organizations display name id or name.
  	 *
  	 * @param OrganizationIdOrName the organization id or name
  	 * @param updateOrgDisplayName the update org display name
  	 * @return the string
  	 */
  	@Processor
	  public String updateOrganizationsDisplayNameIdOrName(String OrganizationIdOrName,OrganizationDisplayNamePutRequest updateOrgDisplayName) {
	    return getClient().updateOrganizationsDisplayNameIdOrName(OrganizationIdOrName,updateOrgDisplayName);
	  }
	  
  	/**
  	 * Update organizations members by id or name.
  	 *
  	 * @param OrganizationIdOrName the organization id or name
  	 * @param updateOrgMembersPutReq the update org members put req
  	 * @return the string
  	 */
  	@Processor
	  public String updateOrganizationsMembersByIdOrName(String OrganizationIdOrName,OrganizationMembersPutRequest updateOrgMembersPutReq) {
	    return getClient().updateOrganizationsMembersByIdOrName(OrganizationIdOrName,updateOrgMembersPutReq);
	  }
	  
  	/**
  	 * Update organizations members by memberid.
  	 *
  	 * @param OrganizationIdOrName the organization id or name
  	 * @param idMember the id member
  	 * @param updateOrgMembersByIdPutReq the update org members by id put req
  	 * @return the string
  	 */
  	@Processor
	  public String updateOrganizationsMembersByMemberid(String OrganizationIdOrName,String idMember,OrganizationMemberIdPutRequest updateOrgMembersByIdPutReq) {
	    return getClient().updateOrganizationsMembersByMemberid(OrganizationIdOrName,idMember,updateOrgMembersByIdPutReq);
	  }
	  
  	/**
  	 * Deactivate organization member by id.
  	 *
  	 * @param OrganizationIdOrName the organization id or name
  	 * @param idMember the id member
  	 * @param deactivatedOrgMembersByIdPutReq the deactivated org members by id put req
  	 * @return the string
  	 */
  	@Processor
	  public String deactivateOrganizationMemberById(String OrganizationIdOrName,String idMember,OrganizationMemberDeactivatedPutRequest deactivatedOrgMembersByIdPutReq) {
	    return getClient().deactivateOrganizationMemberById(OrganizationIdOrName,idMember,deactivatedOrgMembersByIdPutReq);
	  }
	  
  	/**
  	 * Put organization membership by id.
  	 *
  	 * @param OrganizationIdOrName the organization id or name
  	 * @param idMember the id member
  	 * @param memberShipsputReq the member shipsput req
  	 * @return the string
  	 */
  	@Processor
	  public String putOrganizationMembershipById(String OrganizationIdOrName,String idMember,OrganizationMembershipPutRequest memberShipsputReq) {
	    return getClient().putOrganizationMembershipById(OrganizationIdOrName,idMember,memberShipsputReq);
	  }
	  
  	/**
  	 * Update organizations name by id or name.
  	 *
  	 * @param OrganizationIdOrName the organization id or name
  	 * @param updateOrgNamePutReq the update org name put req
  	 * @return the string
  	 */
  	@Processor
	  public String updateOrganizationsNameByIdOrName(String OrganizationIdOrName,OrganizationDisplayNamePutRequest updateOrgNamePutReq) {
	    return getClient().updateOrganizationsNameByIdOrName(OrganizationIdOrName,updateOrgNamePutReq);
	  }
	  
  	/**
  	 * Update organization associated domain.
  	 *
  	 * @param OrganizationIdOrName the organization id or name
  	 * @param orgAssociatedDomainPutReq the org associated domain put req
  	 * @return the string
  	 */
  	@Processor
	  public String updateOrganizationAssociatedDomain(String OrganizationIdOrName,OrganizationAssociatedDomainPutRequest orgAssociatedDomainPutReq) {
	    return getClient().updateOrganizationAssociatedDomain(OrganizationIdOrName,orgAssociatedDomainPutReq);
	  }
	  
  	/**
  	 * Update org organization board visibility restrict.
  	 *
  	 * @param OrganizationIdOrName the organization id or name
  	 * @param orgVisibilityRestrictPutReq the org visibility restrict put req
  	 * @return the string
  	 */
  	@Processor
	  public String updateOrgOrganizationBoardVisibilityRestrict(String OrganizationIdOrName,OrganizationBoardVisibilityRestrictPutRequest orgVisibilityRestrictPutReq) {
	    return getClient().updateOrgOrganizationBoardVisibilityRestrict(OrganizationIdOrName,orgVisibilityRestrictPutReq);
	  }
	  
  	/**
  	 * Update private organization board visibility restrict.
  	 *
  	 * @param OrganizationIdOrName the organization id or name
  	 * @param orgVisibilityRestrictPutReq the org visibility restrict put req
  	 * @return the string
  	 */
  	@Processor
	  public String updatePrivateOrganizationBoardVisibilityRestrict(String OrganizationIdOrName,OrganizationBoardVisibilityRestrictPutRequest orgVisibilityRestrictPutReq) {
	    return getClient().updatePrivateOrganizationBoardVisibilityRestrict(OrganizationIdOrName,orgVisibilityRestrictPutReq);
	  }
	  
  	/**
  	 * Update public organization board visibility restrict.
  	 *
  	 * @param OrganizationIdOrName the organization id or name
  	 * @param orgVisibilityRestrictPutReq the org visibility restrict put req
  	 * @return the string
  	 */
  	@Processor
	  public String updatePublicOrganizationBoardVisibilityRestrict(String OrganizationIdOrName,OrganizationBoardVisibilityRestrictPutRequest orgVisibilityRestrictPutReq) {
	    return getClient().updatePublicOrganizationBoardVisibilityRestrict(OrganizationIdOrName,orgVisibilityRestrictPutReq);
	  }
	  
  	/**
  	 * Update org external members disabled.
  	 *
  	 * @param OrganizationIdOrName the organization id or name
  	 * @param orgExternalMemDisabledPutReq the org external mem disabled put req
  	 * @return the string
  	 */
  	@Processor
	  public String updateOrgExternalMembersDisabled(String OrganizationIdOrName,OrganizationExternalMembersDisabledPutRequest orgExternalMemDisabledPutReq) {
	    return getClient().updateOrgExternalMembersDisabled(OrganizationIdOrName,orgExternalMemDisabledPutReq);
	  }
	  
  	/**
  	 * Update org google app version.
  	 *
  	 * @param OrganizationIdOrName the organization id or name
  	 * @param orgExternalMemDisabledPutReq the org external mem disabled put req
  	 * @return the string
  	 */
  	@Processor
	  public String updateOrgGoogleAppVersion(String OrganizationIdOrName,OrganizationGoogleAppVersionPutRequest orgExternalMemDisabledPutReq) {
	    return getClient().updateOrgGoogleAppVersion(OrganizationIdOrName,orgExternalMemDisabledPutReq);
	  }
	  
  	/**
  	 * Update org invite restrict.
  	 *
  	 * @param OrganizationIdOrName the organization id or name
  	 * @param orgInviteRestrictPutReq the org invite restrict put req
  	 * @return the string
  	 */
  	@Processor
	  public String updateOrgInviteRestrict(String OrganizationIdOrName,OrganizationInviteRestrictPutRequest orgInviteRestrictPutReq) {
	    return getClient().updateOrgInviteRestrict(OrganizationIdOrName,orgInviteRestrictPutReq);
	  }
	  
  	/**
  	 * Update org permission level.
  	 *
  	 * @param OrganizationIdOrName the organization id or name
  	 * @param orgPermissionLevelRestrictPutReq the org permission level restrict put req
  	 * @return the string
  	 */
  	@Processor
	  public String updateOrgPermissionLevel(String OrganizationIdOrName,OrganizationPermissionLevelPutRequest orgPermissionLevelRestrictPutReq) {
	    return getClient().updateOrgPermissionLevel(OrganizationIdOrName,orgPermissionLevelRestrictPutReq);
	  }
	  
  	/**
  	 * Update org website.
  	 *
  	 * @param OrganizationIdOrName the organization id or name
  	 * @param orgPermissionLevelRestrictPutReq the org permission level restrict put req
  	 * @return the string
  	 */
  	@Processor
	  public String updateOrgWebsite(String OrganizationIdOrName,OrganizationPermissionLevelPutRequest orgPermissionLevelRestrictPutReq) {
	    return getClient().updateOrgWebsite(OrganizationIdOrName,orgPermissionLevelRestrictPutReq);
	  }
	  
	  /**
  	 * Post organizations.
  	 *
  	 * @param organizationPostReq the organization post req
  	 * @return the string
  	 */
  	//Orgabnization POST methods
	  @Processor
	  public String postOrganizations(OrganizationPostRequest organizationPostReq) {
	    return getClient().postOrganizations(organizationPostReq);
	  }
	  
  	/**
  	 * Post organizations logo by id or name.
  	 *
  	 * @param orgIdOrName the org id or name
  	 * @param organizationLogoPostReq the organization logo post req
  	 * @return the string
  	 */
  	@Processor
	  public String postOrganizationsLogoByIdOrName(String orgIdOrName,OrganizationLogoPostRequest organizationLogoPostReq) {
	    return getClient().postOrganizationsLogoByIdOrName(orgIdOrName,organizationLogoPostReq);
	  }
	  
	  //Organization DELETE methods
	  
	  /**
  	 * Delete organizations by id or name.
  	 *
  	 * @param orgIdOrName the org id or name
  	 * @return the status response
  	 */
  	@Processor
	  public StatusResponse deleteOrganizationsByIdOrName(String orgIdOrName) {
	    return getClient().deleteOrganizationsByIdOrName(orgIdOrName);
	  }
	  
  	/**
  	 * Delete organizations logo by id or name.
  	 *
  	 * @param orgIdOrName the org id or name
  	 * @return the status response
  	 */
  	@Processor
	  public StatusResponse deleteOrganizationsLogoByIdOrName(String orgIdOrName) {
	    return getClient().deleteOrganizationsLogoByIdOrName(orgIdOrName);
	  }
	  
  	/**
  	 * Delete member from organization by id or name.
  	 *
  	 * @param orgIdOrName the org id or name
  	 * @param idMember the id member
  	 * @return the status response
  	 */
  	@Processor
	  public StatusResponse deleteMemberFromOrganizationByIdOrName(String orgIdOrName,String idMember) {
	    return getClient().deleteMemberFromOrganizationByIdOrName(orgIdOrName,idMember);
	  }
	  
  	/**
  	 * Delete member from all organizations by id or name.
  	 *
  	 * @param orgIdOrName the org id or name
  	 * @param idMember the id member
  	 * @return the status response
  	 */
  	@Processor
	  public StatusResponse deleteMemberFromAllOrganizationsByIdOrName(String orgIdOrName,String idMember) {
	    return getClient().deleteMemberFromAllOrganizationsByIdOrName(orgIdOrName,idMember);
	  }
	  
  	/**
  	 * Delete organizations associated domain by id or name.
  	 *
  	 * @param orgIdOrName the org id or name
  	 * @return the status response
  	 */
  	@Processor
	  public StatusResponse deleteOrganizationsAssociatedDomainByIdOrName(String orgIdOrName) {
	    return getClient().deleteOrganizationsAssociatedDomainByIdOrName(orgIdOrName);
	  }
	  
  	/**
  	 * Delete organizations org invite req by id or name.
  	 *
  	 * @param orgIdOrName the org id or name
  	 * @return the status response
  	 */
  	@Processor
	  public StatusResponse deleteOrganizationsOrgInviteReqByIdOrName(String orgIdOrName) {
	    return getClient().deleteOrganizationsOrgInviteReqByIdOrName(orgIdOrName);
	  }
	  
  	/**
  	 * Gets the member by id or username.
  	 *
  	 * @param id the id
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
  	//Members API 
	  @Processor
		public MemberIdGetResponse getMemberByIdOrUsername(String id, @Optional String actions,  @Default("false") Boolean actions_entities,
				 @Default("false") Boolean actions_display,  @Default("50") String actions_limit,  @Default("all") String action_fields, @Optional String action_since, @Optional String action_before,  @Default("none") String cards,  @Default("all") String card_fields,  @Default("false") Boolean card_members, @Optional String card_member_fields,  @Default("false") String card_attachments, @Optional String card_attachment_fields,  @Default("false") Boolean card_stickers, @Optional String boards, @Optional String board_fields, @Optional String board_actions,  @Default("false") Boolean board_actions_entities, @Default("false") Boolean board_actions_display, @Default("list") String board_actions_format, @Optional String board_actions_since, @Default("50") String board_actions_limit, @Default("all") String board_action_fields, @Default("none") String  board_lists, @Default("none") String board_memberships, @Default("false") Boolean board_organization, @Optional String board_organization_fields, @Optional String boardsInvited, @Optional String boardsInvited_fields, @Default("false") Boolean boardStars, @Default("false") Boolean savedSearches, @Default("none") String organizations, @Default("all") String organization_fields, @Default("false") Boolean organization_paid_account, @Default("none") String organizationsInvited, @Default("all") String organizationsInvited_fields, @Optional String notifications, @Default("false") Boolean notifications_entities, @Default("false") Boolean notifications_display, @Default("50") String notifications_limit, @Default("all") String notification_fields, @Default("true") Boolean notification_memberCreator, @Optional String notification_memberCreator_fields, @Optional String notification_before, @Optional String notification_since, @Default("none") String tokens, @Default("false") Boolean paid_account, @Default("none") String boardBackgrounds, @Default("none") String customBoardBackgrounds, @Default("none") String customStickers, @Default("none") String customEmoji, @Default("all") String fields){
			return getClient().getMemberByIdOrUsername(id,actions,    actions_entities,
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
					   customBoardBackgrounds,   customStickers,   customEmoji,  fields);
		}
		
		/**
		 * Gets the members by id or username and field.
		 *
		 * @param id the id
		 * @param field the field
		 * @return the members by id or username and field
		 */
		@Processor
		public String getMembersByIdOrUsernameAndField(String id, String field){
			return getClient().getMembersByIdOrUsernameAndField(id, field);
		}
		
		/**
		 * Gets the member actions by id or username.
		 *
		 * @param id the id
		 * @param entities the entities
		 * @param display the display
		 * @param filter the filter
		 * @param fields the fields
		 * @param limit the limit
		 * @param format the format
		 * @param since the since
		 * @param before the before
		 * @param page the page
		 * @param idModels the id models
		 * @param member the member
		 * @param member_fields the member_fields
		 * @param memberCreator the member creator
		 * @param memberCreator_fields the member creator_fields
		 * @return the member actions by id or username
		 */
		@Processor
		public MemberActionsByIdOrUsernameGetResponse getMemberActionsByIdOrUsername(String id, @Default("false") Boolean entities,  @Default("false") Boolean display, @Default("all") String filter, @Default("all") String fields, @Default("50") String limit, @Default("list") String format, @Optional String since, @Optional String before, @Default("0") String page, @Optional String idModels, @Default("true") Boolean member, @Optional String member_fields, @Default("true") Boolean memberCreator, @Optional String memberCreator_fields){
			
			return getClient().getMemberActionsByIdOrUsername(id, entities,  display, filter, fields, limit, format, since, before, page, idModels, member, member_fields, memberCreator, memberCreator_fields);
		}
		
		/**
		 * Gets the board back grounds.
		 *
		 * @param id the id
		 * @param filter the filter
		 * @return the board back grounds
		 */
		@Processor
		public String getBoardBackGrounds(String id, @Default("all") String filter){
			return getClient().getBoardBackGrounds(id, filter);
		}
		
		/**
		 * Gets the board back grounds by id.
		 *
		 * @param id the id
		 * @param idBoardBackground the id board background
		 * @param filter the filter
		 * @return the board back grounds by id
		 */
		@Processor
		public String getBoardBackGroundsById(String id, String idBoardBackground, @Default("all") String filter){
			return getClient().getBoardBackGroundsById(id, idBoardBackground, filter);
		}	
		
		/**
		 * Gets the board stars.
		 *
		 * @param id the id
		 * @return the board stars
		 */
		@Processor
		public String getBoardStars(String id){
			return getClient().getBoardStars(id);
		}
		
		/**
		 * Gets the board stars by id.
		 *
		 * @param id the id
		 * @param idBoardStar the id board star
		 * @return the board stars by id
		 */
		@Processor
		public String getBoardStarsById(String id, String idBoardStar){
			return getClient().getBoardStarsById(id, idBoardStar);
		}
		
		/**
		 * Gets the boards.
		 *
		 * @param id the id
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
		 * @return the boards
		 */
		@Processor
		public MembersBoardsGetResponse getBoards(String id, @Default("all") String filter, @Default("all") String fields, @Optional String actions, @Default("false") Boolean actions_entities, @Default("50") String actions_limit, @Default("list") String actions_format, @Optional String actions_since, @Default("all") String action_fields, @Default("none") String memberships, @Default("false") Boolean organization, @Optional String organization_fields, @Default("none") String lists){
			return getClient().getBoards(id, filter, fields, actions, actions_entities, actions_limit, actions_format, actions_since, action_fields, memberships, organization, organization_fields, lists);
		}
		
		/**
		 * Gets the boards by filter.
		 *
		 * @param id the id
		 * @param filter the filter
		 * @return the boards by filter
		 */
		@Processor
		public String getBoardsByFilter(String id, String filter){
			return getClient().getBoardsByFilter(id, filter);
		}
		
		/**
		 * Gets the boards invited.
		 *
		 * @param id the id
		 * @param fields the fields
		 * @return the boards invited
		 */
		@Processor
		public String getBoardsInvited(String id,@Optional String fields){
			return getClient().getBoardsInvited(id, fields);
		}
		
		/**
		 * Gets the boards invited by field.
		 *
		 * @param id the id
		 * @param field the field
		 * @return the boards invited by field
		 */
		@Processor
		public String getBoardsInvitedByField(String id, String field){
			return getClient().getBoardsInvitedByField(id, field);
		}
		
		/**
		 * Gets the cards.
		 *
		 * @param id the id
		 * @param actions the actions
		 * @param attachments the attachments
		 * @param attachment_fields the attachment_fields
		 * @param stickers the stickers
		 * @param members the members
		 * @param member_fields the member_fields
		 * @param checkItemStates the check item states
		 * @param checklists the checklists
		 * @param limit the limit
		 * @param since the since
		 * @param before the before
		 * @param filter the filter
		 * @param fields the fields
		 * @return the cards
		 */
		@Processor
		public String getCards(String id, @Optional String actions,@Default("false") Boolean attachments, @Default("all") String attachment_fields, @Default("false") Boolean stickers, @Default("false") Boolean members, @Optional String member_fields, @Default("false") Boolean checkItemStates, @Default("none") String checklists, @Optional String limit, @Optional String since, @Optional String before, @Default("visible") String filter, @Default("all") String fields){
			return getClient().getCards(id, actions, attachments, attachment_fields, stickers, members, member_fields, checkItemStates, checklists, limit, since, before, filter, fields);
		}
		
		/**
		 * Gets the cards by filter.
		 *
		 * @param id the id
		 * @param filter the filter
		 * @return the cards by filter
		 */
		@Processor
		public String getCardsByFilter(String id, String filter){
			return getClient().getCardsByFilter(id, filter);
		}
		
		/**
		 * Gets the custom board backgrounds.
		 *
		 * @param id the id
		 * @param filter the filter
		 * @return the custom board backgrounds
		 */
		@Processor
		public String getCustomBoardBackgrounds(String id, @Default("all") String filter){
			return getClient().getCustomBoardBackgrounds(id, filter);
		}
		
		/**
		 * Gets the custom board backgrounds by id.
		 *
		 * @param memberId the member id
		 * @param boardBackgroundId the board background id
		 * @param fields the fields
		 * @return the custom board backgrounds by id
		 */
		@Processor
		public String getCustomBoardBackgroundsById(String memberId, String boardBackgroundId, @Default("all") String fields){
			return getClient().getCustomBoardBackgroundsById(memberId, boardBackgroundId, fields);
		}
		
		/**
		 * Gets the custom emoji.
		 *
		 * @param memberId the member id
		 * @param filter the filter
		 * @return the custom emoji
		 */
		@Processor
		public String getCustomEmoji(String memberId, @Default("all") String filter){
			return getClient().getCustomEmoji(memberId, filter);
		}
		
		/**
		 * Gets the custom emoji by id.
		 *
		 * @param memberId the member id
		 * @param idCustomEmoji the id custom emoji
		 * @param fields the fields
		 * @return the custom emoji by id
		 */
		@Processor
		public String getCustomEmojiById(String memberId, String idCustomEmoji, @Default("all") String fields){
			return getClient().getCustomEmojiById(memberId, idCustomEmoji, fields);
		}
		
		/**
		 * Gets the custom stickers.
		 *
		 * @param memberId the member id
		 * @param filter the filter
		 * @return the custom stickers
		 */
		@Processor
		public String getCustomStickers(String memberId, @Default("all") String filter){
			return getClient().getCustomStickers(memberId, filter);
		}
		
		/**
		 * Gets the custom stickers by id.
		 *
		 * @param memberId the member id
		 * @param idCustomSticker the id custom sticker
		 * @param fields the fields
		 * @return the custom stickers by id
		 */
		@Processor
		public String getCustomStickersById(String memberId, String idCustomSticker, @Default("all") String fields){
			return getClient().getCustomStickersById(memberId, idCustomSticker, fields);
		}
		
		/**
		 * Gets the deltas.
		 *
		 * @param memberId the member id
		 * @param tags the tags
		 * @param ixLastUpdate the ix last update
		 * @return the deltas
		 */
		@Processor
		public String getDeltas(String memberId, String tags, String ixLastUpdate){
			return getClient().getDeltas(memberId, tags, ixLastUpdate);
		}
		
		/**
		 * Gets the notifications.
		 *
		 * @param memberId the member id
		 * @param entities the entities
		 * @param display the display
		 * @param filter the filter
		 * @param read_filter the read_filter
		 * @param fields the fields
		 * @param limit the limit
		 * @param page the page
		 * @param before the before
		 * @param since the since
		 * @param memberCreator the member creator
		 * @param memberCreator_fields the member creator_fields
		 * @return the notifications
		 */
		@Processor
		public String getNotifications(String memberId, @Default("false") Boolean entities, @Default("false") Boolean display,@Default("all") String filter, @Default("all") String read_filter, @Default("all") String fields, @Default("50") String limit, @Default("0") String page, @Optional String before, @Optional String since, @Default("true") Boolean memberCreator, @Optional String memberCreator_fields){
			return getClient().getNotifications(memberId, entities, display, filter, read_filter, fields, limit, page, before, since, memberCreator, memberCreator_fields);
		}
		
		/**
		 * Gets the notifications by filter.
		 *
		 * @param memberId the member id
		 * @param filter the filter
		 * @return the notifications by filter
		 */
		@Processor
		public String getNotificationsByFilter(String memberId, String filter){
			return getClient().getNotificationsByFilter(memberId, filter);
		}
		
		/**
		 * Gets the organizations.
		 *
		 * @param memberId the member id
		 * @param filter the filter
		 * @param fields the fields
		 * @param paid_account the paid_account
		 * @return the organizations
		 */
		@Processor
		public OrganizationsGetResponse getOrganizations(String memberId, @Default("all") String filter, @Default("all") String fields, @Default("false") Boolean paid_account){
			return getClient().getOrganizations(memberId, filter, fields, paid_account);
		}
		
		/**
		 * Gets the organizations by filter.
		 *
		 * @param memberId the member id
		 * @param filter the filter
		 * @return the organizations by filter
		 */
		@Processor
		public String getOrganizationsByFilter(String memberId, String filter){
			return getClient().getOrganizationsByFilter(memberId, filter);
		}
		
		/**
		 * Gets the organizations invited.
		 *
		 * @param memberId the member id
		 * @param fields the fields
		 * @return the organizations invited
		 */
		@Processor
		public String getOrganizationsInvited(String memberId, @Default("all") String fields){
			return getClient().getOrganizationsInvited(memberId, fields);
		}
		
		/**
		 * Gets the organizations by field.
		 *
		 * @param memberId the member id
		 * @param field the field
		 * @return the organizations by field
		 */
		@Processor
		public String getOrganizationsByField(String memberId, String field){
			return getClient().getOrganizationsByField(memberId, field);
		}
		
		/**
		 * Gets the saved searches.
		 *
		 * @param memberId the member id
		 * @return the saved searches
		 */
		@Processor
		public String getSavedSearches(String memberId){
			return getClient().getSavedSearches(memberId);
		}
		
		/**
		 * Gets the saved searches by saved search id.
		 *
		 * @param memberId the member id
		 * @param savedSearchId the saved search id
		 * @return the saved searches by saved search id
		 */
		@Processor
		public String getSavedSearchesBySavedSearchId(String memberId, String savedSearchId,String value){
			return getClient().getSavedSearchesBySavedSearchId(memberId, savedSearchId,value);
		}
		
		/**
		 * Gets the tokens.
		 *
		 * @param memberId the member id
		 * @param filter the filter
		 * @param webhooks the webhooks
		 * @return the tokens
		 */
		@Processor
		public String getTokens(String memberId,@Default("all") String filter, @Default("false") Boolean webhooks){
			return getClient().getTokens(memberId,filter,webhooks);
		}
		
		/**
		 * Update member.
		 *
		 * @param memberId the member id
		 * @param request the request
		 * @return the string
		 */
		@Processor
		public String updateMember(String memberId, UpdateMemberPutRequest request){
			return getClient().updateMember(memberId,request);
		}
		
		/**
		 * Update avatar source.
		 *
		 * @param memberId the member id
		 * @param request the request
		 * @return the string
		 */
		@Processor
		public String updateAvatarSource(String memberId, UpdateAvatarSourcePutRequest request){
			return getClient().updateAvatarSource(memberId, request);
		}
		
		/**
		 * Update bio.
		 *
		 * @param memberId the member id
		 * @param value the value
		 * @return the string
		 */
		@Processor
		public String updateBio(String memberId, String value){
			return getClient().updateBio(memberId, value);
		}
		
		/**
		 * Update board backgrounds by id.
		 *
		 * @param memberId the member id
		 * @param idBoardBackground the id board background
		 * @param request the request
		 * @return the string
		 */
		@Processor
		public String updateBoardBackgroundsById(String memberId, String idBoardBackground, UpdateBoardBackgroundByIdPutRequest request){
			return getClient().updateBoardBackgroundsById(memberId, idBoardBackground, request);
		}
		
		/**
		 * Update board stars by id.
		 *
		 * @param memberId the member id
		 * @param idBoardStar the id board star
		 * @param request the request
		 * @return the string
		 */
		@Processor
		public String updateBoardStarsById(String memberId, String idBoardStar, UpdateBoardStarsByIdPutRequest request ){
			return getClient().updateBoardStarsById(memberId, idBoardStar, request);
		}
		
		/**
		 * Update board star by board id.
		 *
		 * @param memberId the member id
		 * @param idBoardStar the id board star
		 * @param request the request
		 * @return the string
		 */
		@Processor
		public String updateBoardStarByBoardId(String memberId, String idBoardStar, UpdateBoardStarByBoardIdPutRequest request){
			return getClient().updateBoardStarByBoardId(memberId, idBoardStar, request);
		}
		
		/**
		 * Update board star by board pos.
		 *
		 * @param memberId the member id
		 * @param idBoardStar the id board star
		 * @param request the request
		 * @return the string
		 */
		@Processor
		public String updateBoardStarByBoardPos(String memberId, String idBoardStar, UpdateBoardStarByBoardPosPutRequest request){
			return getClient().updateBoardStarByBoardPos(memberId, idBoardStar, request);
		}
		
		/**
		 * Update custom board background by id.
		 *
		 * @param memberId the member id
		 * @param idBoardBackground the id board background
		 * @param request the request
		 * @return the string
		 */
		@Processor
		public String updateCustomBoardBackgroundById(String memberId, String idBoardBackground, UpdateCustomBoardBackgroundById request){
			return getClient().updateCustomBoardBackgroundById(memberId, idBoardBackground, request);
		}
		
		/**
		 * Update member fullname.
		 *
		 * @param memberId the member id
		 * @param value the value
		 * @return the string
		 */
		@Processor
		public String updateMemberFullname(String memberId, String value){
			return getClient().updateMemberFullname(memberId, value);
		}
		
		/**
		 * Update member initials.
		 *
		 * @param memberId the member id
		 * @param value the value
		 * @return the string
		 */
		@Processor
		public String updateMemberInitials(String memberId, String value){
			return getClient().updateMemberInitials(memberId, value);
		}
		
		/**
		 * Update member pref color blind.
		 *
		 * @param memberId the member id
		 * @param value the value
		 * @return the string
		 */
		@Processor
		public String updateMemberPrefColorBlind(String memberId, Boolean value){
			return getClient().updateMemberPrefColorBlind(memberId, value);
		}
		
		/**
		 * Update member pref locale.
		 *
		 * @param memberId the member id
		 * @param value the value
		 * @return the string
		 */
		@Processor
		public String updateMemberPrefLocale(String memberId, String value){
			return getClient().updateMemberPrefLocale(memberId, value);
		}
		
		/**
		 * Update member pref minutes between summaries.
		 *
		 * @param memberId the member id
		 * @param value the value
		 * @return the string
		 */
		@Processor
		public String updateMemberPrefMinutesBetweenSummaries(String memberId, String value){
			return getClient().updateMemberPrefMinutesBetweenSummaries(memberId, value);
		}
		
		/**
		 * Update member saved searches by id.
		 *
		 * @param memberId the member id
		 * @param idSavedSearch the id saved search
		 * @param request the request
		 * @return the string
		 */
		@Processor
		public String updateMemberSavedSearchesById(String memberId, String idSavedSearch, UpdateMemberSavedSearchesByIdPutRequest request){
			return getClient().updateMemberSavedSearchesById(memberId, idSavedSearch, request);
		}
		
		/**
		 * Update saved search name.
		 *
		 * @param memberId the member id
		 * @param idSavedSearch the id saved search
		 * @param request the request
		 * @return the string
		 */
		@Processor
		public String updateSavedSearchName(String memberId, String idSavedSearch, UpdateSavedSearchNamePutRequest request){
			return getClient().updateSavedSearchName(memberId, idSavedSearch, request);
		}
		
		/**
		 * Update saved search pos.
		 *
		 * @param memberId the member id
		 * @param idSavedSearch the id saved search
		 * @param request the request
		 * @return the string
		 */
		@Processor
		public String updateSavedSearchPos(String memberId, String idSavedSearch, UpdateSavedSearchPosPutRequest request){
			return getClient().updateSavedSearchPos(memberId, idSavedSearch, request);
		}
		
		/**
		 * Update saved search query.
		 *
		 * @param memberId the member id
		 * @param idSavedSearch the id saved search
		 * @param request the request
		 * @return the string
		 */
		@Processor
		public String updateSavedSearchQuery(String memberId, String idSavedSearch, UpdateSavedSearchQueryPutRequest request){
			return getClient().updateSavedSearchQuery(memberId, idSavedSearch, request);
		}
		
		/**
		 * Update member username.
		 *
		 * @param memberId the member id
		 * @param value the value
		 * @return the string
		 */
		@Processor
		public String updateMemberUsername(String memberId, String value){
			return getClient().updateMemberUsername(memberId, value);
		}
		
		/**
		 * Creates the member avatar.
		 *
		 * @param memberId the member id
		 * @param request the request
		 * @return the string
		 */
		@Processor
		public String createMemberAvatar(String memberId, CreateMemberAvatarPostRequest request){
			return getClient().createMemberAvatar(memberId, request);
		}
		
		/**
		 * Creates the member board backgrounds.
		 *
		 * @param memberId the member id
		 * @param request the request
		 * @return the string
		 */
		@Processor
		public String createMemberBoardBackgrounds(String memberId, CreateMemberBoardBackgroundsPostRequest request){
			return getClient().createMemberBoardBackgrounds(memberId, request);
		}
		
		/**
		 * Creates the member board stars.
		 *
		 * @param memberId the member id
		 * @param request the request
		 * @return the string
		 */
		@Processor
		public String createMemberBoardStars(String memberId, CreateMemberBoardStarsPostRequest request){
			return getClient().createMemberBoardStars(memberId, request);
		}
		
		/**
		 * Creates the custom board backgrounds.
		 *
		 * @param memberId the member id
		 * @param request the request
		 * @return the string
		 */
		@Processor
		public String createCustomBoardBackgrounds(String memberId, CreateCustomBoardBackgroundsPostRequest request){
			return getClient().createCustomBoardBackgrounds(memberId, request);
		}
		
		/**
		 * Creates the custom emoji.
		 *
		 * @param memberId the member id
		 * @param request the request
		 * @return the string
		 */
		@Processor
		public String createCustomEmoji(String memberId, CreateCustomEmojiPostRequest request){
			return getClient().createCustomEmoji(memberId, request);
		}
		
		/**
		 * Creates the custom stickers.
		 *
		 * @param memberId the member id
		 * @param request the request
		 * @return the string
		 */
		@Processor
		public String createCustomStickers(String memberId, CreateCustomStickerPostRequest request){
			return getClient().createCustomStickers(memberId, request);
		}
		
		/**
		 * Creates the one time messages dismissed.
		 *
		 * @param memberId the member id
		 * @param request the request
		 * @return the string
		 */
		@Processor
		public String createOneTimeMessagesDismissed(String memberId, CreateOneTimeMessagesDismissedPostRequest request){
			return getClient().createOneTimeMessagesDismissed(memberId, request);
		}
		
		/**
		 * Creates the saved searches.
		 *
		 * @param memberId the member id
		 * @param request the request
		 * @return the string
		 */
		@Processor
		public String createSavedSearches(String memberId, CreateSavedSearchesPostRequest request){
			return getClient().createSavedSearches(memberId, request);
		}
		
		/**
		 * Delete members board backgrounds by id.
		 *
		 * @param memberId the member id
		 * @param idBoardBackground the id board background
		 * @return the status response
		 */
		@Processor
		public StatusResponse deleteMembersBoardBackgroundsById(String memberId, String idBoardBackground) {
			return getClient().deleteMembersBoardBackgroundsById(memberId, idBoardBackground);
		}
		
		/**
		 * Delete members board stars by id.
		 *
		 * @param memberId the member id
		 * @param idBoardStar the id board star
		 * @return the status response
		 */
		@Processor
		public StatusResponse deleteMembersBoardStarsById(String memberId, String idBoardStar) {
			return getClient().deleteMembersBoardStarsById(memberId, idBoardStar);
		}
		
		/**
		 * Delete members custom board backgrounds by id.
		 *
		 * @param memberId the member id
		 * @param idBoardBackground the id board background
		 * @return the status response
		 */
		@Processor
		public StatusResponse deleteMembersCustomBoardBackgroundsById(String memberId, String idBoardBackground) {
			return getClient().deleteMembersCustomBoardBackgroundsById(memberId, idBoardBackground);
		}
		
		/**
		 * Delete members custom stickers by id.
		 *
		 * @param memberId the member id
		 * @param idCustomSticker the id custom sticker
		 * @return the status response
		 */
		@Processor
		public StatusResponse deleteMembersCustomStickersById(String memberId, String idCustomSticker) {
			return getClient().deleteMembersCustomStickersById(memberId, idCustomSticker);
		}
		
		/**
		 * Delete members saved searches by id.
		 *
		 * @param memberId the member id
		 * @param idSavedSearch the id saved search
		 * @return the status response
		 */
		@Processor
		public StatusResponse deleteMembersSavedSearchesById(String memberId, String idSavedSearch) {
			return getClient().deleteMembersSavedSearchesById(memberId, idSavedSearch);
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