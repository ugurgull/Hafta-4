import java.util.Scanner;

public class Game {
    private static Scanner input = new Scanner(System.in);

    public void start(){
        System.out.println("Macera Oyununa Hosgeldiniz !");
        System.out.println("Lutfen bir isim giriniz : ");
        //String playerName = input.nextLine();
        Player player = new Player("ugur");
        System.out.println("Sayin " + player.getName() + " bu karanlik ve sisli adaya hosgeldiniz !! Burada yasananlarin hepsi gercek !");
        player.selectChar();

    }
}
