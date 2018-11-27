package com.example.phamn.learningtoeic.Service;

import com.example.phamn.learningtoeic.Model.QuestionPart1;
import com.example.phamn.learningtoeic.Model.QuestionPart2;
import com.example.phamn.learningtoeic.Model.QuestionPart3;
import com.example.phamn.learningtoeic.Model.QuestionPart4;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {
    @GET("JSON.php")
    Call<List<QuestionPart1>> getAllQuestionPart1();

    Call<List<QuestionPart2>> getAllQuestionPart2();

    Call<List<QuestionPart3>> getAllQuestionPart3();

    Call<List<QuestionPart4>> getAllQuestionPart4();
}
