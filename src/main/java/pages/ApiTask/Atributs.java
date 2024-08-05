package pages.ApiTask;

import java.util.ArrayList;
import java.util.List;

public class Atributs {
    public String id;
    public String name;
    public List<String> photoUrls;
 //   public List<String> tags;
    public String status;
    public Category category;

    public Atributs(String id, String name, ArrayList<String> photoUrls, ArrayList<String> tags, String status, Category category) {
        this.id = id;
        this.name = name;
        this.photoUrls = photoUrls;
    //    this.tags = tags;
        this.status = status;
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public Category getCategory() {
        return category;
    }
}
