package src.ClassModeling;

public class BookPublishingSystem {
    private int chapters;
    private String editor;
    private String publisher;
    private int wordCount;
    private boolean isPublished;

    public BookPublishingSystem() {
    }

    public BookPublishingSystem(int chapters) {
        this.chapters = chapters;
    }

    public BookPublishingSystem(int chapters, String editor, String publisher, int wordCount, boolean isPublished) {
        this.chapters = chapters;
        this.editor = editor;
        this.publisher = publisher;
        this.wordCount = wordCount;
        this.isPublished = isPublished;
    }

    public int getChapters() {
        return chapters;
    }

    public void setChapters(int chapters) {
        this.chapters = chapters;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getWordCount() {
        return wordCount;
    }

    public void setWordCount(int wordCount) {
        this.wordCount = wordCount;
    }

    public boolean getIsPublished() {
        return isPublished;
    }

    public void setIsPublished(boolean published) {
        isPublished = published;
    }
}
