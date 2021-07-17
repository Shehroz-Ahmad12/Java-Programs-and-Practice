package document;

public class Runner {

	public static void main(String[] args) {
		Document d1 =new Email();
		Document[] d =new Document[4];
		
		d[0]=new Email("sfdf","ferer","tiref","wdabadwfa");
		d[1]=new File("sfddsadasdasfds","fsdfdsfsdfsdawfa");
		d[2]=new Email("khmnlhmlf","mfkbkvr","kvkfff","ajfjeawfa");
		d[3]=new File("sfegswvdf","ferenasjnwajfa");
		
		for(int i=0;i<4;i++) {
            d[i].toString();
           
            String  text=d[i].getText().replaceAll("Bad", "Good");
            d[i].setText(text);
           
            System.out.println("After screening");
            d[i].toString();
           
        }
}
	
	

}
