class GeometricObjects {
    private String color = "grey";
    private boolean filled = false;
    private java.util.Date dateCreated;

    GeometricObjects() {
        dateCreated = new java.util.Date();
    }

    GeometricObjects(String color,boolean  filled) {
        this.color = color;
        this.filled = filled;
        dateCreated = new java.util.Date();
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setIsFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return this.dateCreated;
    }

    public String toString() {
        return "created on " + this.dateCreated + "\ncolor : " + this.color + " is Filled : " + this.filled;
    }
}