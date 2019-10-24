/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118060.latihan.ke.pkg62.livingthing;

/**
 *
 * @author 
 * NAMA     : Permai Ramadhan
 * KELAS    : IF-2
 * NIM      : 10118060
 * Deskripsi Program : Membuat program dengan konsep abstraksi untuk menampilkan
 * perilaku benda hidup
 */
public class Tester {
    public static void main(String[] args) {
        Human manusia = new Human();
        manusia.setNama("Permai Ramadhan");
        manusia.walk(manusia.getNama());
        manusia.breath(manusia.getNama());
        manusia.eat(manusia.getNama());
    }
    
}
