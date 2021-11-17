package lesson8;

public class ForecasCon {
     String Date;
    float Minimum;
    float Maximum;


    public ForecasCon(){}

    public ForecasCon(String date, float maximum, float minimum) {
        Date = date;
        Maximum = maximum;
        Minimum = minimum;
    }
    @Override
    public String toString() {
        return "["+ Date + "," + Maximum + ","+ Minimum+ "]";

    }public float getMinimum() {
        return Minimum;
    }
    public void setMinimum(float minimum, float v) {
        Minimum = minimum;
    }

    public float getMaximum() {
        return Maximum;
    }

    public void setMaximum(float maximum, float v) {
        Maximum = maximum;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(int i, String date) {
        Date = date;
    }



 }
