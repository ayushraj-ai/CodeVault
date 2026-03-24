class Dogg {
    int x;

    public int getx() {
        return x;
    }

    public void setx(int x) {
        this.x = x;
    }
}
    class cat extends Dogg {
        int y;

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }


public class inheritance {
    public static void main(String[] args) {
            cat b = new cat();
            b.setY(4);
            System.out.println(b.getY());
    }
    
}
