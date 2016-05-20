
package org.mule.modules.trello.config;

import javax.annotation.Generated;
import org.mule.config.MuleManifest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.FatalBeanException;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;


/**
 * Registers bean definitions parsers for handling elements in <code>http://www.mulesoft.org/schema/mule/trello</code>.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.2", date = "2016-05-20T07:24:31+05:30", comments = "Build 3.7.x.2633.51164b9")
public class TrelloNamespaceHandler
    extends NamespaceHandlerSupport
{

    private static Logger logger = LoggerFactory.getLogger(TrelloNamespaceHandler.class);

    private void handleException(String beanName, String beanScope, NoClassDefFoundError noClassDefFoundError) {
        String muleVersion = "";
        try {
            muleVersion = MuleManifest.getProductVersion();
        } catch (Exception _x) {
            logger.error("Problem while reading mule version");
        }
        logger.error(((((("Cannot launch the mule app, the  "+ beanScope)+" [")+ beanName)+"] within the connector [trello] is not supported in mule ")+ muleVersion));
        throw new FatalBeanException(((((("Cannot launch the mule app, the  "+ beanScope)+" [")+ beanName)+"] within the connector [trello] is not supported in mule ")+ muleVersion), noClassDefFoundError);
    }

    /**
     * Invoked by the {@link DefaultBeanDefinitionDocumentReader} after construction but before any custom elements are parsed. 
     * @see NamespaceHandlerSupport#registerBeanDefinitionParser(String, BeanDefinitionParser)
     * 
     */
    public void init() {
        try {
            this.registerBeanDefinitionParser("config", new TrelloConnectorConnectorConfigConfigDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("config", "@Config", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-actions-by-id", new GetActionsByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-actions-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-actions-by-id-and-field", new GetActionsByIdAndFieldDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-actions-by-id-and-field", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-actions-by-id-and-board", new GetActionsByIdAndBoardDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-actions-by-id-and-board", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-actions-by-id-and-board-with-field", new GetActionsByIdAndBoardWithFieldDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-actions-by-id-and-board-with-field", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-actions-by-id-and-card", new GetActionsByIdAndCardDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-actions-by-id-and-card", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-actions-by-id-and-card-with-field", new GetActionsByIdAndCardWithFieldDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-actions-by-id-and-card-with-field", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-actions-by-id-with-dispaly", new GetActionsByIdWithDispalyDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-actions-by-id-with-dispaly", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-actions-by-id-with-entities", new GetActionsByIdWithEntitiesDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-actions-by-id-with-entities", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-actions-by-id-and-list", new GetActionsByIdAndListDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-actions-by-id-and-list", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-actions-by-id-and-list-with-field", new GetActionsByIdAndListWithFieldDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-actions-by-id-and-list-with-field", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-actions-by-id-and-member", new GetActionsByIdAndMemberDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-actions-by-id-and-member", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-actions-by-id-and-member-with-field", new GetActionsByIdAndMemberWithFieldDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-actions-by-id-and-member-with-field", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-actions-by-id-and-member-creater", new GetActionsByIdAndMemberCreaterDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-actions-by-id-and-member-creater", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-actions-by-id-and-member-creater-with-field", new GetActionsByIdAndMemberCreaterWithFieldDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-actions-by-id-and-member-creater-with-field", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-actions-by-id-and-organization", new GetActionsByIdAndOrganizationDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-actions-by-id-and-organization", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("put-read-actions-by-id", new PutReadActionsByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("put-read-actions-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("put-write-actions-by-id", new PutWriteActionsByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("put-write-actions-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("delete-actions-by-id", new DeleteActionsByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("delete-actions-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-boards-by-id", new GetBoardsByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-boards-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-boards-by-id-and-field", new GetBoardsByIdAndFieldDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-boards-by-id-and-field", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-boards-by-id-and-actions", new GetBoardsByIdAndActionsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-boards-by-id-and-actions", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-boards-by-id-and-board-stars", new GetBoardsByIdAndBoardStarsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-boards-by-id-and-board-stars", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-boards-by-id-and-cards", new GetBoardsByIdAndCardsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-boards-by-id-and-cards", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-boards-by-id-and-cards-with-filter", new GetBoardsByIdAndCardsWithFilterDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-boards-by-id-and-cards-with-filter", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-boards-by-id-and-cards-with-id-cards", new GetBoardsByIdAndCardsWithIdCardsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-boards-by-id-and-cards-with-id-cards", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-boards-by-id-and-check-lists", new GetBoardsByIdAndCheckListsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-boards-by-id-and-check-lists", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-boards-by-id-and-deltas", new GetBoardsByIdAndDeltasDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-boards-by-id-and-deltas", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-boards-by-id-and-labels", new GetBoardsByIdAndLabelsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-boards-by-id-and-labels", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-boards-by-id-and-labels-with-id", new GetBoardsByIdAndLabelsWithIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-boards-by-id-and-labels-with-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-boards-by-id-and-lists", new GetBoardsByIdAndListsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-boards-by-id-and-lists", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-boards-by-id-and-lists-with-filter", new GetBoardsByIdAndListsWithFilterDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-boards-by-id-and-lists-with-filter", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-board-members-by-board-id", new GetBoardMembersByBoardIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-board-members-by-board-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-board-members-by-board-id-with-filter", new GetBoardMembersByBoardIdWithFilterDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-board-members-by-board-id-with-filter", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-boards-by-id-and-members-by-id-with-cards", new GetBoardsByIdAndMembersByIdWithCardsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-boards-by-id-and-members-by-id-with-cards", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-board-members-invited", new GetBoardMembersInvitedDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-board-members-invited", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-board-members-invited-with-field", new GetBoardMembersInvitedWithFieldDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-board-members-invited-with-field", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-board-member-ships", new GetBoardMemberShipsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-board-member-ships", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-board-member-ships-by-id", new GetBoardMemberShipsByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-board-member-ships-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-boards-with-my-pref", new GetBoardsWithMyPrefDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-boards-with-my-pref", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-boards-by-id-and-organization", new GetBoardsByIdAndOrganizationDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-boards-by-id-and-organization", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-boards-by-id-and-organization-with-field", new GetBoardsByIdAndOrganizationWithFieldDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-boards-by-id-and-organization-with-field", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("put-boards-by-id", new PutBoardsByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("put-boards-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("put-boards-closed-by-id", new PutBoardsClosedByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("put-boards-closed-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-boards-description-by-id", new UpdateBoardsDescriptionByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-boards-description-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-boards-organization-by-id", new UpdateBoardsOrganizationByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-boards-organization-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-boards-label-name-by-blue", new UpdateBoardsLabelNameByBlueDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-boards-label-name-by-blue", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-boards-label-name-by-green", new UpdateBoardsLabelNameByGreenDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-boards-label-name-by-green", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-boards-label-name-by-orange", new UpdateBoardsLabelNameByOrangeDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-boards-label-name-by-orange", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-boards-label-name-by-purple", new UpdateBoardsLabelNameByPurpleDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-boards-label-name-by-purple", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-boards-label-name-by-red", new UpdateBoardsLabelNameByRedDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-boards-label-name-by-red", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-boards-label-name-by-yellow", new UpdateBoardsLabelNameByYellowDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-boards-label-name-by-yellow", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-board-members-by-id", new UpdateBoardMembersByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-board-members-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-board-member-by-member-id", new UpdateBoardMemberByMemberIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-board-member-by-member-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-boards-membership-by-membership-id", new UpdateBoardsMembershipByMembershipIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-boards-membership-by-membership-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-boards-email-pos-pref", new UpdateBoardsEmailPosPrefDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-boards-email-pos-pref", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-boards-email-list-id-pref", new UpdateBoardsEmailListIdPrefDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-boards-email-list-id-pref", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("show-boards-list-guide", new ShowBoardsListGuideDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("show-boards-list-guide", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("show-boards-sidebar", new ShowBoardsSidebarDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("show-boards-sidebar", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("show-boards-sidebar-activity", new ShowBoardsSidebarActivityDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("show-boards-sidebar-activity", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("show-boards-sidebar-board-activity", new ShowBoardsSidebarBoardActivityDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("show-boards-sidebar-board-activity", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("show-boards-sidebar-members", new ShowBoardsSidebarMembersDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("show-boards-sidebar-members", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-board-name-by-id", new UpdateBoardNameByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-board-name-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-boards-background-by-id", new UpdateBoardsBackgroundByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-boards-background-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("boards-calender-feed-enabled", new BoardsCalenderFeedEnabledDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("boards-calender-feed-enabled", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-boards-card-aging", new UpdateBoardsCardAgingDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-boards-card-aging", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-boards-card-covers", new UpdateBoardsCardCoversDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-boards-card-covers", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-boards-comments", new UpdateBoardsCommentsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-boards-comments", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-boards-invitations", new UpdateBoardsInvitationsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-boards-invitations", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-boards-permission-level", new UpdateBoardsPermissionLevelDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-boards-permission-level", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-self-join-boards", new UpdateSelfJoinBoardsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-self-join-boards", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("boards-voting", new BoardsVotingDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("boards-voting", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-subscribed-boards-by-id", new UpdateSubscribedBoardsByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-subscribed-boards-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("post-boards", new PostBoardsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("post-boards", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("post-boards-calenderkey-generate", new PostBoardsCalenderkeyGenerateDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("post-boards-calenderkey-generate", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("post-boards-checklists", new PostBoardsChecklistsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("post-boards-checklists", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("post-boards-emailkey-generation", new PostBoardsEmailkeyGenerationDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("post-boards-emailkey-generation", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("post-boards-by-id-and-label", new PostBoardsByIdAndLabelDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("post-boards-by-id-and-label", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("post-boards-by-and-list", new PostBoardsByAndListDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("post-boards-by-and-list", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("post-boards-mark-as-viewd", new PostBoardsMarkAsViewdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("post-boards-mark-as-viewd", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("post-boards-power-ups", new PostBoardsPowerUpsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("post-boards-power-ups", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("delete-member-under-board-by-id", new DeleteMemberUnderBoardByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("delete-member-under-board-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("delete-power-ups-under-board-by-id", new DeletePowerUpsUnderBoardByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("delete-power-ups-under-board-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-cards-by-id", new GetCardsByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-cards-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-cards-by-id-with-field", new GetCardsByIdWithFieldDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-cards-by-id-with-field", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-card-actions-by-id", new GetCardActionsByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-card-actions-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-cards-attachments", new GetCardsAttachmentsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-cards-attachments", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-cards-attachments-by-id", new GetCardsAttachmentsByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-cards-attachments-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-boards-under-cars-by-id", new GetBoardsUnderCarsByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-boards-under-cars-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-boards-under-cars-by-id-with-field", new GetBoardsUnderCarsByIdWithFieldDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-boards-under-cars-by-id-with-field", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-cards-by-id-with-check-item-states", new GetCardsByIdWithCheckItemStatesDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-cards-by-id-with-check-item-states", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-cards-by-id-with-check-lists", new GetCardsByIdWithCheckListsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-cards-by-id-with-check-lists", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-cards-by-id-with-list", new GetCardsByIdWithListDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-cards-by-id-with-list", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-cards-by-id-with-list-field", new GetCardsByIdWithListFieldDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-cards-by-id-with-list-field", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-cards-members-by-id", new GetCardsMembersByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-cards-members-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-cards-members-voted-by-id", new GetCardsMembersVotedByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-cards-members-voted-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-cards-stickers", new GetCardsStickersDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-cards-stickers", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-cards-stickers-by-id", new GetCardsStickersByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-cards-stickers-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("put-cards-by-id", new PutCardsByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("put-cards-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("put-comments-on-actions-by-id", new PutCommentsOnActionsByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("put-comments-on-actions-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("updatecheck-item-name-on-cards", new UpdatecheckItemNameOnCardsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("updatecheck-item-name-on-cards", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("updatecheck-ite-position-on-cards", new UpdatecheckItePositionOnCardsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("updatecheck-ite-position-on-cards", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("updatecheck-ite-state-on-cards", new UpdatecheckIteStateOnCardsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("updatecheck-ite-state-on-cards", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-currentcheck-list-on-cards", new UpdateCurrentcheckListOnCardsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-currentcheck-list-on-cards", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-closed-cards-by-id", new UpdateClosedCardsByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-closed-cards-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-cards-desc-by-id", new UpdateCardsDescByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-cards-desc-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-cards-due-by-id", new UpdateCardsDueByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-cards-due-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-cards-id-attachment-by-id", new UpdateCardsIdAttachmentByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-cards-id-attachment-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-cards-board-id-by-id", new UpdateCardsBoardIdByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-cards-board-id-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-cards-list-id-by-id", new UpdateCardsListIdByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-cards-list-id-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-card-member-by-id", new UpdateCardMemberByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-card-member-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-card-name-by-id", new UpdateCardNameByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-card-name-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-card-pos-by-id", new UpdateCardPosByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-card-pos-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-card-stickers-by-id", new UpdateCardStickersByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-card-stickers-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("read-subsribed-cards", new ReadSubsribedCardsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("read-subsribed-cards", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("post-cards", new PostCardsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("post-cards", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("post-cards-acion-comments", new PostCardsAcionCommentsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("post-cards-acion-comments", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("post-cards-attachments-by-id", new PostCardsAttachmentsByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("post-cards-attachments-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("post-cards-check-lists-by-id", new PostCardsCheckListsByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("post-cards-check-lists-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("convert-checklist-to-cards-by-id", new ConvertChecklistToCardsByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("convert-checklist-to-cards-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("post-cards-checklist-by-id", new PostCardsChecklistByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("post-cards-checklist-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("post-cards-id-label-by-id", new PostCardsIdLabelByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("post-cards-id-label-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("post-cards-id-members-by-id", new PostCardsIdMembersByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("post-cards-id-members-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("post-cards-labels-by-id", new PostCardsLabelsByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("post-cards-labels-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("post-cards-members-voted-by-id", new PostCardsMembersVotedByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("post-cards-members-voted-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("post-card-stickers-by-id", new PostCardStickersByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("post-card-stickers-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("post-mark-associated-notification-id", new PostMarkAssociatedNotificationIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("post-mark-associated-notification-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("delete-cards-by-id", new DeleteCardsByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("delete-cards-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("delete-cards-action-comments-by-id", new DeleteCardsActionCommentsByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("delete-cards-action-comments-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("delete-cards-id-attachment-by-id", new DeleteCardsIdAttachmentByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("delete-cards-id-attachment-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("delete-cards-check-items-by-id", new DeleteCardsCheckItemsByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("delete-cards-check-items-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("delete-cards-check-lists-by-id", new DeleteCardsCheckListsByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("delete-cards-check-lists-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("delete-cards-id-label-by-id", new DeleteCardsIdLabelByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("delete-cards-id-label-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("delete-cards-by-id-member", new DeleteCardsByIdMemberDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("delete-cards-by-id-member", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("delete-cards-by-id-members-voted", new DeleteCardsByIdMembersVotedDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("delete-cards-by-id-members-voted", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("delete-cards-stickers-by-id", new DeleteCardsStickersByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("delete-cards-stickers-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-checklists-by-id", new GetChecklistsByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-checklists-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-checklists-field-by-id", new GetChecklistsFieldByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-checklists-field-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-checklists-boards-by-id", new GetChecklistsBoardsByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-checklists-boards-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-checklists-board-field-by-id", new GetChecklistsBoardFieldByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-checklists-board-field-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-checklists-cards-by-id", new GetChecklistsCardsByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-checklists-cards-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-checklists-cards-field-by-id", new GetChecklistsCardsFieldByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-checklists-cards-field-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-check-items-by-id", new GetCheckItemsByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-check-items-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-check-items-by-checked-id-by-id", new GetCheckItemsByCheckedIdByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-check-items-by-checked-id-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-checklists-by-checked-id-by-id", new GetChecklistsByCheckedIdByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-checklists-by-checked-id-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("put-checklists-by-id", new PutChecklistsByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("put-checklists-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("put-checklists-name-by-id", new PutChecklistsNameByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("put-checklists-name-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("put-checklists-pos-by-id", new PutChecklistsPosByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("put-checklists-pos-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("post-checklists", new PostChecklistsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("post-checklists", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("post-check-items-by-id", new PostCheckItemsByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("post-check-items-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("delete-checklists-by-id", new DeleteChecklistsByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("delete-checklists-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("delete-checklists-check-items-by-id", new DeleteChecklistsCheckItemsByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("delete-checklists-check-items-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-labels-by-id", new GetLabelsByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-labels-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-labels-boards-by-id", new GetLabelsBoardsByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-labels-boards-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-labels-boards-field-by-id", new GetLabelsBoardsFieldByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-labels-boards-field-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-label-by-id", new UpdateLabelByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-label-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-label-color-by-id", new UpdateLabelColorByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-label-color-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-label-name-by-id", new UpdateLabelNameByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-label-name-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("post-labels", new PostLabelsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("post-labels", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("delete-label-by-id", new DeleteLabelByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("delete-label-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-list-by-id", new GetListByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-list-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-list-field-by-id", new GetListFieldByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-list-field-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-list-action-by-id", new GetListActionByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-list-action-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-list-boards-by-id", new GetListBoardsByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-list-boards-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-list-boards-field-by-id", new GetListBoardsFieldByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-list-boards-field-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-lists-cards-by-id", new GetListsCardsByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-lists-cards-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-list-cards-filter-by-id", new GetListCardsFilterByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-list-cards-filter-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-lists-by-id", new UpdateListsByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-lists-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-lists-closedd-by-id", new UpdateListsCloseddByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-lists-closedd-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-lists-boards-by-id", new UpdateListsBoardsByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-lists-boards-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-lists-name-by-id", new UpdateListsNameByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-lists-name-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-lists-position-by-id", new UpdateListsPositionByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-lists-position-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-lists-subscribed-by-id", new UpdateListsSubscribedByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-lists-subscribed-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("post-lists", new PostListsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("post-lists", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("post-lists-cards-by-id", new PostListsCardsByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("post-lists-cards-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("post-lists-moved-cards-by-id", new PostListsMovedCardsByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("post-lists-moved-cards-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-notifications-by-id", new GetNotificationsByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-notifications-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-notifications-with-field-by-id", new GetNotificationsWithFieldByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-notifications-with-field-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-notifications-boards-by-id", new GetNotificationsBoardsByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-notifications-boards-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-notifications-boards-field-by-id", new GetNotificationsBoardsFieldByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-notifications-boards-field-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-notifications-cards-by-id", new GetNotificationsCardsByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-notifications-cards-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-notifications-cards-field-by-id", new GetNotificationsCardsFieldByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-notifications-cards-field-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-notifications-display-by-id", new GetNotificationsDisplayByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-notifications-display-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-notifications-entities-by-id", new GetNotificationsEntitiesByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-notifications-entities-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-notifications-list-by-id", new GetNotificationsListByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-notifications-list-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-notifications-list-field-by-id", new GetNotificationsListFieldByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-notifications-list-field-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-member-notifications-by-id", new GetMemberNotificationsByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-member-notifications-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-member-notifications-field-by-id", new GetMemberNotificationsFieldByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-member-notifications-field-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-member-creator-notifications-by-id", new GetMemberCreatorNotificationsByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-member-creator-notifications-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-member-creater-notifications-field-by-id", new GetMemberCreaterNotificationsFieldByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-member-creater-notifications-field-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-organizations-notifications-by-id", new GetOrganizationsNotificationsByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-organizations-notifications-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-organizations-field-notifications-by-id", new GetOrganizationsFieldNotificationsByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-organizations-field-notifications-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-notifications-by-id", new UpdateNotificationsByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-notifications-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-unread-notifications-by-id", new UpdateUnreadNotificationsByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-unread-notifications-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("post-all-notifications", new PostAllNotificationsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("post-all-notifications", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-search-query", new GetSearchQueryDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-search-query", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-search-members", new GetSearchMembersDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-search-members", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-sessions-socket", new GetSessionsSocketDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-sessions-socket", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-session-by-id", new UpdateSessionByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-session-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-session-status-by-id", new UpdateSessionStatusByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-session-status-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("post-sessions", new PostSessionsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("post-sessions", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-tokens-by-token", new GetTokensByTokenDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-tokens-by-token", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-tokens-field-by-token", new GetTokensFieldByTokenDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-tokens-field-by-token", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-member-token-by-token", new GetMemberTokenByTokenDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-member-token-by-token", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-member-field-token-by-token", new GetMemberFieldTokenByTokenDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-member-field-token-by-token", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-tokens-webhooks", new GetTokensWebhooksDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-tokens-webhooks", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-tokens-webhooks-by-webhook-id", new GetTokensWebhooksByWebhookIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-tokens-webhooks-by-webhook-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-token-webhook-by-token", new UpdateTokenWebhookByTokenDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-token-webhook-by-token", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("post-token-webhook-by-token", new PostTokenWebhookByTokenDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("post-token-webhook-by-token", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("delete-token-by-token", new DeleteTokenByTokenDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("delete-token-by-token", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("delete-token-webhook-by-token", new DeleteTokenWebhookByTokenDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("delete-token-webhook-by-token", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-type-by-id", new GetTypeByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-type-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-webhooks-by-id", new GetWebhooksByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-webhooks-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-webhooks-field-by-id", new GetWebhooksFieldByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-webhooks-field-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-webhook-by-id", new UpdateWebhookByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-webhook-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-webhook", new UpdateWebhookDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-webhook", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-active-webhook", new UpdateActiveWebhookDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-active-webhook", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-callback-u-r-l-webhook", new UpdateCallbackURLWebhookDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-callback-u-r-l-webhook", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-webhook-description", new UpdateWebhookDescriptionDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-webhook-description", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-webhooks-id-model", new UpdateWebhooksIdModelDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-webhooks-id-model", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("post-webhook", new PostWebhookDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("post-webhook", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("delete-webhook-by-id", new DeleteWebhookByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("delete-webhook-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-organization-by-id", new GetOrganizationByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-organization-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-organization-by-id-and-field", new GetOrganizationByIdAndFieldDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-organization-by-id-and-field", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-organization-actions-by-id", new GetOrganizationActionsByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-organization-actions-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-organization-boards-by-id", new GetOrganizationBoardsByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-organization-boards-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-organization-boards-by-id-with-filter", new GetOrganizationBoardsByIdWithFilterDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-organization-boards-by-id-with-filter", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-organization-deltas-by-id", new GetOrganizationDeltasByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-organization-deltas-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-organization-members-by-id", new GetOrganizationMembersByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-organization-members-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-organization-members-by-id-with-filter", new GetOrganizationMembersByIdWithFilterDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-organization-members-by-id-with-filter", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-organization-members-cards-by-id", new GetOrganizationMembersCardsByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-organization-members-cards-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-organization-members-invited-by-id", new GetOrganizationMembersInvitedByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-organization-members-invited-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-organization-members-invited-by-id-with-field", new GetOrganizationMembersInvitedByIdWithFieldDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-organization-members-invited-by-id-with-field", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-organization-memberships-by-id", new GetOrganizationMembershipsByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-organization-memberships-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-organization-memberships-by-membership-id", new GetOrganizationMembershipsByMembershipIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-organization-memberships-by-membership-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-organizations-by-id-or-name", new UpdateOrganizationsByIdOrNameDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-organizations-by-id-or-name", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-organizations-desc-by-id-or-name", new UpdateOrganizationsDescByIdOrNameDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-organizations-desc-by-id-or-name", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-organizations-display-name-id-or-name", new UpdateOrganizationsDisplayNameIdOrNameDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-organizations-display-name-id-or-name", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-organizations-members-by-id-or-name", new UpdateOrganizationsMembersByIdOrNameDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-organizations-members-by-id-or-name", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-organizations-members-by-memberid", new UpdateOrganizationsMembersByMemberidDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-organizations-members-by-memberid", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("deactivate-organization-member-by-id", new DeactivateOrganizationMemberByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("deactivate-organization-member-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("put-organization-membership-by-id", new PutOrganizationMembershipByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("put-organization-membership-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-organizations-name-by-id-or-name", new UpdateOrganizationsNameByIdOrNameDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-organizations-name-by-id-or-name", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-organization-associated-domain", new UpdateOrganizationAssociatedDomainDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-organization-associated-domain", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-org-organization-board-visibility-restrict", new UpdateOrgOrganizationBoardVisibilityRestrictDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-org-organization-board-visibility-restrict", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-private-organization-board-visibility-restrict", new UpdatePrivateOrganizationBoardVisibilityRestrictDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-private-organization-board-visibility-restrict", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-public-organization-board-visibility-restrict", new UpdatePublicOrganizationBoardVisibilityRestrictDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-public-organization-board-visibility-restrict", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-org-external-members-disabled", new UpdateOrgExternalMembersDisabledDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-org-external-members-disabled", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-org-google-app-version", new UpdateOrgGoogleAppVersionDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-org-google-app-version", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-org-invite-restrict", new UpdateOrgInviteRestrictDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-org-invite-restrict", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-org-permission-level", new UpdateOrgPermissionLevelDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-org-permission-level", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-org-website", new UpdateOrgWebsiteDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-org-website", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("post-organizations", new PostOrganizationsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("post-organizations", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("post-organizations-logo-by-id-or-name", new PostOrganizationsLogoByIdOrNameDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("post-organizations-logo-by-id-or-name", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("delete-organizations-by-id-or-name", new DeleteOrganizationsByIdOrNameDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("delete-organizations-by-id-or-name", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("delete-organizations-logo-by-id-or-name", new DeleteOrganizationsLogoByIdOrNameDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("delete-organizations-logo-by-id-or-name", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("delete-member-from-organization-by-id-or-name", new DeleteMemberFromOrganizationByIdOrNameDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("delete-member-from-organization-by-id-or-name", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("delete-member-from-all-organizations-by-id-or-name", new DeleteMemberFromAllOrganizationsByIdOrNameDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("delete-member-from-all-organizations-by-id-or-name", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("delete-organizations-associated-domain-by-id-or-name", new DeleteOrganizationsAssociatedDomainByIdOrNameDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("delete-organizations-associated-domain-by-id-or-name", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("delete-organizations-org-invite-req-by-id-or-name", new DeleteOrganizationsOrgInviteReqByIdOrNameDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("delete-organizations-org-invite-req-by-id-or-name", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-member-by-id-or-username", new GetMemberByIdOrUsernameDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-member-by-id-or-username", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-members-by-id-or-username-and-field", new GetMembersByIdOrUsernameAndFieldDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-members-by-id-or-username-and-field", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-member-actions-by-id-or-username", new GetMemberActionsByIdOrUsernameDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-member-actions-by-id-or-username", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-board-back-grounds", new GetBoardBackGroundsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-board-back-grounds", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-board-back-grounds-by-id", new GetBoardBackGroundsByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-board-back-grounds-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-board-stars", new GetBoardStarsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-board-stars", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-board-stars-by-id", new GetBoardStarsByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-board-stars-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-boards", new GetBoardsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-boards", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-boards-by-filter", new GetBoardsByFilterDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-boards-by-filter", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-boards-invited", new GetBoardsInvitedDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-boards-invited", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-boards-invited-by-field", new GetBoardsInvitedByFieldDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-boards-invited-by-field", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-cards", new GetCardsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-cards", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-cards-by-filter", new GetCardsByFilterDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-cards-by-filter", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-custom-board-backgrounds", new GetCustomBoardBackgroundsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-custom-board-backgrounds", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-custom-board-backgrounds-by-id", new GetCustomBoardBackgroundsByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-custom-board-backgrounds-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-custom-emoji", new GetCustomEmojiDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-custom-emoji", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-custom-emoji-by-id", new GetCustomEmojiByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-custom-emoji-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-custom-stickers", new GetCustomStickersDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-custom-stickers", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-custom-stickers-by-id", new GetCustomStickersByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-custom-stickers-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-deltas", new GetDeltasDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-deltas", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-notifications", new GetNotificationsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-notifications", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-notifications-by-filter", new GetNotificationsByFilterDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-notifications-by-filter", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-organizations", new GetOrganizationsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-organizations", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-organizations-by-filter", new GetOrganizationsByFilterDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-organizations-by-filter", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-organizations-invited", new GetOrganizationsInvitedDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-organizations-invited", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-organizations-by-field", new GetOrganizationsByFieldDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-organizations-by-field", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-saved-searches", new GetSavedSearchesDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-saved-searches", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-saved-searches-by-saved-search-id", new GetSavedSearchesBySavedSearchIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-saved-searches-by-saved-search-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-tokens", new GetTokensDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-tokens", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-member", new UpdateMemberDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-member", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-avatar-source", new UpdateAvatarSourceDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-avatar-source", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-bio", new UpdateBioDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-bio", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-board-backgrounds-by-id", new UpdateBoardBackgroundsByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-board-backgrounds-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-board-stars-by-id", new UpdateBoardStarsByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-board-stars-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-board-star-by-board-id", new UpdateBoardStarByBoardIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-board-star-by-board-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-board-star-by-board-pos", new UpdateBoardStarByBoardPosDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-board-star-by-board-pos", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-custom-board-background-by-id", new UpdateCustomBoardBackgroundByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-custom-board-background-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-member-fullname", new UpdateMemberFullnameDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-member-fullname", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-member-initials", new UpdateMemberInitialsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-member-initials", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-member-pref-color-blind", new UpdateMemberPrefColorBlindDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-member-pref-color-blind", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-member-pref-locale", new UpdateMemberPrefLocaleDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-member-pref-locale", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-member-pref-minutes-between-summaries", new UpdateMemberPrefMinutesBetweenSummariesDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-member-pref-minutes-between-summaries", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-member-saved-searches-by-id", new UpdateMemberSavedSearchesByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-member-saved-searches-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-saved-search-name", new UpdateSavedSearchNameDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-saved-search-name", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-saved-search-pos", new UpdateSavedSearchPosDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-saved-search-pos", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-saved-search-query", new UpdateSavedSearchQueryDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-saved-search-query", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-member-username", new UpdateMemberUsernameDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-member-username", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("create-member-avatar", new CreateMemberAvatarDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("create-member-avatar", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("create-member-board-backgrounds", new CreateMemberBoardBackgroundsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("create-member-board-backgrounds", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("create-member-board-stars", new CreateMemberBoardStarsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("create-member-board-stars", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("create-custom-board-backgrounds", new CreateCustomBoardBackgroundsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("create-custom-board-backgrounds", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("create-custom-emoji", new CreateCustomEmojiDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("create-custom-emoji", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("create-custom-stickers", new CreateCustomStickersDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("create-custom-stickers", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("create-one-time-messages-dismissed", new CreateOneTimeMessagesDismissedDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("create-one-time-messages-dismissed", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("create-saved-searches", new CreateSavedSearchesDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("create-saved-searches", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("delete-members-board-backgrounds-by-id", new DeleteMembersBoardBackgroundsByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("delete-members-board-backgrounds-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("delete-members-board-stars-by-id", new DeleteMembersBoardStarsByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("delete-members-board-stars-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("delete-members-custom-board-backgrounds-by-id", new DeleteMembersCustomBoardBackgroundsByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("delete-members-custom-board-backgrounds-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("delete-members-custom-stickers-by-id", new DeleteMembersCustomStickersByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("delete-members-custom-stickers-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("delete-members-saved-searches-by-id", new DeleteMembersSavedSearchesByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("delete-members-saved-searches-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("add-entity", new AddEntityDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("add-entity", "@Processor", ex);
        }
    }

}
