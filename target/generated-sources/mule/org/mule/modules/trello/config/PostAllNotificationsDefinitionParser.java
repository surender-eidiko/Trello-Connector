
package org.mule.modules.trello.config;

import javax.annotation.Generated;
import org.mule.config.MuleManifest;
import org.mule.modules.trello.bean.holders.NotificationsPostRequestExpressionHolder;
import org.mule.modules.trello.processors.PostAllNotificationsMessageProcessor;
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
public class PostAllNotificationsDefinitionParser
    extends AbstractDevkitBasedDefinitionParser
{

    private static Logger logger = LoggerFactory.getLogger(PostAllNotificationsDefinitionParser.class);

    private BeanDefinitionBuilder getBeanDefinitionBuilder(ParserContext parserContext) {
        try {
            return BeanDefinitionBuilder.rootBeanDefinition(PostAllNotificationsMessageProcessor.class.getName());
        } catch (NoClassDefFoundError noClassDefFoundError) {
            String muleVersion = "";
            try {
                muleVersion = MuleManifest.getProductVersion();
            } catch (Exception _x) {
                logger.error("Problem while reading mule version");
            }
            logger.error(("Cannot launch the mule app, the @Processor [post-all-notifications] within the connector [trello] is not supported in mule "+ muleVersion));
            throw new BeanDefinitionParsingException(new Problem(("Cannot launch the mule app, the @Processor [post-all-notifications] within the connector [trello] is not supported in mule "+ muleVersion), new Location(parserContext.getReaderContext().getResource()), null, noClassDefFoundError));
        }
    }

    public BeanDefinition parse(Element element, ParserContext parserContext) {
        BeanDefinitionBuilder builder = getBeanDefinitionBuilder(parserContext);
        builder.addConstructorArgValue("postAllNotifications");
        builder.setScope(BeanDefinition.SCOPE_PROTOTYPE);
        if (!hasAttribute(element, "config-ref")) {
            throw new BeanDefinitionParsingException(new Problem("It seems that the config-ref for @Processor [post-all-notifications] within the connector [trello] is null or missing. Please, fill the value with the correct global element.", new Location(parserContext.getReaderContext().getResource()), null));
        }
        parseConfigRef(element, builder);
        if (!parseObjectRef(element, builder, "notifications-post-req", "notificationsPostReq")) {
            BeanDefinitionBuilder notificationsPostReqBuilder = BeanDefinitionBuilder.rootBeanDefinition(NotificationsPostRequestExpressionHolder.class.getName());
            Element notificationsPostReqChildElement = DomUtils.getChildElementByTagName(element, "notifications-post-req");
            if (notificationsPostReqChildElement!= null) {
                parseProperty(notificationsPostReqBuilder, notificationsPostReqChildElement, "display", "display");
                parseProperty(notificationsPostReqBuilder, notificationsPostReqChildElement, "entities", "entities");
                parseProperty(notificationsPostReqBuilder, notificationsPostReqChildElement, "fields", "fields");
                parseProperty(notificationsPostReqBuilder, notificationsPostReqChildElement, "memberCreator", "memberCreator");
                parseProperty(notificationsPostReqBuilder, notificationsPostReqChildElement, "memberCreator_fields", "memberCreator_fields");
                parseProperty(notificationsPostReqBuilder, notificationsPostReqChildElement, "board", "board");
                parseProperty(notificationsPostReqBuilder, notificationsPostReqChildElement, "board_fields", "board_fields");
                parseProperty(notificationsPostReqBuilder, notificationsPostReqChildElement, "list", "list");
                parseProperty(notificationsPostReqBuilder, notificationsPostReqChildElement, "card", "card");
                parseProperty(notificationsPostReqBuilder, notificationsPostReqChildElement, "card_fields", "card_fields");
                parseProperty(notificationsPostReqBuilder, notificationsPostReqChildElement, "organization", "organization");
                parseProperty(notificationsPostReqBuilder, notificationsPostReqChildElement, "organization_fields", "organization_fields");
                parseProperty(notificationsPostReqBuilder, notificationsPostReqChildElement, "member", "member");
                parseProperty(notificationsPostReqBuilder, notificationsPostReqChildElement, "member_fields", "member_fields");
                builder.addPropertyValue("notificationsPostReq", notificationsPostReqBuilder.getBeanDefinition());
            }
        }
        BeanDefinition definition = builder.getBeanDefinition();
        setNoRecurseOnDefinition(definition);
        attachProcessorDefinition(parserContext, definition);
        return definition;
    }

}
