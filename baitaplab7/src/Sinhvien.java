abstract class Sinhvien{
    public abstract double getDiem();

    public void displayDiem(){
        System.out.println("Diem trung binh:" + getDiem());
    }
}

class SinhVienIT extends Sinhvien{
    private double scoreJava;
    private double scoreHTML;

    public SinhVienIT(double scoreJava, double scoreHTML){
        this.scoreJava = scoreJava;
        this.scoreHTML = scoreHTML;
    }
    public double getDiem(){
        return (scoreJava * 2 + scoreHTML) / 3;
    }
}

class SinhVienCoKhi extends Sinhvien{
    private double scoreCNC;
    private double scorePLC;

    public SinhVienCoKhi(double scoreCNC, double scorePLC){
        this.scoreCNC = scoreCNC;
        this.scorePLC = scorePLC;
    }

    public double getDiem(){

        return (scoreCNC + scorePLC) / 2;
    }
}

