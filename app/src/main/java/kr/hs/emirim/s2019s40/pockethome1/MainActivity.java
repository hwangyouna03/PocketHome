package kr.hs.emirim.s2019s40.pockethome1;

import android.content.Intent;
import android.media.Image;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.w3c.dom.Document;

import java.io.IOException;


public class MainActivity extends AppCompatActivity {
    /*private String htmlUrl = "https://news.naver.com/main/list.nhn?mode=LS2D&mid=shm&sid1=101&sid2=260";
    private TextView textView;
    private String htmlContentStringFormat="";*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*버튼 고정*/
        //MainPage
        ImageButton btn1 = (ImageButton)findViewById(R.id.imageButton2);
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        //Information
        ImageButton btn3 = (ImageButton)findViewById(R.id.imageButton3);
        btn3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), Information_word.class);
                        startActivity(intent);
                    }
                });



        /*textView = findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod()); //스크롤 가능

        JsoupAsyncTask jsoupAsyncTask = new JsoupAsyncTask();
        jsoupAsyncTask.execute();
    }
    private class JsoupAsyncTask extends AsyncTask<Void, Void, Void> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected Void doInBackground(Void... params) {
            try{
                Document doc = (Document) Jsoup.connect(htmlUrl).get();

                Elements titles = doc.select("div.list_body newsflash_body");
                for(Element e: titles){
                    System.out.println("title" + e.text());
                    htmlContentStringFormat += e.text().trim() +"\n";
                }
            }catch (IOException e){
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
                    textView.setText(htmlContentStringFormat);
        }*/


    }


}



