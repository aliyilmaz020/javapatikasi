package classes;

class Car {
    // Nitelikler
    String type;
    String model;
    String color;
    int speed;
    int speedLimit;

    Car(String model, int speed, String color) {
        this.model = model;
        this.speed = speed;
        this.color = color;
        this.type = "SEDAN";
        // System.out.println(this.model);
    }

    // Davranışlar
    void increaseSpeed(int increment) {
        if ((speed + increment) < speedLimit) {
            speed += increment;
        }
    }

    void decreaseSpeed(int decrease) {
        if (speed > 0) {
            speed -= decrease;
        }
    }

    void printSpeed() {
        System.out.println(model + " Hızınız: " + speed);
    }

}
