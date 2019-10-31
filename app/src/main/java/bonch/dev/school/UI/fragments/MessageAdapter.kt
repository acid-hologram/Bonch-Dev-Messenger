package bonch.dev.school.UI.fragments

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import bonch.dev.school.R
import bonch.dev.school.UI.modules.MessageLab

class MessageAdapter: RecyclerView.Adapter<MessageAdapter.MessageHolder>() {

    val messageList = MessageLab().messageList

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.user_message_item, parent, false)
        return MessageHolder(view)
    }

    override fun getItemCount(): Int = messageList.size

    override fun onBindViewHolder(holder: MessageHolder, position: Int) {
        holder.bind(position)
    }

    inner class MessageHolder(view: View): RecyclerView.ViewHolder(view){

        fun bind(position: Int) {
            val messageTextureView =  itemView.findViewById<TextView>(R.id.message_text_view)
            messageTextureView.text = messageList[position].messageText
            val timeTextView = itemView.findViewById<TextView>(R.id.send_time_text_view)
            timeTextView.text = messageList[position].messageText
        }
    }

}