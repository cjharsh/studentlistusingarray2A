package listmain;


import bean.Student;

public class MyStudentList {
    private Student[] mylist;
    private int last;

    public MyStudentList(Student[] mylist, int last) {
        this.mylist = mylist;
        this.last = last;
    }

    public void insert(Student element){

        if(last<mylist.length-1){
            last++;
            mylist[last]=element;
        }
        else{
            System.out.println("list is full");
        }

    }
    public void delete(){
        if(last>=0){
            mylist[last]=null;
            last--;
        }
    }

    public boolean search(Student element){
        boolean response=false;
        for(int i=0;i<=last;i++){
            if(mylist[i].getName().equals(element.getName())
                    &&mylist[i].getRollno()==element.getRollno()){
                response=true;
                break;
            }
        }

        return response;
    }

    public void sort(){
        for(int i=0;i<last;i++){
            for(int j=0;j<last;j++){
                if(mylist[j].getRollno()>mylist[j+1].getRollno()){
                    Student temp=mylist[j];
                    mylist[j]=mylist[j+1];
                    mylist[j+1]=temp;
                }
            }
        }
    }
    public void display(){
        System.out.println("mylist");
        for(int i=0;i<=last;i++){
            System.out.println(mylist[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int size = 5;

        Student[] mylist1 = new Student[size];

        int last = -1;

        MyStudentList obj=new MyStudentList(mylist1,last);

        Student element=new Student();
        Student e1=new Student();

        element.setName("vaibahv");
        element.setRollno(24);

        e1.setName("Shyam");
        e1.setRollno(2);

        obj.insert(element);
        obj.display();

        obj.insert(e1);
        obj.display();

        obj.sort();
        obj.display();

        obj.delete();
        obj.display();

        System.out.println(obj.search(element));

    }


}
