package edu.msudenver.cs3013.project1_s24

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment

class DuckGalleryFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_duck_gallery, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Load the vector drawable into ImageView
        view.findViewById<ImageView>(R.id.gallery_image).setImageResource(R.drawable.emoji_nature_24dp_5f6368_fill0_wght400_grad0_opsz24)
    }
}



