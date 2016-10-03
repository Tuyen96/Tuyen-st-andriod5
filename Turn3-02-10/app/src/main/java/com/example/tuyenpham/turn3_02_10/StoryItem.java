package com.example.tuyenpham.turn3_02_10;

/**
 * Created by Tuyen Pham on 02/10/2016.
 */

public class StoryItem {
    private String title;
    private String time;
    private int imageResId;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public StoryItem(String title, String time, int imageResId) {
        this.title = title;
        this.time = time;
        this.imageResId = imageResId;
    }

    public int getImageResId() {
        return imageResId;
    }

    public void setImageResId(int imageResId) {
        this.imageResId = imageResId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public static final StoryItem[] ARRAY = new StoryItem[]{
            new StoryItem(" He may act like he wants a\n " +
                    "secretary but most of the time\n " +
                    "they’re looking for…","10mn", R.drawable.couple),
            new StoryItem("Peggy, just think about it.\n" +
                    "Deeply. Then forget it. And an idea\n" +
                    "will jump up on your face","13mn", R.drawable.man),
            new StoryItem("Go home, take a paper bag\n" +
                    "and cut some eyeholes out of it. Put \n" +
                    "it over your head","16mn", R.drawable.woman),
            new StoryItem("Get out of here and move \n" +
                    "forward. This never happened.\n  " +
                    "It will shock you how much","19mn", R.drawable.sixs_members),
            new StoryItem("That poor girl. She doesn’t \n" +
                    "know that loving you is the worst \n" +
                    "way to get you","22mn", R.drawable.three_some),
    };
}
