import static java.lang.Math.pow;

public class Oblast {
    private double x, y;

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public boolean Oblast(){
        if (x * x + y * y <= 36 && y >= 0) {
            if (Trap(x, y) == false) {
                if (pow(y - 2, 2) + pow(x - 3, 2) >= 4) {
                    return true;
                } else if (Okr(x, y)) {
                    return true;
                } else {
                    return false;
                }
            } else if (Okr(x, y)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static double k(double x1, double y1, double x2, double y2) {
        return (y1 - y2) / (x1 - x2);
    }

    public static double b(double x1, double y1, double x2, double y2) {
        return y1 - x1 * k(x1, y1, x2, y2);
    }

    public static boolean Trap(double x, double y) {
        if (y < x * k(-5, 0, -3, 5) + b(-5, 0, -3, 5) &&
                y < 5 && y < x * k(1, 0, 0, 5) + b(1, 0, 0, 5)) {
            return true;
        }
        return false;
    }

    public static boolean Okr(double x, double y) {
        if (pow(y - 1, 2) + pow(x + 2, 2) <= 1 || pow(y - 3, 2) + pow(x + 2, 2) <= 1 ||
                pow(y - 3, 2) + pow(x - 3, 2) <= 1) {
            return true;
        }
        return false;
    }

}

