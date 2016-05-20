
package org.mule.modules.trello.config;

import javax.annotation.Generated;
import org.mule.config.MuleManifest;
import org.mule.modules.trello.bean.holders.BoardsByIdPutRequestExpressionHolder;
import org.mule.modules.trello.bean.holders.BoardsPrefExpressionHolder;
import org.mule.modules.trello.bean.holders.LabelNamesExpressionHolder;
import org.mule.modules.trello.processors.PutBoardsByIdMessageProcessor;
import org.mule.security.oauth.config.AbstractDevkitBasedDefinitionParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.parsing.BeanDefinitionParsingException;
import org.springframework.beans.factory.parsing.Location;
import org.springframework.beans.factory.parsing.Problem;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.util.xml.DomUtils;
import org.w3c.dom.Element;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.2", date = "2016-05-20T07:24:31+05:30", comments = "Build 3.7.x.2633.51164b9")
public class PutBoardsByIdDefinitionParser
    extends AbstractDevkitBasedDefinitionParser
{

    private static Logger logger = LoggerFactory.getLogger(PutBoardsByIdDefinitionParser.class);

    private BeanDefinitionBuilder getBeanDefinitionBuilder(ParserContext parserContext) {
        try {
            return BeanDefinitionBuilder.rootBeanDefinition(PutBoardsByIdMessageProcessor.class.getName());
        } catch (NoClassDefFoundError noClassDefFoundError) {
            String muleVersion = "";
            try {
                muleVersion = MuleManifest.getProductVersion();
            } catch (Exception _x) {
                logger.error("Problem while reading mule version");
            }
            logger.error(("Cannot launch the mule app, the @Processor [put-boards-by-id] within the connector [trello] is not supported in mule "+ muleVersion));
            throw new BeanDefinitionParsingException(new Problem(("Cannot launch the mule app, the @Processor [put-boards-by-id] within the connector [trello] is not supported in mule "+ muleVersion), new Location(parserContext.getReaderContext().getResource()), null, noClassDefFoundError));
        }
    }

    public BeanDefinition parse(Element element, ParserContext parserContext) {
        BeanDefinitionBuilder builder = getBeanDefinitionBuilder(parserContext);
        builder.addConstructorArgValue("putBoardsById");
        builder.setScope(BeanDefinition.SCOPE_PROTOTYPE);
        if (!hasAttribute(element, "config-ref")) {
            throw new BeanDefinitionParsingException(new Problem("It seems that the config-ref for @Processor [put-boards-by-id] within the connector [trello] is null or missing. Please, fill the value with the correct global element.", new Location(parserContext.getReaderContext().getResource()), null));
        }
        parseConfigRef(element, builder);
        parseProperty(builder, element, "boardId", "boardId");
        if (!parseObjectRef(element, builder, "boards-by-id-put-req", "boardsByIdPutReq")) {
            BeanDefinitionBuilder boardsByIdPutReqBuilder = BeanDefinitionBuilder.rootBeanDefinition(BoardsByIdPutRequestExpressionHolder.class.getName());
            Element boardsByIdPutReqChildElement = DomUtils.getChildElementByTagName(element, "boards-by-id-put-req");
            if (boardsByIdPutReqChildElement!= null) {
                parseProperty(boardsByIdPutReqBuilder, boardsByIdPutReqChildElement, "name", "name");
                parseProperty(boardsByIdPutReqBuilder, boardsByIdPutReqChildElement, "desc", "desc");
                parseProperty(boardsByIdPutReqBuilder, boardsByIdPutReqChildElement, "closed", "closed");
                parseProperty(boardsByIdPutReqBuilder, boardsByIdPutReqChildElement, "subscribed", "subscribed");
                parseProperty(boardsByIdPutReqBuilder, boardsByIdPutReqChildElement, "idOrganization", "idOrganization");
                if (!parseObjectRef(boardsByIdPutReqChildElement, boardsByIdPutReqBuilder, "prefs", "prefs")) {
                    BeanDefinitionBuilder _prefsBuilder = BeanDefinitionBuilder.rootBeanDefinition(BoardsPrefExpressionHolder.class.getName());
                    Element _prefsChildElement = DomUtils.getChildElementByTagName(boardsByIdPutReqChildElement, "prefs");
                    if (_prefsChildElement!= null) {
                        parseProperty(_prefsBuilder, _prefsChildElement, "permissionLevel", "permissionLevel");
                        parseProperty(_prefsBuilder, _prefsChildElement, "selfJoin", "selfJoin");
                        parseProperty(_prefsBuilder, _prefsChildElement, "cardCovers", "cardCovers");
                        parseProperty(_prefsBuilder, _prefsChildElement, "invitations", "invitations");
                        parseProperty(_prefsBuilder, _prefsChildElement, "voting", "voting");
                        parseProperty(_prefsBuilder, _prefsChildElement, "comments", "comments");
                        parseProperty(_prefsBuilder, _prefsChildElement, "background", "background");
                        parseProperty(_prefsBuilder, _prefsChildElement, "cardAging", "cardAging");
                        parseProperty(_prefsBuilder, _prefsChildElement, "calendarFeedEnabled", "calendarFeedEnabled");
                        boardsByIdPutReqBuilder.addPropertyValue("prefs", _prefsBuilder.getBeanDefinition());
                    }
                }
                if (!parseObjectRef(boardsByIdPutReqChildElement, boardsByIdPutReqBuilder, "label-names", "labelNames")) {
                    BeanDefinitionBuilder _labelNamesBuilder = BeanDefinitionBuilder.rootBeanDefinition(LabelNamesExpressionHolder.class.getName());
                    Element _labelNamesChildElement = DomUtils.getChildElementByTagName(boardsByIdPutReqChildElement, "label-names");
                    if (_labelNamesChildElement!= null) {
                        parseProperty(_labelNamesBuilder, _labelNamesChildElement, "orange", "orange");
                        parseProperty(_labelNamesBuilder, _labelNamesChildElement, "sky", "sky");
                        parseProperty(_labelNamesBuilder, _labelNamesChildElement, "red", "red");
                        parseProperty(_labelNamesBuilder, _labelNamesChildElement, "purple", "purple");
                        parseProperty(_labelNamesBuilder, _labelNamesChildElement, "blue", "blue");
                        parseProperty(_labelNamesBuilder, _labelNamesChildElement, "green", "green");
                        parseProperty(_labelNamesBuilder, _labelNamesChildElement, "pink", "pink");
                        parseProperty(_labelNamesBuilder, _labelNamesChildElement, "lime", "lime");
                        parseProperty(_labelNamesBuilder, _labelNamesChildElement, "yellow", "yellow");
                        parseProperty(_labelNamesBuilder, _labelNamesChildElement, "black", "black");
                        boardsByIdPutReqBuilder.addPropertyValue("labelNames", _labelNamesBuilder.getBeanDefinition());
                    }
                }
                builder.addPropertyValue("boardsByIdPutReq", boardsByIdPutReqBuilder.getBeanDefinition());
            }
        }
        BeanDefinition definition = builder.getBeanDefinition();
        setNoRecurseOnDefinition(definition);
        attachProcessorDefinition(parserContext, definition);
        return definition;
    }

}
