package model;

public class Customer {
    private int id;
    private String name;
    private String email;
    private String img;

    public Customer() {
    }

    public Customer(int id, String name, String email, String img) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.img = img;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
