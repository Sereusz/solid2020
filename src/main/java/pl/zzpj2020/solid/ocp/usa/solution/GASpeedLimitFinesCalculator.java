package pl.zzpj2020.solid.ocp.usa.solution;

public class GASpeedLimitFinesCalculator implements StateSpeedLimitFinesCalculator {

    private static final int GA_MAX_SPEED = 0;

    @Override
    public double calculateSpeedLimitFine(int speed) {
        double fine = 0;
        if (speed > GA_MAX_SPEED) {
            // calculate...
        }
        return fine;
    }
}
