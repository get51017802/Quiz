import java.util.Scanner;
public class quis1
{
	public static void main(String [] args) 
	{
		Scanner input= new Scanner(System.in);
		String nama;
		double ktp,bayar,totalbayar,kembalian,jenis,tujuan;
		double diskon;
		double biaya;
		
		System.out.print("Masukkan Nama Anda            : ");
		nama=input.nextLine();
		System.out.print("Masukkan no. KTP              : ");
		ktp=input.nextInt();
		System.out.print("Tujuan:                  (1.Mks)(2.Jkt): ");
		tujuan=input.nextInt();
		System.out.print("Jenis Penerbangan:(1.Ekonomi)(2.Bisnis): ");
		jenis=input.nextInt();
		System.out.print("status member:            (1.Yes)(2.No): ");
		diskon=input.nextInt();
		
		if(tujuan==1 && jenis==1)
		{
			System.out.println();
			System.out.println("Nama: "+nama);
			System.out.println("Kelas: Ekonomi");
			System.out.println("Destinasi: Makassar");
			biaya=1000000;
			
		}
		else if(tujuan==1 && jenis==2)
		{
			System.out.println();
			System.out.println("Nama: "+nama);
			System.out.println("Kelas: Ekonomi");
			System.out.println("Destinasi: Jakarta");
			biaya=1500000;
		}
		else if(tujuan==2 && jenis==1)
		{
			System.out.println();
			System.out.println("Nama: "+nama);
			System.out.println("Kelas: Bisnis");
			System.out.println("Destinasi: Makassar");
			biaya=2500000;
		}
		else if(tujuan==2 && jenis==2)
		{
			System.out.println();
			System.out.println("Nama: "+nama);
			System.out.println("Kelas: Bisnis");
			System.out.println("Destinasi: Jakarta");
			biaya=3000000;
		}
		else
		{
			biaya=0;
		}
		
		
		if(diskon==1)
		{
			diskon=0.1;
		}
		else
		{
			diskon=0;
		}
		
		totalbayar=biaya-(biaya*diskon);
		
		
	
		System.out.println("Total Bayar: Rp " +totalbayar);
		System.out.print("Bayar: Rp ");
		bayar=input.nextInt();
		kembalian=bayar-totalbayar;
		System.out.println("kembalian: Rp "+kembalian);
	}
			
	}
