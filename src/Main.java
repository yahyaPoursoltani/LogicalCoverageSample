public class Main {
    public static void main(String[] args) {
        System.out.println(Chkding(1,2));
    }

    /**
     * @apiNote : This function gets a number and a Numerical base
     *             then determines is that number has valid digits
     *             according to base or not?
     *
     * @param qsb : Numerical Base of Number : 2<=qsb<=10
     * @param qin : Input Number : 0<=qin
     * @return state of Program
     *      if valid(qin) and valid(qsb) and Valid(one of digit of Input) then qs=3
     *      if valid(qin) and valid(qsb) and Invalid(one of digit of Input) then qs=2
     *      if Invalid(qin) or Invalid(qsb) then qs=1
     *
     * **/
    public static int Chkding(int qsb, int qin){
        int qs=1;
        if((qsb>0 && qsb<=10)&&qin>=0){
            qs=2;
            int b=qin;
            int d=0;
            while (b>0 && d<qsb){
                int x=b;
                b= x/10;
                d= x-b*10;
            };

            if(d<qsb){
                qs=3;
            }
        }
        return qs;
    }
}