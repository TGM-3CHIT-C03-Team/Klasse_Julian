package Git;

import javax.swing.JOptionPane;

public class hallo {

	public static void hallo() {
		System.out.println("Julian l�sst sch�n gr��en :-) !");
		System.out.println("Mario hier");
		System.out.println("molbrich l�sst euch gr��en");

		if(NoteJerin() == 1) {
			JOptionPane.showMessageDialog(null, "Jerin ist der Beste");
		}else{
			JOptionPane.showMessageDialog(null, "Jerin ist immernoch besser als Julian, obwohl meine Note eine" + NoteJerin() + " ist : )");
		}
	}
	
	
	public static int NoteJerin () {
		double not = (Math.random() * 4)+1;
		
		return (int)not;
	}
	
	public static void main(String []args){
		hallo();
	}

}
 