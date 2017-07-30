package com.siddharth.simplemath

import android.os.Parcel
import android.os.Parcelable
import java.util.*

/**
 * Created by dhana on 30-07-2017.
 */
object Questions {
    val questions: MutableList<Question> = Collections.synchronizedList(ArrayList())

    class QuestionCreator(val questions:MutableList<Question>) : Thread() {
        override fun run() {
            super.run()
            questions.add(Question())
        }
    }

    private fun createQuestion() {
        QuestionCreator(questions).start()
    }

    fun getNextQuestion():Question {
        if (questions.size == 0) questions.add(Question())

        val result = questions[0]
        questions.removeAt(0)
        return result
    }

    fun createFewQuestions() {
        var x = 0
        while (x < 5) {
           questions.add(Question())
            x++
        }
    }

}