package br.felipesilva.dadosjson;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.*;
import android.view.Menu;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    private TextView txtNome;
    private TextView txtCpf;
    private People people;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        people = (People) getIntent().getSerializableExtra("");

        txtNome = (TextView) findViewById(R.id.txtNome);
        //txtCpf = (TextView) findViewById(R.id.txtCpf);

        txtNome.setText(people.getNome());
        //txtCpf.setText(pessoa.getCpf());
    }

}
