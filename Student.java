package Model;

public class Student {
    private String name;
    private String area;

    public Student(String area ,String name) {
        this.area = area;
        this.name = name;
    }

    public void setArea(String area) {
        this.area = area;
    }
    public String getArea() {
        return area;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", area='" + area + '\'' +
                '}';
    }
}
