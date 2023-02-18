package com.example.quizapp

object Constants {
    const val USER_NAME :String = "user_name"
    const val TOTAL_QUESTIONS:String = "total questions"
    const val CORRECT_ANSWERS:String = "correct_answers"


    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1, "Question 1", R.drawable.ic_question,"Answer 1", "Answer 2", "Answer 3", "Answer 4", 1)
        questionsList.add(que1)

        val que2 = Question(
            2, "Question 2", R.drawable.ic_question,"Answer 1", "Answer 2", "Answer 3", "Answer 4", 2)
        questionsList.add(que2)

        val que3 = Question(
            3, "Question 3", R.drawable.ic_question,"Answer 1", "Answer 2", "Answer 3", "Answer 4", 3)
        questionsList.add(que3)

        val que4 = Question(
            4, "Question 1", R.drawable.ic_question,"Answer 1", "Answer 2", "Answer 3", "Answer 4", 4)
        questionsList.add(que4)

        return questionsList
    }


}