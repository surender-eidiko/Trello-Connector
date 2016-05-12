
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
import org.mule.common.metadata.DefaultPojoMetaDataModel;
import org.mule.common.metadata.DefaultSimpleMetaDataModel;
import org.mule.common.metadata.MetaData;
import org.mule.common.metadata.MetaDataKey;
import org.mule.common.metadata.MetaDataModel;
import org.mule.common.metadata.OperationMetaDataEnabled;
import org.mule.common.metadata.datatype.DataType;
import org.mule.common.metadata.datatype.DataTypeFactory;
import org.mule.devkit.processor.DevkitBasedMessageProcessor;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.bean.BoardsByIdAndMembersByIdCardsGetResponse;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * GetBoardsByIdAndMembersByIdWithCardsMessageProcessor invokes the {@link org.mule.modules.trello.TrelloConnector#getBoardsByIdAndMembersByIdWithCards(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String)} method in {@link TrelloConnector }. For each argument there is a field in this processor to match it.  Before invoking the actual method the processor will evaluate and transform where possible to the expected argument type.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.0", date = "2016-05-12T12:43:23+05:30", comments = "Build mule-devkit-3.7.0.2589.361fd9f")
public class GetBoardsByIdAndMembersByIdWithCardsMessageProcessor
    extends DevkitBasedMessageProcessor
    implements MessageProcessor, OperationMetaDataEnabled
{

    protected Object boardId;
    protected String _boardIdType;
    protected Object memberId;
    protected String _memberIdType;
    protected Object actions;
    protected String _actionsType;
    protected Object attachments;
    protected String _attachmentsType;
    protected Object attachment_fields;
    protected String _attachment_fieldsType;
    protected Object member;
    protected Boolean _memberType;
    protected Object member_fields;
    protected String _member_fieldsType;
    protected Object checkItemStates;
    protected Boolean _checkItemStatesType;
    protected Object checkLists;
    protected String _checkListsType;
    protected Object boards;
    protected Boolean _boardsType;
    protected Object board_fields;
    protected String _board_fieldsType;
    protected Object list;
    protected Boolean _listType;
    protected Object list_fields;
    protected String _list_fieldsType;
    protected Object filter;
    protected String _filterType;
    protected Object fields;
    protected String _fieldsType;

    public GetBoardsByIdAndMembersByIdWithCardsMessageProcessor(String operationName) {
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
     * Sets member
     * 
     * @param value Value to set
     */
    public void setMember(Object value) {
        this.member = value;
    }

    /**
     * Sets boardId
     * 
     * @param value Value to set
     */
    public void setBoardId(Object value) {
        this.boardId = value;
    }

    /**
     * Sets checkItemStates
     * 
     * @param value Value to set
     */
    public void setCheckItemStates(Object value) {
        this.checkItemStates = value;
    }

    /**
     * Sets list
     * 
     * @param value Value to set
     */
    public void setList(Object value) {
        this.list = value;
    }

    /**
     * Sets checkLists
     * 
     * @param value Value to set
     */
    public void setCheckLists(Object value) {
        this.checkLists = value;
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
     * Sets boards
     * 
     * @param value Value to set
     */
    public void setBoards(Object value) {
        this.boards = value;
    }

    /**
     * Sets attachment_fields
     * 
     * @param value Value to set
     */
    public void setAttachment_fields(Object value) {
        this.attachment_fields = value;
    }

    /**
     * Sets list_fields
     * 
     * @param value Value to set
     */
    public void setList_fields(Object value) {
        this.list_fields = value;
    }

    /**
     * Sets memberId
     * 
     * @param value Value to set
     */
    public void setMemberId(Object value) {
        this.memberId = value;
    }

    /**
     * Sets attachments
     * 
     * @param value Value to set
     */
    public void setAttachments(Object value) {
        this.attachments = value;
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
     * Sets filter
     * 
     * @param value Value to set
     */
    public void setFilter(Object value) {
        this.filter = value;
    }

    /**
     * Sets actions
     * 
     * @param value Value to set
     */
    public void setActions(Object value) {
        this.actions = value;
    }

    /**
     * Sets fields
     * 
     * @param value Value to set
     */
    public void setFields(Object value) {
        this.fields = value;
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
            final String _transformedBoardId = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdAndMembersByIdWithCardsMessageProcessor.class.getDeclaredField("_boardIdType").getGenericType(), null, boardId));
            final String _transformedMemberId = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdAndMembersByIdWithCardsMessageProcessor.class.getDeclaredField("_memberIdType").getGenericType(), null, memberId));
            final String _transformedActions = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdAndMembersByIdWithCardsMessageProcessor.class.getDeclaredField("_actionsType").getGenericType(), null, actions));
            final String _transformedAttachments = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdAndMembersByIdWithCardsMessageProcessor.class.getDeclaredField("_attachmentsType").getGenericType(), null, attachments));
            final String _transformedAttachment_fields = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdAndMembersByIdWithCardsMessageProcessor.class.getDeclaredField("_attachment_fieldsType").getGenericType(), null, attachment_fields));
            final Boolean _transformedMember = ((Boolean) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdAndMembersByIdWithCardsMessageProcessor.class.getDeclaredField("_memberType").getGenericType(), null, member));
            final String _transformedMember_fields = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdAndMembersByIdWithCardsMessageProcessor.class.getDeclaredField("_member_fieldsType").getGenericType(), null, member_fields));
            final Boolean _transformedCheckItemStates = ((Boolean) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdAndMembersByIdWithCardsMessageProcessor.class.getDeclaredField("_checkItemStatesType").getGenericType(), null, checkItemStates));
            final String _transformedCheckLists = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdAndMembersByIdWithCardsMessageProcessor.class.getDeclaredField("_checkListsType").getGenericType(), null, checkLists));
            final Boolean _transformedBoards = ((Boolean) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdAndMembersByIdWithCardsMessageProcessor.class.getDeclaredField("_boardsType").getGenericType(), null, boards));
            final String _transformedBoard_fields = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdAndMembersByIdWithCardsMessageProcessor.class.getDeclaredField("_board_fieldsType").getGenericType(), null, board_fields));
            final Boolean _transformedList = ((Boolean) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdAndMembersByIdWithCardsMessageProcessor.class.getDeclaredField("_listType").getGenericType(), null, list));
            final String _transformedList_fields = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdAndMembersByIdWithCardsMessageProcessor.class.getDeclaredField("_list_fieldsType").getGenericType(), null, list_fields));
            final String _transformedFilter = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdAndMembersByIdWithCardsMessageProcessor.class.getDeclaredField("_filterType").getGenericType(), null, filter));
            final String _transformedFields = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdAndMembersByIdWithCardsMessageProcessor.class.getDeclaredField("_fieldsType").getGenericType(), null, fields));
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
                    return ((TrelloConnector) object).getBoardsByIdAndMembersByIdWithCards(_transformedBoardId, _transformedMemberId, _transformedActions, _transformedAttachments, _transformedAttachment_fields, _transformedMember, _transformedMember_fields, _transformedCheckItemStates, _transformedCheckLists, _transformedBoards, _transformedBoard_fields, _transformedList, _transformedList_fields, _transformedFilter, _transformedFields);
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
        return new DefaultResult<MetaData>(new DefaultMetaData(getPojoOrSimpleModel(BoardsByIdAndMembersByIdCardsGetResponse.class)));
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
                    return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), "There was an error processing metadata at TrelloConnector at getBoardsByIdAndMembersByIdWithCards retrieving was successful but result is null");
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
