package helperClassBm;

public class CastToWrapperClass extends StarterClsBm{
	
	Byte hlpBt;
	Short hlpShrt;
	Integer hlpInt;
	Long hlpLng;
	Float hlpFlt;
	Double hlpDbl;
	String hlpStr;
	
	public Byte primitiveByteToWrapperByte() {
		hlpBt = new Byte(inANDdec.initByte());
		System.out.println("Byte bt1 = new Byte(bt); primitive byte casted to wrapper class Byte, and value is: " + hlpBt);
		System.out.println("-------------------------------------------");
		return hlpBt;
	}
	
	public Short primitiveShortToWrapperShort() {
		hlpShrt = new Short(inANDdec.initShort());
		System.out.println("Short shrt1 = new Short(shrt); primitive short casted to wrapper class Short, and value is: " + hlpShrt);
		System.out.println("-------------------------------------------");
		return hlpShrt;
	}
	
	public Integer primitiveIntToWrapperInteger() {
		hlpInt = new Integer(inANDdec.initInt());
		System.out.println("Integer int1 = new Integer(int); primitive int casted to wrapper class Integer, and value is: " + hlpInt);
		System.out.println("-------------------------------------------");
		return hlpInt;
	}
	
	public Long primitiveLongToWrapperLong() {
		hlpLng = new Long(inANDdec.initLong());
		System.out.println("Long lng1 = new Long(lng); primitive long casted to wrapper class Long, and value is: " + hlpLng);
		System.out.println("-------------------------------------------");
		return hlpLng;
	}
	
	public Float primitiveFloatToWrapperFloat() {
		hlpFlt = new Float(inANDdec.initFloat());
		System.out.println("Float flt1 = new Float(flt); primitive float casted to wrapper class Float, and value is: " + hlpFlt);
		System.out.println("-------------------------------------------");
		return hlpFlt;
	}
	
	public Double primitiveDoubleToWrapperDouble() {
		hlpDbl = new Double(inANDdec.initDouble());
		System.out.println("Double dbl1 = new Double(dbl); primitive double casted to wrapper class Double, and value is: " + hlpDbl);
		System.out.println("-------------------------------------------");
		return hlpDbl;
	}
	
	public String wrapperLongToWrapperString() {
		hlpStr = new String(hlpLng.toString());
		System.out.println("String str1 = new String(hlpLng.toString()); wrapper Long casted to wrapper class String, and value is: " + hlpStr);
		System.out.println("-------------------------------------------");
		return hlpStr;
	}

}
