package src;

public class Item {
    private int id;
    private String name;

    public Item(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public int getId()
    {
        return id;
    }

    public String getname()
    {
        return name;
    }

    public String toString()
    {
        return name;
    }
}
