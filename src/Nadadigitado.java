import javax.swing.JOptionPane;

public class Nadadigitado extends Exception{

	private static final long serialVersionUID = 2628380054499696578L;
	
	public Nadadigitado(){
		JOptionPane.showMessageDialog(null, "Você não digitou nada!");
	}

}