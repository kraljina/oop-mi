package hr.fer.oop.task3;

public class InstagramStory extends WebEntry<Story> {
    public InstagramStory(String author, String date, Story story) {
        super(author, date, story);
    }

    public double calculateStoryImpact(int noOfFollowers) {
        return (getEntry().getNumberOfViews() + getEntry().getNumberOfReactions()) / (double) noOfFollowers;
    }
}
