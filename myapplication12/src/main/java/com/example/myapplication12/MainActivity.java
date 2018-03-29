package com.example.myapplication12;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    private EditText editProjeto;
    private TextView textDataInicio;
    private TextView textDataFinal;
    private TextView projetoResult;
    private TextView finalizadoResult;
    private CheckBox checkFinalizado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editProjeto.findViewById(R.id.editProjeto);
        textDataInicio.findViewById(R.id.textDataInicio);
        textDataFinal.findViewById(R.id.textDataFinal);
        projetoResult.findViewById(R.id.projetoResult);
        finalizadoResult.findViewById(R.id.finalizadoResult);
        checkFinalizado.findViewById(R.id.checkFinalizado);

    }
}
