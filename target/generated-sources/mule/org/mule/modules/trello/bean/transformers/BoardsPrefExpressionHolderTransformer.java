
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
import org.mule.modules.trello.bean.BoardsPref;
import org.mule.modules.trello.bean.holders.BoardsPrefExpressionHolder;
import org.mule.transformer.types.DataTypeFactory;
import org.mule.transport.NullPayload;
import org.mule.util.TemplateParser;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.2", date = "2016-05-18T04:08:12+05:30", comments = "Build 3.7.x.2633.51164b9")
public class BoardsPrefExpressionHolderTransformer
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
        return (aClass == BoardsPrefExpressionHolder.class);
    }

    public boolean isSourceDataTypeSupported(DataType<?> dataType) {
        return (dataType.getType() == BoardsPrefExpressionHolder.class);
    }

    public List<Class<?>> getSourceTypes() {
        return Arrays.asList(new Class<?> [] {BoardsPrefExpressionHolder.class });
    }

    public List<DataType<?>> getSourceDataTypes() {
        return Arrays.asList(new DataType<?> [] {DataTypeFactory.create(BoardsPrefExpressionHolder.class)});
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
        return BoardsPref.class;
    }

    public void setReturnDataType(DataType<?> type) {
        throw new UnsupportedOperationException();
    }

    public DataType<?> getReturnDataType() {
        return DataTypeFactory.create(BoardsPref.class);
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
        BoardsPrefExpressionHolder holder = ((BoardsPrefExpressionHolder) src);
        BoardsPref result = new BoardsPref();
        try {
            final String _transformedPermissionLevel = ((String) evaluateAndTransform(this.muleContext, event, BoardsPrefExpressionHolder.class.getDeclaredField("_permissionLevelType").getGenericType(), null, holder.getPermissionLevel()));
            result.setPermissionLevel(_transformedPermissionLevel);
            final Boolean _transformedSelfJoin = ((Boolean) evaluateAndTransform(this.muleContext, event, BoardsPrefExpressionHolder.class.getDeclaredField("_selfJoinType").getGenericType(), null, holder.getSelfJoin()));
            result.setSelfJoin(_transformedSelfJoin);
            final Boolean _transformedCardCovers = ((Boolean) evaluateAndTransform(this.muleContext, event, BoardsPrefExpressionHolder.class.getDeclaredField("_cardCoversType").getGenericType(), null, holder.getCardCovers()));
            result.setCardCovers(_transformedCardCovers);
            final String _transformedInvitations = ((String) evaluateAndTransform(this.muleContext, event, BoardsPrefExpressionHolder.class.getDeclaredField("_invitationsType").getGenericType(), null, holder.getInvitations()));
            result.setInvitations(_transformedInvitations);
            final String _transformedVoting = ((String) evaluateAndTransform(this.muleContext, event, BoardsPrefExpressionHolder.class.getDeclaredField("_votingType").getGenericType(), null, holder.getVoting()));
            result.setVoting(_transformedVoting);
            final String _transformedComments = ((String) evaluateAndTransform(this.muleContext, event, BoardsPrefExpressionHolder.class.getDeclaredField("_commentsType").getGenericType(), null, holder.getComments()));
            result.setComments(_transformedComments);
            final String _transformedBackground = ((String) evaluateAndTransform(this.muleContext, event, BoardsPrefExpressionHolder.class.getDeclaredField("_backgroundType").getGenericType(), null, holder.getBackground()));
            result.setBackground(_transformedBackground);
            final String _transformedCardAging = ((String) evaluateAndTransform(this.muleContext, event, BoardsPrefExpressionHolder.class.getDeclaredField("_cardAgingType").getGenericType(), null, holder.getCardAging()));
            result.setCardAging(_transformedCardAging);
            final Boolean _transformedCalendarFeedEnabled = ((Boolean) evaluateAndTransform(this.muleContext, event, BoardsPrefExpressionHolder.class.getDeclaredField("_calendarFeedEnabledType").getGenericType(), null, holder.getCalendarFeedEnabled()));
            result.setCalendarFeedEnabled(_transformedCalendarFeedEnabled);
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
