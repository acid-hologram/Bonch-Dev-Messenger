package bonch.dev.school.UI.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageButton
import androidx.fragment.app.Fragment
import bonch.dev.school.R
import bonch.dev.school.UI.activities.MainAppActivity

class ChatFragment: Fragment() {

    private lateinit var sendButton: AppCompatImageButton

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_chat, container, false)
        sendButton = view.findViewById(R.id.send_message_button)
        sendButton.setOnClickListener{(context as MainAppActivity).attachProfileFragment()}
        return  view
    }
}