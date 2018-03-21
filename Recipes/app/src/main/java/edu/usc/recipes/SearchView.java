package edu.usc.recipes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class SearchView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_view);

        setSpinners();
    }

    public void onClick_Saved(View view){

        //need to go to saved searches for the user

        //Intent myIntent = new Intent(this,SearchView.class);
        //startActivity(myIntent);
    }

    public void onClick_Search(View view){

        //search given the facets

        //Intent myIntent = new Intent(this,SearchView.class);
        //startActivity(myIntent);
    }

    public void setSpinners(){
        Spinner spinner_dish = (Spinner) findViewById(R.id.spinner_dish);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,
                R.array.dish_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner_dish.setAdapter(adapter1);

        Spinner spinner_health = (Spinner) findViewById(R.id.spinner_health);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
                R.array.health_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner_health.setAdapter(adapter2);

        Spinner spinner_cuisine = (Spinner) findViewById(R.id.spinner_cuisine);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this,
                R.array.dish_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner_cuisine.setAdapter(adapter3);
    }

}
