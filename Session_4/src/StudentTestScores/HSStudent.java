package StudentTestScores;

public class HSStudent
{
    private int serviceHours;

    public HSStudent(String name, int mathScore, int elaScore, int serviceHours)
    {


    }

    public int getServiceHours()
    {
        return -1;
    }

    public void setServiceHours(int serviceHours)
    {

    }

    // If math score is at least 525, return true
    public boolean passMath()
    {
        return false;
    }

    // If ela score is at least 560, return true
    public boolean passEla()
    {
        return false;
    }

    // If service hours are at least 75, return true
    public boolean completeService()
    {
        return false;
    }

    // If the student has passed math, passed ela, and completed
    // service hours, return true.
    public boolean gradQualify()
    {
        return false;
    }

    // If the student has qualified for graduation, print:
    // (name) has qualified for graduation.
    // Otherwise print:
    // (name) has not yet qualified for graduation.
    // Where (name) is the student's name.
    public String toString()
    {
        return null;
    }
}
