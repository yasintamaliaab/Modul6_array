package Lat_praktikum;
public class TestArraymulti {
	int nis [][] = {{210650},{210651},{210652}};
	String nama [][] = {{"Rizvan Dimas"},{"Nur Azmi"},{"Devita Fahma"}};
	public void tampil(){
	System.out.println("Identitas Siswa Angkatan 24");
	}
	public void namanis (int n){
	for (int i = 0; i< 1; i++){
	for (int j = 0; j < 1; j++){
        System.out.println(nama[0][0]+":"+nis[0][0]);
	System.out.println(nama[1][j]+":"+nis[1][j]);
        System.out.println(nama[2][j]+":"+nis[2][j]);
	}
	}
	}
	public static void main (String[]args){
	TestArraymulti siswa = new TestArraymulti();
	siswa.tampil();
	siswa.namanis(0);
        
	}}
