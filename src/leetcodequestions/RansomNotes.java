package leetcodequestions;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class RansomNotes {
	String ransomNote="ab";
	String magazine="ba";
	int assign=0;
	Boolean flag=false;
	int counter=0;
	void display(){
		for (int i = 0; i < magazine.length(); i++) {
			if(magazine.charAt(i)==ransomNote.charAt(assign)){
				assign++;
				counter++;
				if(counter==ransomNote.length()){
					flag=true;
					break;
				}
			}
			
		}
		System.out.println(flag);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
RansomNotes r = new RansomNotes();
r.display();
	}

}
