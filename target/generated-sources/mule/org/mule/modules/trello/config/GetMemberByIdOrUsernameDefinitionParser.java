
package org.mule.modules.trello.config;

import javax.annotation.Generated;
import org.mule.config.MuleManifest;
import org.mule.modules.trello.processors.GetMemberByIdOrUsernameMessageProcessor;
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
public class GetMemberByIdOrUsernameDefinitionParser
    extends AbstractDevkitBasedDefinitionParser
{

    private static Logger logger = LoggerFactory.getLogger(GetMemberByIdOrUsernameDefinitionParser.class);

    private BeanDefinitionBuilder getBeanDefinitionBuilder(ParserContext parserContext) {
        try {
            return BeanDefinitionBuilder.rootBeanDefinition(GetMemberByIdOrUsernameMessageProcessor.class.getName());
        } catch (NoClassDefFoundError noClassDefFoundError) {
            String muleVersion = "";
            try {
                muleVersion = MuleManifest.getProductVersion();
            } catch (Exception _x) {
                logger.error("Problem while reading mule version");
            }
            logger.error(("Cannot launch the mule app, the @Processor [get-member-by-id-or-username] within the connector [trello] is not supported in mule "+ muleVersion));
            throw new BeanDefinitionParsingException(new Problem(("Cannot launch the mule app, the @Processor [get-member-by-id-or-username] within the connector [trello] is not supported in mule "+ muleVersion), new Location(parserContext.getReaderContext().getResource()), null, noClassDefFoundError));
        }
    }

    public BeanDefinition parse(Element element, ParserContext parserContext) {
        BeanDefinitionBuilder builder = getBeanDefinitionBuilder(parserContext);
        builder.addConstructorArgValue("getMemberByIdOrUsername");
        builder.setScope(BeanDefinition.SCOPE_PROTOTYPE);
        if (!hasAttribute(element, "config-ref")) {
            throw new BeanDefinitionParsingException(new Problem("It seems that the config-ref for @Processor [get-member-by-id-or-username] within the connector [trello] is null or missing. Please, fill the value with the correct global element.", new Location(parserContext.getReaderContext().getResource()), null));
        }
        parseConfigRef(element, builder);
        parseProperty(builder, element, "id", "id");
        parseProperty(builder, element, "actions", "actions");
        parseProperty(builder, element, "actions_entities", "actions_entities");
        parseProperty(builder, element, "actions_display", "actions_display");
        parseProperty(builder, element, "actions_limit", "actions_limit");
        parseProperty(builder, element, "action_fields", "action_fields");
        parseProperty(builder, element, "action_since", "action_since");
        parseProperty(builder, element, "action_before", "action_before");
        parseProperty(builder, element, "cards", "cards");
        parseProperty(builder, element, "card_fields", "card_fields");
        parseProperty(builder, element, "card_members", "card_members");
        parseProperty(builder, element, "card_member_fields", "card_member_fields");
        parseProperty(builder, element, "card_attachments", "card_attachments");
        parseProperty(builder, element, "card_attachment_fields", "card_attachment_fields");
        parseProperty(builder, element, "card_stickers", "card_stickers");
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
        parseProperty(builder, element, "board_memberships", "board_memberships");
        parseProperty(builder, element, "board_organization", "board_organization");
        parseProperty(builder, element, "board_organization_fields", "board_organization_fields");
        parseProperty(builder, element, "boardsInvited", "boardsInvited");
        parseProperty(builder, element, "boardsInvited_fields", "boardsInvited_fields");
        parseProperty(builder, element, "boardStars", "boardStars");
        parseProperty(builder, element, "savedSearches", "savedSearches");
        parseProperty(builder, element, "organizations", "organizations");
        parseProperty(builder, element, "organization_fields", "organization_fields");
        parseProperty(builder, element, "organization_paid_account", "organization_paid_account");
        parseProperty(builder, element, "organizationsInvited", "organizationsInvited");
        parseProperty(builder, element, "organizationsInvited_fields", "organizationsInvited_fields");
        parseProperty(builder, element, "notifications", "notifications");
        parseProperty(builder, element, "notifications_entities", "notifications_entities");
        parseProperty(builder, element, "notifications_display", "notifications_display");
        parseProperty(builder, element, "notifications_limit", "notifications_limit");
        parseProperty(builder, element, "notification_fields", "notification_fields");
        parseProperty(builder, element, "notification_memberCreator", "notification_memberCreator");
        parseProperty(builder, element, "notification_memberCreator_fields", "notification_memberCreator_fields");
        parseProperty(builder, element, "notification_before", "notification_before");
        parseProperty(builder, element, "notification_since", "notification_since");
        parseProperty(builder, element, "tokens", "tokens");
        parseProperty(builder, element, "paid_account", "paid_account");
        parseProperty(builder, element, "boardBackgrounds", "boardBackgrounds");
        parseProperty(builder, element, "customBoardBackgrounds", "customBoardBackgrounds");
        parseProperty(builder, element, "customStickers", "customStickers");
        parseProperty(builder, element, "customEmoji", "customEmoji");
        parseProperty(builder, element, "fields", "fields");
        BeanDefinition definition = builder.getBeanDefinition();
        setNoRecurseOnDefinition(definition);
        attachProcessorDefinition(parserContext, definition);
        return definition;
    }

}
