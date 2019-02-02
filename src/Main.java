import pixelr.*;

public class Main {

    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        userManager.addUser(0,new User("raza","chamar@gmqail.com"));
        userManager.addUser(1,new User("maza","golden@gmqail.com"));
        userManager.addUser(2,new User("saza","lolwa@gmqail.com"));

        Library library = new Library();
        library.addBook(0,new Book("dex life","pixelr","funx"));
        library.addBook(1,new Book("go and find my as","pixelr","sund"));
        library.addBook(2,new Book("some books","guess whio","lolwa"));

        OnlineReader onlineReader = new OnlineReader(library, userManager);
        try {
            onlineReader.setCurrentBookAndReade(0,2);
            Display display = onlineReader.getDisplay();
            display.display();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
