package core.basesyntax.figures;

import core.basesyntax.Figure;

public class RightTriangle extends Figure {
    private static final String type = "triangle";
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
    }

    @Override
    public double getArea() {
        return (double) firstLeg * secondLeg * 0.5;
    }

    @Override
    public String getInfo() {
        return "Figure: "
                + type + ", "
                + "area: "
                + this.getArea()
                + " sq. units, "
                + "firstLeg: "
                + firstLeg
                + " units, "
                + "secondLeg: "
                + secondLeg
                + " units, "
                + "color: "
                + color;
    }
}
