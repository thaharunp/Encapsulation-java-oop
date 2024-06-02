public class Get_Set{
    private int eid;
    private String ename;
    private double esal;
    private String loc;

    public int geteid(){
        return eid;
    }
    public void seteid(int eid){
        this.eid=eid;
    }

        public String getename(){
        return ename;
    }
    public void seteid(String ename){
        this.ename=ename;
    }

        public int getesal(){
        return esal;
    }
    public void setesal(double esal){
        this.esal=esal;
    }

        public int getloc(){
        return loc;
    }
    public void seteloc(String eloc){
        this.loc=loc;
    }
        public static void main(String a[]){
            Get_Set a1 = new Get_Set();
                   a1.seteid(20);
                   a1.setename("thaharun");
                   a1.setesal(35000.0);
                   a1.setloc("marthahalli");
                   
        }
    
}