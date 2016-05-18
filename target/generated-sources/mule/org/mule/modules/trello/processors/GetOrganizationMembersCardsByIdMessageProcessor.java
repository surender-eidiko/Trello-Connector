
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
 * GetOrganizationMembersCardsByIdMessageProcessor invokes the {@link org.mule.modules.trello.TrelloConnector#getOrganizationMembersCardsById(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)} method in {@link TrelloConnector }. For each argument there is a field in this processor to match it.  Before invoking the actual method the processor will evaluate and transform where possible to the expected argument type.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.2", date = "2016-05-18T04:08:12+05:30", comments = "Build 3.7.x.2633.51164b9")
public class GetOrganizationMembersCardsByIdMessageProcessor
    extends DevkitBasedMessageProcessor
    implements MessageProcessor, OperationMetaDataEnabled
{

    protected Object OrganizationId;
    protected String _OrganizationIdType;
    protected Object idMember;
    protected String _idMemberType;
    protected Object actions;
    protected String _actionsType;
    protected Object attachments;
    protected String _attachmentsType;
    protected Object attachment_fields;
    protected String _attachment_fieldsType;
    protected Object members;
    protected Boolean _membersType;
    protected Object member_fields;
    protected String _member_fieldsType;
    protected Object checkItemStates;
    protected Boolean _checkItemStatesType;
    protected Object checklists;
    protected String _checklistsType;
    protected Object board;
    protected Boolean _boardType;
    protected Object board_fields;
    protected String _board_fieldsType;
    protected Object list;
    protected String _listType;
    protected Object list_fields;
    protected String _list_fieldsType;
    protected Object filter;
    protected String _filterType;
    protected Object fields;
    protected String _fieldsType;

    public GetOrganizationMembersCardsByIdMessageProcessor(String operationName) {
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
     * Sets checkItemStates
     * 
     * @param value Value to set
     */
    public void setCheckItemStates(Object value) {
        this.checkItemStates = value;
    }

    /**
     * Sets idMember
     * 
     * @param value Value to set
     */
    public void setIdMember(Object value) {
        this.idMember = value;
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
     * Sets OrganizationId
     * 
     * @param value Value to set
     */
    public void setOrganizationId(Object value) {
        this.OrganizationId = value;
    }

    /**
     * Sets board
     * 
     * @param value Value to set
     */
    public void setBoard(Object value) {
        this.board = value;
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
     * Sets attachment_fields
     * 
     * @param value Value to set
     */
    public void setAttachment_fields(Object value) {
        this.attachment_fields = value;
    }

    /**
     * Sets checklists
     * 
     * @param value Value to set
     */
    public void setChecklists(Object value) {
        this.checklists = value;
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
     * Sets members
     * 
     * @param value Value to set
     */
    public void setMembers(Object value) {
        this.members = value;
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
            final String _transformedOrganizationId = ((String) evaluateAndTransform(getMuleContext(), event, GetOrganizationMembersCardsByIdMessageProcessor.class.getDeclaredField("_OrganizationIdType").getGenericType(), null, OrganizationId));
            final String _transformedIdMember = ((String) evaluateAndTransform(getMuleContext(), event, GetOrganizationMembersCardsByIdMessageProcessor.class.getDeclaredField("_idMemberType").getGenericType(), null, idMember));
            final String _transformedActions = ((String) evaluateAndTransform(getMuleContext(), event, GetOrganizationMembersCardsByIdMessageProcessor.class.getDeclaredField("_actionsType").getGenericType(), null, actions));
            final String _transformedAttachments = ((String) evaluateAndTransform(getMuleContext(), event, GetOrganizationMembersCardsByIdMessageProcessor.class.getDeclaredField("_attachmentsType").getGenericType(), null, attachments));
            final String _transformedAttachment_fields = ((String) evaluateAndTransform(getMuleContext(), event, GetOrganizationMembersCardsByIdMessageProcessor.class.getDeclaredField("_attachment_fieldsType").getGenericType(), null, attachment_fields));
            final Boolean _transformedMembers = ((Boolean) evaluateAndTransform(getMuleContext(), event, GetOrganizationMembersCardsByIdMessageProcessor.class.getDeclaredField("_membersType").getGenericType(), null, members));
            final String _transformedMember_fields = ((String) evaluateAndTransform(getMuleContext(), event, GetOrganizationMembersCardsByIdMessageProcessor.class.getDeclaredField("_member_fieldsType").getGenericType(), null, member_fields));
            final Boolean _transformedCheckItemStates = ((Boolean) evaluateAndTransform(getMuleContext(), event, GetOrganizationMembersCardsByIdMessageProcessor.class.getDeclaredField("_checkItemStatesType").getGenericType(), null, checkItemStates));
            final String _transformedChecklists = ((String) evaluateAndTransform(getMuleContext(), event, GetOrganizationMembersCardsByIdMessageProcessor.class.getDeclaredField("_checklistsType").getGenericType(), null, checklists));
            final Boolean _transformedBoard = ((Boolean) evaluateAndTransform(getMuleContext(), event, GetOrganizationMembersCardsByIdMessageProcessor.class.getDeclaredField("_boardType").getGenericType(), null, board));
            final String _transformedBoard_fields = ((String) evaluateAndTransform(getMuleContext(), event, GetOrganizationMembersCardsByIdMessageProcessor.class.getDeclaredField("_board_fieldsType").getGenericType(), null, board_fields));
            final String _transformedList = ((String) evaluateAndTransform(getMuleContext(), event, GetOrganizationMembersCardsByIdMessageProcessor.class.getDeclaredField("_listType").getGenericType(), null, list));
            final String _transformedList_fields = ((String) evaluateAndTransform(getMuleContext(), event, GetOrganizationMembersCardsByIdMessageProcessor.class.getDeclaredField("_list_fieldsType").getGenericType(), null, list_fields));
            final String _transformedFilter = ((String) evaluateAndTransform(getMuleContext(), event, GetOrganizationMembersCardsByIdMessageProcessor.class.getDeclaredField("_filterType").getGenericType(), null, filter));
            final String _transformedFields = ((String) evaluateAndTransform(getMuleContext(), event, GetOrganizationMembersCardsByIdMessageProcessor.class.getDeclaredField("_fieldsType").getGenericType(), null, fields));
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
                    return ((TrelloConnector) object).getOrganizationMembersCardsById(_transformedOrganizationId, _transformedIdMember, _transformedActions, _transformedAttachments, _transformedAttachment_fields, _transformedMembers, _transformedMember_fields, _transformedCheckItemStates, _transformedChecklists, _transformedBoard, _transformedBoard_fields, _transformedList, _transformedList_fields, _transformedFilter, _transformedFields);
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
                    return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), "There was an error processing metadata at TrelloConnector at getOrganizationMembersCardsById retrieving was successful but result is null");
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
