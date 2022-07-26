public class OOP {


    //  height và width có tính đóng gói
    private int height;
    private int width;

    public OOP(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int chuvihinhchunhat() {
        return 2 * height * width;
    }

    public int dientichhinhchunhat() {
        return height * width;
    }


}

    //  Tính kế thừa
    class Animal{
        public void Speak() {
            System.out.println("Animal is speaking...");
        }
    }
    class Dog extends Animal{
        public void Speak(){
            System.out.println("Dog is speaking...");
        }
    }
