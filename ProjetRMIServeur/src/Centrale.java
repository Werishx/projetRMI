import java.rmi.*;

public interface Centrale extends Remote {
	public String getInformation() throws RemoteException;
}
