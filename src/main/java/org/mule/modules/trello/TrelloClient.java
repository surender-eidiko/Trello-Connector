/**
 *
 */
package org.mule.modules.trello;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

import org.codehaus.jackson.map.ObjectMapper;
import org.json.JSONArray;
import org.json.JSONObject;
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

	public BoardsByIdGetResponse getBoardById(String boardId, String token) {

		WebResource webResource = getApiResource().path("boards").path(boardId);
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		webResource = addKeyAndTokenToQueryParams(webResource, token);
		webResource = webResource.queryParams(queryParams);
		return (BoardsByIdGetResponse) getData(webResource,
				BoardsByIdGetResponse.class);
	}

	@SuppressWarnings("unchecked")
	public List<ListsUnderBoardsGetResponse> getAllListsUnderBoard(
			String boardId, String token) {
		WebResource webResource = getApiResource().path("boards").path(boardId)
				.path("lists");
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();

		webResource = addKeyAndTokenToQueryParams(webResource, token);
		webResource = webResource.queryParams(queryParams);
		return (List<ListsUnderBoardsGetResponse>) getListData(webResource,ArrayList.class);
	}

	// Boards PUT method requests
	public BoardsByIdPutResponse putBoardsById(String boardId,
			BoardsByIdPutRequest boardsByIdPutReq, String token) {
		WebResource webResource = getApiResource().path("boards").path(boardId);
		webResource = addKeyAndTokenToQueryParams(webResource, token);
		return (BoardsByIdPutResponse) putData(boardsByIdPutReq, webResource,
				BoardsByIdPutResponse.class);
	}

	// Boards POST methods
	public BoardsPostResponse postBoard(BoardsPostRequest boardssPostRequest,
			String token) {
		WebResource webResource = getApiResource().path("boards");
		webResource = addKeyAndTokenToQueryParams(webResource, token);
		return (BoardsPostResponse) postData(boardssPostRequest, webResource,
				BoardsPostResponse.class);
	}

	// Delete boards
	public StatusResponse deleteMemberUnderBoardById(String boardId,
			String memberId, String token) {
		WebResource webResource = getApiResource().path("boards").path(boardId)
				.path("members").path(memberId);
		webResource = addKeyAndTokenToQueryParams(webResource, token);
		return (StatusResponse) deleteData(webResource);
	}

	// Cards Client Methods
	public CardsByIdGetResponse getCardById(String cardIdOrShortlink,
			String token) {
		WebResource webResource = getApiResource().path("cards").path(
				cardIdOrShortlink);
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		webResource = addKeyAndTokenToQueryParams(webResource, token);
		webResource = webResource.queryParams(queryParams);
		return (CardsByIdGetResponse) getData(webResource,
				CardsByIdGetResponse.class);
	}
	public CardListGetResponse getCardListByCardId(String cardIdOrShortlink,String token,String fields) {
		WebResource webResource = getApiResource().path("cards").path(cardIdOrShortlink).path("list");
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if (fields != null) {
			queryParams.add("fields", fields);
		}
		webResource = addKeyAndTokenToQueryParams(webResource, token);
		webResource = webResource.queryParams(queryParams);
		return (CardListGetResponse) getData(webResource,CardListGetResponse.class);
	}


	// PUT Methods for Card
	public CardsByIdGetResponse updateCardById(String cardIdOrShortlink,
			CardsByIdPutRequest membershipsIdPutRequest, String token) {
		WebResource webResource = getApiResource().path("cards").path(
				cardIdOrShortlink);
		webResource = addKeyAndTokenToQueryParams(webResource, token);
		return (CardsByIdGetResponse) putData(membershipsIdPutRequest,
				webResource, CardsByIdGetResponse.class);
	}

	// Cards POST methods
	public CardsByIdGetResponse createCard(CardsPostRequest cardsPostReq,
			String token) {
		WebResource webResource = getApiResource().path("cards");
		webResource = addKeyAndTokenToQueryParams(webResource, token);
		return (CardsByIdGetResponse) postData(cardsPostReq, webResource,
				CardsByIdGetResponse.class);
	}

	// delete cards
	public StatusResponse deleteCardById(String cardIdOrShortLink, String token) {
		WebResource webResource = getApiResource().path("cards").path(
				cardIdOrShortLink);
		webResource = addKeyAndTokenToQueryParams(webResource, token);
		return (StatusResponse) deleteData(webResource);
	}

	// GET Lists
	public ListsByIdGetResponse getListById(String listId, String board,
			String token) {
		WebResource webResource = getApiResource().path("lists").path(listId);
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();

		if (board != null) {
			queryParams.add("board", board);
		}

		webResource = addKeyAndTokenToQueryParams(webResource, token);
		webResource = webResource.queryParams(queryParams);
		return (ListsByIdGetResponse) getData(webResource,
				ListsByIdGetResponse.class);
	}

	// PUT methods for Lists
	public ListsByIdGetResponse updateListById(String listId,
			ListsByIdPutRequest listsPutReq, String token) {
		WebResource webResource = getApiResource().path("lists").path(listId);
		webResource = addKeyAndTokenToQueryParams(webResource, token);
		return (ListsByIdGetResponse) putData(listsPutReq, webResource,
				ListsByIdGetResponse.class);
	}

	// POST Lists
	public ListPostResponse createList(ListsPostRequest listssPostReq,
			String token) {
		WebResource webResource = getApiResource().path("lists");
		webResource = addKeyAndTokenToQueryParams(webResource, token);
		return (ListPostResponse) postData(listssPostReq, webResource,
				ListPostResponse.class);
	}

	// Checklists GET methods
	public CheckListsByIdGetResponse getChecklistsById(String checklistId,
			String cards, String cardFields, String checkItems,
			String checkItemFields, String fields, String token) {
		WebResource webResource = getApiResource().path("checklists").path(
				checklistId);
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		if (cards != null) {
			queryParams.add("cards", cards);
		}
		if (cardFields != null) {
			queryParams.add("card_fields", cardFields);
		}
		if (checkItems != null) {
			queryParams.add("max", checkItems);
		}
		if (checkItemFields != null) {
			queryParams.add("max", checkItemFields);
		}
		if (fields != null) {
			queryParams.add("fields", fields);
		}
		webResource = addKeyAndTokenToQueryParams(webResource, token);
		webResource = webResource.queryParams(queryParams);
		return (CheckListsByIdGetResponse) getData(webResource,
				CheckListsByIdGetResponse.class);
	}

	// GET Webhooks
	public WebhooksPostResponse getWebhooksById(String idWebhook, String token) {
		WebResource webResource = getApiResource().path("webhooks").path(
				idWebhook);
		webResource = addKeyAndTokenToQueryParams(webResource, token);
		return (WebhooksPostResponse) getData(webResource,
				WebhooksPostResponse.class);
	}

	// PUT webhooks
	public WebhooksPostResponse updateWebhookById(String idWebhook,
			WebhooksByIdPutRequest webhookPutReq, String token) {
		WebResource webResource = getApiResource().path("webhooks").path(
				idWebhook);
		webResource = addKeyAndTokenToQueryParams(webResource, token);
		return (WebhooksPostResponse) putData(webhookPutReq, webResource,
				WebhooksPostResponse.class);
	}

	public WebhooksPostResponse updateWebhook(WebhooksPutRequest webhookPutReq,
			String token) {
		WebResource webResource = getApiResource().path("webhooks");
		webResource = addKeyAndTokenToQueryParams(webResource, token);
		return (WebhooksPostResponse) putData(webhookPutReq, webResource,
				WebhooksPostResponse.class);
	}

	/*
	 * POST webhooks
	 */
	public WebhooksPostResponse postWebhook(WebhooksPutRequest webhooksPostReq,
			String token) {
		WebResource webResource = getApiResource().path("webhooks");
		webResource = addKeyAndTokenToQueryParams(webResource, token);
		return (WebhooksPostResponse) postData(webhooksPostReq, webResource,WebhooksPostResponse.class);
	}

	/*
	 * 
	 * DELETE Webhooks
	 */
	public StatusResponse deleteWebhookById(String idWebhook, String token) {
		WebResource webResource = getApiResource().path("webhooks").path(
				idWebhook);
		webResource = addKeyAndTokenToQueryParams(webResource, token);
		return (StatusResponse) deleteData(webResource);
	}

	/*
	 * 
	 * Members Api Calls
	 */public MemberByIdGetresponse getMemberByIdOrUsername(String boards, String organizations, String token) {
		WebResource webResource = getApiResource().path("members").path("me");
		
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		
		queryParams.add("fields", "username,fullName,url,email");
		queryParams.add("boards", boards);
		queryParams.add("organizations", organizations);
		queryParams.add("organization_fields", "displayName");
		webResource = webResource.queryParams(queryParams);
		webResource = addKeyAndTokenToQueryParams(webResource, token);
		return (MemberByIdGetresponse) getData(webResource,
				MemberByIdGetresponse.class);

	}

	@SuppressWarnings("unchecked")
	public List<MembersBoardsGetResponse> getBoards(String id, String token) {
		WebResource webResource = getApiResource().path("members").path(id)
				.path("boards");
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		webResource = addKeyAndTokenToQueryParams(webResource, token);
		webResource = webResource.queryParams(queryParams);
		return (List<MembersBoardsGetResponse>) getAllBoardsData(webResource,
				ArrayList.class);
	}

	@SuppressWarnings("unchecked")
	public List<MembersBoardsGetResponse> getAllBoards(String token) {
		WebResource webResource = getApiResource().path("members").path("me")
				.path("boards");
		webResource = addKeyAndTokenToQueryParams(webResource, token);
		return (List<MembersBoardsGetResponse>) getAllBoardsData(webResource,
				ArrayList.class);
	}

	private Object getAllBoardsData(WebResource webResource,
			Class<?> returnClass) {
		WebResource.Builder builder = addHeader(webResource);
		ClientResponse clientResponse = builder.get(ClientResponse.class);
		return buildAllBoardsResponseObject(returnClass, clientResponse);
	}

	private Object getData(WebResource webResource, Class<?> returnClass) {
		WebResource.Builder builder = addHeader(webResource);
		ClientResponse clientResponse = builder.get(ClientResponse.class);
		return buildResponseObject(returnClass, clientResponse);
	}

	private Object getListData(WebResource webResource, Class<?> returnClass) {
		WebResource.Builder builder = addHeader(webResource);
		ClientResponse clientResponse = builder.get(ClientResponse.class);
		return buildListResponseObject(returnClass, clientResponse);
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
	  return  webResource.accept(
				MediaType.APPLICATION_JSON).accept(
				MediaType.APPLICATION_OCTET_STREAM);
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
		}		return statusResponse;
	}

	private Object buildListResponseObject(Class<?> returnClass,
			ClientResponse clientResponse) {
		StatusResponse statusResponse = null;
		if (clientResponse.getStatus() == 200) {
			String strResponse = clientResponse.getEntity(String.class);
			JSONArray json = new JSONArray(strResponse);
			List<ListsUnderBoardsGetResponse> list = new ArrayList<>();
			for (int i = 0; i < json.length(); i++) {
				JSONObject jsonObj = json.getJSONObject(i);

				try {
					ObjectMapper mapper = new ObjectMapper();
					ListsUnderBoardsGetResponse res = mapper.readValue(
							jsonObj.toString(),
							ListsUnderBoardsGetResponse.class);
					list.add(res);
				} catch (IOException e1) {
					log.log(Level.SEVERE, "Error", e1);
				}
			}
			return list;
		} else {
			String strResponse = clientResponse.getEntity(String.class);
			try {
				//Constructor<?> ctor = returnClass.getConstructor();
				//statusResponse = (StatusResponse) ctor.newInstance();
				statusResponse = new StatusResponse();
				statusResponse.setStatusCode(String.valueOf(clientResponse
						.getStatus()));
				statusResponse.setStatusMessage(strResponse);
			} catch (Exception ex) {
				log.log(Level.SEVERE, "Error", ex);
			}
		}
		return statusResponse;
	}

	private Object buildAllBoardsResponseObject(Class<?> returnClass,
			ClientResponse clientResponse) {
		StatusResponse statusResponse = null;
		System.out.println("Status Code :"+clientResponse.getStatus());
		if (clientResponse.getStatus() == 200) {
			String strResponse = clientResponse.getEntity(String.class);
			JSONArray json = new JSONArray(strResponse);
			List<MembersBoardsGetResponse> list = new ArrayList<>();
			for (int i = 0; i < json.length(); i++) {
				JSONObject jsonObj = json.getJSONObject(i);
				try {
					ObjectMapper mapper = new ObjectMapper();
					MembersBoardsGetResponse res = mapper.readValue(
							jsonObj.toString(), MembersBoardsGetResponse.class);
					list.add(res);
				} catch (IOException e1) {
					log.log(Level.SEVERE, "Error", e1);
				} 
			}
			return list;
		} else {
			String strResponse = clientResponse.getEntity(String.class);
			try {
				//Constructor<?> ctor = returnClass.getConstructor();
				//statusResponse = (StatusResponse) ctor.newInstance();
				statusResponse = new StatusResponse();
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
		String output = "";

		try {
			output = mapper.writeValueAsString(request);
		} catch (Exception ex) {
			log.log(Level.SEVERE, "Error", ex);
		}
		return output;
	}

	private WebResource getApiResource() {
		return apiResource;
	}

	private WebResource addKeyAndTokenToQueryParams(WebResource webResource,
			String token) {
		String appToken = token;
		WebResource resources = webResource;
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		String key = getTrelloConnector().getConfig().getApiKey();
		if (token == null || "".equals(token)) {
			appToken = getTrelloConnector().getConfig().getApiToken();
		}
		queryParams.add("token", appToken);
		queryParams.add("key", key);
		resources = resources.queryParams(queryParams);
		return resources;
	}

	
}
