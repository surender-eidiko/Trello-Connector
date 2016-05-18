
package org.mule.modules.trello.bean.transformers;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Generated;
import org.mule.api.MuleContext;
import org.mule.api.MuleEvent;
import org.mule.api.endpoint.ImmutableEndpoint;
import org.mule.api.lifecycle.InitialisationException;
import org.mule.api.transformer.DataType;
import org.mule.api.transformer.DiscoverableTransformer;
import org.mule.api.transformer.MessageTransformer;
import org.mule.api.transformer.TransformerException;
import org.mule.api.transformer.TransformerMessagingException;
import org.mule.config.i18n.CoreMessages;
import org.mule.devkit.processor.ExpressionEvaluatorSupport;
import org.mule.modules.trello.bean.NotificationsPostRequest;
import org.mule.modules.trello.bean.holders.NotificationsPostRequestExpressionHolder;
import org.mule.transformer.types.DataTypeFactory;
import org.mule.transport.NullPayload;
import org.mule.util.TemplateParser;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.2", date = "2016-05-18T04:08:12+05:30", comments = "Build 3.7.x.2633.51164b9")
public class NotificationsPostRequestExpressionHolderTransformer
    extends ExpressionEvaluatorSupport
    implements DiscoverableTransformer, MessageTransformer
{

    private int weighting = DiscoverableTransformer.DEFAULT_PRIORITY_WEIGHTING;
    private ImmutableEndpoint endpoint;
    private MuleContext muleContext;
    private String name;

    public int getPriorityWeighting() {
        return weighting;
    }

    public void setPriorityWeighting(int weighting) {
        this.weighting = weighting;
    }

    public boolean isSourceTypeSupported(Class<?> aClass) {
        return (aClass == NotificationsPostRequestExpressionHolder.class);
    }

    public boolean isSourceDataTypeSupported(DataType<?> dataType) {
        return (dataType.getType() == NotificationsPostRequestExpressionHolder.class);
    }

    public List<Class<?>> getSourceTypes() {
        return Arrays.asList(new Class<?> [] {NotificationsPostRequestExpressionHolder.class });
    }

    public List<DataType<?>> getSourceDataTypes() {
        return Arrays.asList(new DataType<?> [] {DataTypeFactory.create(NotificationsPostRequestExpressionHolder.class)});
    }

    public boolean isAcceptNull() {
        return false;
    }

    public boolean isIgnoreBadInput() {
        return false;
    }

    public Object transform(Object src)
        throws TransformerException
    {
        throw new UnsupportedOperationException();
    }

    public Object transform(Object src, String encoding)
        throws TransformerException
    {
        throw new UnsupportedOperationException();
    }

    public void setReturnClass(Class<?> theClass) {
        throw new UnsupportedOperationException();
    }

    public Class<?> getReturnClass() {
        return NotificationsPostRequest.class;
    }

    public void setReturnDataType(DataType<?> type) {
        throw new UnsupportedOperationException();
    }

    public DataType<?> getReturnDataType() {
        return DataTypeFactory.create(NotificationsPostRequest.class);
    }

    public void setEndpoint(ImmutableEndpoint ep) {
        endpoint = ep;
    }

    public ImmutableEndpoint getEndpoint() {
        return endpoint;
    }

    public void dispose() {
    }

    public void initialise()
        throws InitialisationException
    {
    }

    public void setMuleContext(MuleContext context) {
        muleContext = context;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public Object transform(Object src, MuleEvent event)
        throws TransformerMessagingException
    {
        return transform(src, null, event);
    }

    public Object transform(Object src, String encoding, MuleEvent event)
        throws TransformerMessagingException
    {
        if (src == null) {
            return null;
        }
        NotificationsPostRequestExpressionHolder holder = ((NotificationsPostRequestExpressionHolder) src);
        NotificationsPostRequest result = new NotificationsPostRequest();
        try {
            final Boolean _transformedDisplay = ((Boolean) evaluateAndTransform(this.muleContext, event, NotificationsPostRequestExpressionHolder.class.getDeclaredField("_displayType").getGenericType(), null, holder.getDisplay()));
            result.setDisplay(_transformedDisplay);
            final Boolean _transformedEntities = ((Boolean) evaluateAndTransform(this.muleContext, event, NotificationsPostRequestExpressionHolder.class.getDeclaredField("_entitiesType").getGenericType(), null, holder.getEntities()));
            result.setEntities(_transformedEntities);
            final String _transformedFields = ((String) evaluateAndTransform(this.muleContext, event, NotificationsPostRequestExpressionHolder.class.getDeclaredField("_fieldsType").getGenericType(), null, holder.getFields()));
            result.setFields(_transformedFields);
            final String _transformedMemberCreator = ((String) evaluateAndTransform(this.muleContext, event, NotificationsPostRequestExpressionHolder.class.getDeclaredField("_memberCreatorType").getGenericType(), null, holder.getMemberCreator()));
            result.setMemberCreator(_transformedMemberCreator);
            final String _transformedMemberCreator_fields = ((String) evaluateAndTransform(this.muleContext, event, NotificationsPostRequestExpressionHolder.class.getDeclaredField("_memberCreator_fieldsType").getGenericType(), null, holder.getMemberCreator_fields()));
            result.setMemberCreator_fields(_transformedMemberCreator_fields);
            final Boolean _transformedBoard = ((Boolean) evaluateAndTransform(this.muleContext, event, NotificationsPostRequestExpressionHolder.class.getDeclaredField("_boardType").getGenericType(), null, holder.getBoard()));
            result.setBoard(_transformedBoard);
            final String _transformedBoard_fields = ((String) evaluateAndTransform(this.muleContext, event, NotificationsPostRequestExpressionHolder.class.getDeclaredField("_board_fieldsType").getGenericType(), null, holder.getBoard_fields()));
            result.setBoard_fields(_transformedBoard_fields);
            final Boolean _transformedList = ((Boolean) evaluateAndTransform(this.muleContext, event, NotificationsPostRequestExpressionHolder.class.getDeclaredField("_listType").getGenericType(), null, holder.getList()));
            result.setList(_transformedList);
            final Boolean _transformedCard = ((Boolean) evaluateAndTransform(this.muleContext, event, NotificationsPostRequestExpressionHolder.class.getDeclaredField("_cardType").getGenericType(), null, holder.getCard()));
            result.setCard(_transformedCard);
            final String _transformedCard_fields = ((String) evaluateAndTransform(this.muleContext, event, NotificationsPostRequestExpressionHolder.class.getDeclaredField("_card_fieldsType").getGenericType(), null, holder.getCard_fields()));
            result.setCard_fields(_transformedCard_fields);
            final Boolean _transformedOrganization = ((Boolean) evaluateAndTransform(this.muleContext, event, NotificationsPostRequestExpressionHolder.class.getDeclaredField("_organizationType").getGenericType(), null, holder.getOrganization()));
            result.setOrganization(_transformedOrganization);
            final String _transformedOrganization_fields = ((String) evaluateAndTransform(this.muleContext, event, NotificationsPostRequestExpressionHolder.class.getDeclaredField("_organization_fieldsType").getGenericType(), null, holder.getOrganization_fields()));
            result.setOrganization_fields(_transformedOrganization_fields);
            final Boolean _transformedMember = ((Boolean) evaluateAndTransform(this.muleContext, event, NotificationsPostRequestExpressionHolder.class.getDeclaredField("_memberType").getGenericType(), null, holder.getMember()));
            result.setMember(_transformedMember);
            final String _transformedMember_fields = ((String) evaluateAndTransform(this.muleContext, event, NotificationsPostRequestExpressionHolder.class.getDeclaredField("_member_fieldsType").getGenericType(), null, holder.getMember_fields()));
            result.setMember_fields(_transformedMember_fields);
        } catch (NoSuchFieldException e) {
            throw new TransformerMessagingException(CoreMessages.createStaticMessage("internal error"), event, this, e);
        } catch (TransformerException e) {
            throw new TransformerMessagingException(e.getI18nMessage(), event, this, e);
        }
        return result;
    }

    public MuleEvent process(MuleEvent event) {
        return null;
    }

    public String getMimeType() {
        return null;
    }

    public String getEncoding() {
        return null;
    }

    public MuleContext getMuleContext() {
        return muleContext;
    }

    private Object evaluateTransformForPayload(MuleContext muleContext, MuleEvent muleEvent, Type objectType, String mimeType, Object object)
        throws TransformerException, TransformerMessagingException
    {
        Object transformedObject;
        try {
            transformedObject = evaluateAndTransform(muleContext, muleEvent, objectType, mimeType, object);
            if (transformedObject instanceof NullPayload) {
                transformedObject = null;
            }
        } catch (TransformerException e) {
            transformedObject = evaluate(TemplateParser.createMuleStyleParser().getStyle(), muleContext.getExpressionManager(), muleEvent.getMessage(), object);
            if (transformedObject instanceof NullPayload) {
                transformedObject = null;
            } else {
                throw e;
            }
        } catch (TransformerMessagingException e) {
            transformedObject = evaluate(TemplateParser.createMuleStyleParser().getStyle(), muleContext.getExpressionManager(), muleEvent.getMessage(), object);
            if (transformedObject instanceof NullPayload) {
                transformedObject = null;
            } else {
                throw e;
            }
        }
        return transformedObject;
    }

}
