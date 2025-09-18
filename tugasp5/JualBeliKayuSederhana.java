/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasp5;

/**
 *
 * @author ANANDA AYU KARTIKA S
 */
class StockKayuException extends Exception {

    public StockKayuException(String message) {
        super(message);
    }
}

public class JualBeliKayuSederhana {

    // Method beli kayu hanya cek jumlah
    public static void beliKayu(int stok, int jumlahBeli) throws StockKayuException {
        if (jumlahBeli > stok) {
            throw new StockKayuException(
                    "Stok kayu tidak cukup. Stok tersedia: " + stok
                    + ", jumlah diminta: " + jumlahBeli
            );
        }
        System.out.println("Pembelian berhasil!");
        System.out.println("Jumlah beli : " + jumlahBeli);
        System.out.println("Sisa stok   : " + (stok - jumlahBeli));
    }

    public static void main(String[] args) {
        int stokKayu = 30;   
        int jumlahBeli = 50; 

        try {
            beliKayu(stokKayu, jumlahBeli);
        } catch (StockKayuException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}


