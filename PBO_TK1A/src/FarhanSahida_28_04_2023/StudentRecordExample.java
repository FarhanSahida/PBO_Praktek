/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FarhanSahida_28_04_2023;

/**
 *
 * @author LABP1KOMP
 */
public class StudentRecordExample {
    public static void main(String[] args){
        StudentRecord annaRecord = new StudentRecord();
        annaRecord.setName("Anna");
        annaRecord.setAddress("Padang");
        annaRecord.setAge(23);
        annaRecord.setMathGrade(80);
        annaRecord.setEnglishGrade(70);
        annaRecord.setScienceGrade(80);
        
        //Tampilkan
        System.out.println("Nama             :"+annaRecord.getName());
        System.out.println("Alamat           :"+annaRecord.getAddress());
        System.out.println("Umur             :"+annaRecord.getAge());
        System.out.println("Matematika       :"+annaRecord.getMathGrade());
        System.out.println("B.inggris        :"+annaRecord.getEnglishGrade());
        System.out.println("Ilmu Pengetahuan :"+annaRecord.getScienceGrade());
        System.out.println("rata-rata Nilai  :"+annaRecord.getAverage());
        
        StudentRecord aliRecord = new StudentRecord();
        aliRecord.setName("Ali");
        aliRecord.setAddress("Padang");
        aliRecord.print("");
        aliRecord.print(80,70,90);
        
        studentRecord budiRecord = new studentRecord("Budi","Bukittinggi");
        budiRecord.print("");
        
        System.out.println("jumlah Siswa : "+
                studentRecord.getStudentCount());
    }
}