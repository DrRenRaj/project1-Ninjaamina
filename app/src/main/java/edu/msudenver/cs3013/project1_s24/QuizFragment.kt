package edu.msudenver.cs3013.project1_s24

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class QuizFragment : Fragment() {

    private lateinit var questionTextView: TextView
    private lateinit var optionsRadioGroup: RadioGroup
    private lateinit var submitButton: Button

    private var currentQuestionIndex = 0
    private var score = 0

    private val questions = listOf(
        "What are baby ducks called before they are known as ducklings?" to listOf("Hatchlings", "Puppies", "Kittens", "Chicks"),
        "What is a male duck called?" to listOf("Drake", "Hen", "Rooster", "Gander"),
        "What is a group of baby ducks called?" to listOf("Brood", "Flock", "Pack", "Waddle"),
        "When do baby ducks usually imprint?" to listOf("In the first few hours of life", "After a week", "After a month", "After a year")
    )

    private val answers = listOf("Hatchlings", "Drake", "Brood", "In the first few hours of life")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_quiz, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        questionTextView = view.findViewById(R.id.question_textview)
        optionsRadioGroup = view.findViewById(R.id.options_radiogroup)
        submitButton = view.findViewById(R.id.submit_button)

        showNextQuestion()

        submitButton.setOnClickListener {
            val selectedOptionId = optionsRadioGroup.checkedRadioButtonId
            if (selectedOptionId != -1) {
                val selectedRadioButton = view.findViewById<RadioButton>(selectedOptionId)
                val answer = selectedRadioButton.text.toString()
                if (answer == answers[currentQuestionIndex]) {
                    score++
                }
                currentQuestionIndex++
                if (currentQuestionIndex < questions.size) {
                    showNextQuestion()
                } else {
                    val bundle = Bundle().apply {
                        putInt("score", score)
                    }
                    findNavController().navigate(R.id.action_quizFragment_to_resultsFragment, bundle)
                }
            } else {
                Toast.makeText(context, "Please select an answer.", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun showNextQuestion() {
        optionsRadioGroup.clearCheck()
        questionTextView.text = questions[currentQuestionIndex].first
        optionsRadioGroup.removeAllViews()
        for (option in questions[currentQuestionIndex].second) {
            val radioButton = RadioButton(context)
            radioButton.text = option
            optionsRadioGroup.addView(radioButton)
        }
    }
}
