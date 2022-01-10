package com.md.nurkhan.mycarfirm;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Spanned;

import uk.co.deanwild.flowtextview.FlowTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        FlowTextView flowTextView = (FlowTextView) findViewById(R.id.ftv);
        flowTextView.setTextColor(Color.WHITE);
        flowTextView.setTextSize(35);
        flowTextView.setText("Мы просто держим эти трофеи для вас." +
                "В 2021 году Kia заняла первое место среди брендов массового рынка в исследовании надежности транспортных средств JD Power. Исследование определяет" +
                "долгосрочную" +
                "надежность путем измерения количества проблем в автомобилях трехлетней давности. Исследование этого года, охватывающее восемь основных" +
                "категорий, показало, что автомобили Kia 2018 года получили самые высокие оценки надежности среди брендов массового рынка. Важны ваши опросы," +
                "и мы не можем отблагодарить вас в достаточной мере. Мы стремимся поддерживать высокое качество наших будущих автомобилей.1");


    }
}