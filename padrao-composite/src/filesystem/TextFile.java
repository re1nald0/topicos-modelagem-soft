package filesystem;

public class TextFile extends SystemFile {
    private String description, content;

    public TextFile(String description, String content) {
        this.description = description;
        this.content = content;
    }

    @Override
    public SystemFile open() {
        return this;
    }

    @Override
    public void describe() {
        System.out.println("Arquivo de texto: " + this.description);
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
