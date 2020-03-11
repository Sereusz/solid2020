package pl.zzpj2020.solid.ocp.usa.solution;

public class ALSpeedLimitFinesCalculator implements StateSpeedLimitFinesCalculator {
    private static final int AL_MAX_SPEED = 0;

    @Override
    public double calculateSpeedLimitFine(int speed) {
        double fine = 0;
        if (speed > AL_MAX_SPEED) {
            // calculate...
        }
        return fine;
    }
}
