package ch09_classes;

public class ScoreCalc {
    public double addScores(double totalScore, double addedScore){
        return totalScore + addedScore;
    }

    public double calculateAvg(double totalScore, int numberOfSubjects){
        return totalScore / numberOfSubjects;
    }
}
