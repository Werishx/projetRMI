import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ClasseCentrale extends UnicastRemoteObject implements Centrale {
	private static final long serialVersionUID = 2674880711467464646L;
	
	protected ClasseCentrale() throws RemoteException { 
		super();
	}
	
	public String getInformation() throws RemoteException {
		System.out.println("Invocation de la méthode getInformation()");
		return "bonjour";
	}
}
