import java.util.*;
public class Isi {
	//INISIALISASI	BUAH
	public static Vector <String> id = new Vector <String>();
	public static Vector <String> namabuah= new Vector <String>();
	public static Vector hargabeli= new Vector();
	public static Vector hargajual= new Vector();
	
	public static Scanner sc = new Scanner (System.in);
	public static void admin ()
	{
		boolean haladmin=false;
		
		do 
		{
			System.out.println ("");
			System.out.println ("==============================");
			System.out.println ("======== Halaman Admin =======");
			System.out.println ("==============================");
			System.out.println ("1. Manajemen Barang");
			System.out.println ("2. Manajemen Penjualan");
			System.out.println ("3. Logout");
			System.out.print ("Pilih pilihan [1-3] : ");
			int Pil_Buah = sc.nextInt();
				boolean buah=false;
				
			switch (Pil_Buah) 
			{
				case 1:
					do {
						System.out.println ("");
						System.out.println ("==============================");
						System.out.println ("       Manajemen Barang         ");
						System.out.println ("==============================");
						System.out.println ("1. Menambah Data Barang");
						System.out.println ("2. Menghapus Data Barang");
						System.out.println ("3. Mengganti Data Barang");
						System.out.println ("4. Menampilkan Data Barang");
						System.out.println ("5. Mencari Data Barang");
						System.out.println ("6. Exit");
						System.out.print ("Pilih pilihan [1-6] : ");
						
						int pilbuah = sc.nextInt();
						int urutan=-1;
						
							if (pilbuah == 1)
							{
								boolean cekbuah = false;
								do 
								{
								System.out.print ("\n");
									System.out.println ("==============================");
									System.out.println ("1. Menambah Data Barang         ");
									System.out.println ("==============================");
									
									System.out.print ("Masukkan ID : ");
									String ID = sc.next();
									if (id.contains(ID.toUpperCase()) == false)
									{
										
										System.out.print ("Masukkan Nama Barang : ");	
										String NAMA = sc.next();
										if (NAMA.contains(NAMA.toUpperCase()) == false)
										{
											
											System.out.print ("Masukkan Harga Beli : ");
											int HARGA = sc.nextInt();
											
											id.add(ID.toUpperCase());
											namabuah.add(NAMA.toUpperCase());
											hargabeli.add(HARGA);
											int hj = HARGA*10/100;
											hargajual.add(HARGA+hj);
											
											cekbuah = true;
										}
										else {
											System.out.println ("Nama Barang telah digunakan");}
									}
									else {
										System.out.println ("ID telah digunakan");}
								} while (cekbuah == false);
							}
							
							if (pilbuah == 2){
								System.out.print ("\n");
									System.out.println ("==============================");
									System.out.println ("2. menghapus data Barang        ");
									System.out.println ("==============================");
									System.out.print ("Masukkan ID Barang	:");
									
								String hapusbuah = sc.next();
								if (id.contains(hapusbuah.toUpperCase()))
								{
									urutan = id.indexOf(hapusbuah.toUpperCase());
									System.out.println ("Apakah Anda akan menghapus");
									System.out.println ("ID Barang	:"+id.elementAt(urutan));
									System.out.println ("Nama Barang	:"+namabuah.elementAt(urutan));
									System.out.print ("[y/t]");
									String HapusBuah = sc.next();
									if (HapusBuah.equalsIgnoreCase("y"))
									{
										id.remove(id.elementAt(urutan));
										namabuah.remove(namabuah.elementAt(urutan));
										hargabeli.remove(hargabeli.elementAt(urutan));
										hargajual.remove(hargajual.elementAt(urutan));
									}
									else 
									{
									System.out.println ("Data ID "+id.elementAt(urutan)+" tidak terhapus");
									}
								}
								else 
								{
								System.out.println ("ID tidak ditemukan"); 
								}
							}
							
							if (pilbuah == 3)
							{
								System.out.print ("\n");
									System.out.println ("==============================");
									System.out.println ("3. mengganti data Barang        ");
									System.out.println ("==============================");
								System.out.print ("Masukkan ID Barang : ");
								
								String gantiID = sc.next();
								if (id.contains(gantiID.toUpperCase()))
								{
									urutan = id.indexOf(gantiID.toUpperCase());
									System.out.print ("\n");
									System.out.println ("Mengganti Data Barang ");
									System.out.println ("------------------------------");
									System.out.println ("ID Barang	:"+id.elementAt(urutan));
									System.out.println ("Nama Barang	:"+namabuah.elementAt(urutan));
									System.out.println ("Harga Beli	:"+hargabeli.elementAt(urutan));
									
									System.out.print ("[y/t]");
									String GantiID = sc.next();
									if (GantiID.equalsIgnoreCase("y"))
									{
										System.out.print ("Masukkan Nama Barang : ");
										String NAMA = sc.next();
										namabuah.setElementAt(NAMA.toUpperCase(), urutan);

										System.out.print ("Masukkan Harga Beli : ");
										int HARGA = sc.nextInt();
										hargabeli.setElementAt(HARGA, urutan);
										//Menentukan harga jual
										int hj2 = (10/100)*Integer.parseInt(hargabeli.elementAt(urutan).toString());
										hargajual.setElementAt((HARGA+hj2), urutan);
									}
									
									else 
									{
									System.out.println ("Data ID "+id.elementAt(urutan)+" tidak diganti");
									}
									
								}
								
								else 
								{
									System.out.println ("ID Tidak ditemukan");
									}
									
							}
							
							if (pilbuah == 4)
							{
								System.out.print ("\n");
									System.out.println ("==============================");
									System.out.println ("4. menampilkan data Barang      ");
									System.out.println ("==============================");
								
								Isi.baru();
								for (int i=0; i<id.size(); i++)
								{
									System.out.println (id.elementAt(i)+"\t"+namabuah.elementAt(i)+"\t"+hargabeli.elementAt(i)+"\t"+hargajual.elementAt(i));
								}
								
							}
							
							if (pilbuah == 5)
							{
							
								System.out.print ("\n");
									System.out.println ("==============================");
									System.out.println ("5. mencari data Barang      ");
									System.out.println ("==============================");
									System.out.print ("Masukkan Nama Barang yang ingin dicari : ");
									String NAMA = sc.next();
									
									for (int i=0; i<id.size(); i++)
									{
										namabuah.equals(NAMA);
										System.out.println (id.elementAt(i)+"\t"+namabuah.elementAt(i)+"\t"+hargabeli.elementAt(i)+"\t"+hargajual.elementAt(i));
									}
									
							}
							
							if (pilbuah == 6)
							{
								buah = true;
							}
							
					} while (buah == false);
				break;
				
				case 2:
					Isi.kasir();
				break;
				
				
				case 3:
					haladmin = true;
				break;
			}
		} while (haladmin == false);
	}
	
	public static void Penjualan () {

	}
	
	public static Vector total= new Vector();
	public static Vector <String> id1 = new Vector <String>();
	public static Vector <String> namabuah2= new Vector <String>();
	public static Vector <String> hari = new Vector <String>();
	public static Vector totalhari = new Vector();
	public static Vector alltotal = new Vector();
	
	public static void kasir ()
	{
		
		
		boolean halkasir = false;
		do 
		{
		System.out.println ("");
			System.out.println ("==============================");
			System.out.println ("=======Halaman Penjualan======");
			System.out.println ("==============================");
			System.out.println ("1. Penjualan");
			System.out.println ("2. Laporan Penjualan");
			System.out.println ("3. Logout");
			System.out.print ("Pilih pilihan [1-3] : ");
			int Pil_Kasir = sc.nextInt();
			int TotalHari=0;
			int AllTotal=0;
			String ksrbuah;
			
			switch (Pil_Kasir) {
				case 1:
					boolean inputdata = false;
					System.out.print ("\n");
					System.out.println ("==============================");
					System.out.println ("           PENJUALAN          ");
					System.out.println ("==============================");
					System.out.println ("ketik \"stop\" untuk selesai memesan");
					System.out.println ("=============================");
					
					
						
							System.out.println ("masukkan barang yg dibeli");
					do 
					{
							int urutan2 = -1;
							System.out.print ("Input Nama Barang \t: ");
							ksrbuah = sc.next();
							
							if (ksrbuah.equalsIgnoreCase("stop"))
								{
									inputdata = true;
								}
							else if (namabuah.contains(ksrbuah.toUpperCase()) == true)
								{
									urutan2 = namabuah.indexOf(ksrbuah.toUpperCase());
									namabuah2.add(ksrbuah);
									
									System.out.print ("Input Jumlah : ");
									int jumlah = sc.nextInt();
									
									
									total.add(Integer.parseInt(hargajual.elementAt(urutan2).toString()));
									TotalHari += jumlah*Integer.parseInt(hargajual.elementAt(urutan2).toString());
									
								}
							else 	
								{
									System.out.println ("Nama Buah Tidak Terdaftar / Inputan Salah");
								}
							
					} while (inputdata == false);
					
						totalhari.add(TotalHari);
						
				alltotal.add(AllTotal);
							
				break;
				
				case 2:
					System.out.println ("");
						System.out.println ("==============================");
						System.out.println ("      LAPORAN PENJUALAN       ");
						System.out.println ("==============================");
						System.out.println ("");
					System.out.println ("------------------------------");
						for (int k=0; k<1; k++) 
							{
								System.out.println ("total transaksi "+totalhari.elementAt(k));
							}
					System.out.println ("------------------------------");
					System.out.println("daftar barang yg dibeli:");
						for (int i=0; i<id1.size(); i++)
							{
								System.out.println(namabuah.elementAt(i));
								
							}
				break;
				
				case 3:
					halkasir = true;
				break;
			}
		}while (halkasir == false);
	}
	
	public static void baru(){
		
		Vector <Integer> id = new Vector <Integer>();
		Vector <String> nama = new Vector <String>();
		Vector <Integer> harga = new Vector <Integer>();
		
		id.add(01);
		id.add(02);
		id.add(03);
		
		nama.add("melon");
		nama.add("pisang");
		nama.add("jambu");	
		
		harga.add(100);
		harga.add(200);
		harga.add(100);
		
		

		System.out.println("cetak isi vektor");
		System.out.println("ID || NAMA BARANG || HARGA") ;
		for (int i=0; i<id.size(); i++){
			
			System.out.println(""+id.get(i)+"\t"+(nama.get(i).toString())+"\t      "+harga.get(i)) ;
		}
	
	
	
	}
}