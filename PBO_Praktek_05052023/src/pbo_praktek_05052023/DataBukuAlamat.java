/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_praktek_05052023;

/**
 *
 * @author mhdir
 */
public class DataBukuAlamat {
    private BukuAlamat[] data = new BukuAlamat[100];
    private int index;
    
    public void insert(BukuAlamat dataAlamat){
        data[index] = dataAlamat;
        index++;
    }
    
    public void update(int index, BukuAlamat dataAlamat){
        data[index] = dataAlamat;
    }
    
    public BukuAlamat[] getAll(){
        BukuAlamat[] temp = new BukuAlamat[index];
        for(int i = 0;i < index; i++){
            temp[i]=data[i];
        }
        return temp;
    }
    
    public void delete(int index){
        data[index].setAlamat("");
        data[index].setNama("");
        data[index].setNotelp("");
        data[index].setEmail("");       
    }
    
    public static void main(String[] args){
        DataBukuAlamat data = new DataBukuAlamat();
        BukuAlamat temp = new BukuAlamat();
        temp.setNama("Hansy");
        temp.setAlamat("Padang");
        temp.setNotelp("085157300103");
        temp.setEmail("farhansahida1101@gmail.com");
        
        BukuAlamat temp1 = new BukuAlamat();
        temp1.setNama("Abdul");
        temp1.setAlamat("Solok");
        temp1.setNotelp("081123980123");
        temp1.setEmail("abdulgg90@gmail.com");
        
        data.insert(temp);
        data.insert(temp1);
        
        //tampilkan
        BukuAlamat[] list = data.getAll();
        for(int i = 0;i < list.length; i++){
            System.out.println("Buku Alamat ke : "+(i+1));
            System.out.println("Nama : "+list[i].getNama());
            System.out.println("Alamat : "+list[i].getAlamat());
            System.out.println("No telpon : "+list[i].getNotelp());
            System.out.println("Email : "+list[i].getEmail()+"\n");
        }
    }
}
