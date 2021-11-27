package filesystem;

public class VideoFile extends SystemFile {
    private String description, content;

    public VideoFile(String description, String content) {
        this.description = description;
        this.content = content;
    }

    @Override
    public SystemFile open() {
        return this;
    }

    @Override
    public void describe() {
        System.out.println("Arquivo de video: " + this.description);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }    
}
