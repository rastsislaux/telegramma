package org.lipski.telegramma.model

import org.lipski.telegramma.model.event.*

data class Update(
    val updateId: Int,
    val message: Message?,
    val editedMessage: Message?,
    val channelPost: Message?,
    val editedChannelPost: Message?,
    val inlineQuery: InlineQuery?,
    val chosenInlineResult: ChosenInlineResult?,
    val callbackQuery: CallbackQuery?,
    val shippingQuery: ShippingQuery?,
    val preCheckoutQuery: PreCheckoutQuery?,
    val poll: Poll?,
    val pollAnswer: PollAnswer?,
    val myChatMember: ChatMemberUpdated?,
    val chatMember: ChatMemberUpdated?,
    val chatJoinRequest: ChatJoinRequest?
) { }