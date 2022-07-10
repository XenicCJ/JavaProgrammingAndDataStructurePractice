package C7_LinearArray;

/**
 * locker problem, 1000 students and 1000 lockers
 */
public class P23_LockerProblem {
    /**
     * deal with locker problem
     * @param lockerAmount
     * @param studentAmount
     */
    public static void lockerProblem(int lockerAmount,int studentAmount){
        //do the problem
        boolean[] lockers=new boolean[lockerAmount];
        for(int i=1;i<=studentAmount;i++){
            oneStudentAction(lockers,i);
        }
        //show No. of all opened lockers
        System.out.print("Sequence Number of All Opened lockers are: ");
        for(int i=0;i<lockers.length;i++){
            if(lockers[i]){
                System.out.print((i+1)+" ");
            }
        }
    }

    /**
     * one student action
     * @param lockers
     * @param studentNo
     */
    public static void oneStudentAction(boolean[] lockers,int studentNo){
        for(int i=studentNo-1;i<lockers.length;i+=studentNo){
            changeLockerState(lockers,i);
        }
    }

    /**
     * change state of one locker
     * @param lockers
     * @param pos
     */
    public static void changeLockerState(boolean[] lockers,int pos){
        if(lockers[pos]){
            lockers[pos]=false;
        }else {
            lockers[pos]=true;
        }
    }

    public static void main(String[] args) {
        lockerProblem(1000,1000);
    }
}
