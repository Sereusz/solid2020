package pl.zzpj2020.solid.ocp.usa.solution;

public class USASpeedLimitFines {
    StateSpeedLimitFinesCalculator stateCalculator;
    public USASpeedLimitFines(StateSpeedLimitFinesCalculator stateCalculator){
        this.stateCalculator = stateCalculator;
    }
    public double calculateSpeedLimitFine(int speed){
        return stateCalculator.calculateSpeedLimitFine(speed);
    }
}
