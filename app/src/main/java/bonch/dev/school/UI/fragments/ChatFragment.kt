package bonch.dev.school.UI.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.widget.AppCompatImageButton
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import bonch.dev.school.R
import bonch.dev.school.UI.activities.MainAppActivity


class ChatFragment : Fragment() {


    private lateinit var sendButton: AppCompatImageButton
    private lateinit var messageRecycler: RecyclerView


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_chat, container, false)
        sendButton = view.findViewById(R.id.send_message_button)
        sendButton.setOnClickListener{}
        messageRecycler = view.findViewById(R.id.message_recycler_view)
        messageRecycler.layoutManager = LinearLayoutManager(container!!.context)
        messageRecycler.adapter = MessageAdapter()
        return  view
    }
}