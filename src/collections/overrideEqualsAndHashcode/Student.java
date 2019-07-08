package collections.overrideEqualsAndHashcode;

public class Student {

    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
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

    @Override
    public boolean equals(Object obj) {
        if(obj == null)
        {
            return false;
        }
        if(!(obj instanceof Student))
        {
            return false;
        }
        if(obj == this)
        {
            return true;
        }

        return this.getId() == ((Student) obj).getId();

    }

    @Override
    public int hashCode() {
        return id;
    }
}
