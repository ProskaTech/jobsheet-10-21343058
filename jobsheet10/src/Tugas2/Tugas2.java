//created by 21343058_Muhammad Farel Fahlevi

package Tugas2;

public class Tugas2 {
    String Nama, smtr;
    int NIM, SKS;
    double IP;
    
    public void IP(){
        if(IP >= 3.5){
            SKS = 24;
            System.out.println("Anda berhak mengontrak "+SKS+" SKS pada Semester V");
        }
        else if(IP >= 3.0){
            SKS = 22;
            System.out.println("Anda berhak mengontrak "+SKS+" SKS pada Semester V");
        }
        else if(IP >= 2.5){
            SKS = 20;
            System.out.println("Anda berhak mengontrak "+SKS+" SKS pada Semester V");
        }
        else if(IP >= 2.0){
            SKS = 18;
            System.out.println("Anda berhak mengontrak "+SKS+" SKS pada Semester V");
        }
        else{
            SKS = 15;
            System.out.println("Anda berhak mengontrak "+SKS+" SKS pada Semester V");
        }
    }
    
    public static void main(String[] args){
        Tugas2 Mahasiswa = new Tugas2();
    
        Mahasiswa.Nama = "Joni";
        Mahasiswa.NIM = 12345;
        Mahasiswa.smtr = "V";
        Mahasiswa.IP = 3.5;
        
        
        System.out.println("Jumlah Pengambilan SKS");
        System.out.println("Nama Mahasiswa\t: "+ Mahasiswa.Nama);
        System.out.println("NIM\t\t: "+ Mahasiswa.NIM);
        System.out.println("Semester\t: "+ Mahasiswa.smtr);
        System.out.println("IP Semester ini\t: "+ Mahasiswa.IP);
        Mahasiswa.IP();
    }

}
