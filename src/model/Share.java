package model;

public abstract class Share {

    private String shapeName;

    public Share(String shapeName) {
        this.shapeName = shapeName;
    }

    public Share() {
    }

    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    public abstract double calcPerimeter();

    public abstract double calcArea();
}
