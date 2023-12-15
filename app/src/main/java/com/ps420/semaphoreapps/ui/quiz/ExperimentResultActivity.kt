package com.ps420.semaphoreapps.ui.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ps420.semaphoreapps.R
import com.ps420.semaphoreapps.databinding.ActivityExperimentResultBinding
import com.ps420.semaphoreapps.databinding.ActivityHomeBinding
import com.ps420.semaphoreapps.model.FakeLearnDataSourceExperimental.CORRECT_ANSWER
import com.ps420.semaphoreapps.model.FakeLearnDataSourceExperimental.TOTAL_QUESTIONS
import com.ps420.semaphoreapps.model.FakeLearnDataSourceExperimental.USER_NAME
import com.ps420.semaphoreapps.ui.home.HomeActivity

class ExperimentResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityExperimentResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExperimentResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val totalQuestion = intent.getIntExtra(TOTAL_QUESTIONS, 0)
        val correctAnswer = intent.getIntExtra(CORRECT_ANSWER, 0)
        val username = intent.getStringExtra(USER_NAME)
        binding.apply {
            tvUsername.text = username
            totalAnswerExp.text = correctAnswer.toString()
            correctAnswerExp.text = totalQuestion.toString()

        }
        binding.btnBackHomeExp.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}