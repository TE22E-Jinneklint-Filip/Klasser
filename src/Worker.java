public class Worker {
    protected String name;
    protected int age;
    protected int wage;

    public Worker(String name, int age) {
        this.name = name;
        this.age = age;
        this.wage = 0;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWage() {
        return wage;
    }


}


class BlueCollar extends Worker {
    public BlueCollar(String name, int age) {
        super(name, age);
    }

    public void Build(){

    }

    public void Repair(){

    }

    public void Destroy(){

    }

}

class WhiteCollar extends Worker {

    public WhiteCollar(String name, int age) {
        super(name, age);
    }



}
