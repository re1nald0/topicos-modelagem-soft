package filesystem;

import java.util.ArrayList;

public class Folder extends SystemFile {
    private String description;
    private ArrayList<SystemFile> content;

    public Folder(String description) {
        this.description = description;
        this.content = new ArrayList<>();
    }

    @Override
    public SystemFile open() {
        return this;
    }

    @Override
    public void describe() {
        System.out.println("Diretorio: " + this.description);
        if(this.content.size() == 0) {
            System.out.println("Empty folder");
        } else {
            for(SystemFile file : content) {
                file.describe();
            }
        }
        System.out.println("-----------");
    }

    public Folder getFolder(int index) {
        return (Folder) this.content.get(index);
    }

    public void newFile(SystemFile file) {
        this.content.add(file);
    }

    public void removeFile(int index) {
        this.content.remove(index);
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
