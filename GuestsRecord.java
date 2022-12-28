package TM;

import java.util.Scanner;

public class GuestsRecord {
    public static void main(String[] args) {
        Menu();
    }
  
    public static void InputJumlahTamu(){
        Scanner InputUser = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Tamu: ");
        int n = InputUser.nextInt();
        EventOrganiser[] s = new EventOrganiser[n];
        InputTamuUndangan(s);
    }

    public static void InputTamuUndangan(EventOrganiser[] s){
        Scanner InputUser = new Scanner(System.in);
        for(int i = 0; i < s.length; i++ ){
            s[i] = new EventOrganiser();
            System.out.print("Masukkan Customer Id: ");
            int InputId = InputUser.nextInt();
            System.out.print("Masukkan Customer Name: ");
            String InputName = InputUser.next();
            System.out.print("Masukkan Customer Address: ");
            String InputAddr = InputUser.next();
            System.out.print("Masukkan Customer Email: ");
            String InputEmail = InputUser.next();
            System.out.print("Masukkan Customer Phone: ");
            int InputPhone = InputUser.nextInt();
            System.out.print("Apakah ingin Melanjutkan Mengisi Daftar Tamu? y/n: ");
            String pilih = InputUser.next();
            if(pilih.contains("y")){
            }else{
                System.out.println("\n===Terima Kasih Sudah Mengisi Daftar Tamu===");
                System.out.print("\n===Apakah Anda Ingin Melihat Daftar Tamu? y/n: ");
                String input = InputUser.next();
                if(input.contains("y")){
                    s[i] = new EventOrganiser(InputId, InputName, InputAddr, InputEmail, InputPhone);
                    s[i].PrintGuests(s);
                }else{
                    Menu();}
            }
        }
    }

    public static void Menu(){
        Scanner InputUser = new Scanner(System.in);
        System.out.println("1.\tRegister\n2.\tExit");
        System.out.print("Masukkan Pilihan: ");
        String input = InputUser.next();
        switch(input){
            case "1":
                InputJumlahTamu();
                break;
            case "2":
                break;
            default:
                System.err.println("Anda Belum Memasukan Pilihan atau Pilihan Anda Salah");}

    }
}

