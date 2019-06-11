package entity;

public class Office {
    private int id;
    private String officeName;

    @Override
    public String toString() {
        return "Office{" +
                "id=" + id +
                ", officeName='" + officeName + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }
}
