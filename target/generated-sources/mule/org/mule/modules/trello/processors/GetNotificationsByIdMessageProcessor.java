
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
 * GetNotificationsByIdMessageProcessor invokes the {@link org.mule.modules.trello.TrelloConnector#getNotificationsById(java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String)} method in {@link TrelloConnector }. For each argument there is a field in this processor to match it.  Before invoking the actual method the processor will evaluate and transform where possible to the expected argument type.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.2", date = "2016-05-18T04:08:12+05:30", comments = "Build 3.7.x.2633.51164b9")
public class GetNotificationsByIdMessageProcessor
    extends DevkitBasedMessageProcessor
    implements MessageProcessor, OperationMetaDataEnabled
{

    protected Object notificationId;
    protected String _notificationIdType;
    protected Object display;
    protected Boolean _displayType;
    protected Object entities;
    protected Boolean _entitiesType;
    protected Object fields;
    protected String _fieldsType;
    protected Object memberCreator;
    protected String _memberCreatorType;
    protected Object memberCreator_fields;
    protected String _memberCreator_fieldsType;
    protected Object board;
    protected Boolean _boardType;
    protected Object board_fields;
    protected String _board_fieldsType;
    protected Object list;
    protected Boolean _listType;
    protected Object card;
    protected Boolean _cardType;
    protected Object card_fields;
    protected String _card_fieldsType;
    protected Object organization;
    protected Boolean _organizationType;
    protected Object organization_fields;
    protected String _organization_fieldsType;
    protected Object member;
    protected Boolean _memberType;
    protected Object member_fields;
    protected String _member_fieldsType;

    public GetNotificationsByIdMessageProcessor(String operationName) {
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
     * Sets display
     * 
     * @param value Value to set
     */
    public void setDisplay(Object value) {
        this.display = value;
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
     * Sets board
     * 
     * @param value Value to set
     */
    public void setBoard(Object value) {
        this.board = value;
    }

    /**
     * Sets entities
     * 
     * @param value Value to set
     */
    public void setEntities(Object value) {
        this.entities = value;
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
     * Sets notificationId
     * 
     * @param value Value to set
     */
    public void setNotificationId(Object value) {
        this.notificationId = value;
    }

    /**
     * Sets memberCreator_fields
     * 
     * @param value Value to set
     */
    public void setMemberCreator_fields(Object value) {
        this.memberCreator_fields = value;
    }

    /**
     * Sets organization
     * 
     * @param value Value to set
     */
    public void setOrganization(Object value) {
        this.organization = value;
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
     * Sets card
     * 
     * @param value Value to set
     */
    public void setCard(Object value) {
        this.card = value;
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
     * Sets member_fields
     * 
     * @param value Value to set
     */
    public void setMember_fields(Object value) {
        this.member_fields = value;
    }

    /**
     * Sets memberCreator
     * 
     * @param value Value to set
     */
    public void setMemberCreator(Object value) {
        this.memberCreator = value;
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
            final String _transformedNotificationId = ((String) evaluateAndTransform(getMuleContext(), event, GetNotificationsByIdMessageProcessor.class.getDeclaredField("_notificationIdType").getGenericType(), null, notificationId));
            final Boolean _transformedDisplay = ((Boolean) evaluateAndTransform(getMuleContext(), event, GetNotificationsByIdMessageProcessor.class.getDeclaredField("_displayType").getGenericType(), null, display));
            final Boolean _transformedEntities = ((Boolean) evaluateAndTransform(getMuleContext(), event, GetNotificationsByIdMessageProcessor.class.getDeclaredField("_entitiesType").getGenericType(), null, entities));
            final String _transformedFields = ((String) evaluateAndTransform(getMuleContext(), event, GetNotificationsByIdMessageProcessor.class.getDeclaredField("_fieldsType").getGenericType(), null, fields));
            final String _transformedMemberCreator = ((String) evaluateAndTransform(getMuleContext(), event, GetNotificationsByIdMessageProcessor.class.getDeclaredField("_memberCreatorType").getGenericType(), null, memberCreator));
            final String _transformedMemberCreator_fields = ((String) evaluateAndTransform(getMuleContext(), event, GetNotificationsByIdMessageProcessor.class.getDeclaredField("_memberCreator_fieldsType").getGenericType(), null, memberCreator_fields));
            final Boolean _transformedBoard = ((Boolean) evaluateAndTransform(getMuleContext(), event, GetNotificationsByIdMessageProcessor.class.getDeclaredField("_boardType").getGenericType(), null, board));
            final String _transformedBoard_fields = ((String) evaluateAndTransform(getMuleContext(), event, GetNotificationsByIdMessageProcessor.class.getDeclaredField("_board_fieldsType").getGenericType(), null, board_fields));
            final Boolean _transformedList = ((Boolean) evaluateAndTransform(getMuleContext(), event, GetNotificationsByIdMessageProcessor.class.getDeclaredField("_listType").getGenericType(), null, list));
            final Boolean _transformedCard = ((Boolean) evaluateAndTransform(getMuleContext(), event, GetNotificationsByIdMessageProcessor.class.getDeclaredField("_cardType").getGenericType(), null, card));
            final String _transformedCard_fields = ((String) evaluateAndTransform(getMuleContext(), event, GetNotificationsByIdMessageProcessor.class.getDeclaredField("_card_fieldsType").getGenericType(), null, card_fields));
            final Boolean _transformedOrganization = ((Boolean) evaluateAndTransform(getMuleContext(), event, GetNotificationsByIdMessageProcessor.class.getDeclaredField("_organizationType").getGenericType(), null, organization));
            final String _transformedOrganization_fields = ((String) evaluateAndTransform(getMuleContext(), event, GetNotificationsByIdMessageProcessor.class.getDeclaredField("_organization_fieldsType").getGenericType(), null, organization_fields));
            final Boolean _transformedMember = ((Boolean) evaluateAndTransform(getMuleContext(), event, GetNotificationsByIdMessageProcessor.class.getDeclaredField("_memberType").getGenericType(), null, member));
            final String _transformedMember_fields = ((String) evaluateAndTransform(getMuleContext(), event, GetNotificationsByIdMessageProcessor.class.getDeclaredField("_member_fieldsType").getGenericType(), null, member_fields));
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
                    return ((TrelloConnector) object).getNotificationsById(_transformedNotificationId, _transformedDisplay, _transformedEntities, _transformedFields, _transformedMemberCreator, _transformedMemberCreator_fields, _transformedBoard, _transformedBoard_fields, _transformedList, _transformedCard, _transformedCard_fields, _transformedOrganization, _transformedOrganization_fields, _transformedMember, _transformedMember_fields);
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
                    return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), "There was an error processing metadata at TrelloConnector at getNotificationsById retrieving was successful but result is null");
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
