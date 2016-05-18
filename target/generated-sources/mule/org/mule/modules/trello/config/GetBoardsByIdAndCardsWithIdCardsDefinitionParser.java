
package org.mule.modules.trello.config;

import javax.annotation.Generated;
import org.mule.config.MuleManifest;
import org.mule.modules.trello.processors.GetBoardsByIdAndCardsWithIdCardsMessageProcessor;
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
@Generated(value = "Mule DevKit Version 3.7.2", date = "2016-05-18T04:08:12+05:30", comments = "Build 3.7.x.2633.51164b9")
public class GetBoardsByIdAndCardsWithIdCardsDefinitionParser
    extends AbstractDevkitBasedDefinitionParser
{

    private static Logger logger = LoggerFactory.getLogger(GetBoardsByIdAndCardsWithIdCardsDefinitionParser.class);

    private BeanDefinitionBuilder getBeanDefinitionBuilder(ParserContext parserContext) {
        try {
            return BeanDefinitionBuilder.rootBeanDefinition(GetBoardsByIdAndCardsWithIdCardsMessageProcessor.class.getName());
        } catch (NoClassDefFoundError noClassDefFoundError) {
            String muleVersion = "";
            try {
                muleVersion = MuleManifest.getProductVersion();
            } catch (Exception _x) {
                logger.error("Problem while reading mule version");
            }
            logger.error(("Cannot launch the mule app, the @Processor [get-boards-by-id-and-cards-with-id-cards] within the connector [trello] is not supported in mule "+ muleVersion));
            throw new BeanDefinitionParsingException(new Problem(("Cannot launch the mule app, the @Processor [get-boards-by-id-and-cards-with-id-cards] within the connector [trello] is not supported in mule "+ muleVersion), new Location(parserContext.getReaderContext().getResource()), null, noClassDefFoundError));
        }
    }

    public BeanDefinition parse(Element element, ParserContext parserContext) {
        BeanDefinitionBuilder builder = getBeanDefinitionBuilder(parserContext);
        builder.addConstructorArgValue("getBoardsByIdAndCardsWithIdCards");
        builder.setScope(BeanDefinition.SCOPE_PROTOTYPE);
        if (!hasAttribute(element, "config-ref")) {
            throw new BeanDefinitionParsingException(new Problem("It seems that the config-ref for @Processor [get-boards-by-id-and-cards-with-id-cards] within the connector [trello] is null or missing. Please, fill the value with the correct global element.", new Location(parserContext.getReaderContext().getResource()), null));
        }
        parseConfigRef(element, builder);
        parseProperty(builder, element, "boardId", "boardId");
        parseProperty(builder, element, "idCard", "idCard");
        parseProperty(builder, element, "attachments", "attachments");
        parseProperty(builder, element, "attachment_fields", "attachment_fields");
        parseProperty(builder, element, "actions", "actions");
        parseProperty(builder, element, "actions_entities", "actions_entities");
        parseProperty(builder, element, "actions_display", "actions_display");
        parseProperty(builder, element, "actions_limit", "actions_limit");
        parseProperty(builder, element, "action_fields", "action_fields");
        parseProperty(builder, element, "action_memberCreator_fields", "action_memberCreator_fields");
        parseProperty(builder, element, "members", "members");
        parseProperty(builder, element, "member_fields", "member_fields");
        parseProperty(builder, element, "checkItemStates", "checkItemStates");
        parseProperty(builder, element, "checkItemState_fields", "checkItemState_fields");
        parseProperty(builder, element, "labels", "labels");
        parseProperty(builder, element, "checklists", "checklists");
        parseProperty(builder, element, "checklist_fields", "checklist_fields");
        parseProperty(builder, element, "fields", "fields");
        BeanDefinition definition = builder.getBeanDefinition();
        setNoRecurseOnDefinition(definition);
        attachProcessorDefinition(parserContext, definition);
        return definition;
    }

}
