
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
@Generated(value = "Mule DevKit Version 3.7.0", date = "2016-05-12T12:43:23+05:30", comments = "Build mule-devkit-3.7.0.2589.361fd9f")
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
            this.registerBeanDefinitionParser("get-actions-by-id-with-entities1", new GetActionsByIdWithEntities1DefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-actions-by-id-with-entities1", "@Processor", ex);
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
            this.registerBeanDefinitionParser("add-entity", new AddEntityDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("add-entity", "@Processor", ex);
        }
    }

}
