package in.apptonic.milkdelivery;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText milkName;
    EditText quantity;
    Button submitButton;
    Database database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        database = new Database();

        milkName = findViewById(R.id.milkName);
        quantity = findViewById(R.id.quantity);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                database.setMilkBrand(milkName.toString());
                database.setQuantity(quantity.toString());

                startIntent();

            }
        });

    }

    public void startIntent() {

        Intent intent = new Intent(this, DisplayMilkSale.class);
        startService(intent);
    }

}
