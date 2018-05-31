package demo.inote;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //test

//        Button btn = (Button)findViewById(R.id.button_newNotes);
//        Button btn2 = (Button)findViewById(R.id.button_myNotes);
//
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(MainActivity.this, NewNoteActivity.class));
//            }
//        });
//
//        btn2.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v){
//                startActivity(new Intent(MainActivity.this, MyNotes.class));
//            }
//        });

        CardView cvNew=findViewById(R.id.create);
            cvNew.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(),NewNoteActivity.class);
                    startActivity(intent);
                }
            });

        CardView cvnotes=findViewById(R.id.mynotes);
        cvnotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MyNotes.class);
                startActivity(intent);
            }
        });

        CardView dashboard=findViewById(R.id.dashboard);
        dashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),NewNoteActivity.class);
                startActivity(intent);
            }
        });

        CardView calender=findViewById(R.id.calender);
        calender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),NewNoteActivity.class);
                startActivity(intent);
            }
        });
    }
}
