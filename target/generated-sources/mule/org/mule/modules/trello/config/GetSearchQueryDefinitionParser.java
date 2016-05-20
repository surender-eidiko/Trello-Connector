
package org.mule.modules.trello.config;

import javax.annotation.Generated;
import org.mule.config.MuleManifest;
import org.mule.modules.trello.processors.GetSearchQueryMessageProcessor;
import org.mule.security.oauth.config.AbstractDevkitBasedDefinitionParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.parsing.BeanDefinitionParsingException;
import org.springframework.beans.factory.parsing.Location;
import org.springframework.beans.factory.parsing.Problem;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.2", date = "2016-05-20T07:24:31+05:30", comments = "Build 3.7.x.2633.51164b9")
public class GetSearchQueryDefinitionParser
    extends AbstractDevkitBasedDefinitionParser
{

    private static Logger logger = LoggerFactory.getLogger(GetSearchQueryDefinitionParser.class);

    private BeanDefinitionBuilder getBeanDefinitionBuilder(ParserContext parserContext) {
        try {
            return BeanDefinitionBuilder.rootBeanDefinition(GetSearchQueryMessageProcessor.class.getName());
        } catch (NoClassDefFoundError noClassDefFoundError) {
            String muleVersion = "";
            try {
                muleVersion = MuleManifest.getProductVersion();
            } catch (Exception _x) {
                logger.error("Problem while reading mule version");
            }
            logger.error(("Cannot launch the mule app, the @Processor [get-search-query] within the connector [trello] is not supported in mule "+ muleVersion));
            throw new BeanDefinitionParsingException(new Problem(("Cannot launch the mule app, the @Processor [get-search-query] within the connector [trello] is not supported in mule "+ muleVersion), new Location(parserContext.getReaderContext().getResource()), null, noClassDefFoundError));
        }
    }

    public BeanDefinition parse(Element element, ParserContext parserContext) {
        BeanDefinitionBuilder builder = getBeanDefinitionBuilder(parserContext);
        builder.addConstructorArgValue("getSearchQuery");
        builder.setScope(BeanDefinition.SCOPE_PROTOTYPE);
        if (!hasAttribute(element, "config-ref")) {
            throw new BeanDefinitionParsingException(new Problem("It seems that the config-ref for @Processor [get-search-query] within the connector [trello] is null or missing. Please, fill the value with the correct global element.", new Location(parserContext.getReaderContext().getResource()), null));
        }
        parseConfigRef(element, builder);
        parseProperty(builder, element, "query", "query");
        parseProperty(builder, element, "idBoards", "idBoards");
        parseProperty(builder, element, "idOrganizations", "idOrganizations");
        parseProperty(builder, element, "idCards", "idCards");
        parseProperty(builder, element, "modelTypes", "modelTypes");
        parseProperty(builder, element, "board_fields", "board_fields");
        parseProperty(builder, element, "card_fields", "card_fields");
        parseProperty(builder, element, "boards_limit", "boards_limit");
        parseProperty(builder, element, "cards_limit", "cards_limit");
        parseProperty(builder, element, "cards_page", "cards_page");
        parseProperty(builder, element, "card_board", "card_board");
        parseProperty(builder, element, "card_list", "card_list");
        parseProperty(builder, element, "card_members", "card_members");
        parseProperty(builder, element, "card_stickers", "card_stickers");
        parseProperty(builder, element, "card_attachments", "card_attachments");
        parseProperty(builder, element, "organization_fields", "organization_fields");
        parseProperty(builder, element, "organizations_limit", "organizations_limit");
        parseProperty(builder, element, "member_fields", "member_fields");
        parseProperty(builder, element, "members_limit", "members_limit");
        parseProperty(builder, element, "partial", "partial");
        BeanDefinition definition = builder.getBeanDefinition();
        setNoRecurseOnDefinition(definition);
        attachProcessorDefinition(parserContext, definition);
        return definition;
    }

}
