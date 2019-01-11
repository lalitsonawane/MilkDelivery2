package in.apptonic.milkdelivery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMilkSale extends AppCompatActivity {

    TextView milkBrand;
    TextView quantity;
    String milk;
    String qua;
    Database database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_milk_sale);

        milkBrand = findViewById(R.id.milkName);
        quantity = findViewById(R.id.quantity);

        milk = database.getMilkBrand();
        qua = database.getQuantity();

        milkBrand.setText(milk);
        quantity.setText(qua);

    }
}
