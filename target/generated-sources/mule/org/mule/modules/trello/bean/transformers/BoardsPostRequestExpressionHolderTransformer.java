
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
import org.mule.modules.trello.bean.BoardsPostRequest;
import org.mule.modules.trello.bean.holders.BoardsPostRequestExpressionHolder;
import org.mule.transformer.types.DataTypeFactory;
import org.mule.transport.NullPayload;
import org.mule.util.TemplateParser;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.2", date = "2016-05-18T04:08:12+05:30", comments = "Build 3.7.x.2633.51164b9")
public class BoardsPostRequestExpressionHolderTransformer
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
        return (aClass == BoardsPostRequestExpressionHolder.class);
    }

    public boolean isSourceDataTypeSupported(DataType<?> dataType) {
        return (dataType.getType() == BoardsPostRequestExpressionHolder.class);
    }

    public List<Class<?>> getSourceTypes() {
        return Arrays.asList(new Class<?> [] {BoardsPostRequestExpressionHolder.class });
    }

    public List<DataType<?>> getSourceDataTypes() {
        return Arrays.asList(new DataType<?> [] {DataTypeFactory.create(BoardsPostRequestExpressionHolder.class)});
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
        return BoardsPostRequest.class;
    }

    public void setReturnDataType(DataType<?> type) {
        throw new UnsupportedOperationException();
    }

    public DataType<?> getReturnDataType() {
        return DataTypeFactory.create(BoardsPostRequest.class);
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
        BoardsPostRequestExpressionHolder holder = ((BoardsPostRequestExpressionHolder) src);
        BoardsPostRequest result = new BoardsPostRequest();
        try {
            final String _transformedName = ((String) evaluateAndTransform(this.muleContext, event, BoardsPostRequestExpressionHolder.class.getDeclaredField("_nameType").getGenericType(), null, holder.getName()));
            result.setName(_transformedName);
            final Boolean _transformedDefaultLists = ((Boolean) evaluateAndTransform(this.muleContext, event, BoardsPostRequestExpressionHolder.class.getDeclaredField("_defaultListsType").getGenericType(), null, holder.getDefaultLists()));
            result.setDefaultLists(_transformedDefaultLists);
            final String _transformedDesc = ((String) evaluateAndTransform(this.muleContext, event, BoardsPostRequestExpressionHolder.class.getDeclaredField("_descType").getGenericType(), null, holder.getDesc()));
            result.setDesc(_transformedDesc);
            final String _transformedIdOrganization = ((String) evaluateAndTransform(this.muleContext, event, BoardsPostRequestExpressionHolder.class.getDeclaredField("_idOrganizationType").getGenericType(), null, holder.getIdOrganization()));
            result.setIdOrganization(_transformedIdOrganization);
            final String _transformedIdBoardSource = ((String) evaluateAndTransform(this.muleContext, event, BoardsPostRequestExpressionHolder.class.getDeclaredField("_idBoardSourceType").getGenericType(), null, holder.getIdBoardSource()));
            result.setIdBoardSource(_transformedIdBoardSource);
            final String _transformedKeepFromSource = ((String) evaluateAndTransform(this.muleContext, event, BoardsPostRequestExpressionHolder.class.getDeclaredField("_keepFromSourceType").getGenericType(), null, holder.getKeepFromSource()));
            result.setKeepFromSource(_transformedKeepFromSource);
            final String _transformedPowerUps = ((String) evaluateAndTransform(this.muleContext, event, BoardsPostRequestExpressionHolder.class.getDeclaredField("_powerUpsType").getGenericType(), null, holder.getPowerUps()));
            result.setPowerUps(_transformedPowerUps);
            final String _transformedPrefs_permissionLevel = ((String) evaluateAndTransform(this.muleContext, event, BoardsPostRequestExpressionHolder.class.getDeclaredField("_prefs_permissionLevelType").getGenericType(), null, holder.getPrefs_permissionLevel()));
            result.setPrefs_permissionLevel(_transformedPrefs_permissionLevel);
            final String _transformedPrefs_voting = ((String) evaluateAndTransform(this.muleContext, event, BoardsPostRequestExpressionHolder.class.getDeclaredField("_prefs_votingType").getGenericType(), null, holder.getPrefs_voting()));
            result.setPrefs_voting(_transformedPrefs_voting);
            final String _transformedPrefs_comments = ((String) evaluateAndTransform(this.muleContext, event, BoardsPostRequestExpressionHolder.class.getDeclaredField("_prefs_commentsType").getGenericType(), null, holder.getPrefs_comments()));
            result.setPrefs_comments(_transformedPrefs_comments);
            final String _transformedPrefs_invitations = ((String) evaluateAndTransform(this.muleContext, event, BoardsPostRequestExpressionHolder.class.getDeclaredField("_prefs_invitationsType").getGenericType(), null, holder.getPrefs_invitations()));
            result.setPrefs_invitations(_transformedPrefs_invitations);
            final Boolean _transformedPrefs_selfJoin = ((Boolean) evaluateAndTransform(this.muleContext, event, BoardsPostRequestExpressionHolder.class.getDeclaredField("_prefs_selfJoinType").getGenericType(), null, holder.getPrefs_selfJoin()));
            result.setPrefs_selfJoin(_transformedPrefs_selfJoin);
            final Boolean _transformedPrefs_cardCovers = ((Boolean) evaluateAndTransform(this.muleContext, event, BoardsPostRequestExpressionHolder.class.getDeclaredField("_prefs_cardCoversType").getGenericType(), null, holder.getPrefs_cardCovers()));
            result.setPrefs_cardCovers(_transformedPrefs_cardCovers);
            final String _transformedPrefs_background = ((String) evaluateAndTransform(this.muleContext, event, BoardsPostRequestExpressionHolder.class.getDeclaredField("_prefs_backgroundType").getGenericType(), null, holder.getPrefs_background()));
            result.setPrefs_background(_transformedPrefs_background);
            final String _transformedPrefs_cardAging = ((String) evaluateAndTransform(this.muleContext, event, BoardsPostRequestExpressionHolder.class.getDeclaredField("_prefs_cardAgingType").getGenericType(), null, holder.getPrefs_cardAging()));
            result.setPrefs_cardAging(_transformedPrefs_cardAging);
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
