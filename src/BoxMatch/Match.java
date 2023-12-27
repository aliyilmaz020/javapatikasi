package boxMatch;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        if (isFirstFight()) {
            this.f1 = f1;
            this.f2 = f2;
        } else {
            this.f1 = f2;
            this.f2 = f1;
        }
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {
        if (isCheck()) {
            while (this.f1.healthy > 0 && this.f2.healthy > 0) {
                System.out.println("----------NEW ROUND-----------");
                this.f2.healthy = this.f1.hit(this.f2);
                System.out.println(this.f2.name + ": " + this.f2.healthy);
                System.out.println("-----------------------------------");
                if (isWin()) {
                    break;
                }
                this.f1.healthy = this.f2.hit(this.f1);
                System.out.println(this.f1.name + ": " + this.f1.healthy);
                if (isWin()) {
                    break;
                }

            }
        } else {
            System.out.println("Sporcuların sikletleri uymuyor.");
        }
    }

    boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight)
                && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin() {
        if (this.f1.healthy == 0) {
            System.out.println(f2.name + " kazandı ! ");
            return true;
        }
        if (this.f2.healthy == 0) {
            System.out.println(f1.name + " kazandı ! ");
            return true;
        }
        return false;
    }

    boolean isFirstFight() {
        double randNum = Math.random() * 100;
        return randNum <= 50;
    }
}
