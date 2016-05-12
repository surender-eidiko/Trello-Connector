
package org.mule.modules.trello.config;

import javax.annotation.Generated;
import org.mule.config.MuleManifest;
import org.mule.modules.trello.processors.GetBoardsByIdMessageProcessor;
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
@Generated(value = "Mule DevKit Version 3.7.0", date = "2016-05-12T12:43:23+05:30", comments = "Build mule-devkit-3.7.0.2589.361fd9f")
public class GetBoardsByIdDefinitionParser
    extends AbstractDevkitBasedDefinitionParser
{

    private static Logger logger = LoggerFactory.getLogger(GetBoardsByIdDefinitionParser.class);

    private BeanDefinitionBuilder getBeanDefinitionBuilder(ParserContext parserContext) {
        try {
            return BeanDefinitionBuilder.rootBeanDefinition(GetBoardsByIdMessageProcessor.class.getName());
        } catch (NoClassDefFoundError noClassDefFoundError) {
            String muleVersion = "";
            try {
                muleVersion = MuleManifest.getProductVersion();
            } catch (Exception _x) {
                logger.error("Problem while reading mule version");
            }
            logger.error(("Cannot launch the mule app, the @Processor [get-boards-by-id] within the connector [trello] is not supported in mule "+ muleVersion));
            throw new BeanDefinitionParsingException(new Problem(("Cannot launch the mule app, the @Processor [get-boards-by-id] within the connector [trello] is not supported in mule "+ muleVersion), new Location(parserContext.getReaderContext().getResource()), null, noClassDefFoundError));
        }
    }

    public BeanDefinition parse(Element element, ParserContext parserContext) {
        BeanDefinitionBuilder builder = getBeanDefinitionBuilder(parserContext);
        builder.addConstructorArgValue("getBoardsById");
        builder.setScope(BeanDefinition.SCOPE_PROTOTYPE);
        if (!hasAttribute(element, "config-ref")) {
            throw new BeanDefinitionParsingException(new Problem("It seems that the config-ref for @Processor [get-boards-by-id] within the connector [trello] is null or missing. Please, fill the value with the correct global element.", new Location(parserContext.getReaderContext().getResource()), null));
        }
        parseConfigRef(element, builder);
        parseProperty(builder, element, "boardId", "boardId");
        parseProperty(builder, element, "actions", "actions");
        parseProperty(builder, element, "actions_entities", "actions_entities");
        parseProperty(builder, element, "actions_display", "actions_display");
        parseProperty(builder, element, "actions_format", "actions_format");
        parseProperty(builder, element, "actions_since", "actions_since");
        parseProperty(builder, element, "actions_limit", "actions_limit");
        parseProperty(builder, element, "action_fields", "action_fields");
        parseProperty(builder, element, "action_member", "action_member");
        parseProperty(builder, element, "action_member_fields", "action_member_fields");
        parseProperty(builder, element, "action_memberCreator", "action_memberCreator");
        parseProperty(builder, element, "action_memberCreator_fields", "action_memberCreator_fields");
        parseProperty(builder, element, "cards", "cards");
        parseProperty(builder, element, "card_fields", "card_fields");
        parseProperty(builder, element, "card_attachments", "card_attachments");
        parseProperty(builder, element, "card_attachment_fields", "card_attachment_fields");
        parseProperty(builder, element, "card_checklists", "card_checklists");
        parseProperty(builder, element, "card_stickers", "card_stickers");
        parseProperty(builder, element, "boardStars", "boardStars");
        parseProperty(builder, element, "labels", "labels");
        parseProperty(builder, element, "label_fields", "label_fields");
        parseProperty(builder, element, "labels_limit", "labels_limit");
        parseProperty(builder, element, "lists", "lists");
        parseProperty(builder, element, "list_fields", "list_fields");
        parseProperty(builder, element, "memberships", "memberships");
        parseProperty(builder, element, "memberships_member", "memberships_member");
        parseProperty(builder, element, "memberships_member_fields", "memberships_member_fields");
        parseProperty(builder, element, "members", "members");
        parseProperty(builder, element, "member_fields", "member_fields");
        parseProperty(builder, element, "membersInvited", "membersInvited");
        parseProperty(builder, element, "membersInvited_fields", "membersInvited_fields");
        parseProperty(builder, element, "checklists", "checklists");
        parseProperty(builder, element, "checklist_fields", "checklist_fields");
        parseProperty(builder, element, "organization", "organization");
        parseProperty(builder, element, "organization_fields", "organization_fields");
        parseProperty(builder, element, "organization_memberships", "organization_memberships");
        parseProperty(builder, element, "myPrefs", "myPrefs");
        parseProperty(builder, element, "tags", "tags");
        parseProperty(builder, element, "fields", "fields");
        BeanDefinition definition = builder.getBeanDefinition();
        setNoRecurseOnDefinition(definition);
        attachProcessorDefinition(parserContext, definition);
        return definition;
    }

}
