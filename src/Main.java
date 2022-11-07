import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] array = {"KTRK", "Mir-24", "Sport TV", "Peramida", "Peak-Soft Tv", "Music", "Cinemax",
                "Footboll TV", "Balastan", "NTS"};
        Television television = new Television(0, 10, array);
        while (true){
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" +
                    "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("1. Следующий канал. 2. Предыдущий канал. 3. Переключать канал по номеру." +
                    " 4.Показать все текущее каналы.  5. Получить текущее название канала.");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" +
                    "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print(" Введите число для команды : ");
            int number = new Scanner(System.in).nextInt();
            if (number==1){
                television.nextChannel();
            } else if (number==2) {
                television.previouschannel();
            } else if (number==3) {
                System.out.print(" Введите номер канала : ");
                int channelNumber = new Scanner(System.in).nextInt();
                television.changeChannelByNumber(channelNumber);
            } else if (number==4) {
                television.setChannel();
            } else if (number==5) {
                System.out.println(" Название текушего канала : " + television.getCurrentChannelName());
            } else if (number==0) {
                System.out.println(" Программа была завершена."); break;
            }
            else {
                System.out.println("Не правильный ввод номера . Пожалуйста введите заново.");
            }
        }
    }
}