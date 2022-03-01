package android.example.coffee_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void increment(View view) {
        quantity = quantity + 1;
        display(quantity);
    }

    public void decrement(View view) {
        quantity = quantity - 1;
        display(quantity);
    }

    public void order(View view) {
        int price = calculatePrice();
        String priceMessage = createOrderSummary(price);
        displayMessage(createOrderSummary(price));
    }

    private String createOrderSummary(int price) {
        String priceMessage = "Name : Toshali Mohapatra ";
        priceMessage = priceMessage + "\nCoffee Quantity: " + quantity;
        priceMessage = priceMessage + "\nTotal: $" + price;
        priceMessage = priceMessage + "\nThank You!";
        return priceMessage;
    }

    private int calculatePrice() {
        int price = 5 * quantity;
        return price;
    }

    public void displayMessage(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);
    }

    private void display(int numbers) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantityOfCoffee);
        quantityTextView.setText(" " + numbers);
    }


}