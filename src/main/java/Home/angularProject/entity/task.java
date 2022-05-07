package Home.angularProject.entity;

import javax.persistence.*;

@Entity
@Table(name = "task")
public class task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id ;
    private String name;
    private boolean completed;

    public task(int id, String name, boolean completed) {
        this.id = id;
        this.name = name;
        this.completed = completed;
    }

    public task() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }


}
