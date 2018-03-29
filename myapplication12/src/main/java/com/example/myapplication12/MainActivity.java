package com.example.myapplication12;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

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

        final Calendar calendarioInicio = Calendar.getInstance();

        final Calendar calendarioFinal = Calendar.getInstance();

        final DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear,
                                  int dayOfMonth) {
                calendarioInicio.set(Calendar.YEAR,year);
                calendarioInicio.set(Calendar.MONTH,monthOfYear);
                calendarioInicio.set(Calendar.DAY_OF_MONTH,dayOfMonth);

                SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

                textDataInicio.setText(format.format(calendarioInicio.getTime()));


            }
        };


    }
}
