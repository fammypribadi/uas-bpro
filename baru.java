public class baru(){
		public static void main (String [] args);
		Vector <Integer> id = new Vector <Integer>();
		Vector <String> nama = new Vector <String>();
		Vector <Integer> harga = new Vector <Integer>();
		
	id.add(01);
	id.add(02);
	id.add(03);
	
	nama.add("Melon");
	nama.add("Pisang");
	nama.add("Jambu");	
	
	harga.add(100);
	harga.add(200);
	harga.add(400);
	
	

	
	System.out.println("cetak isi vektor");
	System.out.println("ID || NAMA BARANG || HARGA") ;
	for (int i=0; i<id.size(); i++){
		
		System.out.println(""+id.get(i)+"\t"+(nama.get(i).toString())+"\t      "+harga.get(i)) ;
	}
	
	
	
  }