package edu.msudenver.cs3013.project1_s24

import android.media.MediaPlayer
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class DuckSoundFragment : Fragment() {

    private var mediaPlayer: MediaPlayer? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_duck_sound, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.play_sound_button).setOnClickListener {
            playDuckSound()
        }
    }
    private fun playDuckSound() {
        try {
            mediaPlayer?.release()
            mediaPlayer = MediaPlayer.create(requireContext(), R.raw.duck_sound)
            mediaPlayer?.start()
            mediaPlayer?.setOnCompletionListener {
                mediaPlayer?.release()
                mediaPlayer = null
            }
        } catch (e: IllegalArgumentException) {
            e.printStackTrace()
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        mediaPlayer?.release()
        mediaPlayer = null
    }
}



