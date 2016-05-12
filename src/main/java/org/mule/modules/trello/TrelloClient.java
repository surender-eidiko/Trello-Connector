package org.mule.modules.trello;

import java.lang.reflect.Constructor;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

import org.codehaus.jackson.map.ObjectMapper;
import org.mule.api.annotations.param.Optional;
import org.mule.modules.trello.bean.ActionsByIdPutRequest;
import org.mule.modules.trello.bean.ActionsTextByIdPutRequest;
import org.mule.modules.trello.bean.BoardsByIdAndActionsGetResponse;
import org.mule.modules.trello.bean.BoardsByIdAndCardsGetResponse;
import org.mule.modules.trello.bean.BoardsByIdAndCheckListsGetResponse;
import org.mule.modules.trello.bean.BoardsByIdAndListsGetResponse;
import org.mule.modules.trello.bean.BoardsByIdGetResponse;
import org.mule.modules.trello.bean.BoardsByIdLabelPostRequest;
import org.mule.modules.trello.bean.BoardsByIdListPostRequest;
import org.mule.modules.trello.bean.BoardsByIdPutRequest;
import org.mule.modules.trello.bean.BoardsCalendekeyGeneratePostRequest;
import org.mule.modules.trello.bean.BoardsChecklistPostRequest;
import org.mule.modules.trello.bean.BoardsClosedByIdPutRequest;
import org.mule.modules.trello.bean.BoardsDescriptionByIdPutRequest;
import org.mule.modules.trello.bean.BoardsOrganizationByIdPutRequest;
import org.mule.modules.trello.bean.BoardsPostRequest;
import org.mule.modules.trello.bean.BoardsPostResponse;
import org.mule.modules.trello.bean.BoardsPoweUpsPostRequest;
import org.mule.modules.trello.bean.CardsAcionCommentsByIdPostRequest;
import org.mule.modules.trello.bean.CardsAttachmentsByIdPostRequest;
import org.mule.modules.trello.bean.CardsByIdGetResponse;
import org.mule.modules.trello.bean.CardsByIdPutRequest;
import org.mule.modules.trello.bean.CardsByIdPutResponse;
import org.mule.modules.trello.bean.CardsCardsBoardIdPutRequest;
import org.mule.modules.trello.bean.CardsCardsIdAttachmentPutRequest;
import org.mule.modules.trello.bean.CardsCardsListPutRequest;
import org.mule.modules.trello.bean.CardsCheckListNamePutRequest;
import org.mule.modules.trello.bean.CardsCheckListNamePutResponse;
import org.mule.modules.trello.bean.CardsCheckListPositionPutRequest;
import org.mule.modules.trello.bean.CardsCheckListPositionPutResponse;
import org.mule.modules.trello.bean.CardsCheckListStatePutRequest;
import org.mule.modules.trello.bean.CardsCheckListStatePutResponse;
import org.mule.modules.trello.bean.CardsCheckListsByIdPostRequest;
import org.mule.modules.trello.bean.CardsClosedPutRequest;
import org.mule.modules.trello.bean.CardsCommentsByIdPutRequest;
import org.mule.modules.trello.bean.CardsCommentsByIdPutResponse;
import org.mule.modules.trello.bean.CardsCurrentCheckListPutRequest;
import org.mule.modules.trello.bean.CardsDescriptionPutRequest;
import org.mule.modules.trello.bean.CardsDuePutRequest;
import org.mule.modules.trello.bean.CardsIdLabelByIdPostRequest;
import org.mule.modules.trello.bean.CardsIdMembersPostRequest;
import org.mule.modules.trello.bean.CardsLabelsPostRequest;
import org.mule.modules.trello.bean.CardsMemberPutRequest;
import org.mule.modules.trello.bean.CardsMembersVotedPostRequest;
import org.mule.modules.trello.bean.CardsNamePosRequest;
import org.mule.modules.trello.bean.CardsNamePutRequest;
import org.mule.modules.trello.bean.CardsPostRequest;
import org.mule.modules.trello.bean.CardsStickerPutRequest;
import org.mule.modules.trello.bean.CardsStickersPostRequest;
import org.mule.modules.trello.bean.CardsSubscribedPutRequest;
import org.mule.modules.trello.bean.CheckItems;
import org.mule.modules.trello.bean.CheckItemsPostRequest;
import org.mule.modules.trello.bean.CheckListsGetResponse;
import org.mule.modules.trello.bean.CheckListsToCardByIdPostRequest;
import org.mule.modules.trello.bean.CheckListsUpdatePostRequest;
import org.mule.modules.trello.bean.ChecklistsByIdPutRequest;
import org.mule.modules.trello.bean.ChecklistsNameByIdPutRequest;
import org.mule.modules.trello.bean.ChecklistsPosByIdPutRequest;
import org.mule.modules.trello.bean.ChecklistsPostRequest;
import org.mule.modules.trello.bean.LabelByIdPutRequest;
import org.mule.modules.trello.bean.LabelColorByIdPutRequest;
import org.mule.modules.trello.bean.LabelNameByIdPutRequest;
import org.mule.modules.trello.bean.LabelsPostRequest;
import org.mule.modules.trello.bean.ListCardsGetResponse;
import org.mule.modules.trello.bean.ListsActionsByIdGetResponse;
import org.mule.modules.trello.bean.ListsBoardsByIdPutRequest;
import org.mule.modules.trello.bean.ListsByIdGetResponse;
import org.mule.modules.trello.bean.ListsByIdPutRequest;
import org.mule.modules.trello.bean.ListsCardsPostRequest;
import org.mule.modules.trello.bean.ListsClosedByIdPutRequest;
import org.mule.modules.trello.bean.ListsFieldByIdGetResponse;
import org.mule.modules.trello.bean.ListsMovedCardsPostRequest;
import org.mule.modules.trello.bean.ListsPostRequest;
import org.mule.modules.trello.bean.NotificationsByIdPutRequest;
import org.mule.modules.trello.bean.NotificationsPostRequest;
import org.mule.modules.trello.bean.NotificationsUnreadByIdPutRequest;
import org.mule.modules.trello.bean.OrganizationGetResponse;
import org.mule.modules.trello.bean.SessionByIdPutRequest;
import org.mule.modules.trello.bean.SessionStatusByIdPutRequest;
import org.mule.modules.trello.bean.SessionsPostRequest;
import org.mule.modules.trello.bean.StatusResponse;
import org.mule.modules.trello.bean.TokensGetResponse;
import org.mule.modules.trello.bean.TokensPutRequest;
import org.mule.modules.trello.bean.TypesGetResponse;
import org.mule.modules.trello.bean.WebhooksActivePutRequest;
import org.mule.modules.trello.bean.WebhooksByIdPutRequest;
import org.mule.modules.trello.bean.WebhooksCallBackURLPutRequest;
import org.mule.modules.trello.bean.WebhooksDescPutRequest;
import org.mule.modules.trello.bean.WebhooksPutRequest;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;
import com.sun.jersey.core.util.MultivaluedMapImpl;

public class TrelloClient {

	private Client client;
	private WebResource apiResource;
	private TrelloConnector trelloConnector;
	private static final Logger log = Logger.getLogger(TrelloClient.class
			.getName());

	public TrelloConnector getTrelloConnector() {
		return trelloConnector;
	}

	public void setTrelloConnector(TrelloConnector trelloConnector) {
		this.trelloConnector = trelloConnector;
	}

	public TrelloClient(TrelloConnector trelloConnector) {
		setTrelloConnector(trelloConnector);
		ClientConfig clientConfig = new DefaultClientConfig();
		clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING,
				Boolean.TRUE);
		this.client = Client.create(clientConfig);
		this.apiResource = this.client.resource(getTrelloConnector()
				.getConfig().getUrl());
	}

	public String getActionsById(String actionId,
			Boolean display, Boolean entities, String fields, Boolean member,
			String member_fields, Boolean memberCreator,
			String memberCreator_fields) {
		WebResource webResource = getApiResource().path("actions").path(
				actionId);
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if (actionId != null) {
			queryParams.add("actionId", actionId);
		}
		if (display != null) {
			queryParams.add("display", String.valueOf(display));
		}
		if (entities != null) {
			queryParams.add("entities", String.valueOf(entities));
		}

		queryParams.add("fields", fields);

		if (member != null) {
			queryParams.add("member", String.valueOf(member));
		}
		if (memberCreator != null) {
			queryParams.add("memberCreator", String.valueOf(memberCreator));
		}
		webResource = webResource.queryParams(queryParams);
		return (String) getData(webResource,
				String.class);
	}

	public String getActionsByIdAndField(String actionId,
			String field) {
		WebResource webResource = getApiResource().path("actions")
				.path(actionId).path(field);
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if (actionId != null) {
			queryParams.add("actionId", actionId);
		}
		queryParams.add("field", field);
		webResource = webResource.queryParams(queryParams);
		return (String) getData(webResource,String.class);
	}

	public String getActionsByIdAndBoard(String actionId,
			@Optional String fields) {

		WebResource webResource = getApiResource().path("actions")
				.path(actionId).path("board");
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if (actionId != null) {
			queryParams.add("actionId", actionId);
		}
		if (fields != null) {
			queryParams.add("fields", fields);

		}
		webResource = webResource.queryParams(queryParams);
		return (String) getData(webResource,
				String.class);
	}

	public String getActionsByIdAndBoardWithField(
			String actionId, String field) {
		WebResource webResource = getApiResource().path("actions")
				.path(actionId).path("board").path(field);
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if (actionId != null) {
			queryParams.add("actionId", actionId);
		}
		queryParams.add("field", field);
		webResource = webResource.queryParams(queryParams);
		return (String) getData(webResource,
				String.class);
	}

	public String getActionsByIdAndCard(String actionId,
			String fields) {
		WebResource webResource = getApiResource().path("actions")
				.path(actionId).path("board").path(fields);
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		queryParams.add("actionId", actionId);
		if (fields != null) {
			queryParams.add("field", fields);
		}
		webResource = webResource.queryParams(queryParams);
		return (String) getData(webResource,
				String.class);
	}

	public String getActionsByIdAndCardWithField(
			String actionId, String field) {
		WebResource webResource = getApiResource().path("actions")
				.path(actionId).path("board").path(field);
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if (actionId != null) {
			queryParams.add("actionId", actionId);
		}
		queryParams.add("field", field);
		webResource = webResource.queryParams(queryParams);
		return (String) getData(webResource,
				String.class);
	}

	public String getActionsByIdWithDispaly(
			String actionId) {
		WebResource webResource = getApiResource().path("actions")
				.path(actionId).path("display");
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		queryParams.add("actionId", actionId);
		webResource = webResource.queryParams(queryParams);
		return (String) getData(webResource,String.class);
	}

	public String getActionsByIdWithEntities(
			String actionId) {
		WebResource webResource = getApiResource().path("actions")
				.path(actionId).path("entities");
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		queryParams.add("actionId", actionId);
		webResource = webResource.queryParams(queryParams);
		return (String) getData(webResource,String.class);
	}

	public String getActionsByIdAndList(String actionId,
			String fields) {
		WebResource webResource = getApiResource().path("actions")
				.path(actionId).path("list").path(fields);
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		queryParams.add("actionId", actionId);
		if (fields != null) {
			queryParams.add("fields", fields);
		}
		webResource = webResource.queryParams(queryParams);
		return (String) getData(webResource,String.class);
	}

	public String getActionsByIdAndListWithField(
			String actionId, String field) {
		WebResource webResource = getApiResource().path("actions")
				.path(actionId).path("list").path(field);
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		queryParams.add("actionId", actionId);
		queryParams.add("field", field);
		webResource = webResource.queryParams(queryParams);
		return (String) getData(webResource,
				String.class);
	}

	public String getActionsByIdAndMember(
			String actionId, String fields) {
		WebResource webResource = getApiResource().path("actions")
				.path(actionId).path("member").path(fields);
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if (fields != null) {
			queryParams.add("fields", fields);
		}
		webResource = webResource.queryParams(queryParams);
		return (String) getData(webResource,
				String.class);
	}

	public String getActionsByIdAndMemberWithField(
			String actionId, String field) {
		WebResource webResource = getApiResource().path("actions")
				.path(actionId).path("member").path(field);
		return (String) getData(webResource,
				String.class);
	}

	public String getActionsByIdAndMemberCreater(
			String actionId, String fields) {
		WebResource webResource = getApiResource().path("actions")
				.path(actionId).path("memberCreator").path(fields);
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if (fields != null) {
			queryParams.add("fields", fields);
		}
		webResource = webResource.queryParams(queryParams);
		return (String) getData(webResource,
				String.class);
	}

	public String getActionsByIdAndMemberCreaterWithField(
			String actionId, String field) {
		WebResource webResource = getApiResource().path("actions")
				.path(actionId).path("memberCreator").path(field);
		return (String) getData(webResource,String.class);
	}

	public String getActionsByIdAndOrganization(
			String actionId, String fields) {
		WebResource webResource = getApiResource().path("actions").path(actionId).path("organization");
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if (fields != null) {
			queryParams.add("fields", fields);
		}
		webResource = webResource.queryParams(queryParams);
		return (String) getData(webResource,	String.class);
	}

	public String getActionsByIdAndOrganizationWithField(
			String actionId, String field) {
		WebResource webResource = getApiResource().path("actions").path(actionId).path("organization").path(field);
		return (String) getData(webResource,
				String.class);
	}

	public String putReadActionsById(String actionId,
			String text, ActionsByIdPutRequest actionIdPutRequest) {
		WebResource webResource = getApiResource().path("actions").path(actionId);
		return (String) putData(actionIdPutRequest,
				webResource, String.class);
	}

	public String putWriteActionsById(String actionId,
			String value, ActionsTextByIdPutRequest actionIdPutRequest) {
		WebResource webResource = getApiResource().path("actions").path(actionId).path("text");
		return (String) putData(actionIdPutRequest,	webResource, String.class);
	}

	public StatusResponse deleteActionsById(String actionId) {
		WebResource webResource = getApiResource().path("actions").path(
				actionId);
		return (StatusResponse) deleteData(webResource);
	}

	public BoardsByIdGetResponse getBoardsById(String boardId, String actions,
			Boolean actions_entities, Boolean actions_display,
			String actions_format, String actions_since, Integer actions_limit,
			String action_fields, Boolean action_member,
			String action_member_fields, Boolean action_memberCreator,
			String action_memberCreator_fields, String cards,
			String card_fields, String card_attachments,
			String card_attachment_fields, String card_checklists,
			Boolean card_stickers, String boardStars, String labels,
			String label_fields, Integer labels_limit, String lists,
			String list_fields, String memberships, Boolean memberships_member,
			String memberships_member_fields, String members,
			String member_fields, String membersInvited,
			String membersInvited_fields, String checklists,
			String checklist_fields, Boolean organization,
			String organization_fields, String organization_memberships,
			Boolean myPrefs, Boolean tags, String fields) {

		WebResource webResource = getApiResource().path("boards").path(boardId);
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if (actions != null) {
			queryParams.add("actions", actions);
		}
		if (actions_since != null) {
			queryParams.add("actions_since", actions_since);
		}
		if (actions_limit != null) {
			queryParams.add("actions_limit", String.valueOf(actions_limit));
		}
		if (action_fields != null) {
			queryParams.add("action_fields", action_fields);
		}
		if (action_member != null) {
			queryParams.add("action_member", String.valueOf(action_member));
		}
		if (action_member_fields != null) {
			queryParams.add("action_member_fields", action_member_fields);
		}
		if (action_memberCreator != null) {
			queryParams.add("action_memberCreator",
					String.valueOf(action_memberCreator));
		}
		if (action_memberCreator_fields != null) {
			queryParams.add("action_memberCreator_fields",
					action_memberCreator_fields);
		}
		if (cards != null) {
			queryParams.add("cards", cards);
		}
		if (card_fields != null) {
			queryParams.add("card_fields", card_fields);
		}
		if (card_attachments != null) {
			queryParams.add("card_attachments", card_attachments);
		}
		if (card_attachment_fields != null) {
			queryParams.add("card_attachment_fields", card_attachment_fields);
		}
		if (card_checklists != null) {
			queryParams.add("card_checklists", card_checklists);
		}
		if (card_stickers != null) {
			queryParams.add("card_stickers", String.valueOf(card_stickers));
		}
		if (boardStars != null) {
			queryParams.add("boardStars", boardStars);
		}
		if (labels != null) {
			queryParams.add("labels", labels);
		}
		if (label_fields != null) {
			queryParams.add("label_fields", label_fields);
		}
		if (labels_limit != null) {
			queryParams.add("labels_limit", String.valueOf(labels_limit));
		}
		if (lists != null) {
			queryParams.add("lists", lists);
		}
		if (list_fields != null) {
			queryParams.add("list_fields", list_fields);
		}
		if (memberships != null) {
			queryParams.add("memberships", memberships);
		}
		if (memberships_member != null) {
			queryParams.add("memberships_member",
					String.valueOf(memberships_member));
		}
		if (memberships_member_fields != null) {
			queryParams.add("memberships_member_fields",
					memberships_member_fields);
		}
		if (members != null) {
			queryParams.add("members", members);
		}
		if (member_fields != null) {
			queryParams.add("member_fields", member_fields);
		}
		if (membersInvited != null) {
			queryParams.add("membersInvited", membersInvited);
		}
		if (membersInvited_fields != null) {
			queryParams.add("membersInvited_fields", membersInvited_fields);
		}
		if (checklists != null) {
			queryParams.add("checklists", checklists);
		}
		if (checklist_fields != null) {
			queryParams.add("checklist_fields", checklist_fields);
		}
		if (organization != null) {
			queryParams.add("organization", String.valueOf(organization));
		}
		if (organization_fields != null) {
			queryParams.add("organization_fields", organization_fields);
		}
		if (organization_memberships != null) {
			queryParams.add("organization_memberships",
					organization_memberships);
		}
		if (myPrefs != null) {
			queryParams.add("myPrefs", String.valueOf(myPrefs));
		}
		if (tags != null) {
			queryParams.add("tags", String.valueOf(tags));
		}
		if (fields != null) {
			queryParams.add("fields", fields);
		}
		webResource = webResource.queryParams(queryParams);
		return (BoardsByIdGetResponse) getData(webResource,
				BoardsByIdGetResponse.class);
	}

	public BoardsByIdAndActionsGetResponse getBoardsByIdAndActions(
			String boardId, String entities, Boolean display, String filter,
			String fields, Integer limit, String format, String since,
			String before, Integer page, String idModels, Boolean member,
			String member_fields, Boolean memberCreator,
			String memberCreator_fields) {

		WebResource webResource = getApiResource().path("boards").path(boardId);
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if (entities != null) {
			queryParams.add("entities", entities);
		}
		if (display != null) {
			queryParams.add("display", String.valueOf(display));
		}
		if (filter != null) {
			queryParams.add("filter", filter);
		}
		if (limit != null) {
			queryParams.add("limit", String.valueOf(limit));
		}
		if (format != null) {
			queryParams.add("format", format);
		}
		if (since != null) {
			queryParams.add("since", since);
		}
		if (since != null) {
			queryParams.add("since", since);
		}
		if (page != null) {
			queryParams.add("page", String.valueOf(page));
		}
		if (idModels != null) {
			queryParams.add("idModels", idModels);
		}
		if (member != null) {
			queryParams.add("member", String.valueOf(member));
		}
		if (member_fields != null) {
			queryParams.add("member_fields", member_fields);
		}
		if (memberCreator != null) {
			queryParams.add("memberCreator", String.valueOf(memberCreator));
		}
		if (memberCreator_fields != null) {
			queryParams.add("memberCreator_fields", memberCreator_fields);
		}
		webResource = webResource.queryParams(queryParams);
		return (BoardsByIdAndActionsGetResponse) getData(webResource,
				BoardsByIdAndActionsGetResponse.class);
	}

	public String getBoardsByIdAndBoardStars(
			String boardId, String filters) {
		WebResource webResource = getApiResource().path("boards").path(boardId)
				.path("boardStars");
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if (filters != null) {
			queryParams.add("filters", filters);
		}
		webResource = webResource.queryParams(queryParams);
		return (String) getData(webResource,String.class);
	}

	public BoardsByIdAndCardsGetResponse getBoardsByIdAndCards(String boardId,
			String filters) {
		WebResource webResource = getApiResource().path("boards").path(boardId)
				.path("cards");
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if (filters != null) {
			queryParams.add("filters", filters);
		}
		webResource = webResource.queryParams(queryParams);
		return (BoardsByIdAndCardsGetResponse) getData(webResource,
				BoardsByIdAndCardsGetResponse.class);
	}

	public String getBoardsByIdAndField(String boardId,
			String field) {
		WebResource webResource = getApiResource().path("boards").path(boardId).path(field);
		return (String) getData(webResource,
				String.class);
	}
	public BoardsByIdAndCardsGetResponse getBoardsByIdAndCards(String boardId,
			String actions, String attachments, String attachment_fields,
			Boolean stickers, Boolean members, String member_fields,
			String checklists, String since, String before, String filter,
			String fields) {
		WebResource webResource = getApiResource().path("boards").path(boardId)
				.path(fields);
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if (attachments != null) {
			queryParams.add("attachments", attachments);
		}
		if (attachment_fields != null) {
			queryParams.add("attachment_fields", attachment_fields);
		}
		if (stickers != null) {
			queryParams.add("stickers", String.valueOf(stickers));
		}
		if (members != null) {
			queryParams.add("members", String.valueOf(members));
		}
		if (member_fields != null) {
			queryParams.add("member_fields", member_fields);
		}
		if (checklists != null) {
			queryParams.add("checklists", checklists);
		}
		if (since != null) {
			queryParams.add("since", since);
		}
		if (before != null) {
			queryParams.add("before", before);
		}
		if (filter != null) {
			queryParams.add("filter", filter);
		}
		if (fields != null) {
			queryParams.add("fields", fields);
		}
		webResource = webResource.queryParams(queryParams);
		return (BoardsByIdAndCardsGetResponse) getData(webResource,
				BoardsByIdAndCardsGetResponse.class);
	}

	public String getBoardsByIdAndCardsWithFilter(
			String boardId, String filter) {
		WebResource webResource = getApiResource().path("boards").path(boardId)
				.path(filter);
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if(filter!=null){
			queryParams.add("filter", filter);
		}
		webResource = webResource.queryParams(queryParams);
		return (String) getData(webResource,String.class);
	}

	public String getBoardsByIdAndCardsWithIdCards(
			String boardId, String idCard, String attachments,
			String attachment_fields, String actions, Boolean actions_entities,
			Boolean actions_display, Integer actions_limit,
			String action_fields, String action_memberCreator_fields,
			Boolean members, String member_fields, Boolean checkItemStates,
			String checkItemState_fields, Boolean labels, String checklists,
			String checklist_fields, String fields) {
		WebResource webResource = getApiResource().path("boards").path(boardId)
				.path("cards").path(idCard);
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if(idCard!=null){
			queryParams.add("idCard", idCard);
		}
		if (attachments != null) {
			queryParams.add("attachments", attachments);
		}
		if (actions != null) {
			queryParams.add("actions", actions);
		}
		if (actions_entities != null) {
			queryParams.add("actions_entities",
					String.valueOf(actions_entities));
		}
		if (actions_display != null) {
			queryParams.add("actions_display", String.valueOf(actions_display));
		}
		if (actions_limit != null) {
			queryParams.add("actions_limit", String.valueOf(actions_limit));
		}
		if (action_fields != null) {
			queryParams.add("action_fields", action_fields);
		}
		if (action_memberCreator_fields != null) {
			queryParams.add("action_memberCreator_fields",
					action_memberCreator_fields);
		}
		if (members != null) {
			queryParams.add("members", String.valueOf(members));
		}
		if (member_fields != null) {
			queryParams.add("member_fields", member_fields);
		}
		if (checkItemStates != null) {
			queryParams.add("checkItemStates", String.valueOf(checkItemStates));
		}
		if (checkItemState_fields != null) {
			queryParams.add("checkItemState_fields", checkItemState_fields);
		}
		if (labels != null) {
			queryParams.add("labels", String.valueOf(labels));
		}

		if (checklists != null) {
			queryParams.add("checklists", checklists);
		}
		if (checklist_fields != null) {
			queryParams.add("checklist_fields", checklist_fields);
		}
		if (attachments != null) {
			queryParams.add("attachments", attachments);
		}
		if (fields != null) {
			queryParams.add("fields", fields);
		}
		webResource = webResource.queryParams(queryParams);
		return (String) getData(webResource,
				String.class);
	}

	public BoardsByIdAndCheckListsGetResponse getBoardsByIdAndCheckLists(
			String boardId, String cards, String card_fields,
			String check_Items, String checkItem_fields, String filter,
			String fields) {
		WebResource webResource = getApiResource().path("boards").path(boardId)
				.path("checklists");
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if(cards!=null){
			queryParams.add("cards", cards);
		}
		if (card_fields != null) {
			queryParams.add("card_fields", card_fields);
		}
		if (check_Items != null) {
			queryParams.add("actions", check_Items);
		}
		if (checkItem_fields != null) {
			queryParams.add("checkItem_fields", checkItem_fields);
		}
		if (filter != null) {
			queryParams.add("filter", filter);
		}
		if (checkItem_fields != null) {
			queryParams.add("fields", fields);
		}
		webResource = webResource.queryParams(queryParams);
		return (BoardsByIdAndCheckListsGetResponse) getData(webResource,
				BoardsByIdAndCheckListsGetResponse.class);
	}

	public String getBoardsByIdAndDeltas(
			String boardId, String tags, String ixLastUpdate) {

		WebResource webResource = getApiResource().path("boards").path(boardId).path("deltas");
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		queryParams.add("tags", tags);
		queryParams.add("ixLastUpdate", ixLastUpdate);
		webResource = webResource.queryParams(queryParams);
		return (String) getData(webResource,String.class);
	}
	
	public String getBoardsByIdAndLimit(String boardId,
			String fields, String limit) {
		WebResource webResource = getApiResource().path("boards").path(boardId).path("labels");
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if(fields!=null){
			queryParams.add("fields", fields);
		}
		if(limit!=null){
			queryParams.add("limit", limit);
		}
		webResource = webResource.queryParams(queryParams);
		return (String) getData(webResource,String.class);
	}

	public String getBoardsByIdAndLabelsWithId(
			String boardId, String labelId, String fields) {
		WebResource webResource = getApiResource().path("boards").path(boardId).path("labels").path(labelId);
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if(fields!=null){
			queryParams.add("fields", fields);
		}
		webResource = webResource.queryParams(queryParams);
		return (String) getData(webResource,String.class);
	}
	public BoardsByIdAndListsGetResponse getBoardsByIdAndLists(String boardId,
			String cards, String card_fields, String filter, String fields) {
		WebResource webResource = getApiResource().path("boards").path(boardId).path("lists");
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if(cards!=null){
			queryParams.add("cards", cards);
		}
		if(card_fields!=null){
			queryParams.add("card_fields", card_fields);
		}
		if(filter!=null){
			queryParams.add("filter", filter);
		}
		if(fields!=null){
			queryParams.add("fields", fields);
		}
		
		webResource = webResource.queryParams(queryParams);
		return (BoardsByIdAndListsGetResponse) getData(webResource,
				BoardsByIdAndListsGetResponse.class);
	}
	public String getBoardsByIdAndListsWithFilter(
			String boardId, String filter) {
		WebResource webResource = getApiResource().path("boards").path(boardId).path("lists").path(filter);
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		webResource = webResource.queryParams(queryParams);
		return (String) getData(webResource,String.class);
	}
	public String getBoardMembersByBoardId(String boardId, String filter,String fields,Boolean activity) {
		WebResource webResource = getApiResource().path("boards").path(boardId).path("members");
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if(filter!=null){
			queryParams.add("filter", filter);
		}
		if(fields!=null){
			queryParams.add("fields", fields);
		}
		if(activity!=null){
			queryParams.add("activity", String.valueOf(activity));
		}
		webResource = webResource.queryParams(queryParams);
		return (String) getData(webResource,
				String.class);
	}
	public String getBoardMembersByBoardIdWithFilter(
			String boardId, String filter) {
		WebResource webResource = getApiResource().path("boards").path(boardId).path("members").path(filter);
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		webResource = webResource.queryParams(queryParams);
		return (String) getData(webResource,String.class);
	}
	public String getBoardsByIdAndMembersByIdWithCards(
			String boardId, String memberId, String actions,
			String attachments, String attachment_fields, Boolean member,
			String member_fields, Boolean checkItemStates, String checkLists,
			Boolean boards, String board_fields, Boolean list,
			String list_fields, String filter, String fields) {
		WebResource webResource = getApiResource().path("boards").path(boardId).path("members").path(memberId).path("cards");
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if(actions!=null){
			queryParams.add("actions", actions);
		}
		if(attachments!=null){
			queryParams.add("attachments", attachments);
		}
		if(attachment_fields!=null){
			queryParams.add("attachment_fields", attachment_fields);
		}
		if(member!=null){
			queryParams.add("member", String.valueOf(member));
		}
		if(member_fields!=null){
			queryParams.add("member_fields", member_fields);
		}
		if(checkItemStates!=null){
			queryParams.add("checkItemStates", String.valueOf(checkItemStates));
		}
		if(checkLists!=null){
			queryParams.add("checkLists", checkLists);
		}
		if(boards!=null){
			queryParams.add("boards", String.valueOf(boards));
		}
		if(board_fields!=null){
			queryParams.add("board_fields", board_fields);
		}
		if(list!=null){
			queryParams.add("list", String.valueOf(list));
		}
		if(list_fields!=null){
			queryParams.add("list_fields", list_fields);
		}
		if(filter!=null){
			queryParams.add("filter", filter);
		}
		if(fields!=null){
			queryParams.add("fields", fields);
		}
		
		webResource = webResource.queryParams(queryParams);
		return (String) getData(webResource,
				String.class);
	}
	public String getBoardMembersInvited(
			String boardId, String fields) {
		WebResource webResource = getApiResource().path("boards").path(boardId).path("membersInvited");
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if(fields!=null){
			queryParams.add("fields", fields);
		}
		webResource = webResource.queryParams(queryParams);
		return (String) getData(webResource,String.class);
	}

	public String getBoardMembersInvitedWithField(
			String boardId, String field) {
		WebResource webResource = getApiResource().path("boards").path(boardId).path("membersInvited").path(field);
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		webResource = webResource.queryParams(queryParams);
		return (String) getData(webResource,String.class);
	}
	public String getBoardMemberShips(String boardId,String filter,
			Boolean member, String member_fields) {
		WebResource webResource = getApiResource().path("boards").path(boardId).path("memberships");
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if(filter!=null){
			queryParams.add("filter", filter);
		}
		if(member!=null){
			queryParams.add("member", String.valueOf(member));
		}
		if(member_fields!=null){
			queryParams.add("member_fields", member_fields);
		}
		webResource = webResource.queryParams(queryParams);
		return (String) getData(webResource,
				String.class);
	}
	public String getBoardMemberShipsById(String boardId,
			String membershipId, Boolean member, String member_fields) {
		WebResource webResource = getApiResource().path("boards").path(boardId).path("memberships").path(membershipId);
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if(member!=null){
			queryParams.add("member", String.valueOf(member));
		}
		if(member_fields!=null){
			queryParams.add("member_fields", member_fields);
		}
		webResource = webResource.queryParams(queryParams);
		return (String) getData(webResource,
				String.class);
	}
	public String getBoardsWithMyPref(String boardId) {
		WebResource webResource = getApiResource().path("boards").path(boardId).path("myPrefs");
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		webResource = webResource.queryParams(queryParams);
		return (String) getData(webResource,String.class);
	}
	public String getBoardsByIdAndOrganization(
			String boardId, String fields) {
		WebResource webResource = getApiResource().path("boards").path(boardId).path("organization");
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if(fields!=null){
			queryParams.add("fields", fields);
		}
		webResource = webResource.queryParams(queryParams);
		return (String) getData(webResource,String.class);
	}
	public String getBoardsByIdAndOrganizationWithField(
			String boardId, String fields) {
		WebResource webResource = getApiResource().path("boards").path(boardId).path("organization").path(fields);
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		webResource = webResource.queryParams(queryParams);
		return (String) getData(webResource,
				String.class);
	}
/*	public BoardsByIdPutResponse putBoardsByIdAndClosed(String boardId,
			String value) {
		WebResource webResource = getApiResource().path("boards").path(boardId).path("closed");
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		webResource = webResource.queryParams(queryParams);
		if(value!=null){
			queryParams.add("value", value);
		}
		
	}*/
	public String putBoardsById(String boardId,BoardsByIdPutRequest boardsByIdPutReq) {
		WebResource webResource = getApiResource().path("boards").path(boardId);
			    return (String) putData(boardsByIdPutReq,webResource, String.class);
	}
	public String putBoardsClosedById(String boardId,
			BoardsClosedByIdPutRequest boardsClosedByIdPutReq) {
		WebResource webResource = getApiResource().path("boards").path(boardId).path("closed");
	    return (String) putData(boardsClosedByIdPutReq,webResource, String.class);
	}
	public String updateBoardsDescriptionById(String boardId,
			BoardsDescriptionByIdPutRequest boardsClosedByIdPutReq) {
		WebResource webResource = getApiResource().path("boards").path(boardId).path("desc");
	    return (String) putData(boardsClosedByIdPutReq,webResource, String.class);
	}
	public String updateBoardsOrganizationById(String boardId,
			BoardsOrganizationByIdPutRequest boardsOrganizationByIdPutReq) {
		WebResource webResource = getApiResource().path("boards").path(boardId).path("idOrganizationlink");
	    return (String) putData(boardsOrganizationByIdPutReq,webResource, String.class);
	}
	

	
	//Boards POST methods
	public BoardsPostResponse postBoards(BoardsPostRequest boardssPostRequest) {
		 WebResource webResource = getApiResource().path("boards");
		    return (BoardsPostResponse) postData(boardssPostRequest, webResource,
		    		BoardsPostResponse.class);
	}
	public String postBoardsCalenderkeyGenerate(String boardId,	BoardsCalendekeyGeneratePostRequest boardsCalenderkeyGenPostRequest) {
		 WebResource webResource = getApiResource().path("boards").path(boardId).path("calendarKey").path("generate");
		 return (String) postData(boardsCalenderkeyGenPostRequest, webResource,String.class);
	}
	public String postBoardsChecklists(String boardId,BoardsChecklistPostRequest boardsChecklistPostRequest) {
		WebResource webResource = getApiResource().path("boards").path(boardId).path("checklists");
	    return (String) postData(boardsChecklistPostRequest, webResource,String.class);

	}
	public String postBoardsEmailkeyGeneration(String boardId,
			BoardsCalendekeyGeneratePostRequest boardsEmailkeyGenPostRequest) {
		 WebResource webResource = getApiResource().path("boards").path(boardId).path("emailKey").path("generate");
		    return (String) postData(boardsEmailkeyGenPostRequest, webResource,String.class);
	}
	public String postBoardsByIdAndLabel(String boardId,  BoardsByIdLabelPostRequest boardsIdLabelPostRequest) {
		 WebResource webResource = getApiResource().path("boards").path(boardId).path("labels");
		    return (String) postData(boardsIdLabelPostRequest, webResource,String.class);
	}
	public String postBoardsByAndList(String boardId,  BoardsByIdListPostRequest boardsIdListPostRequest) {
		 WebResource webResource = getApiResource().path("boards").path(boardId).path("lists");
		    return (String) postData(boardsIdListPostRequest, webResource,String.class);
	}
	public String postBoardsMarkAsViewd(String boardId,
			BoardsCalendekeyGeneratePostRequest boardsMarkAsVieedPostReq) {
		 WebResource webResource = getApiResource().path("boards").path(boardId).path("markAsViewed");
		    return (String) postData(boardsMarkAsVieedPostReq, webResource,String.class);
	}
	public String postBoardsPowerUps(String boardId, String value,
			BoardsPoweUpsPostRequest boardsByIdAndPoerUps) {
		 WebResource webResource = getApiResource().path("boards").path(boardId).path("powerUps");
		 MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
			if(value!=null){
				 queryParams.add("value", value);
			}
			 webResource = webResource.queryParams(queryParams);
		    return (String) postData(boardsByIdAndPoerUps, webResource,String.class);
	}
	public String deleteMemberUnderBoardById(String boardId,String memberId) {
		 WebResource webResource = getApiResource().path("boards").path(boardId).path("members").path(memberId);
		    return (String) deleteData(webResource);
	}
	public StatusResponse deletePowerUpsUnderBoardById(String boardId,String powerUp) {
		 WebResource webResource = getApiResource().path("boards").path(boardId).path("poweUps").path(powerUp);
		    return (StatusResponse) deleteData(webResource);
	}
	
	//Cards Client Methods
	public CardsByIdGetResponse getCardsById(String cardIdOrShortlink, String actions,
			Boolean actions_entities, Boolean actions_display,
			Integer actions_limit, String action_fields,
			String action_memberCreator_fields, String attachments,
			String attachment_fields, Boolean members, String member_fields,
			Boolean membersVoted, String memberVoted_fields,
			Boolean checkItemStates, String checkItemState_fields,
			String checklists, String checklist_fields, Boolean board,
			String board_fields, Boolean list, String list_fields,
			Boolean stickers, String sticker_fields, String fields) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink);
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if(actions!=null){
			queryParams.add("actions", actions);
		}
		if(actions_entities!=null){
			queryParams.add("actions_entities", String.valueOf(actions_entities));
		}
		if(actions_display!=null){
			queryParams.add("actions_display", String.valueOf(actions_display));
		}
		if(actions_limit!=null){
			queryParams.add("actions_limit", String.valueOf(actions_limit));
		}
		if(action_fields!=null){
			queryParams.add("action_fields", action_fields);
		}
		if(action_memberCreator_fields!=null){
			queryParams.add("action_memberCreator_fields", action_memberCreator_fields);
		}
		if(attachments!=null){
			queryParams.add("attachments", attachments);
		}
		if(attachment_fields!=null){
			queryParams.add("attachment_fields", attachment_fields);
		}
		if(members!=null){
			queryParams.add("members", String.valueOf(members));
		}
		if(member_fields!=null){
			queryParams.add("member_fields", member_fields);
		}
		if(membersVoted!=null){
			queryParams.add("membersVoted", String.valueOf(membersVoted));
		}
		
		if(memberVoted_fields!=null){
			queryParams.add("memberVoted_fields", memberVoted_fields);
		}
		if(checkItemStates!=null){
			queryParams.add("checkItemStates", String.valueOf(checkItemStates));
		}
		if(checkItemState_fields!=null){
			queryParams.add("checkItemState_fields", checkItemState_fields);
		}
		
		if(checklists!=null){
			queryParams.add("checklists", checklists);
		}
		if(checklist_fields!=null){
			queryParams.add("checklist_fields", checklist_fields);
		}
		
		if(board!=null){
			queryParams.add("board", String.valueOf(board));
		}
		if(board_fields!=null){
			queryParams.add("board_fields", board_fields);
		}
		if(list!=null){
			queryParams.add("list", String.valueOf(list));
		}
		
		if(list_fields!=null){
			queryParams.add("list_fields", list_fields);
		}
		if(stickers!=null){
			queryParams.add("stickers", String.valueOf(stickers));
		}
		if(sticker_fields!=null){
			queryParams.add("sticker_fields", sticker_fields);
		}
		if(fields!=null){
			queryParams.add("fields", fields);
		}
		webResource = webResource.queryParams(queryParams);
		return (CardsByIdGetResponse) getData(webResource,
				CardsByIdGetResponse.class);
	}

	public String getCardsByIdWithField(
			String cardIdOrShortlink, String field) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path(field);
		return (String) getData(webResource,
				String.class);
	}
	public String getCardActionsById(
			String cardIdOrShortlink, Boolean entities, Boolean display,
			String filter, String fields, Integer limit, String format,
			String since, String before, String idModels, Boolean member,
			String member_fields, Boolean memberCreator,
			String memberCreator_fields) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("actions");
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if(entities!=null){
			queryParams.add("entities", String.valueOf(entities));
		}
		if(display!=null){
			queryParams.add("display", String.valueOf(display));
		}
		if(filter!=null){
			queryParams.add("filter", filter);
		}
		if(fields!=null){
			queryParams.add("fields",fields);
		}
		if(limit!=null){
			queryParams.add("limit", String.valueOf(limit));
		}
		if(since!=null){
			queryParams.add("since", since);
		}
		if(before!=null){
			queryParams.add("before",before);
		}
		if(idModels!=null){
			queryParams.add("idModels",idModels);
		}
		if(member!=null){
			queryParams.add("member", String.valueOf(member));
		}
		
		if(member_fields!=null){
			queryParams.add("member_fields", member_fields);
		}
		if(memberCreator!=null){
			queryParams.add("memberCreator", String.valueOf(memberCreator));
		}
		
		if(memberCreator_fields!=null){
			queryParams.add("memberCreator_fields", memberCreator_fields);
		}
		webResource = webResource.queryParams(queryParams);
		return (String) getData(webResource,String.class);
	}
	public String getCardsAttachments(String cardIdOrShortlink,	String fields) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("attachments");
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if(fields!=null){
			queryParams.add("entities", String.valueOf(fields));
		}
		webResource = webResource.queryParams(queryParams);
		return (String) getData(webResource,String.class);
	}
	public String getCardsAttachmentsById(String cardIdOrShortlink,
			String idAttachment, String fields) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("attachments").path(idAttachment);
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if(fields!=null){
			queryParams.add("entities", fields);
		}
		webResource = webResource.queryParams(queryParams);
		return (String) getData(webResource,String.class);
	}
	public String getBoardsUnderCarsById(String cardIdOrShortlink,
			String fields) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("attachments").path("board");
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if(fields!=null){
			queryParams.add("entities", fields);
		}
		webResource = webResource.queryParams(queryParams);
		return (String) getData(webResource,String.class);
	}
	public String getBoardsUnderCarsByIdWithField(
			String cardIdOrShortlink, String fields) {
			WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("attachments").path("board").path(fields);
			return (String) getData(webResource,String.class);
	}
	public String getCardsByIdWithCheckItemStates(
			String cardIdOrShortlink, String fields) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("checkItemStates");
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if(fields!=null){
			queryParams.add("entities", fields);
		}
		webResource = webResource.queryParams(queryParams);
		return (String) getData(webResource,String.class);
	}
	public String getCardsByIdWithCheckLists(String cardIdOrShortlink,
			String cards, String card_fields, String checkItems,
			String checkItem_fields, String filter, String fields) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("checklists");
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if(cards!=null){
			queryParams.add("cards", cards);
		}
		if(card_fields!=null){
			queryParams.add("card_fields", card_fields);
		}
		if(checkItems!=null){
			queryParams.add("checkItems",checkItems);
		}
		if(checkItem_fields!=null){
			queryParams.add("checkItem_fields", checkItem_fields);
		}
		if(filter!=null){
			queryParams.add("filter",filter);
		}
		if(fields!=null){
			queryParams.add("entities", fields);
		}
		webResource = webResource.queryParams(queryParams);
		return (String) getData(webResource,String.class);
	}
	public String getCardsByIdWithList(String cardIdOrShortlink,
			String fields) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("list");
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if(fields!=null){
			queryParams.add("fields", fields);
		}
		webResource = webResource.queryParams(queryParams);
		return (String) getData(webResource,String.class);
	}
	public String getCardsByIdWithListField(String cardIdOrShortlink,
			String field) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("list").path(field);
		return (String) getData(webResource,String.class);
	}
	public String getCardsMembersById(String cardIdOrShortlink,
			String fields) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("members");
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if(fields!=null){
			queryParams.add("fields",fields);
		}
		webResource = webResource.queryParams(queryParams);
		return (String) getData(webResource,String.class);
	}
	public String getCardsMembersVotedById(String cardIdOrShortlink,
			String fields) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("membersVoted");
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if(fields!=null){
			queryParams.add("fields",fields);
		}
		webResource = webResource.queryParams(queryParams);
		return (String) getData(webResource,String.class);
	}
	public String getCardsStickers(String cardIdOrShortlink,
			String fields) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("stickers");
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if(fields!=null){
			queryParams.add("fields",fields);
		}
		webResource = webResource.queryParams(queryParams);
		return (String) getData(webResource,String.class);
	}
	public String getCardsStickersById(String cardIdOrShortlink,String idSticker, String fields) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("stickers").path(idSticker);
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if(fields!=null){
			queryParams.add("fields",fields);
		}
		webResource = webResource.queryParams(queryParams);
		return (String) getData(webResource,String.class);
	}
	//PUT Methods for Card
	
	public String putCardsById(String cardIdOrShortlink,CardsByIdPutRequest membershipsIdPutRequest) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink);
	    return (String) putData(membershipsIdPutRequest, webResource,String.class);
	}
	public String putCommentsOnActionsById(String cardIdOrShortlink,String idAction,CardsCommentsByIdPutRequest membershipsIdPutRequest) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("actions").path(idAction).path("comments");
		
	    return (String) putData(membershipsIdPutRequest, webResource,String.class);
	}
	public String updatecheckItemNameOnCards(String cardIdOrShortlink,String idChecklist, String idCheckItem,
			CardsCheckListNamePutRequest udatecheckItemNamePostRequest) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("checklist").path(idChecklist).path("checkItem").path(idCheckItem).path("name");
	    return (String) putData(udatecheckItemNamePostRequest, webResource,CardsCheckListNamePutResponse.class);
	} 
	public String updatecheckItePositionOnCards(String cardIdOrShortlink,
			String idChecklist, String idCheckItem,
			CardsCheckListPositionPutRequest udatecheckItemPosPostRequest) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("checklist").path(idChecklist).path("checkItem").path(idCheckItem).path("pos");
	    return (String) putData(udatecheckItemPosPostRequest, webResource,CardsCheckListPositionPutResponse.class);
	}
	public String updatecheckIteStateOnCards(String cardIdOrShortlink,
			String idChecklist, String idCheckItem,	CardsCheckListStatePutRequest udatecheckItemPosPostRequest) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("checklist").path(idChecklist).path("checkItem").path(idCheckItem).path("state");
	    return (String) putData(udatecheckItemPosPostRequest, webResource,CardsCheckListStatePutResponse.class);
	}
	public String updateCurrentcheckListOnCards(
			String cardIdOrShortlink,
			String idChecklistCurrent,
			String idCheckItem,
			CardsCurrentCheckListPutRequest updateCurrentcheckListyIdPosPostRequest) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("checklist").path(idChecklistCurrent).path("checkItem").path(idCheckItem);
	    return (String) putData(updateCurrentcheckListyIdPosPostRequest, webResource,String.class);
	}
	public String updateClosedCardsById(String cardIdOrShortlink,
			CardsClosedPutRequest updateClosedCardsById) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("closed");
	    return (String) putData(updateClosedCardsById, webResource,String.class);
	}
	public String updateCardsDescById(String cardIdOrShortlink,CardsDescriptionPutRequest updateCardsDescById) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("desc");
	    return (String) putData(updateCardsDescById, webResource,String.class);
	}
	public String updateCardsDueById(String cardIdOrShortlink,
			CardsDuePutRequest updateCardsDueById) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("due");
	    return (String) putData(updateCardsDueById, webResource,String.class);
	}
	public String updateCardsIdAttachmentById(String cardIdOrShortlink,
			CardsCardsIdAttachmentPutRequest updateCardsidAttachmentById) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("idAttachmentCover");
	    return (String) putData(updateCardsidAttachmentById, webResource,String.class);
	}
	public String updateCardsBoardIdById(String cardIdOrShortlink,
			CardsCardsBoardIdPutRequest updateCardsBoardIdPutReq) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("idBoard");
	    return (String) putData(updateCardsBoardIdPutReq, webResource,String.class);
	}
	public String updateCardsListIdById(String cardIdOrShortlink,
			CardsCardsListPutRequest updateCardsListIdPutReq) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("idList");
	    return (String) putData(updateCardsListIdPutReq, webResource,String.class);
	}
	public String updateCardMemberById(String cardIdOrShortlink,
			CardsMemberPutRequest updateCardMemberPutReq) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("idMembers");
	    return (String) putData(updateCardMemberPutReq, webResource,String.class);
	}
	public String updateCardNameById(String cardIdOrShortlink,
			CardsNamePutRequest updateCardsNamePutReq) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("name");
	    return (String) putData(updateCardsNamePutReq, webResource,String.class);
		}
	public String updateCardPosById(String cardIdOrShortlink,
			CardsNamePosRequest updateCardsPosPutReq) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("pos");
	    return (String) putData(updateCardsPosPutReq, webResource,String.class);
		}
	public String updateCardStickersById(String cardIdOrShortlink,String idSticker,
			CardsStickerPutRequest updateCardsStickerPutReq) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("stickers").path(idSticker);
	    return (String) putData(updateCardsStickerPutReq, webResource,String.class);
	}
	public String readSubsribedCards(String cardIdOrShortlink,
			CardsSubscribedPutRequest readSubscribedCarsdsPutReq) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("subscribed");
	    return (String) putData(readSubscribedCarsdsPutReq, webResource,String.class);
		}
	//Cards POST methods
	public String postCards(CardsPostRequest cardsPostReq) {
		WebResource webResource = getApiResource().path("cards");
	    return (String) postData(cardsPostReq, webResource,String.class);
	}
	public String postCardsAcionComments(String cardIdOrShortlink,CardsAcionCommentsByIdPostRequest cardsActionCommentsPostReq) {
		 WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("actions").path("comments");
		    return (String) postData(cardsActionCommentsPostReq,
		      webResource, String.class);
	}
	public String postCardsAttachmentsById(String cardIdOrShortlink,CardsAttachmentsByIdPostRequest postCardsAttachmentsById) {
		 WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("attachments");
		    return (String) postData(postCardsAttachmentsById,
		      webResource, String.class);
	}
	public String postCardsCheckListsById(String cardIdOrShortlink,String idCheckList,
			CardsCheckListsByIdPostRequest postCardChecklistsByIdPostReq) {
		 WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("checklist").path(idCheckList).path("checkItem");
		    return (String) postData(postCardChecklistsByIdPostReq, webResource, String.class);
	}
	public String convertChecklistToCardsById(String cardIdOrShortlink,	String idChecklist, String idCheckItem,
			CheckListsToCardByIdPostRequest postCardChecklistsToCardByIdPostReq) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("checklist").path(idChecklist).path("checkItem").path(idCheckItem);
	    return (String) postData(postCardChecklistsToCardByIdPostReq, webResource, String.class);
	}
	public String postCardsChecklistById(String cardIdOrShortlink,
			CheckListsUpdatePostRequest checkListUpdatePostReq) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("checklists");
	    return (String) postData(checkListUpdatePostReq, webResource, String.class);
	}
	public String postCardsIdLabelById(String cardIdOrShortlink,
			CardsIdLabelByIdPostRequest postCardsIdLabelsPostReq) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("idLabels");
	    return (String) postData(postCardsIdLabelsPostReq, webResource, String.class);
	}
	public String postCardsIdMembersById(String cardIdOrShortlink,
			CardsIdMembersPostRequest postCardsIdMemberPostReq) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("idMembers");
	    return (String) postData(postCardsIdMemberPostReq, webResource, String.class);
	}
	public String postCardsLabelsById(String cardIdOrShortlink,
			CardsLabelsPostRequest postCardsIdMemberPostReq) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("labels");
	    return (String) postData(postCardsIdMemberPostReq, webResource, String.class);
	}
	public String postCardsMembersVotedById(String cardIdOrShortlink,
			CardsMembersVotedPostRequest postCardsMembedrsVotedPostReq) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("membersVoted");
	    return (String) postData(postCardsMembedrsVotedPostReq, webResource, String.class);
	}
	public String postCardStickersById(String cardIdOrShortlink,
			CardsStickersPostRequest postCardsStickersPostReq) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("stickers");
	    return (String) postData(postCardsStickersPostReq, webResource, String.class);
	}
	public StatusResponse deleteCardsById(String cardIdOrShortLink) {
		 WebResource webResource = getApiResource().path("cards").path(cardIdOrShortLink);
			    return (StatusResponse) deleteData(webResource);
	}
	public StatusResponse deleteCardsActionCommentsById(String cardIdOrShortLink,String idAction) {
		 WebResource webResource = getApiResource().path("cards").path(cardIdOrShortLink).path("actions").path(idAction).path("comments");
		    return (StatusResponse) deleteData(webResource);
	}
	public StatusResponse deleteCardsIdAttachmentById(String cardIdOrShortLink,	String idAttachment) {
		 WebResource webResource = getApiResource().path("cards").path(cardIdOrShortLink).path("attachments").path(idAttachment);
		    return (StatusResponse) deleteData(webResource);
	}
	public StatusResponse deleteCardsCheckItemsById(String cardIdOrShortLink,
			String idChecklist, String idCheckItem) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortLink).path("checklist").path(idChecklist).path("checkItem").path(idCheckItem );
	    return (StatusResponse) deleteData(webResource);
	}
	public StatusResponse deleteCardsChecklistsById(String cardIdOrShortLink,String idChecklist) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortLink).path("checklists").path(idChecklist);
	    return (StatusResponse) deleteData(webResource);
	}
	public StatusResponse deleteCardsIdLabelById(String cardIdOrShortLink,String idLabel) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortLink).path("idLabels").path(idLabel);
	    return (StatusResponse) deleteData(webResource);
	}
	public StatusResponse deleteCardsByIdMember(String cardIdOrShortLink,
			String idMember) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortLink).path("idMembers").path(idMember);
	    return (StatusResponse) deleteData(webResource);
	}
	public StatusResponse deleteCardsByIdMembersVoted(String cardIdOrShortLink,	String idMember) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortLink).path("membersVoted").path(idMember);
	    return (StatusResponse) deleteData(webResource);
	}
	// Checklists GET methods
	public CheckListsGetResponse getChecklistsById(String checklistId,String cards, String card_fields, String checkItems,String checkItem_fields, String fields) {
		WebResource webResource = getApiResource().path("checklists").path(checklistId);
	    MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
	    if (cards != null) {
	      queryParams.add("cards", cards);
	    }
	    if (card_fields != null) {
	      queryParams.add("card_fields", card_fields);
	    }
	    if (checkItems != null) {
		      queryParams.add("max", checkItems);
		    }
	    if (checkItem_fields != null) {
		      queryParams.add("max", checkItem_fields);
		    }
	    if (fields != null) {
		      queryParams.add("fields", fields);
		    }
	    webResource = webResource.queryParams(queryParams);
	    return (CheckListsGetResponse) getData(webResource,CheckListsGetResponse.class);
	}
	public String getChecklistsFieldById(String checklistId, String field) {
		WebResource webResource = getApiResource().path("checklists").path(checklistId).path(field);
		return (String) getData(webResource,String.class);
	}
	public String getChecklistsBoardsById(String checklistId, String fields) {
		WebResource webResource = getApiResource().path("checklists").path(checklistId).path("board");
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
	    if (fields != null) {
	      queryParams.add("fields", fields);
	    }
	    webResource = webResource.queryParams(queryParams);
		return (String) getData(webResource,String.class);
	}
	public String getChecklistsBoardFieldById(String checklistId, String field) {
		WebResource webResource = getApiResource().path("checklists").path(checklistId).path("board").path(field);
		return (String) getData(webResource,String.class);
	}
	public String getChecklistsCardsById(String checklistId, String actions,
			String attachments, String attachment_fields, Boolean stickers,
			Boolean members, String member_fields, Boolean checkItemStates,
			String checklists, Integer limit, String since, String before,
			String filter, String fields) {
		WebResource webResource = getApiResource().path("checklists").path(checklistId).path("cards");
	    MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
	    if (actions != null) {
	      queryParams.add("actions", actions);
	    }
	    if (attachments != null) {
	      queryParams.add("card_fields", attachments);
	    }
	    if (attachment_fields != null) {
		      queryParams.add("attachment_fields", attachment_fields);
		    }
	    if (stickers != null) {
		      queryParams.add("stickers", String.valueOf(stickers));
		    }
	    if (members != null) {
		      queryParams.add("members", String.valueOf(members));
		    }
	    if (member_fields != null) {
		      queryParams.add("member_fields", member_fields);
		    }
	    if (checkItemStates != null) {
		      queryParams.add("checkItemStates", String.valueOf(checkItemStates));
		    }
	    if (checklists != null) {
		      queryParams.add("checklists", checklists);
		    }
	    if (limit != null) {
		      queryParams.add("limit", String.valueOf(limit));
		    }
	    if (since != null) {
		      queryParams.add("since", since);
		    }
	    if (before != null) {
		      queryParams.add("before", before);
		    }
	    if (filter != null) {
		      queryParams.add("filter", filter);
		    }
	    if (fields != null) {
		      queryParams.add("fields", fields);
		    }
	    webResource = webResource.queryParams(queryParams);
	    return (String) getData(webResource,String.class);
	}
	public String getChecklistsCardsFieldById(String checklistId, String filter) {
		WebResource webResource = getApiResource().path("checklists").path(checklistId).path("cards").path(filter);
		return (String) getData(webResource,String.class);
	}
	public CheckItems getCheckItemsById(String checklistId, String filter,String fields) {
		WebResource webResource = getApiResource().path("checklists").path(checklistId).path("checkItems");
	    MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
	    if (filter != null) {
	      queryParams.add("filter", filter);
	    }
	    if (fields != null) {
	      queryParams.add("fields", fields);
	    }
	    webResource = webResource.queryParams(queryParams);
	    return (CheckItems) getData(webResource,CheckItems.class);
	}
	public CheckItems getCheckItemsByCheckedIdById(String checklistId,
			String idCheckItems, String fields) {
		WebResource webResource = getApiResource().path("checklists").path(checklistId).path("checkItems").path(idCheckItems);
	    MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
	    if (fields != null) {
	      queryParams.add("fields", fields);
	    }
	    webResource = webResource.queryParams(queryParams);
	    return (CheckItems) getData(webResource,CheckItems.class);
	}
	//Checklists PUT methods
	public String putChecklistsById(String idChecklist,	ChecklistsByIdPutRequest checklistsPutReq) {
		WebResource webResource = getApiResource().path("checklists").path(idChecklist);
		 return (String) putData(checklistsPutReq, webResource, String.class);
	}
	public String putChecklistsNameById(String idChecklist,
			ChecklistsNameByIdPutRequest checklistsNamePutReq) {
		WebResource webResource = getApiResource().path("checklists").path(idChecklist).path("name");
		 return (String) putData(checklistsNamePutReq, webResource, String.class);
	}
	public String putChecklistsPosById(String idChecklist,ChecklistsPosByIdPutRequest checklistsPosPutReq) {
		WebResource webResource = getApiResource().path("checklists").path(idChecklist).path("pos");
		 return (String) putData(checklistsPosPutReq, webResource, String.class);
	}
	//POST checklist methods
	public String postChecklistsById(ChecklistsPostRequest checklistsPostReq) {
		 WebResource webResource = getApiResource().path("checklists");
		    return (String) postData(checklistsPostReq, webResource,String.class);
	}
	
	public String postCheckItemsById(String idChecklist,CheckItemsPostRequest checkItemsPostReq) {
		WebResource webResource = getApiResource().path("checklists").path(idChecklist).path("checkItems");
	    return (String) postData(checkItemsPostReq, webResource,String.class);
	}
	//DELETE checklists methods
	public StatusResponse deleteChecklistsById(String idChecklist) {
		WebResource webResource = getApiResource().path("checklists").path(idChecklist);
	    return (StatusResponse) deleteData(webResource);
	}
	public StatusResponse deleteChecklistsCheckItemsById(String idChecklist, String idCheckItem) {
		WebResource webResource = getApiResource().path("checklists").path(idChecklist).path("checkItems").path(idCheckItem);
	    return (StatusResponse) deleteData(webResource);
	}
	//Get Methods For Label
	public String getLabelsById(String idLabel, String fields) {
		WebResource webResource = getApiResource().path("labels").path(idLabel);
	    MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
	    if (fields != null) {
	      queryParams.add("fields", fields);
	    }
	    webResource = webResource.queryParams(queryParams);
	    return (String) getData(webResource, String.class);
	}
	public String getLabelsBoardsById(String idLabel, String fields) {
		WebResource webResource = getApiResource().path("labels").path(idLabel).path("board");
	    MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
	    if (fields != null) {
	      queryParams.add("fields", fields);
	    }
	    webResource = webResource.queryParams(queryParams);
	    return (String) getData(webResource, String.class);
	}
	public String getLabelsBoardsFieldById(String idLabel, String field) {
		WebResource webResource = getApiResource().path("labels").path(idLabel).path("board").path(field);
	    return (String) getData(webResource, String.class);
	}
	//Label PUT methods
	
	public String updateLabelById(String idLabel,
			LabelByIdPutRequest labelByIdPutReq) {
		WebResource webResource = getApiResource().path("labels").path(idLabel);
	    return (String) putData(labelByIdPutReq, webResource, String.class);
	}
	public String updateLabelColorById(String idLabel,LabelColorByIdPutRequest labelcolorByIdPutReq) {
		WebResource webResource = getApiResource().path("labels").path(idLabel).path("color");
	    return (String) putData(labelcolorByIdPutReq, webResource, String.class);
	}
	public String updateLabelNameById(String idLabel,LabelNameByIdPutRequest labelNameByIdPutReq) {
		WebResource webResource = getApiResource().path("labels").path(idLabel).path("name");
	    return (String) putData(labelNameByIdPutReq, webResource, String.class);
	}
//Labels POST method
	public String postLabels(LabelsPostRequest labelsPostReq) {
		WebResource webResource = getApiResource().path("labels");
		return (String) postData(labelsPostReq, webResource, String.class);
	}
	//Labels DELETE Method
	public StatusResponse deleteLabelById(String idLabel) {
		WebResource webResource = getApiResource().path("labels").path(idLabel);
	    return (StatusResponse) deleteData(webResource);
	}
	
//list GET method requests
	public ListsByIdGetResponse getListById(String listId, String cards,
			String card_fields, String board, String board_fields, String fields) {
		WebResource webResource = getApiResource().path("lists").path(listId);
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
	   	    if (cards != null) {
		      queryParams.add("cards", cards);
		    }
	    if (card_fields != null) {
		      queryParams.add("card_fields", card_fields);
		    }
	    if (board != null) {
		      queryParams.add("board", board);
		    }
	    if (board_fields != null) {
		      queryParams.add("board_fields", board_fields);
		    }
	    if (fields != null) {
		      queryParams.add("fields", fields);
		    }
	    webResource = webResource.queryParams(queryParams);
	    return (ListsByIdGetResponse) getData(webResource,ListsByIdGetResponse.class);
	}
	public ListsFieldByIdGetResponse getListFieldById(String listId,String field) {
		WebResource webResource = getApiResource().path("lists").path(listId).path(field);
		 return (ListsFieldByIdGetResponse) getData(webResource,ListsFieldByIdGetResponse.class);
	}
	public ListsActionsByIdGetResponse getListActionById(String listId,
			Boolean entities, Boolean display, String filter, String fields,
			Integer limit, String format, String since, String before,
			Integer page, String idModels, Boolean member,
			String member_fields, Boolean memberCreator,
			String memberCreator_fields) {
		WebResource webResource = getApiResource().path("lists").path(listId);
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
	   	    if (entities != null) {
		      queryParams.add("entities", String.valueOf(entities));
		    }
	    if (display != null) {
		      queryParams.add("display", String.valueOf(display));
		    }
	    if (filter != null) {
		      queryParams.add("filter", filter);
		    }
	    if (fields != null) {
		      queryParams.add("fields", fields);
		    }
	    if (format != null) {
		      queryParams.add("format", format);
		    }
	    if (since != null) {
		      queryParams.add("since", since);
		    }
	    if (before != null) {
		      queryParams.add("before",before);
		    }
	    if (page != null) {
		      queryParams.add("page", String.valueOf(page));
		    }
	    if (idModels != null) {
		      queryParams.add("idModels", idModels);
		    }
	    if (member != null) {
		      queryParams.add("member", String.valueOf(member));
		    }
	    if (memberCreator != null) {
		      queryParams.add("memberCreator",String.valueOf(memberCreator));
		    }
	    if (memberCreator_fields != null) {
		      queryParams.add("memberCreator_fields",memberCreator_fields);
		    }
	    webResource = webResource.queryParams(queryParams);
	    return (ListsActionsByIdGetResponse) getData(webResource,ListsActionsByIdGetResponse.class);
	}
	public String getListBoardsById(String listId, String fields) {
		WebResource webResource = getApiResource().path("lists").path(listId).path("board");
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
	   	    if (fields != null) {
		      queryParams.add("fields", fields);
		    }
	   	 webResource = webResource.queryParams(queryParams);
		    return (String) getData(webResource,String.class);
	}
	public String getListBoardsFieldById(String listId, String field) {
		WebResource webResource = getApiResource().path("lists").path(listId).path("board").path(field);
		    return (String) getData(webResource,String.class);
	}
	public ListCardsGetResponse getListsCardsById(String listId, String actions,
			String attachments, String attachment_fields, Boolean stickers,
			Boolean members, String member_fields, Boolean checkItemStates,
			String checklists, Integer limit, String since, String before,
			String filter, String fields) {
		WebResource webResource = getApiResource().path("lists").path(listId).path("cards");
	    MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
	    if (actions != null) {
	      queryParams.add("actions", actions);
	    }
	    if (attachments != null) {
	      queryParams.add("card_fields", attachments);
	    }
	    if (attachment_fields != null) {
		      queryParams.add("attachment_fields", attachment_fields);
		    }
	    if (stickers != null) {
		      queryParams.add("stickers", String.valueOf(stickers));
		    }
	    if (members != null) {
		      queryParams.add("members", String.valueOf(members));
		    }
	    if (member_fields != null) {
		      queryParams.add("member_fields", member_fields);
		    }
	    if (checkItemStates != null) {
		      queryParams.add("checkItemStates", String.valueOf(checkItemStates));
		    }
	    if (checklists != null) {
		      queryParams.add("checklists", checklists);
		    }
	    if (limit != null) {
		      queryParams.add("limit", String.valueOf(limit));
		    }
	    if (since != null) {
		      queryParams.add("since", since);
		    }
	    if (before != null) {
		      queryParams.add("before", before);
		    }
	    if (filter != null) {
		      queryParams.add("filter", filter);
		    }
	    if (fields != null) {
		      queryParams.add("fields", fields);
		    }
	    webResource = webResource.queryParams(queryParams);
	    return (ListCardsGetResponse) getData(webResource,ListCardsGetResponse.class);
	}

	public String getListCardsFilterById(String listId, String filter) {
		WebResource webResource = getApiResource().path("lists").path(listId).path("cards").path(filter);
	    return (String) getData(webResource,String.class);
	}

//PUT methods for Lists
	public String updateListsById(String listId,
			ListsByIdPutRequest listsPutReq) {
		WebResource webResource = getApiResource().path("lists").path(listId);
	    return (String) putData(listsPutReq, webResource, String.class);
	}
	public String updateListsCloseddById(String listId,
			ListsClosedByIdPutRequest listsClosedPutReq) {
		WebResource webResource = getApiResource().path("lists").path(listId).path("closed");
	    return (String) putData(listsClosedPutReq, webResource, String.class);
	}
	public String updateListsBoardsById(String listId,
			ListsBoardsByIdPutRequest listsBoardsPutReq) {
		WebResource webResource = getApiResource().path("lists").path(listId).path("idBoard");
	    return (String) putData(listsBoardsPutReq, webResource, String.class);
	}
	public String updateListsNameById(String listId,
			ChecklistsNameByIdPutRequest listNamesPutReq) {
		WebResource webResource = getApiResource().path("lists").path(listId).path("name");
	    return (String) putData(listNamesPutReq, webResource, String.class);
	}
	public String updateListsPositionById(String listId,ChecklistsPosByIdPutRequest listPosPutReq) {
		WebResource webResource = getApiResource().path("lists").path(listId).path("pos");
	    return (String) putData(listPosPutReq, webResource, String.class);
	}
	public String updateListsSubscribedById(String listId,
			CardsSubscribedPutRequest listSubscribedPutReq) {
		WebResource webResource = getApiResource().path("lists").path(listId).path("pos");
	    return (String) putData(listSubscribedPutReq, webResource, String.class);
	}
	//POST methods for lists
	public String postLists(ListsPostRequest listssPostReq) {
		WebResource webResource = getApiResource().path("lists");
		return (String) postData(listssPostReq, webResource, String.class);
	}
	public String postListsCardsById(String idList,ListsCardsPostRequest listsCardsPostReq) {
		WebResource webResource = getApiResource().path("lists").path(idList).path("cards");
		return (String) postData(listsCardsPostReq, webResource, String.class);
	}
	public String postListsMovedCardsById(String idList,ListsMovedCardsPostRequest listsMovedCardsPostReq) {
		WebResource webResource = getApiResource().path("lists").path(idList).path("moveAllCards");
		return (String) postData(listsMovedCardsPostReq, webResource, String.class);
	}
	//Notifications Get methods

	public String getNotificationsById(String notificationId, Boolean display,
			Boolean entities, String fields, String memberCreator,
			String memberCreator_fields, Boolean board, String board_fields,
			Boolean list, Boolean card, String card_fields,
			Boolean organization, String organization_fields, Boolean member,
			String member_fields) {
		WebResource webResource = getApiResource().path("notifications").path(notificationId);
	    MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
	    if (display != null) {
	      queryParams.add("display", String.valueOf(display));
	    }
	    if (entities != null) {
	      queryParams.add("entities", String.valueOf(entities));
	    }
	    if (fields != null) {
		      queryParams.add("fields", fields);
		    }
	    if (memberCreator != null) {
		      queryParams.add("memberCreator", memberCreator);
		    }
	    if (memberCreator_fields != null) {
		      queryParams.add("memberCreator_fields",memberCreator_fields);
		    }
	    if (board_fields != null) {
		      queryParams.add("board_fields", board_fields);
		    }
	    if (board != null) {
		      queryParams.add("board", String.valueOf(board));
		    }
	    if (card != null) {
		      queryParams.add("card", String.valueOf(card));
		    }
	    if (list != null) {
		      queryParams.add("list", String.valueOf(list));
		    }
	    if (card_fields != null) {
		      queryParams.add("card_fields", card_fields);
		    }
	    if (organization != null) {
		      queryParams.add("before", String.valueOf(organization));
		    }
	    if (organization_fields != null) {
		      queryParams.add("organization_fields", organization_fields);
		    }
	    if (member != null) {
		      queryParams.add("member", String.valueOf(member));
		    }
	    if (member_fields != null) {
		      queryParams.add("member_fields", member_fields);
		    }
	    webResource = webResource.queryParams(queryParams);
	    return (String) getData(webResource,String.class);
	}
	public String getNotificationsWithById(String notificationId, String field) {
		WebResource webResource = getApiResource().path("notifications").path(notificationId).path(field);
		 return (String) getData(webResource,String.class);
	}
	public String getNotificationsBoardsById(String notificationId,String fields) {
		WebResource webResource = getApiResource().path("notifications").path(notificationId).path("board");
		 MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		    if (fields != null) {
		      queryParams.add("fields", fields);
		    } 
		    webResource = webResource.queryParams(queryParams);
		    return (String) getData(webResource,String.class);
	}
	public String getNotificationsBoardsFieldById(String notificationId,String fields) {
		WebResource webResource = getApiResource().path("notifications").path(notificationId).path("board").path(fields);
		    return (String) getData(webResource,String.class);
	}
	public String getNotificationsCardsById(String notificationId,String fields) {
		WebResource webResource = getApiResource().path("notifications").path(notificationId).path("card");
		 MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		    if (fields != null) {
		      queryParams.add("fields", fields);
		    } 
		    webResource = webResource.queryParams(queryParams);
		    return (String) getData(webResource,String.class);
	}
	public String getNotificationsCardsFieldById(String notificationId,String fields) {
		WebResource webResource = getApiResource().path("notifications").path(notificationId).path("card").path(fields);
		    return (String) getData(webResource,String.class);
	}
	public String getNotificationsDisplayById(String notificationId) {
		WebResource webResource = getApiResource().path("notifications").path(notificationId).path("display");
	    return (String) getData(webResource,String.class);
	}
	public String getNotificationsEntitiesById(String notificationId) {
		WebResource webResource = getApiResource().path("notifications").path(notificationId).path("entities");
	    return (String) getData(webResource,String.class);
	}
	public String getNotificationsListById(String notificationId, String fields) {
		WebResource webResource = getApiResource().path("notifications").path(notificationId).path("list");
	    MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
	    if (fields != null) {
	      queryParams.add("fields", fields);
	    }
	    webResource = webResource.queryParams(queryParams);
	    return (String) getData(webResource,String.class);
	}
	public String getNotificationsListFieldById(String notificationId,String field) {
		WebResource webResource = getApiResource().path("notifications").path(notificationId).path("list").path(field);
	    return (String) getData(webResource,String.class);
	}
	public String getMemberNotificationsById(String notificationId,
			String fields) {
		WebResource webResource = getApiResource().path("notifications").path(notificationId).path("member");
	    MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
	    if (fields != null) {
	      queryParams.add("fields", fields);
	    }
	    webResource = webResource.queryParams(queryParams);
	    return (String) getData(webResource,String.class);
	}
	public String getMemberNotificationsFieldById(String notificationId,
			String field) {
		WebResource webResource = getApiResource().path("notifications").path(notificationId).path("member").path(field);
		return (String) getData(webResource,String.class);
	}
	public String getMemberCreatorNotificationsById(String notificationId,
			String fields) {
		WebResource webResource = getApiResource().path("notifications").path(notificationId).path("memberCreator");
	    MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
	    if (fields != null) {
	      queryParams.add("fields", fields);
	    }
	    webResource = webResource.queryParams(queryParams);
	    return (String) getData(webResource,String.class);
	}
	public String getMemberCreaterNotificationsFieldById(String notificationId,
			String field) {
		WebResource webResource = getApiResource().path("notifications").path(notificationId).path("memberCreator").path(field);
		return (String) getData(webResource,String.class);
	}
	public String getOrganizationsNotificationsById(String notificationId,
			String fields) {
		WebResource webResource = getApiResource().path("notifications").path(notificationId).path("organization");
	    MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
	    if (fields != null) {
	      queryParams.add("fields", fields);
	    }
	    webResource = webResource.queryParams(queryParams);
	    return (String) getData(webResource,String.class);
	}
	public String getOrganizationsFieldNotificationsById(String notificationId,	String field) {
		WebResource webResource = getApiResource().path("notifications").path(notificationId).path("organization").path(field);
		return (String) getData(webResource,String.class);
	}
	public String updateNotificationsById(String notificationId,NotificationsByIdPutRequest notificationsPutReq) {
		WebResource webResource = getApiResource().path("notifications").path(notificationId);
		return (String) putData(notificationsPutReq, webResource, String.class);
	}
	public String updateUnreadNotificationsById(String notificationId,
			NotificationsUnreadByIdPutRequest notificationsUnreadPutReq) {
		WebResource webResource = getApiResource().path("notifications").path(notificationId);
		return (String) putData(notificationsUnreadPutReq, webResource, String.class);
	}
	public String postAllNotifications(	NotificationsPostRequest notificationsPostReq) {
		WebResource webResource = getApiResource().path("notifications").path("all").path("read");
		return (String) putData(notificationsPostReq, webResource, String.class);
	}
//Search Get methods
	public String getSearchQuery(String query, String idBoards,
			String idOrganizations, String idCards, String modelTypes,
			String board_fields, String card_fields, Integer boards_limit,
			Integer cards_limit, Integer cards_page, Boolean card_board,
			String card_list, Boolean card_members, Boolean card_stickers,
			String card_attachments, String organization_fields,
			Integer organizations_limit, String member_fields,
			Integer members_limit, Boolean partial) {
		WebResource webResource = getApiResource().path("search");
	    MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
	    if (query != null) {
	      queryParams.add("query", query);
	    }
	    if (idBoards != null) {
	      queryParams.add("idBoards", idBoards);
	    }
	    if (idOrganizations != null) {
		      queryParams.add("idOrganizations", idOrganizations);
		    }
	    if (idCards != null) {
		      queryParams.add("idCards", idCards);
		    }
	    if (modelTypes != null) {
		      queryParams.add("modelTypes",modelTypes);
		    }
	    if (board_fields != null) {
		      queryParams.add("board_fields", board_fields);
		    }
	    if (boards_limit != null) {
		      queryParams.add("boards_limit", String.valueOf(boards_limit));
		    }
	    if (card_fields != null) {
		      queryParams.add("card_fields", card_fields);
		    }
	    if (cards_limit != null) {
		      queryParams.add("cards_limit", String.valueOf(cards_limit));
		    }
	    if (card_list != null) {
		      queryParams.add("card_list", card_list);
		    }
	    if(card_members!=null){
	    	 queryParams.add("card_members",String.valueOf(card_members));
	    }
	    if(card_stickers!=null){
	    	queryParams.add("cards_limit", String.valueOf(card_stickers));
	    }
	    if(card_attachments!=null){
	    	queryParams.add("card_attachments", card_attachments);
	    }
	    if (organization_fields != null) {
		      queryParams.add("organization_fields", organization_fields);
		    }
	    if (cards_page != null) {
		      queryParams.add("cards_page", String.valueOf(cards_page));
		    }
	    if (card_board != null) {
		      queryParams.add("card_board", String.valueOf(card_board));
		    }
	    if (organizations_limit != null) {
		      queryParams.add("organizations_limit", String.valueOf(organizations_limit));
		    }
	    if (member_fields != null) {
		      queryParams.add("member_fields", member_fields);
		    }
	    if (members_limit != null) {
		      queryParams.add("members_limit", String.valueOf(members_limit));
		    }
	    if(partial!=null){
	    	  queryParams.add("partial", String.valueOf(partial));
	    }
	    webResource = webResource.queryParams(queryParams);
	    return (String) getData(webResource,String.class);
	}
	public String getSearchMembers(String query, String limit, String idBoard,
			String idOrganization, Boolean onlyOrgMembers) {
		WebResource webResource = getApiResource().path("search").path("members");
	    MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
	    if (query != null) {
	      queryParams.add("query", query);
	    }
	    if (limit != null) {
	      queryParams.add("limit", limit);
	    }
	    if (idBoard != null) {
		      queryParams.add("idBoard", idBoard);
		    }
	    if (idOrganization != null) {
		      queryParams.add("idOrganization", idOrganization);
		    }
	    if (onlyOrgMembers != null) {
		      queryParams.add("onlyOrgMembers",String.valueOf(onlyOrgMembers));
		    }
	    webResource = webResource.queryParams(queryParams);
	    return (String) getData(webResource,String.class);
	}
//Session Get method
	
	public String getSessionsSocket() {
		WebResource webResource = getApiResource().path("sessions").path("socket");		
		return (String) getData(webResource, String.class);
	}
	//Session PUT method
	public String updateSessionById(String sessionId,SessionByIdPutRequest sessionByIdPutReq) {
		WebResource webResource = getApiResource().path("sessions").path(sessionId);
		return (String) putData(sessionByIdPutReq, webResource, String.class);
	}
	public String updateSessionStatusById(String sessionId,SessionStatusByIdPutRequest sessionStatusByIdPutReq) {
		WebResource webResource = getApiResource().path("sessions").path(sessionId).path("status");
		return (String) putData(sessionStatusByIdPutReq, webResource, String.class);
	}
	public String postSessions(SessionsPostRequest sessionsPOstReq) {
		WebResource webResource = getApiResource().path("sessions");
		return (String) postData(sessionsPOstReq, webResource, String.class);
	}
//Tokens GET Methods

	public TokensGetResponse getTokensByToken(String token, String fields, Boolean webhooks) {
		WebResource webResource = getApiResource().path("tokens").path(token);
		 MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		    if (fields != null) {
		      queryParams.add("fields", fields);
		    }
		    if (webhooks != null) {
		      queryParams.add("webhooks", String.valueOf(webhooks));
		    }
		    webResource = webResource.queryParams(queryParams);
		    return (TokensGetResponse) getData(webResource,TokensGetResponse.class);
	}
	public String getTokensFieldByToken(String token, String field) {
		WebResource webResource = getApiResource().path("tokens").path(token).path(field);
		 return (String) getData(webResource,String.class);
	}
	public String getMemberTokenByToken(String token, String fields) {
		WebResource webResource = getApiResource().path("tokens").path(token).path("member");
		 MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		    if (fields != null) {
		      queryParams.add("fields", fields);
		    }
		    webResource = webResource.queryParams(queryParams);
		    return (String) getData(webResource,String.class);
	}
	public String getMemberFieldTokenByToken(String token, String field) {
		WebResource webResource = getApiResource().path("tokens").path(token).path("member").path(field);
		 return (String) getData(webResource,String.class);
	}
	public String getTokensWebhooks(String token) {
		WebResource webResource = getApiResource().path("tokens").path(token).path("webhooks");
		 return (String) getData(webResource,String.class);
	}
	public String getTokensWebhooksByWebhookId(String token, String idWebhook) {
		WebResource webResource = getApiResource().path("tokens").path(token).path("webhooks").path(idWebhook);
		 return (String) getData(webResource,String.class);
	}
	public String updateTokenWebhookByToken(String token,
			TokensPutRequest tokensPutReq) {
		WebResource webResource = getApiResource().path("tokens").path(token).path("webhooks");
		 return (String) putData(tokensPutReq,webResource,String.class);
	}
	public String postTokenWebhookByToken(String token,
			TokensPutRequest tokensPutReq) {
		WebResource webResource = getApiResource().path("tokens").path(token).path("webhooks");
		 return (String) postData(tokensPutReq,webResource,String.class);
	}
//delete token
	public StatusResponse deleteTokenByToken(String token) {
		WebResource webResource = getApiResource().path("tokens").path(token);
		return (StatusResponse) deleteData(webResource);
	}
	public StatusResponse deleteTokenWebhookByToken(String token,
			String idWebhook) {
		WebResource webResource = getApiResource().path("tokens").path(token).path("webhooks").path(idWebhook);
		return (StatusResponse) deleteData(webResource);
	}
	//Types
	public TypesGetResponse TypesGetResponse(String typeId) {
		WebResource webResource = getApiResource().path("types").path(typeId);
		return (TypesGetResponse) getData(webResource,TypesGetResponse.class);
	}
	public String getWebhooksById(String idWebhook) {
		WebResource webResource = getApiResource().path("webhooks").path(idWebhook);
		return (String) getData(webResource,String.class);
	}
	//GET Webhooks
	public String getWebhooksFieldById(String idWebhook, String field) {
		WebResource webResource = getApiResource().path("webhooks").path(idWebhook).path(field);
		return (String) getData(webResource,String.class);
	}
	//PUT webhooks
	public String updateWebhookById(String idWebhook,
			WebhooksByIdPutRequest webhookPutReq) {
		WebResource webResource = getApiResource().path("webhooks").path(idWebhook);
		return (String) putData(webhookPutReq, webResource, String.class);
	}
	public String updateWebhook(WebhooksPutRequest webhookPutReq) {
		WebResource webResource = getApiResource().path("webhooks");
		return (String) putData(webhookPutReq, webResource, String.class);
	}
	public String updateActiveWebhook(String idWebhook,
			WebhooksActivePutRequest webhooksActivePutReq) {
		WebResource webResource = getApiResource().path("webhooks").path(idWebhook).path("active");
		return (String) putData(webhooksActivePutReq, webResource, String.class);
	}
	public String updateCallbackURLWebhook(String idWebhook,
			WebhooksCallBackURLPutRequest webhooksCallbackActivePutReq) {
		WebResource webResource = getApiResource().path("webhooks").path(idWebhook).path("callbackURL");
		return (String) putData(webhooksCallbackActivePutReq, webResource, String.class);
	}
	public String updateWebhookDescription(String idWebhook,
			WebhooksDescPutRequest webhooksDescPutReq) {
		WebResource webResource = getApiResource().path("webhooks").path(idWebhook).path("description");
		return (String) putData(webhooksDescPutReq, webResource, String.class);
	}
	public String updateWebhooksIdModel(String idWebhook,WebhooksDescPutRequest webhooksDescPutReq) {
		WebResource webResource = getApiResource().path("webhooks").path(idWebhook).path("idModel");
		return (String) putData(webhooksDescPutReq, webResource, String.class);
	}
	//POST webhooks
	public String postWebhook(WebhooksPutRequest webhooksPostReq) {
		WebResource webResource = getApiResource().path("webhooks");
		return (String) postData(webhooksPostReq, webResource, String.class);
	}
	//DELETE Webhooks 
	public StatusResponse deleteWebhookById(String idWebhook) {
		WebResource webResource = getApiResource().path("webhooks").path(idWebhook);
		return (StatusResponse) deleteData(webResource);
	}
//GET Methods for Organizations
	public OrganizationGetResponse getOrganizationById(String organizationId, String actions,
			Boolean actions_entities, Boolean actions_display,
			Integer actions_limit, String action_fields, String memberships,
			Boolean memberships_member, String memberships_member_fields,
			String members, String member_fields, Boolean member_activity,
			String membersInvited, String membersInvited_fields, String boards,
			String board_fields, String board_actions,
			Boolean board_actions_entities, Boolean board_actions_display,
			String board_actions_format, String board_actions_since,
			Integer board_actions_limit, String board_action_fields,
			String board_lists, String paid_account, String fields) {
		WebResource webResource = getApiResource().path("organizations").path("organizationId");
	    MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
	    if (actions != null) {
	      queryParams.add("actions", actions);
	    }
	    if (actions_entities != null) {
	      queryParams.add("actions_entities", String.valueOf(actions_entities));
	    }
	    if (actions_display != null) {
		      queryParams.add("actions_display", String.valueOf(actions_display));
		    }
	    if (actions_limit != null) {
		      queryParams.add("actions_limit", String.valueOf(actions_limit));
		    }
	    if (action_fields != null) {
		      queryParams.add("action_fields",action_fields);
		    }
	    if (memberships != null) {
		      queryParams.add("memberships",memberships);
		    }
	    if (memberships_member != null) {
		      queryParams.add("memberships_member",String.valueOf(memberships_member));
		    }
	    if (memberships_member_fields != null) {
		      queryParams.add("memberships_member_fields",memberships_member_fields);
		    }
	    if (members != null) {
		      queryParams.add("members",members);
		    }
	    if (member_fields != null) {
		      queryParams.add("member_fields",member_fields);
		    }
	    if (member_activity != null) {
		      queryParams.add("member_activity",String.valueOf(member_activity));
		    }
	    if (membersInvited != null) {
		      queryParams.add("membersInvited",membersInvited);
		    }
	    if (membersInvited_fields != null) {
		      queryParams.add("membersInvited_fields",membersInvited_fields);
		    }
	    if (boards != null) {
		      queryParams.add("boards",boards);
		    }
	    if (board_fields != null) {
		      queryParams.add("board_fields",board_fields);
		    }
	    if (board_actions != null) {
		      queryParams.add("board_actions",board_actions);
		    }
	    if (board_actions_entities != null) {
		      queryParams.add("board_actions_entities",String.valueOf(board_actions_entities));
		    }
	    if (board_actions_display != null) {
		      queryParams.add("board_actions_display",String.valueOf(board_actions_display));
		    }
	    if (board_actions_format != null) {
		      queryParams.add("board_actions_format",board_actions_format);
		    }
	    if (board_actions_since != null) {
		      queryParams.add("board_actions_since",board_actions_since);
		    }
	    if (board_actions_limit != null) {
		      queryParams.add("board_actions_limit",String.valueOf(board_actions_limit));
		    }
	    if (board_action_fields != null) {
		      queryParams.add("board_action_fields",board_action_fields);
		    }
	    if (board_lists != null) {
		      queryParams.add("board_lists",board_lists);
		    }
	    if (paid_account != null) {
		      queryParams.add("paid_account",paid_account);
		    }
	    
	    if (fields != null) {
		      queryParams.add("fields",fields);
		    }
	    webResource = webResource.queryParams(queryParams);
	    return (OrganizationGetResponse) getData(webResource,OrganizationGetResponse.class);
	}
	
	
	
	private Object getData(WebResource webResource, Class<?> returnClass) {
		WebResource.Builder builder = addHeader(webResource);

		ClientResponse clientResponse = builder.get(ClientResponse.class);
		return buildResponseObject(returnClass, clientResponse);
	}
	private Object postData(Object request, WebResource webResource,
			Class<?> returnClass) {
		WebResource.Builder builder = addHeader(webResource);
		builder.type(MediaType.APPLICATION_JSON);
		ObjectMapper mapper = new ObjectMapper();
		String input = convertObjectToString(request, mapper);

		ClientResponse clientResponse = builder.post(ClientResponse.class,
				input);

		return buildResponseObject(returnClass, clientResponse);
	}
	private Object putData(Object request, WebResource webResource,
			Class<?> returnClass) {
		WebResource.Builder builder = addHeader(webResource);
		builder.type(MediaType.APPLICATION_JSON);
		ObjectMapper mapper = new ObjectMapper();
		String input = convertObjectToString(request, mapper);

		ClientResponse clientResponse = builder
				.put(ClientResponse.class, input);
		return buildResponseObject(returnClass, clientResponse);
	}
	private Object deleteData(WebResource webResource) {
		WebResource.Builder builder = addHeader(webResource);
		ClientResponse clientResponse = builder.delete(ClientResponse.class);
		return buildDeleteResponseObject(clientResponse);
	}
	private WebResource.Builder addHeader(WebResource webResource) {
		WebResource.Builder builder = webResource
				.accept(MediaType.APPLICATION_JSON);

		builder.header("Authorization", trelloConnector.getConfig()
				.getAuthorization());
		return builder;
	}
	private Object buildDeleteResponseObject(ClientResponse clientResponse) {
		StatusResponse statusResponse = new StatusResponse();
		statusResponse
				.setStatusCode(String.valueOf(clientResponse.getStatus()));
		return statusResponse;
	}

	private Object buildResponseObject(Class<?> returnClass,
			ClientResponse clientResponse) {

		StatusResponse statusResponse = null;
		if (clientResponse.getStatus() == 200) {
			statusResponse = (StatusResponse) clientResponse
					.getEntity(returnClass);
			statusResponse.setStatusCode("200");
		} else {

			String strResponse = clientResponse.getEntity(String.class);
			try {
				Constructor<?> ctor = returnClass.getConstructor();
				statusResponse = (StatusResponse) ctor.newInstance();
				statusResponse.setStatusCode(String.valueOf(clientResponse
						.getStatus()));
				statusResponse.setStatusMessage(strResponse);
			} catch (Exception ex) {
				log.log(Level.SEVERE, "Error", ex);
			}
		}

		return statusResponse;

	}

	private String convertObjectToString(Object request, ObjectMapper mapper) {
		String input = "";

		try {
			input = mapper.writeValueAsString(request);

		} catch (Exception ex) {
			log.log(Level.SEVERE, "Error", ex);
		}
		log.info("Input String = " + input);
		return input;
	}
	private WebResource getApiResource() {
		return apiResource;
	}



	






	

	




	

	










	

	






	

	





	

	



	

	

	

	

	
	

	

	

	









	

	








	



	

	




	







	



	


	

	




	

	


	


	

	

	

	







	












	








	



	

	
	




	



















	
	
	


	


	

	



	

	


	

}
