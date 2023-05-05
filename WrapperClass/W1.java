package WrapperClass;

public class W1 {

	public static void main(String[] args) {
		//Boxing
		
		byte ba=10;
		Byte bb=ba;
		Byte bc=Byte.valueOf(ba);
		System.out.println(bb);
		System.out.println(bc);
		
		short sa=20;		
		Short sb=sa;		
		Short sc=Short.valueOf(sa);
		System.out.println(sb);
		System.out.println(sc);
		
		int ia=30;		
		Integer ib=ia;		
		Integer ic=Integer.valueOf(ia);
		System.out.println(ib);
		System.out.println(ic);
		
		
		long la=40;		
		Long lb=la;		
		Long lc=Long.valueOf(la);
		System.out.println(lb);
		System.out.println(lc);
		
		float fa=40;		
		Float fb=fa;		
		Float fc=Float.valueOf(fa);
		System.out.println(fb);
		System.out.println(fc);
		
		double da=40;		
		Double db=da;		
		Double dc=Double.valueOf(da);
		System.out.println(db);
		System.out.println(dc);
		
		char ca='A';		
		Character cb=ca;		
		Character cc=Character.valueOf(ca);
		System.out.println(cb);
		System.out.println(cc);
		
		boolean bla=true;		
		Boolean blb=bla;		
		Boolean blc=Boolean.valueOf(bla);
		System.out.println(blb);
		System.out.println(blc);
		
		
		
		
		

	}

}
