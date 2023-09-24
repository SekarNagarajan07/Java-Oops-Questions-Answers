//Create a class named Welcome. Write constructors, to display a welcome
// message. Create 2 constructors. One to read user name as input and tell
//welcome with name. Another default constructor to print Welcome Guest.

class Welcome {
    public Welcome(String userName){
        System.out.println("Welcome: " + userName);
    }

    public Welcome(){
        System.out.println("Welcome Guest");
    }

    public static void main(String[] args) {
        Welcome welcome = new Welcome("sekar");

        Welcome defaultWelcome = new Welcome();
    }
}