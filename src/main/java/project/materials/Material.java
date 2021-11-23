package project.materials;

public enum Material {

    GLASS,
    PLASTIC,
    METAL;

    private double thermalConductivity;
    private String color;
    private double density;

    Glass glass = new Glass(0.017,"green",2200);
    Plastic plastic = new Plastic(0.2, "white", 1800);
    Metal metal = new Metal(58.0, "silver", 7800);

    Material(double thermalConductivity, String color, double density) {
        this.thermalConductivity = thermalConductivity;
        this.color = color;
        this.density = density;
    }

    Material() {

    }

    public double getThermalConductivity() {
        return thermalConductivity;
    }

    public void setThermalConductivity(double thermalConductivity) {
        this.thermalConductivity = thermalConductivity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }
}
