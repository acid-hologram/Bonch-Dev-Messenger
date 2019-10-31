package bonch.dev.school.UI.modules


data class Message(val messageId: Int, val messageText: String, val sentDate: String, val isUser: Boolean) //change sentData type to Data

class MessageLab() {
    val messageList: MutableList<Message>

    init {
        messageList = mutableListOf()
        for (i in 0..99) {
            val message = Message(i, "Test", "31.10.2019", true)
            messageList.add(message)
        }
    }
}