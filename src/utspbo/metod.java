/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utspbo;

/**
 *
 * @author Kirana
 */
import java.util.Random;
import java.util.Scanner;
public class metod {
    void awal(){
           skor = 0;
    lives = 3;
    level = 1; 
    }
    int skor = 0;
    int lives = 3;
    int level = 1;
    int pilih;
    int soal;
    String nama;
    String output = "";
    Scanner in = new Scanner (System.in);
    
    
    void tampilan(){
        System.out.println ("**********************");
        System.out.println ("Game Match");
        System.out.println ("**********************");
        System.out.println ("Masukkan Nama Anda : ");
        this.nama = in.nextLine();
    }
    void Menu(){
        awal();
        System.out.println ("**********************");
        System.out.println ("Game Match");
        System.out.println ("**********************");
        System.out.println ("Menu : ");
        System.out.println ("1.Penjumlahan");
        System.out.println ("2.Pengurangan");
        System.out.println ("3.Keluar");
        System.out.println ("Pilihan no menu : ");
        this.pilih = in.nextInt();
                if (pilih==3){
        System.exit(0);   
        }
    }

    void level1(){
        if (pilih == 1){
            do {
                if (lives == 0){
                    System.out.println("Kamu kalah :( huhuhuhu");          
            Menu();
        }
                int angkaK = (int)(Math.random()*10);
                int angkaN = (int)(Math.random()*10);
                System.out.println ("**********************");
                System.out.println ("Game Match");
                System.out.println ("**********************");
                System.out.println ("Berapakah hasil dari "+ angkaK + " + " + angkaN + " =  ?");
                this.soal = in.nextInt();
                int kunci = angkaK + angkaN;
                if (soal == kunci){
                    skor = skor + 5;
                        System.out.println("[Selamat " + this.nama + " Jawabanmu Benar]" + "[Skor : " + this.skor + " ]" + "Lives : " + this.lives + " ]" + "[level :" + this.level + " ]");
                }
                else {
                    skor = skor - 2 ;
                    lives = lives - 1;
                        System.out.println("Wah, maaf jawabanmu salah!" + "[Skor : " + this.skor + " ]" + "Lives : " + this.lives + " ]" + "[level :" + this.level + " ]");  
                }
            } 
            while (skor < 100);
                    System.out.println(" YEYYY " + this.nama + " Kamu Naik Level 2!" );
            if(lives > 0){
                level2();
                    System.out.println(" YEYYY " + this.nama + " Kamu Naik Level 3!");
            if (lives > 0){
                level3();
                }
            }
        }
        else if (pilih == 3){
            System.exit(0);   
        }
        else if (pilih == 2){
            do {
                if (lives == 0){
                    System.out.println("Kamu kalah :( huhuhuhu"); 
                        Menu();  
                }
                int angkaK = (int)(Math.random()*10);
                int angkaN = (int)(Math.random()*10);
                System.out.println ("**********************");
                System.out.println ("Game Match");
                System.out.println ("**********************");
                System.out.println ("Berapakah hasil dari "+ angkaK + " - " + angkaN + " =  ?");
                this.soal = in.nextInt();
                int kunci = angkaK - angkaN;
                if (soal == kunci){
                    skor = skor + 5;
                        System.out.println("[Selamat " + this.nama + " Anda Benar]" + "[Skor : " + this.skor + " ]" + "Lives : " + this.lives + " ]" + "[level :" + this.level + " ]");
                }
                else {
                    skor = skor - 2 ;
                    lives = lives - 1;
                        System.out.println("Wah, maaf jawabanmu salah!" + "[Skor : " + this.skor + " ]" + "Lives : " + this.lives + " ]" + "[level :" + this.level + " ]");  
                }
            } 
                while (skor < 100);
                    System.out.println(" YEYYY " + this.nama + " Anda Naik Level 2!" );
                if(lives > 0){
                    level2();
                        System.out.println(" YEYYY " + this.nama + " Anda Naik Level 3!");
                if (lives > 0){
                    level3();
             }
        }
        }
    }
    void level2(){
        if (pilih == 1){
            do {
                if (lives == 0){
                    System.out.println("Kamu kalah :( huhuhuhu");
                        Menu();
                }
                int angkaK = (int)(Math.random()*(-1 - (-10)+1))+(-10);
                int angkaN = (int)(Math.random()*(-1 - (-10)+1))+(-10);
                
                String bil1 = (angkaK>0)? Integer.toString(angkaK) : "(" + angkaK + ")";
                String bil2 = (angkaN>0)? Integer.toString(angkaN) : "(" + angkaN + ")";
  
                System.out.println ("**********************");
                System.out.println ("Game Match");
                System.out.println ("**********************");
                System.out.println ("Berapakah hasil dari "+ bil1 + " + " + bil2 + " =  ?");
                this.soal = in.nextInt();
                int kunci = angkaK + angkaN;
                if (soal == kunci){
                    skor = skor + 5;
                    System.out.println("[Selamat " + this.nama + " Anda Benar]" + "[Skor : " + this.skor + " ]" + "Lives : " + this.lives + " ]" + "[level :" + this.level + " ]");
                }
                else {
                    skor = skor - 2 ;
                    lives = lives - 1;
                    System.out.println("Wah, maaf jawabanmu salah!" + "[Skor : " + this.skor + " ]" + "Lives : " + this.lives + " ]" + "[level :" + this.level + " ]");  
                }
            } 
                while (skor < 200);  
        }
                else if (pilih == 3){
        System.exit(0);   
        }
        if (pilih == 2){
            do {
                if (lives == 0){
                    System.out.println("Kamu kalah :( huhuhuhu");
                        Menu();
                }
                int angkaK = (int)(Math.random()*(-1 - (-10)+1))+(-10);
                int angkaN = (int)(Math.random()*(-1 - (-10)+1))+(-10);
                
                String bil1 = (angkaK>0)? Integer.toString(angkaK) : "(" + angkaK + ")";
                String bil2 = (angkaN>0)? Integer.toString(angkaN) : "(" + angkaN + ")";
               
                System.out.println ("**********************");
                System.out.println ("Game Match");
                System.out.println ("**********************");
                System.out.println ("Berapakah hasil dari "+ bil1 + " - " + bil2 + " =  ?");
                this.soal = in.nextInt();
                int kunci = angkaK - angkaN;
                if (soal == kunci){
                    skor = skor + 5;
                        System.out.println("[Selamat " + this.nama + " Anda Benar]" + "[Skor : " + this.skor + " ]" + "Lives : " + this.lives + " ]" + "[level :" + this.level + " ]");
                }
                else {
                    skor = skor - 2 ;
                    lives = lives - 1;
                        System.out.println("Wah, salah deh!" + "[Skor : " + this.skor + " ]" + "Lives : " + this.lives + " ]" + "[level :" + this.level + " ]");  
                }
            } while (skor < 200);
        }
    }
        void level3(){
        if (pilih == 1){
            do {
                if (lives == 0){
                    System.out.println("Kamu kalah :( huhuhuhu");
                        Menu(); 
                }
                int angkaK = (int)(Math.random()*(10 - (-10)+1))+(-10);
                int angkaN = (int)(Math.random()*(10 - (-10)+1))+(-10);
                
                String bil1 = (angkaK>0)? Integer.toString(angkaK) : "(" + angkaK + ")";
                String bil2 = (angkaN>0)? Integer.toString(angkaN) : "(" + angkaN + ")";
                
                System.out.println ("**********************");
                System.out.println ("Game Match");
                System.out.println ("**********************");
                System.out.println ("Berapakah hasil dari "+ bil1 + " + " + bil2 + " =  ?");
                this.soal = in.nextInt();
                int kunci = angkaK + angkaN;
                if (soal == kunci){
                    skor = skor + 5;
                        System.out.println("[Selamat " + this.nama + " Anda Benar]" + "[Skor : " + this.skor + " ]" + "Lives : " + this.lives + " ]" + "[level :" + this.level + " ]");
                }
                else {
                    skor = skor - 2 ;
                    lives = lives - 1;
                        System.out.println("Wah, maaf jawabanmu salah!" + "[Skor : " + this.skor + " ]" + "Lives : " + this.lives + " ]" + "[level :" + this.level + " ]");  
                }
            } 
                while (skor < 300);     
        }
                else if (pilih == 3){
        System.exit(0);   
        }
        if (pilih == 2){
            do {
                if (lives == 0){
                    System.out.println("Kamu kalah :( huhuhuhu");
                        Menu(); 
                }
                int angkaK = (int)(Math.random()*(10 - (-10)+1))+(-10);
                int angkaN = (int)(Math.random()*(10 - (-10)+1))+(-10);
                
                String bil1 = (angkaK>0)? Integer.toString(angkaK) : "(" + angkaK + ")";
                String bil2 = (angkaN>0)? Integer.toString(angkaN) : "(" + angkaN + ")";

                System.out.println ("**********************");
                System.out.println ("Game Match");
                System.out.println ("**********************");
                System.out.println ("Berapakah hasil dari "+ bil1 + " - " + bil2 + " =  ?");
                this.soal = in.nextInt();
                int kunci = angkaK - angkaN;
                if (soal == kunci){
                    skor = skor + 5;
                        System.out.println("[Selamat " + this.nama + " Anda Benar]" + "[Skor : " + this.skor + " ]" + "Lives : " + this.lives + " ]" + "[level :" + this.level + " ]");
                }
                else {
                    skor = skor - 2 ;
                    lives = lives - 1;
                        System.out.println("Wah, maaf jawabanmu salah!" + "[Skor : " + this.skor + " ]" + "Lives : " + this.lives + " ]" + "[level :" + this.level + " ]");  
                }
            } 
                while (skor < 300);
        }
    }
}
