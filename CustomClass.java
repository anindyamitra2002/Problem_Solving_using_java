class Player{
    private int id;
    private String name;
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }
}

public class CustomClass {
    public static void main(String[] args) {
        Player anind = new Player();
        anind.setName("Anindya Mitra");
        anind.setId(42);

        System.out.println(anind.getName());
        System.out.println(anind.getId());

    }
}
