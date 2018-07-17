package sg.edu.rp.c346.simplemovielist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //Step 1b: Create a ListView variable
    ListView lvMovie;

    //Step 2b: Create an ArrayList variable
    ArrayList<String> alMovieList;

    //Step 3b: Create an ArrayAdapter
    ArrayAdapter<String> aaMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Step 1c: Bind the UI element to the Java variable
        lvMovie = findViewById(R.id.listViewMovie);

        //Step 2c: Initialise the ArrayList
        alMovieList = new ArrayList<>();
        alMovieList.add("Avengers Infinity War  Release Date: 2018.04");
        alMovieList.add("Justice League  Release Date: 2017.11");

        //Step 3c: Initialise the ArrayAdapter and bind it to the ArrayList
        aaMovie = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, alMovieList);

        //Step 4c: Bind ListView to the ArrayAdapter
        lvMovie.setAdapter(aaMovie);

    }
}
