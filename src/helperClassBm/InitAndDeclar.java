package helperClassBm;

public class InitAndDeclar {
	char p_chr;
	byte p_bt;
	short p_shrt;
	int p_int;
	long p_lng;
	float p_flt;
	double p_dbl;
	boolean p_bln;	
	
	public char initChar( ) {
		System.out.println("This is default value for char: " + p_chr);
		p_chr = 'H';
		System.out.println("chr = 'H'; This is declared value for char: " + p_chr);
		System.out.println("-----------------------------------------------------");
		return p_chr;
	}
	public byte initByte( ) {
		System.out.println("This is default value for byte: " + p_bt);
		p_bt = 127;
		System.out.println("bt = 126; This is declated value for byte: " + p_bt);
		System.out.println("-----------------------------------------------------");
		return p_bt;
	}
	public short initShort( ) {	
		System.out.println("This is default value for short: " + p_shrt);
		p_shrt = 32_767; //32_767
		System.out.println("shrt = 37_766; This is declared value for short: " + p_shrt);
		System.out.println("-----------------------------------------------------");
		return p_shrt;
	}
	public int initInt( ) {
		System.out.println("This is default value for int: " + p_int);
		p_int = 2_147_483__646;
		System.out.println("int = 2_147_483__646; This is declared value for int: " + p_int);
		System.out.println("-----------------------------------------------------");
		return p_int;
	}
	public long initLong( ) {
		System.out.println("This is default value for long: " + p_lng);
		p_lng = 9_223_372_036_854_775_807L;
		System.out.println("lng = 9_223_372_036_854_775_807L; This is declared value for long: " + p_lng);
		System.out.println("-----------------------------------------------------");
		return p_lng;
	}
	public float initFloat( ) {
		System.out.println("This is default value for float: " + p_flt);
		p_flt = 12.121f;
		System.out.println("flt = 12.121f; This is declared value for float: " + p_flt);
		System.out.println("-----------------------------------------------------");
		return p_flt;
	}
	public double initDouble( ) {
		System.out.println("This is default value for double: " + p_dbl);
		p_dbl = 12.121_212_121_212_121_212_121d;
		System.out.println("dble = 12.121_212_121_212_121_212_121d; This is declared value for double: " + p_dbl);
		System.out.println("-----------------------------------------------------");
		return p_dbl;
	}
	public boolean initBoolean( ) {
		System.out.println("This is default value for boolean: " + p_bln);
		p_bln = true;
		System.out.println("bln = true; This is declared value for boolean: " + p_bln);
		return p_bln;
	}

}
