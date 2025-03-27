public class Main {
    public static void main(String[] args) {
        HumanBMI human = new HumanBMI(70, 1.74);
        System.out.println("BMI: " + human.getBMI());
        System.out.println("Category: " + human.getBmiCategory());
    }
}
class HumanBMI {
    private double weight; // Вага людини
    private double height; // Зріст людини

    public HumanBMI(double weight, double height) {
        if (weight <= 0 || height <= 0) {
            throw new IllegalArgumentException("Weight and height must be greater than zero.");
        }
        this.weight = weight;
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Weight must be greater than zero.");
        }
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be greater than zero.");
        }
        this.height = height;
    }

    public double getBMI() {
        return weight / (height * height);
    }

    public String getBmiCategory() {
        double bmi = getBMI();

        if (bmi < 18.5) {
            return "Deficit";
        } else if (bmi < 25) {
            return "Norm";
        } else if (bmi < 30) {
            return "Warning!";
        } else {
            return "Fat";
        }
    }
}