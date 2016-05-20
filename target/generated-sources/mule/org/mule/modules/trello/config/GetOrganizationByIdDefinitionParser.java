
package org.mule.modules.trello.config;

import javax.annotation.Generated;
import org.mule.config.MuleManifest;
import org.mule.modules.trello.processors.GetOrganizationByIdMessageProcessor;
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
public class GetOrganizationByIdDefinitionParser
    extends AbstractDevkitBasedDefinitionParser
{

    private static Logger logger = LoggerFactory.getLogger(GetOrganizationByIdDefinitionParser.class);

    private BeanDefinitionBuilder getBeanDefinitionBuilder(ParserContext parserContext) {
        try {
            return BeanDefinitionBuilder.rootBeanDefinition(GetOrganizationByIdMessageProcessor.class.getName());
        } catch (NoClassDefFoundError noClassDefFoundError) {
            String muleVersion = "";
            try {
                muleVersion = MuleManifest.getProductVersion();
            } catch (Exception _x) {
                logger.error("Problem while reading mule version");
            }
            logger.error(("Cannot launch the mule app, the @Processor [get-organization-by-id] within the connector [trello] is not supported in mule "+ muleVersion));
            throw new BeanDefinitionParsingException(new Problem(("Cannot launch the mule app, the @Processor [get-organization-by-id] within the connector [trello] is not supported in mule "+ muleVersion), new Location(parserContext.getReaderContext().getResource()), null, noClassDefFoundError));
        }
    }

    public BeanDefinition parse(Element element, ParserContext parserContext) {
        BeanDefinitionBuilder builder = getBeanDefinitionBuilder(parserContext);
        builder.addConstructorArgValue("getOrganizationById");
        builder.setScope(BeanDefinition.SCOPE_PROTOTYPE);
        if (!hasAttribute(element, "config-ref")) {
            throw new BeanDefinitionParsingException(new Problem("It seems that the config-ref for @Processor [get-organization-by-id] within the connector [trello] is null or missing. Please, fill the value with the correct global element.", new Location(parserContext.getReaderContext().getResource()), null));
        }
        parseConfigRef(element, builder);
        parseProperty(builder, element, "OrganizationId", "OrganizationId");
        parseProperty(builder, element, "actions", "actions");
        parseProperty(builder, element, "actions_entities", "actions_entities");
        parseProperty(builder, element, "actions_display", "actions_display");
        parseProperty(builder, element, "actions_limit", "actions_limit");
        parseProperty(builder, element, "action_fields", "action_fields");
        parseProperty(builder, element, "memberships", "memberships");
        parseProperty(builder, element, "memberships_member", "memberships_member");
        parseProperty(builder, element, "memberships_member_fields", "memberships_member_fields");
        parseProperty(builder, element, "members", "members");
        parseProperty(builder, element, "member_fields", "member_fields");
        parseProperty(builder, element, "member_activity", "member_activity");
        parseProperty(builder, element, "membersInvited", "membersInvited");
        parseProperty(builder, element, "membersInvited_fields", "membersInvited_fields");
        parseProperty(builder, element, "boards", "boards");
        parseProperty(builder, element, "board_fields", "board_fields");
        parseProperty(builder, element, "board_actions", "board_actions");
        parseProperty(builder, element, "board_actions_entities", "board_actions_entities");
        parseProperty(builder, element, "board_actions_display", "board_actions_display");
        parseProperty(builder, element, "board_actions_format", "board_actions_format");
        parseProperty(builder, element, "board_actions_since", "board_actions_since");
        parseProperty(builder, element, "board_actions_limit", "board_actions_limit");
        parseProperty(builder, element, "board_action_fields", "board_action_fields");
        parseProperty(builder, element, "board_lists", "board_lists");
        parseProperty(builder, element, "paid_account", "paid_account");
        parseProperty(builder, element, "fields", "fields");
        BeanDefinition definition = builder.getBeanDefinition();
        setNoRecurseOnDefinition(definition);
        attachProcessorDefinition(parserContext, definition);
        return definition;
    }

}
