package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    Button mTopButton;
    Button mBottomButton;
    TextView mStoryText;
    int mIndex;
    //public StoryPath(String storyText, String topText, String bottomText, int topPath, int bottomPath ){//maybe add story level to see where we are in the story

        StoryPath [] storyArray = new StoryPath[] {

            new StoryPath(R.string.T1_Story, R.string.T1_Ans1, R.string.T1_Ans2, 2, 1),
            new StoryPath(R.string.T2_Story, R.string.T2_Ans1, R.string.T2_Ans2, 2, 3),
            new StoryPath(R.string.T3_Story, R.string.T3_Ans1, R.string.T3_Ans2, 5, 4),
            new StoryPath(R.string.T4_End),//last three lines are endings so no need for other paths here.
            new StoryPath(R.string.T5_End),
            new StoryPath(R.string.T6_End)
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mTopButton = findViewById(R.id.buttonTop);
        mBottomButton = findViewById(R.id.buttonBottom);
        mStoryText = findViewById(R.id.storyTextView);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mTopButton.setOnClickListener(new View.OnClickListener() {//top button = true
            @Override
            public void onClick(View v) {
            update(true, mIndex);

            }

        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mBottomButton.setOnClickListener(new View.OnClickListener() {//bottom = false
            @Override
            public void onClick(View v) {
                update(false, mIndex);


            }

        });

    }
    private void update(boolean choice, int index){
        //choice true means that the topbutton has been pressed

        //a little bit confusing but basically update method does most the work.
        //if choice is true that means the top button was pressed. the index is the index of the array of
        //storyPath objects. this index is changed based on what button is pressed
        if(choice == true && index==0){
            mIndex = storyArray[0].topPath; //since topButton was pressed we will change the index to the topPath
            mStoryText.setText(storyArray[mIndex].storyTextString);//t2 story changes the text on the screen to the next xml string of the story.
            mTopButton.setText(storyArray[mIndex].topButtonString);
            mBottomButton.setText(storyArray[mIndex].bottomButtonString);

        }else if(choice == true && index==1){

            mIndex = storyArray[1].topPath;
            mStoryText.setText(storyArray[mIndex].storyTextString);
            mTopButton.setText(storyArray[mIndex].topButtonString);
            mBottomButton.setText(storyArray[mIndex].bottomButtonString);

        }else if(choice == true && index==2){//HEY FUTURE ME IF INDEX IS 2...

            mIndex = storyArray[2].topPath;//index here will be changed to 5 which is the end of the story
            mStoryText.setText(storyArray[mIndex].storyTextString);//we have the
           mTopButton.setVisibility(View.GONE);
           mBottomButton.setVisibility(View.GONE);



        }else if(choice == false && index==0){
            mIndex = storyArray[0].bottomPath; //2 top path gives the set of questions that will arise on pressing the top button choice. top path and bottom path give indexes. This is because an array was made of story path objects. each story path object holds the story text and the top and bottom button responses to the story. along with the top and bottom path choices. for example if the top button is pressed then the index will switch to the "top path" in the storyPath object and then the new story text and buttons will appear. If the story comes to an end.. ie index 4 and up.. another constructor in the story path class is made for this which only containts story text. for now the user will have to close the app manually to end the game. all these notes and code with the exception of being supply the app layout ie xml and the todo all the code solution is mine
            mStoryText.setText(storyArray[mIndex].storyTextString);
            mTopButton.setText(storyArray[mIndex].topButtonString);
            mBottomButton.setText(storyArray[mIndex].bottomButtonString);
        }else if(choice == false && index == 1){
            mIndex = storyArray[1].bottomPath; //2 top path gives the set of questions that will arise on pressing the top button choice. top path and bottom path give indexes. This is because an array was made of story path objects. each story path object holds the story text and the top and bottom button responses to the story. along with the top and bottom path choices. for example if the top button is pressed then the index will switch to the "top path" in the storyPath object and then the new story text and buttons will appear. If the story comes to an end.. ie index 4 and up.. another constructor in the story path class is made for this which only containts story text. for now the user will have to close the app manually to end the game. all these notes and code with the exception of being supply the app layout ie xml and the todo all the code solution is mine
            mStoryText.setText(storyArray[mIndex].storyTextString);
            mTopButton.setVisibility(View.GONE);
            mBottomButton.setVisibility(View.GONE);


        }//else if(choice == false && index == 2) {
          else {
            mIndex = storyArray[2].bottomPath; //2 top path gives the set of questions that will arise on pressing the top button choice. top path and bottom path give indexes. This is because an array was made of story path objects. each story path object holds the story text and the top and bottom button responses to the story. along with the top and bottom path choices. for example if the top button is pressed then the index will switch to the "top path" in the storyPath object and then the new story text and buttons will appear. If the story comes to an end.. ie index 4 and up.. another constructor in the story path class is made for this which only containts story text. for now the user will have to close the app manually to end the game. all these notes and code with the exception of being supply the app layout ie xml and the todo all the code solution is mine
            mStoryText.setText(storyArray[mIndex].storyTextString);
            mTopButton.setVisibility(View.GONE);
            mBottomButton.setVisibility(View.GONE);


//        }else if((choice == true || choice==false) && index==3){
//            mIndex = 3;
//            mTopButton.setVisibility(View.GONE);
//            mBottomButton.setVisibility(View.GONE);
//            mStoryText.setText(storyArray[3].storyTextString);
//        }else if((choice == true || choice==false) && index==4){
//            mIndex = 4;
//            mTopButton.setVisibility(View.GONE);
//            mBottomButton.setVisibility(View.GONE);
//            mStoryText.setText(storyArray[4].storyTextString);
//        }else {
//            mIndex = 5;
//            mTopButton.setVisibility(View.GONE);
//            mBottomButton.setVisibility(View.GONE);
//            mStoryText.setText(storyArray[5].storyTextString);
//        }

        }}
}