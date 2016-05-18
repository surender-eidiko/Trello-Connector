
package org.mule.modules.trello.processors;

import java.util.List;
import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleException;
import org.mule.api.config.ConfigurationException;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.lifecycle.InitialisationException;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.registry.RegistrationException;
import org.mule.common.DefaultResult;
import org.mule.common.FailureType;
import org.mule.common.Result;
import org.mule.common.metadata.ConnectorMetaDataEnabled;
import org.mule.common.metadata.DefaultMetaData;
import org.mule.common.metadata.DefaultMetaDataKey;
import org.mule.common.metadata.DefaultPojoMetaDataModel;
import org.mule.common.metadata.DefaultSimpleMetaDataModel;
import org.mule.common.metadata.MetaData;
import org.mule.common.metadata.MetaDataKey;
import org.mule.common.metadata.MetaDataModel;
import org.mule.common.metadata.OperationMetaDataEnabled;
import org.mule.common.metadata.datatype.DataType;
import org.mule.common.metadata.datatype.DataTypeFactory;
import org.mule.devkit.internal.metadata.fixes.STUDIO7157;
import org.mule.devkit.processor.DevkitBasedMessageProcessor;
import org.mule.modules.trello.TrelloConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * GetSearchQueryMessageProcessor invokes the {@link org.mule.modules.trello.TrelloConnector#getSearchQuery(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Boolean)} method in {@link TrelloConnector }. For each argument there is a field in this processor to match it.  Before invoking the actual method the processor will evaluate and transform where possible to the expected argument type.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.2", date = "2016-05-18T04:08:12+05:30", comments = "Build 3.7.x.2633.51164b9")
public class GetSearchQueryMessageProcessor
    extends DevkitBasedMessageProcessor
    implements MessageProcessor, OperationMetaDataEnabled
{

    protected Object query;
    protected String _queryType;
    protected Object idBoards;
    protected String _idBoardsType;
    protected Object idOrganizations;
    protected String _idOrganizationsType;
    protected Object idCards;
    protected String _idCardsType;
    protected Object modelTypes;
    protected String _modelTypesType;
    protected Object board_fields;
    protected String _board_fieldsType;
    protected Object card_fields;
    protected String _card_fieldsType;
    protected Object boards_limit;
    protected Integer _boards_limitType;
    protected Object cards_limit;
    protected Integer _cards_limitType;
    protected Object cards_page;
    protected Integer _cards_pageType;
    protected Object card_board;
    protected Boolean _card_boardType;
    protected Object card_list;
    protected String _card_listType;
    protected Object card_members;
    protected Boolean _card_membersType;
    protected Object card_stickers;
    protected Boolean _card_stickersType;
    protected Object card_attachments;
    protected String _card_attachmentsType;
    protected Object organization_fields;
    protected String _organization_fieldsType;
    protected Object organizations_limit;
    protected Integer _organizations_limitType;
    protected Object member_fields;
    protected String _member_fieldsType;
    protected Object members_limit;
    protected Integer _members_limitType;
    protected Object partial;
    protected Boolean _partialType;

    public GetSearchQueryMessageProcessor(String operationName) {
        super(operationName);
    }

    /**
     * Obtains the expression manager from the Mule context and initialises the connector. If a target object  has not been set already it will search the Mule registry for a default one.
     * 
     * @throws InitialisationException
     */
    public void initialise()
        throws InitialisationException
    {
    }

    @Override
    public void start()
        throws MuleException
    {
        super.start();
    }

    @Override
    public void stop()
        throws MuleException
    {
        super.stop();
    }

    @Override
    public void dispose() {
        super.dispose();
    }

    /**
     * Sets card_members
     * 
     * @param value Value to set
     */
    public void setCard_members(Object value) {
        this.card_members = value;
    }

    /**
     * Sets boards_limit
     * 
     * @param value Value to set
     */
    public void setBoards_limit(Object value) {
        this.boards_limit = value;
    }

    /**
     * Sets modelTypes
     * 
     * @param value Value to set
     */
    public void setModelTypes(Object value) {
        this.modelTypes = value;
    }

    /**
     * Sets card_stickers
     * 
     * @param value Value to set
     */
    public void setCard_stickers(Object value) {
        this.card_stickers = value;
    }

    /**
     * Sets query
     * 
     * @param value Value to set
     */
    public void setQuery(Object value) {
        this.query = value;
    }

    /**
     * Sets cards_page
     * 
     * @param value Value to set
     */
    public void setCards_page(Object value) {
        this.cards_page = value;
    }

    /**
     * Sets card_board
     * 
     * @param value Value to set
     */
    public void setCard_board(Object value) {
        this.card_board = value;
    }

    /**
     * Sets partial
     * 
     * @param value Value to set
     */
    public void setPartial(Object value) {
        this.partial = value;
    }

    /**
     * Sets board_fields
     * 
     * @param value Value to set
     */
    public void setBoard_fields(Object value) {
        this.board_fields = value;
    }

    /**
     * Sets idBoards
     * 
     * @param value Value to set
     */
    public void setIdBoards(Object value) {
        this.idBoards = value;
    }

    /**
     * Sets card_attachments
     * 
     * @param value Value to set
     */
    public void setCard_attachments(Object value) {
        this.card_attachments = value;
    }

    /**
     * Sets members_limit
     * 
     * @param value Value to set
     */
    public void setMembers_limit(Object value) {
        this.members_limit = value;
    }

    /**
     * Sets organizations_limit
     * 
     * @param value Value to set
     */
    public void setOrganizations_limit(Object value) {
        this.organizations_limit = value;
    }

    /**
     * Sets card_fields
     * 
     * @param value Value to set
     */
    public void setCard_fields(Object value) {
        this.card_fields = value;
    }

    /**
     * Sets organization_fields
     * 
     * @param value Value to set
     */
    public void setOrganization_fields(Object value) {
        this.organization_fields = value;
    }

    /**
     * Sets idOrganizations
     * 
     * @param value Value to set
     */
    public void setIdOrganizations(Object value) {
        this.idOrganizations = value;
    }

    /**
     * Sets card_list
     * 
     * @param value Value to set
     */
    public void setCard_list(Object value) {
        this.card_list = value;
    }

    /**
     * Sets member_fields
     * 
     * @param value Value to set
     */
    public void setMember_fields(Object value) {
        this.member_fields = value;
    }

    /**
     * Sets cards_limit
     * 
     * @param value Value to set
     */
    public void setCards_limit(Object value) {
        this.cards_limit = value;
    }

    /**
     * Sets idCards
     * 
     * @param value Value to set
     */
    public void setIdCards(Object value) {
        this.idCards = value;
    }

    /**
     * Invokes the MessageProcessor.
     * 
     * @param event MuleEvent to be processed
     * @throws Exception
     */
    public MuleEvent doProcess(final MuleEvent event)
        throws Exception
    {
        Object moduleObject = null;
        try {
            moduleObject = findOrCreate(null, false, event);
            final String _transformedQuery = ((String) evaluateAndTransform(getMuleContext(), event, GetSearchQueryMessageProcessor.class.getDeclaredField("_queryType").getGenericType(), null, query));
            final String _transformedIdBoards = ((String) evaluateAndTransform(getMuleContext(), event, GetSearchQueryMessageProcessor.class.getDeclaredField("_idBoardsType").getGenericType(), null, idBoards));
            final String _transformedIdOrganizations = ((String) evaluateAndTransform(getMuleContext(), event, GetSearchQueryMessageProcessor.class.getDeclaredField("_idOrganizationsType").getGenericType(), null, idOrganizations));
            final String _transformedIdCards = ((String) evaluateAndTransform(getMuleContext(), event, GetSearchQueryMessageProcessor.class.getDeclaredField("_idCardsType").getGenericType(), null, idCards));
            final String _transformedModelTypes = ((String) evaluateAndTransform(getMuleContext(), event, GetSearchQueryMessageProcessor.class.getDeclaredField("_modelTypesType").getGenericType(), null, modelTypes));
            final String _transformedBoard_fields = ((String) evaluateAndTransform(getMuleContext(), event, GetSearchQueryMessageProcessor.class.getDeclaredField("_board_fieldsType").getGenericType(), null, board_fields));
            final String _transformedCard_fields = ((String) evaluateAndTransform(getMuleContext(), event, GetSearchQueryMessageProcessor.class.getDeclaredField("_card_fieldsType").getGenericType(), null, card_fields));
            final Integer _transformedBoards_limit = ((Integer) evaluateAndTransform(getMuleContext(), event, GetSearchQueryMessageProcessor.class.getDeclaredField("_boards_limitType").getGenericType(), null, boards_limit));
            final Integer _transformedCards_limit = ((Integer) evaluateAndTransform(getMuleContext(), event, GetSearchQueryMessageProcessor.class.getDeclaredField("_cards_limitType").getGenericType(), null, cards_limit));
            final Integer _transformedCards_page = ((Integer) evaluateAndTransform(getMuleContext(), event, GetSearchQueryMessageProcessor.class.getDeclaredField("_cards_pageType").getGenericType(), null, cards_page));
            final Boolean _transformedCard_board = ((Boolean) evaluateAndTransform(getMuleContext(), event, GetSearchQueryMessageProcessor.class.getDeclaredField("_card_boardType").getGenericType(), null, card_board));
            final String _transformedCard_list = ((String) evaluateAndTransform(getMuleContext(), event, GetSearchQueryMessageProcessor.class.getDeclaredField("_card_listType").getGenericType(), null, card_list));
            final Boolean _transformedCard_members = ((Boolean) evaluateAndTransform(getMuleContext(), event, GetSearchQueryMessageProcessor.class.getDeclaredField("_card_membersType").getGenericType(), null, card_members));
            final Boolean _transformedCard_stickers = ((Boolean) evaluateAndTransform(getMuleContext(), event, GetSearchQueryMessageProcessor.class.getDeclaredField("_card_stickersType").getGenericType(), null, card_stickers));
            final String _transformedCard_attachments = ((String) evaluateAndTransform(getMuleContext(), event, GetSearchQueryMessageProcessor.class.getDeclaredField("_card_attachmentsType").getGenericType(), null, card_attachments));
            final String _transformedOrganization_fields = ((String) evaluateAndTransform(getMuleContext(), event, GetSearchQueryMessageProcessor.class.getDeclaredField("_organization_fieldsType").getGenericType(), null, organization_fields));
            final Integer _transformedOrganizations_limit = ((Integer) evaluateAndTransform(getMuleContext(), event, GetSearchQueryMessageProcessor.class.getDeclaredField("_organizations_limitType").getGenericType(), null, organizations_limit));
            final String _transformedMember_fields = ((String) evaluateAndTransform(getMuleContext(), event, GetSearchQueryMessageProcessor.class.getDeclaredField("_member_fieldsType").getGenericType(), null, member_fields));
            final Integer _transformedMembers_limit = ((Integer) evaluateAndTransform(getMuleContext(), event, GetSearchQueryMessageProcessor.class.getDeclaredField("_members_limitType").getGenericType(), null, members_limit));
            final Boolean _transformedPartial = ((Boolean) evaluateAndTransform(getMuleContext(), event, GetSearchQueryMessageProcessor.class.getDeclaredField("_partialType").getGenericType(), null, partial));
            Object resultPayload;
            final ProcessTemplate<Object, Object> processTemplate = ((ProcessAdapter<Object> ) moduleObject).getProcessTemplate();
            resultPayload = processTemplate.execute(new ProcessCallback<Object,Object>() {


                public List<Class<? extends Exception>> getManagedExceptions() {
                    return null;
                }

                public boolean isProtected() {
                    return false;
                }

                public Object process(Object object)
                    throws Exception
                {
                    return ((TrelloConnector) object).getSearchQuery(_transformedQuery, _transformedIdBoards, _transformedIdOrganizations, _transformedIdCards, _transformedModelTypes, _transformedBoard_fields, _transformedCard_fields, _transformedBoards_limit, _transformedCards_limit, _transformedCards_page, _transformedCard_board, _transformedCard_list, _transformedCard_members, _transformedCard_stickers, _transformedCard_attachments, _transformedOrganization_fields, _transformedOrganizations_limit, _transformedMember_fields, _transformedMembers_limit, _transformedPartial);
                }

            }
            , this, event);
            event.getMessage().setPayload(resultPayload);
            return event;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public Result<MetaData> getInputMetaData() {
        return new DefaultResult<MetaData>(null, (Result.Status.SUCCESS));
    }

    @Override
    public Result<MetaData> getOutputMetaData(MetaData inputMetadata) {
        MetaDataModel metaDataPayload = getPojoOrSimpleModel(String.class);
        DefaultMetaDataKey keyForStudio = new DefaultMetaDataKey("OUTPUT_METADATA", null);
        keyForStudio.setCategory("DataSenseResolver");
        metaDataPayload.addProperty(STUDIO7157 .getStructureIdentifierMetaDataModelProperty(keyForStudio, false, false));
        return new DefaultResult<MetaData>(new DefaultMetaData(metaDataPayload));
    }

    private MetaDataModel getPojoOrSimpleModel(Class clazz) {
        DataType dataType = DataTypeFactory.getInstance().getDataType(clazz);
        if (DataType.POJO.equals(dataType)) {
            return new DefaultPojoMetaDataModel(clazz);
        } else {
            return new DefaultSimpleMetaDataModel(dataType);
        }
    }

    public Result<MetaData> getGenericMetaData(MetaDataKey metaDataKey) {
        ConnectorMetaDataEnabled connector;
        try {
            connector = ((ConnectorMetaDataEnabled) findOrCreate(null, false, null));
            try {
                Result<MetaData> metadata = connector.getMetaData(metaDataKey);
                if ((Result.Status.FAILURE).equals(metadata.getStatus())) {
                    return metadata;
                }
                if (metadata.get() == null) {
                    return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), "There was an error processing metadata at TrelloConnector at getSearchQuery retrieving was successful but result is null");
                }
                return metadata;
            } catch (Exception e) {
                return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), e.getMessage(), FailureType.UNSPECIFIED, e);
            }
        } catch (ClassCastException cast) {
            return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), "There was an error getting metadata, there was no connection manager available. Maybe you're trying to use metadata from an Oauth connector");
        } catch (ConfigurationException e) {
            return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), e.getMessage(), FailureType.UNSPECIFIED, e);
        } catch (RegistrationException e) {
            return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), e.getMessage(), FailureType.UNSPECIFIED, e);
        } catch (IllegalAccessException e) {
            return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), e.getMessage(), FailureType.UNSPECIFIED, e);
        } catch (InstantiationException e) {
            return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), e.getMessage(), FailureType.UNSPECIFIED, e);
        } catch (Exception e) {
            return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), e.getMessage(), FailureType.UNSPECIFIED, e);
        }
    }

}
