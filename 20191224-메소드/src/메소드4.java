
public class �޼ҵ�4 {
	static String[] movieList(int page)
	{
		String[] data=new String[5];
		String[] title= {
				"��λ�",
				"�õ�",
				"���� V ���",
				"�ܿ�ձ� 2",
				"���̺꽺 �ƿ�",
				"�길��: �ؽ�Ʈ ����",
				"���Ӵ�",
				"Ĺ��",
				"�ź����Ʈ ������ �ϴõ����� �� �丣������",
				"6 ����׶���",
				"���ʰ��� �׳�"
		};
		
		int rowSize=5;
		int j=0; // 5���� �����ִ� ���� 
		int pagecnt=(page*rowSize)-rowSize; // ������
		// 1page => 0~4
		// 2page => 5~9
		// 3page => 10~14 =>
		
		int k=0;
		for(int i=0;i<title.length;i++)
		{
			if(j<5 && i>=pagecnt)
			{
				data[k]=title[i];
				k++;
				j++;
			}
		}
		
		return data;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int page=3;
		String[] data=movieList(page);
		for(String s:data)
		{
			if(s!=null)
			System.out.println(s);
		}
	}

}
