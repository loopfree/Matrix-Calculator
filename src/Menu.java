import java.util.*;
import java.io.*;

public class Menu
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args)
	{
		int menu;
		int metode;
		int masuk;
		int baca;

		do
		{
			System.out.println("");
			System.out.println("---------------------------------------");
			System.out.println("Pilih Menu yang Diinginkan");
			System.out.println("");
			System.out.println("1. Sistem Persamaan Linear");
			System.out.println("2. Determinan");
			System.out.println("3. Matriks balikan");
			System.out.println("4. Interpolasi Polinom");
			System.out.println("5. Regresi linear berganda");
			System.out.println("6. Keluar");
			System.out.println("---------------------------------------");

			menu = input.nextInt();
			switch(menu)
			{
				/* ----------------------------------------------------- */
				/* -------------- SISTEM PERSAMAAN LINEAR -------------- */
				/* ----------------------------------------------------- */
				case 1:
					System.out.println("Sistem Persamaan Linear");
					System.out.println("");
					System.out.println("---------------------------------------");
					System.out.println("Pilih Metode yang Ingin Digunakan");
					System.out.println("");
					System.out.println("1. Metode eliminasi Gauss");
					System.out.println("2. Metode eliminasi Gauss-Jordan");
					System.out.println("3. Matriks matriks balikan");
					System.out.println("4. Kaidah Cramer");
					System.out.println("---------------------------------------");
					metode = input.nextInt();

					String fileName;
					switch(metode)
					{
						case 1:
							System.out.println("---------------------------------------");
							System.out.println("Pilih Cara Menginput Matrix");
							System.out.println("");
							System.out.println("1. Metode Manual");
							System.out.println("2. Metode Baca File");
							System.out.println("---------------------------------------");
							masuk = input.nextInt();

							if (masuk== 1)
							{
								// Menulis hasil ke file.txt
								fileName = getFileToOutput();
								SPL.metodeGauss(fileName, false, null);
							}
							else if (masuk == 2)
							{	
								try
								{
									// Menulis hasil ke file.txt
									Scanner read = new Scanner(System.in);
									System.out.println("Masukkan Nama File yang Ingin Dibaca(Tanpa Ext)");
									String namaFile = read.nextLine();
									namaFile = "../test/" + namaFile + ".txt";
									File file = new File(namaFile);
									Scanner nama = new Scanner(file);

									// Menulis hasil ke file.txt
									fileName = getFileToOutput();
									SPL.metodeGauss(fileName, true, nama);
								}
								catch(Exception e) 
						        {
							   		e.getStackTrace();
							   	}
							}
							else
							{
								System.out.println("Input Tidak Valid");
							}
							break;


						case 2:
							System.out.println("---------------------------------------");
							System.out.println("Pilih Cara Menginput Matrix");
							System.out.println("");
							System.out.println("1. Metode Manual");
							System.out.println("2. Metode Baca File");
							System.out.println("---------------------------------------");
							masuk = input.nextInt();

							if (masuk== 1)
							{
								// Menulis hasil ke file.txt
								fileName = getFileToOutput();
								SPL.metodeGaussJordan(fileName, false, null);
							}
							else if (masuk == 2)
							{	
								try
								{
									// Membaca suatu file.txt
									Scanner read = new Scanner(System.in);
									System.out.println("Masukkan Nama File yang Ingin Dibaca(Tanpa Ext)");
									String namaFile = read.nextLine();
									namaFile = "../test/" + namaFile + ".txt";
									File file = new File(namaFile);
									Scanner nama = new Scanner(file);

									// Menulis hasil ke file.txt
									fileName = getFileToOutput();
									SPL.metodeGaussJordan(fileName, true, nama);
								}
								catch(Exception e) 
						        {
							   		e.getStackTrace();
							   	}
							}
							else
							{
								System.out.println("Input Tidak Valid");
							}
							break;


						case 3:
							System.out.println("Balikan");
							break;


						case 4:
							System.out.println("Cramer");
							break;


						default:
							System.out.println("Input tidak valid");
					}
					break;



				/* ----------------------------------------------------- */
				/* -------------------- DETERMINAN --------------------- */
				/* ----------------------------------------------------- */
				case 2:
					System.out.println("Determinan");
					System.out.println("");
					System.out.println("---------------------------------------");
					System.out.println("Pilih Metode yang Ingin Digunakan");
					System.out.println("");
					System.out.println("1. Reduksi Baris");
					System.out.println("2. Kofaktor");
					System.out.println("3. Dll.");
					System.out.println("---------------------------------------");
					metode = input.nextInt();
					switch(metode)
					{
						case 1:
							System.out.println("---------------------------------------");
							System.out.println("Pilih Cara Menginput Matrix");
							System.out.println("");
							System.out.println("1. Metode Manual");
							System.out.println("2. Metode Baca File");
							System.out.println("---------------------------------------");
							masuk = input.nextInt();

							if (masuk== 1)
							{
								// Menulis hasil ke file.txt
								fileName = getFileToOutput();
								Determinan.metodeReduksiBaris(fileName, false, null);
							}
							else if (masuk == 2)
							{	
								try
								{
									// Membaca suatu file.txt
									Scanner read = new Scanner(System.in);
									System.out.println("Masukkan Nama File yang Ingin Dibaca(Tanpa Ext)");
									String namaFile = read.nextLine();
									namaFile = "../test/" + namaFile + ".txt";
									File file = new File(namaFile);
									Scanner nama = new Scanner(file);

									// Menulis hasil ke file.txt
									fileName = getFileToOutput();
									Determinan.metodeReduksiBaris(fileName, true, nama);
								}
								catch(Exception e) 
						        {
							   		e.getStackTrace();
							   	}
							}
							else
							{
								System.out.println("Input Tidak Valid");
							}
							break;


						case 2:
							System.out.println("Kofaktor");
							break;


						default:
							System.out.println("Input tidak valid");
					}
					break;



				/* ----------------------------------------------------- */
				/* ------------------- MATRIX BALIKAN ------------------ */
				/* ----------------------------------------------------- */
				case 3:
					System.out.println("Matriks balikan");
					System.out.println("");
					System.out.println("---------------------------------------");
					System.out.println("Pilih Metode yang Ingin Digunakan");
					System.out.println("");
					System.out.println("1. Metode A");
					System.out.println("2. Metode B");
					System.out.println("3. Dll.");
					System.out.println("---------------------------------------");
					metode = input.nextInt();
					switch(metode)
					{
						case 1:
							System.out.println("Metode A");
							break;
						case 2:
							System.out.println("Metode B");
							break;
						default:
							System.out.println("Input tidak valid");
					}
					break;




				/* ----------------------------------------------------- */
				/* ---------------- INTERPOLASI POLINOM ---------------- */
				/* ----------------------------------------------------- */
				case 4:
					System.out.println("Interpolasi Polinom");
					break;




				/* ----------------------------------------------------- */
				/* -------------- REGRESI LINEAR BERGANDA -------------- */
				/* ----------------------------------------------------- */
				case 5:
					System.out.println("Regresi linear berganda");
					break;



				/* ----------------------------------------------------- */
				/* ---------------------- KELUAR ----------------------- */
				/* ----------------------------------------------------- */
				case 6:
					break;

				default:
					System.out.println("Input Tidak Valid");
			}

		} while (menu!=6);

	}

	static String getFileToOutput() {
		Scanner newScanner = new Scanner(System.in);
		System.out.println("Masukkan nama file di mana jawaban dibentuk");
		return "../test/" + newScanner.nextLine() + ".txt";
	}
	
}