package kr.co.bizspring;

// TODO: Auto-generated Javadoc
/**
 * The Class Client.
 */
public class Client {
	
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String args[])
	{
		MakeData makeData = new MakeData();
		makeData.setStartDate("2019-06-01");
		makeData.setEndDate("2019-06-07");
		makeData.setDailyCount(1000);
		
		//뉴스 생성 관련 설정작업
		makeData.prepare();
		
		//뉴스 생성 실행
		makeData.process();
	}
}