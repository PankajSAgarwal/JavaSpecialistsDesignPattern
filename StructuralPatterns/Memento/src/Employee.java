import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public class Employee {

    public enum POSITION {TESTER,PROGRAMMER,MANAGER};
    private int salary = 1000;
    private int balance = 2000;
    private POSITION position = POSITION.TESTER;

    public void pay(){
        balance += salary;
    }

    public void promote(){

        switch(position){
            case TESTER:
                position = POSITION.PROGRAMMER;
                salary += 400;
                break;
            case PROGRAMMER:
                position = POSITION.MANAGER;
                salary *= 3;
                break;

            case MANAGER:
                salary *= 1.5;
                break;
        }
    }

    public Memento createMemento(){
        return new MementoImpl(this);
    }

    public void setMemento(Memento m){

        MementoImpl mi = (MementoImpl) m;
        if(this != mi.originator.get()){
            throw new IllegalArgumentException("Memento does not match originator");
        }
        this.salary = mi.salary;
        this.balance =  mi.balance;
        this.position = mi.position;
    }
    // MementoImpl as inner static class to avoid memory leak
    private static class MementoImpl implements Memento{

        private final int salary;
        private final int balance;

        private final Employee.POSITION position;

       private final Reference<Employee> originator;

        public MementoImpl(Employee employee){
            this.salary = employee.salary;
            this.balance = employee.balance;
            this.position = employee.position;
            this.originator = new WeakReference<Employee>(employee);
        }

    }

}

