package com.example.dog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Game extends AppCompatActivity {

    TextView story;
    ConstraintLayout tap;
    Button ch1, ch2, ch3;
    View contin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game);

        tap = (ConstraintLayout)findViewById(R.id.main);
        story = (TextView)findViewById(R.id.story);
        ch1 = (Button)findViewById(R.id.ch1);
        ch2 = (Button)findViewById(R.id.ch2);
        ch3 = (Button)findViewById(R.id.ch3);

        Story textStory = new Story();
        Player player = new Player();
        textStory.next(story, contin);

        class Next implements Runnable{
            @Override
            public void run() {
                textStory.next(story,contin);
            }
        }

        tap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textStory.text[textStory.step].equals("choose")){
                    contin = v;
                    v.setClickable(false);
                    textStory.chose(ch1,ch2,ch3);
                }
                else{
                    Thread thread=new Thread(new Next());
                    thread.start();
                }
            }
        });

        ch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                search(textStory, textStory.text[textStory.step + 1], player);
            }

        });


        ch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                search(textStory, textStory.text[textStory.step + 2], player);
            }
        });


        ch3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                search(textStory, textStory.text[textStory.step + 3], player);
            }
        });


    }
    public void search(Story textStory,String target, Player player){
        if(textStory.text[textStory.step + 4].equals("ChooseFood")){
            switch(target){
                case "ch1 1! Сосиски":
                    player.food = ch1.getText().toString();
                    textStory.text[41] += "Кинуть собаке сосиску";
                    break;
                case "ch2 1! Сладости":
                    player.food = ch2.getText().toString();
                    break;
                case "ch3 1! ":
                    player.food = ch3.getText().toString();
                    break;
            }
            textStory.step = textStory.step + 5;
            story.setText("Даша купила " + player.food);
            contin.setClickable(true);
        }
        else{
           target = target.split("! ")[0];
            for(int i = 0;;i++){
                if(textStory.text[textStory.step + i].equals(target)){
                    if(textStory.text[textStory.step + i + 1].equals("back")){
                        textStory.step = 50;
                    }
                    else{
                        textStory.step += i + 2;
                    }
                    story.setText(textStory.text[textStory.step - 1]);
                    contin.setClickable(true);
                    break;
                }
            }
        }
        ch1.setVisibility(View.INVISIBLE);
        ch2.setVisibility(View.INVISIBLE);
        ch3.setVisibility(View.INVISIBLE);
    }
}