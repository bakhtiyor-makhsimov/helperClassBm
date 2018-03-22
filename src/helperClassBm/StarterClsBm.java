package helperClassBm;

public class StarterClsBm {
	
	static InitAndDeclar inANDdec = new InitAndDeclar();
	static CastToWrapperClass primitiveToWrapper = new CastToWrapperClass(); 

	public static void main(String[] args) {
//		inANDdec.initChar();
//		inANDdec.initByte();
//		inANDdec.initShort();
//		inANDdec.initInt();
//		inANDdec.initLong();
//		inANDdec.initFloat();
//		inANDdec.initDouble();
//		inANDdec.initBoolean();
//		-------------------------------------
		primitiveToWrapper.primitiveByteToWrapperByte();
		primitiveToWrapper.primitiveShortToWrapperShort();
		primitiveToWrapper.primitiveIntToWrapperInteger();
		primitiveToWrapper.primitiveLongToWrapperLong();
		primitiveToWrapper.primitiveFloatToWrapperFloat();
		primitiveToWrapper.primitiveDoubleToWrapperDouble();
		primitiveToWrapper.wrapperLongToWrapperString();
	}

}
