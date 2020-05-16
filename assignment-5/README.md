#QuizApplicationWithTimeOut

Rules:

1. The Quiz Application consists of 10 MCQS.
2. Users are prompted for answers of these MCQs one by one.
3. If a user does not enter the answer of any question within 10 seconds, the application would exit.
4. If quiz is completed successfully, results would be displayed.

Design:

1. 2 threads maintain the whole application.
2. One is a daemon thread which manages timeout.
3. The other thread manages the displays and user interactions for the Quiz App.