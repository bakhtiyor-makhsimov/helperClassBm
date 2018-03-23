package helperClassBm;

public class StarterClsBm {
	
	static InitAndDeclar inANDdec = new InitAndDeclar();
	static CastToWrapperClass primitiveToWrapper = new CastToWrapperClass(); 

	public static void main(String[] args) {
		
		double d = 3.99;
		Double dh = new Double(d);
		int ir = dh.intValue();
		System.out.println(ir);
		System.out.println(dh instanceof Double);
//		inANDdec.initChar();
//		inANDdec.initByte();
//		inANDdec.initShort();
//		inANDdec.initInt();
//		inANDdec.initLong();
//		inANDdec.initFloat();
//		inANDdec.initDouble();
//		inANDdec.initBoolean();
//		-------------------------------------
//		primitiveToWrapper.primitiveByteToWrapperByte();
//		primitiveToWrapper.primitiveShortToWrapperShort();
//		primitiveToWrapper.primitiveIntToWrapperInteger();
//		primitiveToWrapper.primitiveLongToWrapperLong();
//		primitiveToWrapper.primitiveFloatToWrapperFloat();
//		primitiveToWrapper.primitiveDoubleToWrapperDouble();
//		primitiveToWrapper.wrapperLongToWrapperString();
	}

}
