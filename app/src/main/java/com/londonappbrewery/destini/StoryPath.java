package com.londonappbrewery.destini;

public class StoryPath {

    int storyTextString; //story text that will be used in java.main from the strings.xml
    int topButtonString;//same as above
    int bottomButtonString;//same as abvove
    int topPath; //the array index to be switched to if top button is pressed
    int bottomPath;//same as above but for the bottom button.

    //this constructor is put into an array. the index of that array tracks which StoryPath object's information will be show on the app
    //the index in use is dependent on the topPath and bottomPath parameters in the StoryPath. if array index is 0 and topButton is pressed
    //then array index will be switched to "top path"
    //
    public StoryPath(int storyTextString, int topButtonString, int bottomButtonString, int topPath, int bottomPath ){//maybe add story level to see where we are in the story
        this.storyTextString = storyTextString;
        this.topButtonString = topButtonString;
        this.bottomButtonString = bottomButtonString;
        this.topPath = topPath;
        this.bottomPath = bottomPath;// depending on the level the paths to the next story level will be different


    }
    //this consructor is just for endings. the code in the main file
    //will dertermine when to use this constructor
    //namely when the arrray index is 3 and above
    public StoryPath(int storyText){
        storyTextString = storyText;
    }

}
