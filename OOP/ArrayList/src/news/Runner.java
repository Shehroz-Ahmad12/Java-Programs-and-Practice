package news;

import java.util.ArrayList;


public class Runner {

	public static void main(String[] args) {
		News n1=new News("8820","Ali","How you doin");
		News n2=new News("123","Usama","How are csiadsyou doin");
		News n3=new News("8546","Hassan","How youafasgrase doin");
		
		ArrayList<News> list=new ArrayList<News>(20);
		list.add(n1);
		list.add(n2);
		list.add(n3);
		
		for(int i=0;i<3;i++) {
			if(list.get(i).getNewsId().equals("123")) {
				list.remove(i);
		}
		}
		
		System.out.println(list.size());
	}

}
