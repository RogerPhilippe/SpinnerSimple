package br.com.philippesis.spinnersimple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Spinner mspMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] itens = {"January", "Feburary", "March", "April", "May",
                "June", "July", "August", "September", "October", "November","December"};

        mspMain = (Spinner) findViewById(R.id.idsnMain);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, itens);

        mspMain.setAdapter(adapter);

        mspMain.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, mspMain.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
