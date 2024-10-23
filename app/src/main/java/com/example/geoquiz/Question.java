package com.example.geoquiz;

public class Question {
    // Texto de la pregunta.
    // Lo ponemos como entero (int) porque tiene que almacenar el ID de un recurso de cadena, no la cadena directamente.
    // Un recuso de cadena es cualquier texto que se almacena en archivos XML dentro de la carpeta res/values/
    private int mTextResId;
    // Respuesta de la pregunta.
    private boolean mAnswerTrue;

    // Getter y Setters para las variables "mTextResId" y "mAnswerTrue"
    // Getter:
    public int getTextResId() {
        return mTextResId;
    }

    // Setter:
    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    // Getter:
    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    // Setter:
    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public Question(int textResId, boolean answerTrue) {
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
    }
}