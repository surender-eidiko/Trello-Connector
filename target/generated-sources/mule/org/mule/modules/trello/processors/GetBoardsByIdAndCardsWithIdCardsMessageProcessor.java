
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
 * GetBoardsByIdAndCardsWithIdCardsMessageProcessor invokes the {@link org.mule.modules.trello.TrelloConnector#getBoardsByIdAndCardsWithIdCards(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String)} method in {@link TrelloConnector }. For each argument there is a field in this processor to match it.  Before invoking the actual method the processor will evaluate and transform where possible to the expected argument type.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.2", date = "2016-05-20T07:24:31+05:30", comments = "Build 3.7.x.2633.51164b9")
public class GetBoardsByIdAndCardsWithIdCardsMessageProcessor
    extends DevkitBasedMessageProcessor
    implements MessageProcessor, OperationMetaDataEnabled
{

    protected Object boardId;
    protected String _boardIdType;
    protected Object idCard;
    protected String _idCardType;
    protected Object attachments;
    protected String _attachmentsType;
    protected Object attachment_fields;
    protected String _attachment_fieldsType;
    protected Object actions;
    protected String _actionsType;
    protected Object actions_entities;
    protected Boolean _actions_entitiesType;
    protected Object actions_display;
    protected Boolean _actions_displayType;
    protected Object actions_limit;
    protected Integer _actions_limitType;
    protected Object action_fields;
    protected String _action_fieldsType;
    protected Object action_memberCreator_fields;
    protected String _action_memberCreator_fieldsType;
    protected Object members;
    protected Boolean _membersType;
    protected Object member_fields;
    protected String _member_fieldsType;
    protected Object checkItemStates;
    protected Boolean _checkItemStatesType;
    protected Object checkItemState_fields;
    protected String _checkItemState_fieldsType;
    protected Object labels;
    protected Boolean _labelsType;
    protected Object checklists;
    protected String _checklistsType;
    protected Object checklist_fields;
    protected String _checklist_fieldsType;
    protected Object fields;
    protected String _fieldsType;

    public GetBoardsByIdAndCardsWithIdCardsMessageProcessor(String operationName) {
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
     * Sets boardId
     * 
     * @param value Value to set
     */
    public void setBoardId(Object value) {
        this.boardId = value;
    }

    /**
     * Sets idCard
     * 
     * @param value Value to set
     */
    public void setIdCard(Object value) {
        this.idCard = value;
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
     * Sets labels
     * 
     * @param value Value to set
     */
    public void setLabels(Object value) {
        this.labels = value;
    }

    /**
     * Sets actions_display
     * 
     * @param value Value to set
     */
    public void setActions_display(Object value) {
        this.actions_display = value;
    }

    /**
     * Sets actions_entities
     * 
     * @param value Value to set
     */
    public void setActions_entities(Object value) {
        this.actions_entities = value;
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
     * Sets checkItemState_fields
     * 
     * @param value Value to set
     */
    public void setCheckItemState_fields(Object value) {
        this.checkItemState_fields = value;
    }

    /**
     * Sets actions_limit
     * 
     * @param value Value to set
     */
    public void setActions_limit(Object value) {
        this.actions_limit = value;
    }

    /**
     * Sets action_memberCreator_fields
     * 
     * @param value Value to set
     */
    public void setAction_memberCreator_fields(Object value) {
        this.action_memberCreator_fields = value;
    }

    /**
     * Sets checklist_fields
     * 
     * @param value Value to set
     */
    public void setChecklist_fields(Object value) {
        this.checklist_fields = value;
    }

    /**
     * Sets action_fields
     * 
     * @param value Value to set
     */
    public void setAction_fields(Object value) {
        this.action_fields = value;
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
            final String _transformedBoardId = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdAndCardsWithIdCardsMessageProcessor.class.getDeclaredField("_boardIdType").getGenericType(), null, boardId));
            final String _transformedIdCard = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdAndCardsWithIdCardsMessageProcessor.class.getDeclaredField("_idCardType").getGenericType(), null, idCard));
            final String _transformedAttachments = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdAndCardsWithIdCardsMessageProcessor.class.getDeclaredField("_attachmentsType").getGenericType(), null, attachments));
            final String _transformedAttachment_fields = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdAndCardsWithIdCardsMessageProcessor.class.getDeclaredField("_attachment_fieldsType").getGenericType(), null, attachment_fields));
            final String _transformedActions = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdAndCardsWithIdCardsMessageProcessor.class.getDeclaredField("_actionsType").getGenericType(), null, actions));
            final Boolean _transformedActions_entities = ((Boolean) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdAndCardsWithIdCardsMessageProcessor.class.getDeclaredField("_actions_entitiesType").getGenericType(), null, actions_entities));
            final Boolean _transformedActions_display = ((Boolean) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdAndCardsWithIdCardsMessageProcessor.class.getDeclaredField("_actions_displayType").getGenericType(), null, actions_display));
            final Integer _transformedActions_limit = ((Integer) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdAndCardsWithIdCardsMessageProcessor.class.getDeclaredField("_actions_limitType").getGenericType(), null, actions_limit));
            final String _transformedAction_fields = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdAndCardsWithIdCardsMessageProcessor.class.getDeclaredField("_action_fieldsType").getGenericType(), null, action_fields));
            final String _transformedAction_memberCreator_fields = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdAndCardsWithIdCardsMessageProcessor.class.getDeclaredField("_action_memberCreator_fieldsType").getGenericType(), null, action_memberCreator_fields));
            final Boolean _transformedMembers = ((Boolean) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdAndCardsWithIdCardsMessageProcessor.class.getDeclaredField("_membersType").getGenericType(), null, members));
            final String _transformedMember_fields = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdAndCardsWithIdCardsMessageProcessor.class.getDeclaredField("_member_fieldsType").getGenericType(), null, member_fields));
            final Boolean _transformedCheckItemStates = ((Boolean) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdAndCardsWithIdCardsMessageProcessor.class.getDeclaredField("_checkItemStatesType").getGenericType(), null, checkItemStates));
            final String _transformedCheckItemState_fields = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdAndCardsWithIdCardsMessageProcessor.class.getDeclaredField("_checkItemState_fieldsType").getGenericType(), null, checkItemState_fields));
            final Boolean _transformedLabels = ((Boolean) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdAndCardsWithIdCardsMessageProcessor.class.getDeclaredField("_labelsType").getGenericType(), null, labels));
            final String _transformedChecklists = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdAndCardsWithIdCardsMessageProcessor.class.getDeclaredField("_checklistsType").getGenericType(), null, checklists));
            final String _transformedChecklist_fields = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdAndCardsWithIdCardsMessageProcessor.class.getDeclaredField("_checklist_fieldsType").getGenericType(), null, checklist_fields));
            final String _transformedFields = ((String) evaluateAndTransform(getMuleContext(), event, GetBoardsByIdAndCardsWithIdCardsMessageProcessor.class.getDeclaredField("_fieldsType").getGenericType(), null, fields));
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
                    return ((TrelloConnector) object).getBoardsByIdAndCardsWithIdCards(_transformedBoardId, _transformedIdCard, _transformedAttachments, _transformedAttachment_fields, _transformedActions, _transformedActions_entities, _transformedActions_display, _transformedActions_limit, _transformedAction_fields, _transformedAction_memberCreator_fields, _transformedMembers, _transformedMember_fields, _transformedCheckItemStates, _transformedCheckItemState_fields, _transformedLabels, _transformedChecklists, _transformedChecklist_fields, _transformedFields);
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
                    return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), "There was an error processing metadata at TrelloConnector at getBoardsByIdAndCardsWithIdCards retrieving was successful but result is null");
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
