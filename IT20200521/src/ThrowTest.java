
public class ThrowTest {

	public static void main(String[] args) {
		
		try {
			summary();
		} catch (Exception e) {
			e.printStackTrace();
			//�, ��� ���ܰ� �߻��ߴ��� �˷��ִ� �ڵ�
		}

	}
	
	public static int divide(int n ,int m) throws Exception {
		return n/m;
	}
	
	public static void summary() throws Exception {

		try {
			System.out.println("����� : "+divide(10,0));
		} catch (Exception e) {
			throw new Exception("��й�ȣ 5ȸƲ��");
			//������ ���ܹ߻�(������ �ƴ����� ������ ������ �߻����Ѿ� �ϴ� ��Ȳ)
		}
}
}