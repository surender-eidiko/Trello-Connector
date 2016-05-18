
package org.mule.modules.trello.config;

import javax.annotation.Generated;
import org.mule.config.MuleManifest;
import org.mule.modules.trello.bean.holders.BoardsPostRequestExpressionHolder;
import org.mule.modules.trello.processors.PostBoardsMessageProcessor;
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
@Generated(value = "Mule DevKit Version 3.7.2", date = "2016-05-18T04:08:12+05:30", comments = "Build 3.7.x.2633.51164b9")
public class PostBoardsDefinitionParser
    extends AbstractDevkitBasedDefinitionParser
{

    private static Logger logger = LoggerFactory.getLogger(PostBoardsDefinitionParser.class);

    private BeanDefinitionBuilder getBeanDefinitionBuilder(ParserContext parserContext) {
        try {
            return BeanDefinitionBuilder.rootBeanDefinition(PostBoardsMessageProcessor.class.getName());
        } catch (NoClassDefFoundError noClassDefFoundError) {
            String muleVersion = "";
            try {
                muleVersion = MuleManifest.getProductVersion();
            } catch (Exception _x) {
                logger.error("Problem while reading mule version");
            }
            logger.error(("Cannot launch the mule app, the @Processor [post-boards] within the connector [trello] is not supported in mule "+ muleVersion));
            throw new BeanDefinitionParsingException(new Problem(("Cannot launch the mule app, the @Processor [post-boards] within the connector [trello] is not supported in mule "+ muleVersion), new Location(parserContext.getReaderContext().getResource()), null, noClassDefFoundError));
        }
    }

    public BeanDefinition parse(Element element, ParserContext parserContext) {
        BeanDefinitionBuilder builder = getBeanDefinitionBuilder(parserContext);
        builder.addConstructorArgValue("postBoards");
        builder.setScope(BeanDefinition.SCOPE_PROTOTYPE);
        if (!hasAttribute(element, "config-ref")) {
            throw new BeanDefinitionParsingException(new Problem("It seems that the config-ref for @Processor [post-boards] within the connector [trello] is null or missing. Please, fill the value with the correct global element.", new Location(parserContext.getReaderContext().getResource()), null));
        }
        parseConfigRef(element, builder);
        if (!parseObjectRef(element, builder, "boardss-post-request", "boardssPostRequest")) {
            BeanDefinitionBuilder boardssPostRequestBuilder = BeanDefinitionBuilder.rootBeanDefinition(BoardsPostRequestExpressionHolder.class.getName());
            Element boardssPostRequestChildElement = DomUtils.getChildElementByTagName(element, "boardss-post-request");
            if (boardssPostRequestChildElement!= null) {
                parseProperty(boardssPostRequestBuilder, boardssPostRequestChildElement, "name", "name");
                parseProperty(boardssPostRequestBuilder, boardssPostRequestChildElement, "defaultLists", "defaultLists");
                parseProperty(boardssPostRequestBuilder, boardssPostRequestChildElement, "desc", "desc");
                parseProperty(boardssPostRequestBuilder, boardssPostRequestChildElement, "idOrganization", "idOrganization");
                parseProperty(boardssPostRequestBuilder, boardssPostRequestChildElement, "idBoardSource", "idBoardSource");
                parseProperty(boardssPostRequestBuilder, boardssPostRequestChildElement, "keepFromSource", "keepFromSource");
                parseProperty(boardssPostRequestBuilder, boardssPostRequestChildElement, "powerUps", "powerUps");
                parseProperty(boardssPostRequestBuilder, boardssPostRequestChildElement, "prefs_permissionLevel", "prefs_permissionLevel");
                parseProperty(boardssPostRequestBuilder, boardssPostRequestChildElement, "prefs_voting", "prefs_voting");
                parseProperty(boardssPostRequestBuilder, boardssPostRequestChildElement, "prefs_comments", "prefs_comments");
                parseProperty(boardssPostRequestBuilder, boardssPostRequestChildElement, "prefs_invitations", "prefs_invitations");
                parseProperty(boardssPostRequestBuilder, boardssPostRequestChildElement, "prefs_selfJoin", "prefs_selfJoin");
                parseProperty(boardssPostRequestBuilder, boardssPostRequestChildElement, "prefs_cardCovers", "prefs_cardCovers");
                parseProperty(boardssPostRequestBuilder, boardssPostRequestChildElement, "prefs_background", "prefs_background");
                parseProperty(boardssPostRequestBuilder, boardssPostRequestChildElement, "prefs_cardAging", "prefs_cardAging");
                builder.addPropertyValue("boardssPostRequest", boardssPostRequestBuilder.getBeanDefinition());
            }
        }
        BeanDefinition definition = builder.getBeanDefinition();
        setNoRecurseOnDefinition(definition);
        attachProcessorDefinition(parserContext, definition);
        return definition;
    }

}
