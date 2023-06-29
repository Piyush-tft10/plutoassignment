public class construchaining {
    construchaining(){

        System.out.println("called......");
    }
    public static void main(String[] args) {
        childd c= new childd();
    }
}

class childd extends construchaining{
    childd(){
        System.out.println("calling......");
    }

}
