    package com.anik.myapplication;

    import android.support.v7.app.AppCompatActivity;
    import android.os.Bundle;
    import android.util.Log;
    import android.view.View;
    import android.widget.Button;
    import android.widget.EditText;
    import android.widget.TextView;

    public class MainActivity extends AppCompatActivity {

         @Override

        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
             Button b1=(Button)findViewById(R.id.b1);
             Button b2=(Button) findViewById(R.id.b2);
             Button b3=(Button)findViewById(R.id.b3);
             final EditText e1=(EditText)findViewById(R.id.e1);
             final TextView t1=(TextView)findViewById(R.id.t1);

             b1.setOnClickListener(
                     new View.OnClickListener(){
                         public void onClick(View v) {
                             String copy=e1.getText().toString();
                          t1.setText(copy);
                         }


                     }
             );

             b2.setOnClickListener(
                    new Button.OnClickListener(){
                        public void onClick(View v){
                            TextView t1=(TextView)findViewById(R.id.t1);
                            t1.setText(R.string.textChina);
    }
                    }
            );

             b3.setOnClickListener(
                    new Button.OnClickListener(){
                        public void onClick(View v){
                            TextView t1=(TextView)findViewById(R.id.t1);
                            t1.setText(R.string.textSpain);
      }
    }
     );
            };
     }

