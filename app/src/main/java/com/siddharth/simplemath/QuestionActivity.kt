package com.siddharth.simplemath

import android.content.res.ColorStateList
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_question.*

class QuestionActivity : AppCompatActivity() {

    val question = Questions.getNextQuestion()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        val option1 = findViewById<Button>(R.id.option1)
        val option2 = findViewById<Button>(R.id.option2)
        val option3 = findViewById<Button>(R.id.option3)
        val option4 = findViewById<Button>(R.id.option4)
        val option5 = findViewById<Button>(R.id.option5)
        val option6 = findViewById<Button>(R.id.option6)
        val skip = findViewById<Button>(R.id.optionSkip)

        val questionTv = findViewById<TextView>(R.id.questionTv)

        questionTv.text = question.getQuestion()

        option1.text = question.a.toString()
        option1.setOnClickListener(View.OnClickListener { view -> validateAnswer(view as Button) })

        option2.text = question.b.toString()
        option2.setOnClickListener(View.OnClickListener { view -> validateAnswer(view as Button) })

        option3.text = question.c.toString()
        option3.setOnClickListener(View.OnClickListener { view -> validateAnswer(view as Button) })

        option4.text = question.d.toString()
        option4.setOnClickListener(View.OnClickListener { view -> validateAnswer(view as Button) })

        option5.text = question.e.toString()
        option5.setOnClickListener(View.OnClickListener { view -> validateAnswer(view as Button) })

        option6.text = question.f.toString()
        option6.setOnClickListener(View.OnClickListener { view -> validateAnswer(view as Button) })
    }

    fun validateAnswer(btn:Button) {
        //Validating answer
        if(question.isAnswer(btn.text.toString()))
            btn.setTextColor(Color.GREEN)
        else
            btn.setTextColor(Color.RED)

        //Disabling buttons
        option1.isEnabled = false;
        option2.isEnabled = false;
        option3.isEnabled = false;
        option4.isEnabled = false;
        option5.isEnabled = false;
        option6.isEnabled = false;
    }
}
