public class MyThis {



    public static void main(String[] args) {




        MyThis myThis = new MyThis();

        {


        }
        myThis.length();
        myThis.index();
        myThis.lower();
        System.out.println(myThis.length());
        System.out.println(myThis.index());
        System.out.println(myThis.lower());


    }
    int spped = 5;

    public MyThis(){   }
    public MyThis(MyThis c){
        System.out.println(c);
    }

    public MyThis(int weight, MyThis q)
    { this() ;
    weight = 10;


    }




    public void run (int speed){
        this.spped= speed;
        System.out.println(speed);
        walk(this);
        System.out.println(this);
            }

            public MyThis walk(MyThis v){
        return this;
            }
            public void eat(){
        new MyThis(this);
            }

            public int length(){
        String name = "Nobin Kalayil Babu";
        return name.length();

            }
    public String lower(){
        String name = "Nobin Kalayil Babu";
        return name.toLowerCase();

    }
    public int index(){
        String name = "Nobin Kalayil Babu";
        return name.indexOf('n');


    }
    public  void anu123(Nobin b){
        b.arun();
        System.out.println(b);

    }




}
