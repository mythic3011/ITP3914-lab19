public class OutstandingStudent extends Student{
    protected String award;

    public OutstandingStudent(String name, int stid, int year,String award) {
        super(name, stid, year);
        this.award = award;
    }

    @Override
    public String toString(){
        return super.toString() + ", Award: "+award;
    }
}
