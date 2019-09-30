package aaa.enumPR;

public enum EnumEx00 {

	A("a1,a2,a3"),B("b1,b2,b3")
	;
	final private String exArray[];
	private EnumEx00(String str) {
		this.exArray = str.split(",");
	}
	public String get(int idx) {return exArray[idx];}
}
